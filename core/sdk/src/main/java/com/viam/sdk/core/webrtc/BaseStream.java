package com.viam.sdk.core.webrtc;

import com.google.common.primitives.Bytes;
import com.google.protobuf.ByteString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;

import proto.rpc.webrtc.v1.Grpc;

public class BaseStream {

    // MaxMessageSize is the maximum size a gRPC message can be.
    public static long MaxMessageSize = 1 << 25;

    protected final Grpc.Stream stream;
    private final Function<Long, Void> onDone;
    private final Logger logger;
    private boolean closed = false;
    private final List<List<Byte>> packetBuf = new ArrayList<>();
    private int packetBufSize = 0;
    private Exception err = null;


    public BaseStream(final Grpc.Stream stream, final Function<Long, Void> onDone, final Logger logger) {
        this.stream = stream;
        this.onDone = onDone;
        this.logger = logger;
    }

    protected void closeWithRecvError(final Exception err) {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.err = err;
        this.onDone.apply(this.stream.getId());
    }

    protected Optional<List<Byte>> processPacketMessage(final Grpc.PacketMessage msg) {
		final ByteString data = msg.getData();
        if (data.size() + this.packetBufSize > MaxMessageSize) {
            this.packetBuf.clear();
            this.packetBufSize = 0;
            logger.warning("message size larger than max " + MaxMessageSize + "; discarding");
            return Optional.empty();
        }
        this.packetBuf.add(Bytes.asList(data.toByteArray()));
        this.packetBufSize += data.size();
        if (msg.getEom()) {
			final List<Byte> allData = new ArrayList<>(this.packetBufSize);
            int position = 0;
            for (final List<Byte> partialData : this.packetBuf) {
                allData.addAll(position, partialData);
                position += partialData.size();
            }
            this.packetBuf.clear();
            this.packetBufSize = 0;
            return Optional.of(allData);
        }
        return Optional.empty();
    }
}

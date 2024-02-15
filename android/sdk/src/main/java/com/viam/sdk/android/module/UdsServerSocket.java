package com.viam.sdk.android.module;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ServerSocketChannel;

@SuppressWarnings("UnsynchronizedOverridesSynchronized") // Rely on LocalSocket's synchronization
class UdsServerSocket extends ServerSocket {

  private final LocalServerSocket localSocket;
  private boolean closed;

  // TODO(erd): -1 default okay?
  private int recvBufferSize = -1;

  public UdsServerSocket(LocalSocketAddress localSocketAddress) throws IOException {
    final LocalSocket sock = new LocalSocket();
    sock.bind(localSocketAddress);
    localSocket = new LocalServerSocket(sock.getFileDescriptor());
  }

  @Override
  public Socket accept() throws IOException {
    final LocalSocket socket = localSocket.accept();
    return new UdsSocket(socket);
  }

  @Override
  public void bind(SocketAddress endpoint) throws IOException {
    // no-op
  }

  @Override
  public void bind(SocketAddress endpoint, int backlog) throws IOException {
    // no-op
  }

  @Override
  public synchronized void close() throws IOException {
    if (closed) {
      return;
    }
    //TODO(erd): more to do?
    localSocket.close();
    closed = true;
  }

  @Override
  public ServerSocketChannel getChannel() {
    throw new UnsupportedOperationException("getChannel() not supported");
  }

  @Override
  public InetAddress getInetAddress() {
    throw new UnsupportedOperationException("getInetAddress() not supported");
  }

  @Override
  public int getLocalPort() {
    throw new UnsupportedOperationException("Unsupported operation getLocalPort()");
  }

  @Override
  public SocketAddress getLocalSocketAddress() {
    return new SocketAddress() {
    };
  }

  @Override
  public synchronized int getReceiveBufferSize() throws SocketException {
    return recvBufferSize;
  }

  @Override
  public synchronized void setReceiveBufferSize(int size) throws SocketException {
    recvBufferSize = size;
  }

  @Override
  public boolean getReuseAddress() {
    throw new UnsupportedOperationException("Unsupported operation getReuseAddress()");
  }

  @Override
  public void setReuseAddress(boolean on) throws SocketException {
    // TODO(erd): maybe noop
    throw new UnsupportedOperationException("Unsupported operation setReuseAddress()");
  }

  @Override
  public synchronized int getSoTimeout() throws IOException {
    // TODO(erd): -1 okay?
    return -1;
  }

  @Override
  public synchronized void setSoTimeout(int timeout) throws SocketException {
    // TODO(erd): maybe impl for passing on accept
    // no-op
  }

  @Override
  public boolean isBound() {
    return true;
  }

  @Override
  public synchronized boolean isClosed() {
    return closed;
  }

  @Override
  public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) {
    throw new UnsupportedOperationException("Unsupported operation setPerformancePreferences()");
  }
}
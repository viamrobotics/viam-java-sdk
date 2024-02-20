package com.viam.sdk.android.module;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

class UdsServerSocket extends ServerSocket {

  private final LocalSocket sock;
  private final LocalServerSocket localSocket;
  private boolean closed;

  private int recvBufferSize = -1;
  private Integer timeout = null;

  public UdsServerSocket(LocalSocketAddress localSocketAddress) throws IOException {
    //noinspection resource
    sock = new LocalSocket();
    sock.bind(localSocketAddress);
    // careful: passing FD here doesn't transfer ownership. You MUST keep sock alive or
    // this FD will get reused and then the accept loop will fail when it is closed.
    localSocket = new LocalServerSocket(sock.getFileDescriptor());
  }

  @Override
  public Socket accept() throws IOException {
    final LocalSocket socket = localSocket.accept();
    synchronized (this) {
      if (timeout != null) {
        socket.setSoTimeout(timeout);
      }
    }
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
  public synchronized int getReceiveBufferSize() {
    return recvBufferSize;
  }

  @Override
  public synchronized void setReceiveBufferSize(int size) {
    recvBufferSize = size;
  }

  @Override
  public boolean getReuseAddress() {
    throw new UnsupportedOperationException("Unsupported operation getReuseAddress()");
  }

  @Override
  public void setReuseAddress(boolean on) {
    throw new UnsupportedOperationException("Unsupported operation setReuseAddress()");
  }

  @Override
  public synchronized int getSoTimeout() {
    return -1;
  }

  @Override
  public synchronized void setSoTimeout(int timeout) {
    this.timeout = timeout;
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
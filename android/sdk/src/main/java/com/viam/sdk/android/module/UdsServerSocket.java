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

  private final LocalSocket boundSocket;
  private final LocalServerSocket serverSocket;
  private boolean closed;

  private int recvBufferSize = -1;
  private Integer timeout = null;

  public UdsServerSocket(LocalSocketAddress localSocketAddress) throws IOException {
    boundSocket = new LocalSocket();
    boundSocket.bind(localSocketAddress);
    // Note: According to this LocalServerSocket constructor: "The passed-in FileDescriptor is not
    // managed by this class and must be closed by the caller." Therefore, we MUST keep the bound
    // socket alive or else this FD may get reused and corrupted (close-after-use or unrelated use).
    serverSocket = new LocalServerSocket(boundSocket.getFileDescriptor());
  }

  @Override
  public Socket accept() throws IOException {
    final LocalSocket socket = serverSocket.accept();
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
    serverSocket.close();
    boundSocket.close();
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
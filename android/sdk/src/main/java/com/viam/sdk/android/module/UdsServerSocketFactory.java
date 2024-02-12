package com.viam.sdk.android.module;

import android.net.LocalSocketAddress;
import android.net.LocalSocketAddress.Namespace;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import javax.net.ServerSocketFactory;
class UdsServerSocketFactory extends ServerSocketFactory {

    private final LocalSocketAddress localSocketAddress;

    public UdsServerSocketFactory(String path, Namespace namespace) {
        localSocketAddress = new LocalSocketAddress(path, namespace);
    }

    @Override
    public ServerSocket createServerSocket() throws IOException {
        return create();
    }

    @Override
    public ServerSocket createServerSocket(int port) throws IOException {
        return create();
    }

    @Override
    public ServerSocket createServerSocket(int port, int backlog) throws IOException {
        return create();
    }

    @Override
    public ServerSocket createServerSocket(int port, int backlog, InetAddress ifAddress) throws IOException {
        return create();
    }

    private ServerSocket create() throws IOException {
        return new UdsServerSocket(localSocketAddress);
    }
}
package bgu.spl.net.srv;

import java.net.DatagramPacket;

public interface Connections<T> {

    void connect(int connectionId, BlockingConnectionHandler<T> handler);

    boolean send(int connectionId, T msg);

    void disconnect(int connectionId);

}

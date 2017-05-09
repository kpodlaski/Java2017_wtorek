package pl.uni.lodz.wfis.java2017w.zajecia7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 09.05.2017.
 */
public class CommServer {

    private ServerSocket ssocket;
    private Socket clientSocket;
    private int port;

    public CommServer(int port) {
        this.port = port;
    }

    public void startServer() throws IOException {
        ssocket = new ServerSocket(port); //Na wszystkich kartach sieciowych
        clientSocket = ssocket.accept(); //instrukcja blokująca
    }

    public void listenOnSocket() throws IOException {
        InputStream is = clientSocket.getInputStream();
        OutputStream os = clientSocket.getOutputStream();
        System.out.println("Wlaczam nasluch");
        while (true){
            int c;
            c= is.read();
            System.out.print(""+((char) c));
            os.write(c);
        }
    }

    public static void main(String[] a) throws IOException {
        CommServer cs = new CommServer(8000);
        cs.startServer();
        cs.listenOnSocket();
    }
}

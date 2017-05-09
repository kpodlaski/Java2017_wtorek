package pl.uni.lodz.wfis.java2017w.zajecia7;

import java.io.*;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 09.05.2017.
 */
public class CommClient {
    private Socket socket;
    private int port;
    private String serverIP;

    public CommClient(int port, String serverIP) {
        this.port = port;
        this.serverIP = serverIP;
    }

    public void connectToServer() throws IOException {
        socket = new Socket(serverIP,port);
    }

    public void sendMessage(String message) throws IOException {
        OutputStream os = socket.getOutputStream();
        os.write(message.getBytes());
    }

    public void listenOnSocket() throws IOException {
            SocketListener listener = new SocketListener();
            //To nie jest nowy wątek: listener.run();
            Thread th = new Thread(listener);
            th.start();
        }

    class SocketListener implements Runnable{
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
            while (true){
                int c;
                c= is.read();
                System.out.print(""+((char) c));
                if (c == ';') System.out.println();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        CommClient cc = new CommClient(8000,"127.0.0.1");
        BufferedReader in = new BufferedReader
                (new InputStreamReader(System.in));
        cc.connectToServer();
        cc.listenOnSocket();
        for (int i=0;  i<10; i++) {
            String msg = in.readLine();
            cc.sendMessage(msg + ";");
        }
        Thread.sleep(1000);
        cc.socket.close();
    }
}

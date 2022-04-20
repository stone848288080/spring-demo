package top.ximimi.springdemo.io;


import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOTest {

    @Test
    public void testSocketServer(){
        System.out.println("Server boot");
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            if((line = bufferedReader.readLine())!=null){
                System.out.println("received the message from client: " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    void testSocketClient(){
        System.out.println("client boot");
        try {
            Socket socket = new Socket("127.0.0.1",9999);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("hello world");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

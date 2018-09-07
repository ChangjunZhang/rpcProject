package com.jun.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 同步阻塞IO的TimeServer
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if(args!=null&&args.length>0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){

            }
        }
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("The server start in port .."+port);
            Socket socket = null;
            while (true){
                socket = serverSocket.accept();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}

package com.test.demo.io;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket服务端
 *
 * @author songxibo
 * @date 2018/4/16上午10:07
 */
public class ServerSocketTest {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        String inString;
        BufferedReader in = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        while ((inString = in.readLine()) != null) {
            System.out.println(inString);
        }

        serverSocket.close();

    }

}

package com.test.demo.io;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @author songxibo
 * @date 2018/4/16上午10:07
 */
public class ClientSocketTest {

    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 9999);

        String clientRequest = "client test";
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(clientRequest.getBytes(Charset.defaultCharset()));
        outputStream.flush();

    }

}

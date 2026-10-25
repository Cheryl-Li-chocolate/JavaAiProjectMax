package com.itheima.demo7;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
    try {
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("HTTP/1.1 200 OK");
        ps.println("Content-Type: text/html; charset=UTF-8");
        ps.println();
        ps.println("<html>");
        ps.println("<body>");
        ps.println("<h1 style='color: red'>hello, world</h1>");
        ps.println("</body>");
        ps.println("</html>");
        ps.close();
        socket.close();

        } catch (Exception e) {
        System.out.println("客户端下线");
    }
}}

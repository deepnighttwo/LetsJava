package com.geekbang.learnsocket.writeit;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static com.geekbang.learnsocket.writeit.MyServer.BYE;
import static com.geekbang.learnsocket.writeit.MyServer.MY_COMM_CHARSET;

public class MyChat {

    private String from;
    private String greeting;
    private Socket s;

    public MyChat(String from, String greeting, Socket s) {
        this.from = from;
        this.greeting = greeting;
        this.s = s;
    }

    public void chatting() {
        Scanner in = new Scanner(System.in);
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(s.getInputStream(), MY_COMM_CHARSET));
                PrintWriter pw = new PrintWriter(
                        new OutputStreamWriter(s.getOutputStream(), MY_COMM_CHARSET)
                );
        ) {
            if (greeting != null) {
                pw.println(greeting);
                pw.flush();
            }
            while (true) {
                String line = br.readLine();
                if (line.equalsIgnoreCase(BYE)) {
                    pw.println(BYE);
                    break;
                } else {
                    System.out.println(from + ":" + line);
                    String myword = in.nextLine();
                    pw.println(myword);
                    pw.flush();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Akhilesh
 */
public class ClientListener extends Thread {

    private Socket socket;
    private BufferedReader reader;
    private PrintStream out;

    public ClientListener(Socket socket) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        out = new PrintStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            out.println("Hello from server");
            while (!isInterrupted()) {
//                PrintWriter out = new PrintWriter(socket.getOutputStream());
//                out.flush();
                String line = reader.readLine();

                if (line.equalsIgnoreCase("time")) {
                    out.println("Date and time: " + new Date());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapp.util;

import com.akhilesh.doscommands.DosCommand;
import com.akhilesh.doscommands.DosCommandFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Akhilesh
 */
public class DosClientListener extends Thread {

    private Socket socket;
    private BufferedReader reader;
    private PrintStream out;

    public DosClientListener(Socket socket) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        out = new PrintStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            String line = "";
            out.println("Hello from server");
            out.print(">");
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                String[] params = line.split(" ");
                DosCommand command = DosCommandFactory.getDosCommand(params[0]);
                if (command != null) {
                    command.execute(params);
                    System.out.println("===========================");
                } else {
                    System.out.println("Invalid command");
                     System.out.println("===========================");
                }
                out.print(">");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

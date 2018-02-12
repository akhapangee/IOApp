/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import com.akhilesh.ioapp.util.DosClientListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Akhilesh
 */
public class ChatDosCommandsApp {

    public static void main(String[] args) {
        try {
            int port = 9000;
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server is running at " + port);

            while (true) {
                Socket socket = server.accept();
                System.out.println("Request is coming from " + socket.getInetAddress().getHostName());

                DosClientListener dosClientListener = new DosClientListener(socket);
                dosClientListener.start();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

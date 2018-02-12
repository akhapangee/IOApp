/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import com.akhilesh.doscommands.DosCommand;
import com.akhilesh.doscommands.DosCommandFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 *
 * @author Akhilesh
 */
public class DosCommandApp {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(">");
            String line = "";

            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                String[] params = line.split(" ");

                DosCommand command = DosCommandFactory.getDosCommand(params[0]);
                if (command != null) {
                    command.execute(params);
                } else {
                    System.out.println("Invalid command");
                }

                System.out.print(">");

            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getFileType(File f) {
        if (f.isFile()) {
            return "File";
        } else if (f.isDirectory()) {
            return "Dir";
        }
        return "";
    }
}

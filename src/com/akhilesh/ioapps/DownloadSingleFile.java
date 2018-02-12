/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Akhilesh
 */
public class DownloadSingleFile {

    public static void main(String[] args) {
        System.out.println("Enter full path of file to download: ");
        System.out.print(">");
        String line = "";
        String path = "downloads/";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                String[] str = line.split("/");
                URLConnection conn = new URL(line).openConnection();
                InputStream is = conn.getInputStream();
                OutputStream os = new FileOutputStream(path + "file" + str[str.length - 1]);
                byte[] data = new byte[1024 * 5];
                int i = 0;
                System.out.println("Downloading...");
                while ((i = is.read(data)) != -1) {
                    os.write(data, 0, i);
                }
                System.out.println("Download finished");
                System.out.print(">");
                is.close();
                os.close();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

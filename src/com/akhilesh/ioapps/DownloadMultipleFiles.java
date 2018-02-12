/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapps;

import com.akhilesh.ioapp.util.Downloader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Akhilesh
 */
public class DownloadMultipleFiles {

    public static void main(String[] args) {
        System.out.println("Enter full path of file to download: ");
        System.out.print(">");
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                System.out.println("Downloading...");
                Downloader downloader = new Downloader(line);
                downloader.start();
                System.out.println("Download finished");
                System.out.print(">");
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

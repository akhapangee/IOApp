/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ioapp.util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Akhilesh
 */
public class Downloader extends Thread {

    private String path = "downloads/";
    private String link;

    public Downloader(String link) {
        this.link = link;
    }

    @Override
    public void run() {
        try {
            URLConnection conn = new URL(link).openConnection();
            InputStream is = conn.getInputStream();
            String[] tokens = link.split("/");
            OutputStream os = new FileOutputStream(path + tokens[tokens.length - 1]);
            byte[] data = new byte[1024 * 5];
            int i = 0;

            while ((i = is.read()) != -1) {
                os.write(data, 0, i);
            }
            is.close();
            os.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

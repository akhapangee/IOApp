/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.doscommands;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Akhilesh
 */
public class WebCommand extends DosCommand {

    @Override
    public void execute(String[] params) throws IOException {
        if (params.length > 1) {
            URLConnection conn = new URL(params[1]).openConnection();
            conn.setRequestProperty("User-Agent", "jfkdj");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\r\n");
            }

            if (params.length == 2) {
                System.out.println(content.toString());
            } else if (params.length == 3) {
                FileWriter fw = new FileWriter(params[3]);
                fw.write(content.toString());
                fw.close();
            }
            reader.close();
        }
    }

}

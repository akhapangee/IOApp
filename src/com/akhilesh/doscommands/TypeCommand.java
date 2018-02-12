/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.doscommands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Akhilesh
 */
public class TypeCommand extends DosCommand {

    @Override
    public void execute(String[] params) throws IOException {
        if (params.length > 1) {
            BufferedReader reader = new BufferedReader(new FileReader(params[1]));
            String line = "";

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
    }

}

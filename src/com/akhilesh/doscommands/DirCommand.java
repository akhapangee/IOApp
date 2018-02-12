/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.doscommands;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Akhilesh
 */
public class DirCommand extends DosCommand {

    @Override
    public void execute(String[] params) throws IOException {
        File file = (params.length == 1) ? new File(".") : new File(params[1]);
//        if (params.length == 1) {
//            file = new File(".");
//        } else {
//            file = new File(params[1]);
//        }
        for (File f : file.listFiles()) {
            System.out.printf("%s (%s) %d", f.getName(), getType(f), f.length());
            System.out.println();
        }
    }

    private String getType(File f) {
        if (f.isFile()) {
            return "File";
        } else if (f.isDirectory()) {
            return "Dir";
        }
        return null;
    }

}

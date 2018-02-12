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
public class RDCommand extends DosCommand {

    @Override
    public void execute(String[] params) throws IOException {
        if (params.length > 1) {
            new File(params[1]).delete();
             System.out.println("Directory '"+ params[1]+ "' deleted");
        } else {
            System.out.println("Not enough parameter");
        }
    }

}

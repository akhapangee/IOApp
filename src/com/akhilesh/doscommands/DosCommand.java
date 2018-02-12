/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.doscommands;

import java.io.IOException;

/**
 *
 * @author Akhilesh
 */
public abstract class DosCommand {
    public abstract void execute(String[] params) throws  IOException;
}

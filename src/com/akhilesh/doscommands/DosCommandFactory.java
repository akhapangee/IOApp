/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.doscommands;

import java.util.HashMap;

/**
 *
 * @author Akhilesh
 */
public class DosCommandFactory {

    private static HashMap<String, DosCommand> commands = intiCommands();

    private static HashMap<String, DosCommand> intiCommands() {
        HashMap<String, DosCommand> cmds = new HashMap<>();
        cmds.put("dir", new DirCommand());
        cmds.put("md", new MDCommand());
        cmds.put("rd", new RDCommand());
        cmds.put("web", new WebCommand());
        cmds.put("type", new TypeCommand());
        return cmds;
    }

    public static DosCommand getDosCommand(String param) {
//        if (param.equalsIgnoreCase("dir")) {
//            return new DirCommand();
//        } else if (param.equalsIgnoreCase("md")) {
//            return new MDCommand();
//        } else if (param.equalsIgnoreCase("rd")) {
//            return new RDCommand();
//        } else if (param.equalsIgnoreCase("web")) {
//            return new WebCommand();
//        } else if (param.equalsIgnoreCase("type")) {
//            return new TypeCommand();
//        }
//        return null;
        return (commands.containsKey(param)) ? commands.get(param) : null;

    }

}

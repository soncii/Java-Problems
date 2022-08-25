package com.Damir;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void Main(String[] args) throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        prop.load(input);
        String mode = prop.getProperty("mode");
        Logger log = null;
        if ((mode.toLowerCase().equals("copy")) || (mode.toLowerCase().equals("move"))) {
        } else {
            log.log(Level.SEVERE, "Mode is not recognized: " +mode);
            return ;
        }
        String suffix = prop.getProperty("suffix");
        if (suffix==null) {
            log.log(Level.SEVERE, "No suffix is configured");
            return ;
        }
        String files = prop.getProperty("files");
        if (files==null){
            log.log(Level.WARNING, "No files are configured to be copied/moved");
            return;
        }
        StringBuilder temp = new StringBuilder();
        for (int i=0; i<=files.length(); i++) {
            if (i==files.length() || files.charAt(i) == ':'){
                String Path = temp.toString();
                temp = new StringBuilder();
                File file = new File(Path);
                if (!file.exists()) {
                    log.log(Level.SEVERE, "No such file: "+Path);
                    continue;
                }
                StringBuilder name = new StringBuilder();
                int j;
                for (j=Path.length()-1; Path.charAt(j)!='/'; j--) {
                }
                for (j=j; j<Path.length(); j++) {
                    if (Path.charAt(j)=='.') {
                        name.append(suffix);
                    }
                    name.append(Path.charAt(j));
                }
                file.renameTo(new File(name.toString()));
            } else {
                temp.append(files.charAt(i));
            }
        }
        prop.getProperty("MODE");
        System.out.println("Hello world!");
    }
}
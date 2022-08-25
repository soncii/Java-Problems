package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        prop.load(input);
        String mode = prop.getProperty("mode");
        Logger log = Logger.getLogger("org.example.Main");
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
        if (files==null || files.isEmpty()){
            log.log(Level.WARNING, "No files are configured to be copied/moved");
            return;
        }
        StringBuilder temp = new StringBuilder();
        for (int i=0; i<=files.length(); i++) {
            if (i==files.length() || files.charAt(i) == ':'){
                String path = temp.toString();
                temp = new StringBuilder();
                Path file = Paths.get(path);
                if (!Files.exists(file)) {
                    log.log(Level.SEVERE, "No such file: "+ path);
                    continue;
                }
                StringBuilder name = new StringBuilder();

                int j;
                j=path.length()-1;
                while (path.charAt(j)!='/') {
                    j--;
                }
                StringBuilder Target = new StringBuilder(path.substring(0, j));
                for (j=j; j<path.length(); j++) {
                    if (path.charAt(j)=='.') {
                        name.append(suffix);
                    }
                    name.append(path.charAt(j));
                }
                Target.append(name);


                if (mode.toLowerCase().equals("copy")) {
                    Files.copy(file, Paths.get(Target.toString()));
                    log.log(Level.INFO, path + " -> " + Target);
                }
                else {
                    Files.move(file, Paths.get(Target.toString()), StandardCopyOption.REPLACE_EXISTING);
                    log.log(Level.INFO, path + " => " + Target);
                }
            }
            else {
                temp.append(files.charAt(i));
            }
        }
    }
}
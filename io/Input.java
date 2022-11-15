package io;

import java.io.*;

public class Input {
    private static File file = null;
    private static FileReader fr = null;
    private static BufferedReader br = null;

    public static void init(String filepath) throws FileNotFoundException {
        file = new File(filepath);
        fr = new FileReader (file);
        br = new BufferedReader(fr);
    }

    public static String readNextLine() throws IOException {
        String lines = "";
        String line = null;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            if (lines.isEmpty())
                lines += line;
            else
                lines += " "+line;
        }

        if (!lines.equals("")) return lines;

        return null;
    }
}

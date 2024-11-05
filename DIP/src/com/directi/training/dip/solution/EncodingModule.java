package com.directi.training.dip.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{
    private final Database database;

    public EncodingModule(Database database) {
        this.database = database;
    }

    public void encodeWithFiles() throws IOException
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                new FileReader("/home/gala/Desktop/RT5 Materials/microservices/TP/TP2/SOLID_rev/DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
            writer = new BufferedWriter(
                new FileWriter("/home/gala/Desktop/RT5 Materials/microservices/TP/TP2/SOLID_rev/DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException
    {
        URL url;
        url = new URL("http", "google.com", 80, "/index.html");
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        database.write(encodedString);
    }
}


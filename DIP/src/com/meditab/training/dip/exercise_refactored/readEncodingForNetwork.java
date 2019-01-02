package com.meditab.training.dip.exercise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{
    public void encodeWithFiles() throws IOException
    {
        BufferedReader reader = null;
		try {
            reader = new BufferedReader(
                new FileReader("DIP/src/com/meditab/training/dip/exercise/beforeEncryption.txt"));
				 while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
				}
			 } finally {
			 if (reader != null) {
                reader.close();
            }
	}
	 public void encodeBasedOnNetwork() throws IOException
    {
        URL url;
        url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
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
	}
	}
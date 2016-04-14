package com.company;
import java.io.*;

public class CopyJpqFile {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("res/picture.jpg");
            FileOutputStream destination = new FileOutputStream("res/my-copied-picture.jpg")) {
            byte[] buffer = new byte[4096];
            while (true) {
                int readBytes = inputStream.read(buffer, 0, buffer.length);
                if(readBytes <= 0) break;
                destination.write(buffer, 0, readBytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
 }

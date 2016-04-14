package com.company;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    public static void main(String[] args){
        Map<String, File> files = new HashMap<String, File>() {{
            put("count-chars.txt", new File("res/count-chars.txt"));
            put("word.txt", new File("res/word.txt"));
            put("liness.txt", new File("res/liness.txt"));
        }};

        ZipFiles(files, "res/text-files.zip");
    }

    private static void ZipFiles(Map<String, File> files, String archiveName) {
        try (ZipOutputStream destination = new ZipOutputStream(new FileOutputStream(archiveName))) {

            for (Map.Entry<String, File> file : files.entrySet()) {
                try (FileInputStream source = new FileInputStream(file.getValue())) {
                    destination.putNextEntry(new ZipEntry(file.getKey()));

                    byte[] buffer = new byte[4096];
                    while (true) {
                        int readed = source.read(buffer, 0, buffer.length);
                        if (readed <= 0) break;
                        destination.write(buffer, 0, readed);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

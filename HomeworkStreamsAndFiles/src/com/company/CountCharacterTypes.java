package com.company;
import java.io.*;
import java.util.Arrays;

public class CountCharacterTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int noVowels = 0;
        int punctuation = 0;
        String s = "res/word.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(s)));
             PrintWriter writer = new PrintWriter(new FileWriter("res/count-chars.txt"))) {
            String reads = reader.readLine();
            while (reads != null) {
                for (int i = 0; i < reads.length(); i++) {
                    if (reads.charAt(i)== 'a' || reads.charAt(i)== 'e' || reads.charAt(i)== 'o' || reads.charAt(i)== 'i' || reads.charAt(i)== 'u'){
                        vowels++;
                    } else if (reads.charAt(i)== '!' || reads.charAt(i)== ',' || reads.charAt(i)== '.' || reads.charAt(i)== '?') {
                        punctuation++;
                    } else if (reads.charAt(i) != ' ') {
                        noVowels++;
                    }
                }

                reads = reader.readLine();
            }

            writer.write(String.format("Vowels: %d\nConsonants: %d\nPunctuation: %d", vowels, noVowels, punctuation));

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
  /*
            int input = reader.read();
            while (input != -1) {
                char ch = (char) input;
                if (Character.isLetter(ch)) {
                    if (Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'}).contains(ch)) {
                        vowels++;
                    } else {
                        noVowels++;

                    }
                } else if (Arrays.asList(new Character[]{'!', ',', '.', '?'}).contains(ch)) {
                    punctuation++;
                }

                input = reader.read();
            }
*/
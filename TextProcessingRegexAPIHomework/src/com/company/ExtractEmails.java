package com.company;
import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();  //.toLowerCase();

        Pattern pattern = Pattern.compile("(\\w+([-_.]*\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]*\\w+)*)");
        Matcher matcher = pattern.matcher(input);

        List<String> results = new ArrayList<>();
        while (matcher.find()) {
            String currentMail = matcher.group();
            results.add(currentMail);
        }
        for (String res:results) {
            System.out.printf("%s\n", res);
        }
    }
}
//(^(\w+([-_.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*)$)"
//("(^([a-z0-9.-_]+)(\\@)([a-z]+)([a-z-.]*)(\\.)+([a-z-.])*([a-z]+)$)");
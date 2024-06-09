package com.example.task1;

import java.io.*;

public class PhoneNumber {
    private final File filePath = new File("src/main/resources/com/example/task1/file.txt");
    private final ValidateNumber phoneNumber = number -> {
        String regexFirstVariant = "^\\d{3}-\\d{3}-\\d{4}$";
        String regexSecondVariant = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        return number.matches(regexFirstVariant) || number.matches(regexSecondVariant);
    };

    public void printValidPhoneNumber() {
        try (BufferedReader bIS = new BufferedReader(new FileReader(filePath))) {
            String number;

            while ((number = bIS.readLine()) != null) {
                if (phoneNumber.isValidNumber(number)) {
                    System.out.println(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
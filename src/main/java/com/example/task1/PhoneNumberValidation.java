package com.example.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class PhoneNumberValidation {
    private final Collection<String> validPhoneNumbers = new ArrayList<>();

    public PhoneNumberValidation(File file){
        try (BufferedReader bIS = new BufferedReader(new FileReader(file))) {
            String number;

            while ((number = bIS.readLine()) != null) {
                ValidateNumber phoneNumber = validNumber -> {
                    String regexFirstVariant = "^\\d{3}-\\d{3}-\\d{4}$";
                    String regexSecondVariant = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
                    return validNumber.matches(regexFirstVariant) || validNumber.matches(regexSecondVariant);
                };
                if (phoneNumber.isValidNumber(number)) {
                    validPhoneNumbers.add(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Collection<String> getResult() {
        return validPhoneNumbers;
    }

    @Override
    public String toString()  {
        StringBuilder stringBuilder = new StringBuilder();
        for (String phone : validPhoneNumbers) {
           stringBuilder.append(phone).append("\n");
        }
        return stringBuilder.toString();
    }
}
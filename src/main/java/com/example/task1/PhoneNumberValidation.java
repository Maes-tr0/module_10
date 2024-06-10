package com.example.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class PhoneNumberValidation {
    private final Collection<String> validPhoneNumbers = new ArrayList<>();
    private static final String REGEX_FIRST_VARIANT = "^\\d{3}-\\d{3}-\\d{4}$";
    private static final String REGEX_SECOND_VARIANT = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";


    public PhoneNumberValidation(File file){
        try (BufferedReader bIS = new BufferedReader(new FileReader(file))) {
            String number;

            ValidateNumber phoneNumber = validNumber -> validNumber.matches(REGEX_FIRST_VARIANT) || validNumber.matches(REGEX_SECOND_VARIANT);

            while ((number = bIS.readLine()) != null) {
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
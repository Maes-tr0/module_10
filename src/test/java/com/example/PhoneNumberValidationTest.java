package com.example;

import com.example.task1.PhoneNumberValidation;

import java.io.File;

public class PhoneNumberValidationTest {
    public static void main(String[] args) {
        File filePath = new File("src/main/resources/com/example/task1/input/file.txt");
        PhoneNumberValidation phoneNumber = new PhoneNumberValidation(filePath);
        System.out.println(phoneNumber);
        /* Result:
            987-123-4567
            (123) 456-7890
            111-222-3333
            (555) 666-7777
            999-888-7777
            (999) 888-7777
            000-111-2222
         */
    }
}

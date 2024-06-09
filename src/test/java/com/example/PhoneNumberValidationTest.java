package com.example;

import com.example.task1.PhoneNumber;

public class PhoneNumberValidationTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.printValidPhoneNumber();
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

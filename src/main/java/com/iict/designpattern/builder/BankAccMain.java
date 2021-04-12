package com.iict.designpattern.builder;

public class BankAccMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Savings Account", "1234")
                .withEmail("abc@abc.com")
                .wantNewsletter(true)
                .build();
    }
}

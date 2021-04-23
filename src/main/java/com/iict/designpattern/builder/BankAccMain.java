package com.iict.designpattern.builder;

public class BankAccMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Savings Account", "1234")
                .withEmail("abc@abc.com")
                .wantNewsletter(true)
                .withNid("183939943934")
                .build();
        System.out.println(bankAccount.getAccountNumber());
        Employee employee = Employee.builder()
                            .name("Rabbi")
                            .age(Long.valueOf(35))
                            .address("Dhaka")
                            .build();
        System.out.println(employee.getName());
    }
}

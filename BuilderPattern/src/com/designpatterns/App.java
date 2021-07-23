package com.designpatterns;

/* Builder Pattern:
The builder pattern is used for building complex objects with lots of constructor parameters. Use cases:
* a. When dealing with a complex object that requires a lot of parameters.
b. When trying to prevent mistakes from creating a complex object i.e constructor argument order mismatch.
c. When trying to avoid unreadable codes that is caused by big constructors when we need to create a really complex objects.
* */

public class App {
    public static void main(String[] args) {
        OnlineStoreAccount onlineStore = new OnlineStoreAccount.Builder(1L)
                .withName("John Smith")
                .withAddress("5 Lane Park")
                .withBudget(100L)
                .withDiscount(5L)
                .build();
        System.out.println("Name: "+onlineStore.getName()+"\n" +
                "Address: "+onlineStore.getAddress()+"\n" +
                "Budget: "+onlineStore.getBudget()+"\n" +
                "Discount: "+onlineStore.getDiscountRate());
    }
}

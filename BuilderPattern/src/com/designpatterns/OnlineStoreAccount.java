package com.designpatterns;

public class OnlineStoreAccount {
    private Long id;
    private String name;
    private String address;
    private Long budget;
    private Long discountRate;

    public static class Builder{
        private Long id;
        private String name;
        private String address;
        private Long budget;
        private Long discountRate;

        public Builder(Long id){
            this.id = id;
        }
        public Builder withName(String name){
            this.name = name;
            return this;  // setter method returns Builder object
        }
        public Builder withAddress(String address){
            this.address = address;
            return this; // setter method returns Builder object
        }
        public Builder withBudget(Long budget){
            this.budget = budget;
            return this; // setter method returns Builder object

        }
        public Builder withDiscount(Long discountRate){
            this.discountRate = discountRate;
            return this; // setter method returns Builder object
        }
        public OnlineStoreAccount build(){
            OnlineStoreAccount onlineStureAccount = new OnlineStoreAccount();
            onlineStureAccount.id = this.id;
            onlineStureAccount.name = this.name;
            onlineStureAccount.address = this.address;
            onlineStureAccount.budget = this.budget;
            onlineStureAccount.discountRate = this.discountRate;

            return onlineStureAccount;
        }
    }
    private OnlineStoreAccount(){}; // no-arg constructor is not used. Builder class and build method used instead.

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Long getBudget() {
        return budget;
    }
    public Long getDiscountRate() {
        return discountRate;
    }
}

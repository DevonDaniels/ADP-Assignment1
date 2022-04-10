package za.ac.cput.domain;

/*
    Customer.java
    Customer Entity
    Author: Mugammad Tashreeq Emeran (214137805)
    Date: 10/04/2022
 */

import za.ac.cput.user.User;

public class Customer {
    private String ID;
    private String addressID;
    private String firstName;
    private String lastName;
    private String email;
    private String createDate;
    private String lastUpdate;

    private Customer(Builder builder) {
        this.ID = builder.ID;
        this.addressID = builder.addressID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.createDate = builder.createDate;
        this. lastUpdate = builder.lastUpdate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID='" + ID + '\'' +
                ", addressID='" + addressID + '\'' +
                ", fistName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", createDate='" + createDate + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }

    public static class Builder{
        private String ID;
        private String addressID;
        private String firstName;
        private String lastName;
        private String email;
        private String createDate;
        private String lastUpdate;


        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setAddressID(String addressID) {
            this.addressID = addressID;
            return this;
        }

        public Builder setFirstName(String fistName) {
            this.firstName = fistName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        public Builder copy(Customer customer) {
            this.ID = customer.ID;
            this.addressID = customer.addressID;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.createDate = customer.createDate;
            this.lastUpdate = customer.lastUpdate;
            return this;

        }

        public Customer build() {
            return new Customer (this);
        }
    }
}

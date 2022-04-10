package za.ac.cput.domain;

/*
    Address.java
    Address Entity
    Author: Mugammad Tashreeq Emeran (214137805)
    Date: 10/04/2022
 */

public class Address {
        private String ID;
        private String cityID;
        private String address;
        private String postalCode;
        private String contactNumber;
        private String lastUpdate;

    private Address(Builder builder) {
        this.ID = builder.ID;
        this.cityID = builder.cityID;
        this.address = builder.address;
        this.postalCode = builder.postalCode;
        this.contactNumber = builder.contactNumber;
        this.lastUpdate = builder.lastUpdate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ID='" + ID + '\'' +
                ", cityID='" + cityID + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }

    public static class Builder {
        private String ID;
        private String cityID;
        private String address;
        private String postalCode;
        private String contactNumber;
        private String lastUpdate;

        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setCityID(String cityID) {
            this.cityID = cityID;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        public Builder copy(Address address) {
            this.ID = address.ID;
            this.cityID = address.cityID;
            this.address = address.address;
            this.postalCode = address.postalCode;
            this.contactNumber = address.contactNumber;
            this.lastUpdate = address.lastUpdate;
            return this;

        }

        public Address build() {
            return new Address(this);
        }
    }
}

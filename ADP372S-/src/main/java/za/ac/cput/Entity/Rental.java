package za.ac.cput.Entity;

/*      Inventory.java
        Entity for the Rental
        Author: Devon Daniels (217299822)
        Date: 03 April 2022

 */
public class Rental {
    private String ID, Staff, Customer, InventoryId, RentalDate, ReturnDate, LastUpdate;

    private Rental(){}

    private Rental(Builder builder) {
        this.ID = builder.ID;
        this.Staff = builder.Staff;
        this.Customer = builder.Customer;
        this.InventoryId = builder.InventoryId;
        this.RentalDate = builder.RentalDate;
        this.ReturnDate =builder.ReturnDate;
        this.LastUpdate = builder.LastUpdate;
    }
    public String getID() {
        return ID;
    }

    public String getStaff() {
        return Staff;
    }

    public String getCustomer() {
        return Customer;
    }

    public String getInventoryId() { return InventoryId;}

    public String getRentalDate() { return RentalDate;}

    public String getReturnDate() { return ReturnDate;}

    public String getLastUpdate() { return LastUpdate;}



    @Override
    public String toString() {
        return "za.ac.cput.Entity.Inventory{" +
                "Id='" + ID + '\'' +
                ", Staff='" + Staff + '\'' +
                ", Customer='" + Customer + '\'' +
                ", Inventory ID='" + InventoryId + '\'' +
                ", Rental Date='" + RentalDate + '\'' +
                ", Return Date='" + ReturnDate + '\'' +
                ", Last Update='" + LastUpdate + '\'' +
                '}';
    }

    public static class Builder {
        private String ID, Staff, Customer, InventoryId, RentalDate, ReturnDate, LastUpdate;

        public Builder setID(String ID) {
            this.ID = ID;

            return this;
        }

        public Builder setStaff(String Staff) {
            this.Staff = Staff;

            return this;
        }

        public Builder setCustomer(String Customer) {
            this.Customer = Customer;

            return this;
        }

        public Builder setInventoryId(String InventoryId) {
            this.InventoryId = InventoryId;

            return this;
        }

        public Builder setRentalDate(String RentalDate) {
            this.RentalDate = RentalDate;

            return this;
        }

        public Builder setReturnDate(String ReturnDate) {
            this.ReturnDate = ReturnDate;

            return this;
        }

        public Builder setLastUpdate(String LastUpdate) {
            this.LastUpdate = LastUpdate;

            return this;
        }


        public Rental Build() {

            return new Rental(this);
        }

        public Builder copy(Rental rental) {
            this.ID = rental.ID;
            this.Staff = rental.Staff;
            this.Customer = rental.Customer;
            this.InventoryId = rental.InventoryId;
            this.RentalDate = rental.RentalDate;
            this.ReturnDate = rental.ReturnDate;
            this.LastUpdate = rental.LastUpdate;

            return this;
        }

    }
    }



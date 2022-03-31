package za.ac.cput.Entity;

/*      Inventory.java
        Entity for the Payment
        Author: Devon Daniels (217299822)
        Date: 03 April 2022

 */
public class Payment {
    private String ID, Rental, CustomerId, StaffId, Amount, PaymentDate;

    private Payment(){}

    private Payment(Builder builder) {
        this.ID = builder.ID;
        this.Rental = builder.Rental;
        this.CustomerId = builder.CustomerId;
        this.StaffId = builder.StaffId;
        this.Amount = builder.Amount;
        this.PaymentDate =builder.PaymentDate;

    }
    public String getID() {
        return ID;
    }

    public String getRental() {
        return Rental;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public String getStaffId() { return StaffId;}

    public String getAmount() { return Amount;}

    public String getPaymentDate() { return PaymentDate;}





    @Override
    public String toString() {
        return "za.ac.cput.Entity.Inventory{" +
                "Id='" + ID + '\'' +
                ", Rental='" + Rental + '\'' +
                ", Customer ID='" + CustomerId + '\'' +
                ", Staff ID='" + StaffId + '\'' +
                ", Amount='" + Amount + '\'' +
                ", Payment Date='" + PaymentDate + '\'' +
                '}';
    }

    public static class Builder {
        private String ID, Rental, CustomerId, StaffId, Amount, PaymentDate;

        public Builder setID(String ID) {
            this.ID = ID;

            return this;
        }

        public Builder setRental(String Rental) {
            this.Rental = Rental;

            return this;
        }

        public Builder setCustomerId(String CustomerId) {
            this.CustomerId = CustomerId;

            return this;
        }

        public Builder setStaffId(String StaffId) {
            this.StaffId = StaffId;

            return this;
        }

        public Builder setAmount(String Amount) {
            this.Amount = Amount;

            return this;
        }

        public Builder setPaymentDate(String PaymentDate) {
            this.PaymentDate = PaymentDate;

            return this;
        }




        public Payment Build() {

            return new Payment(this);
        }

        public Builder copy(Payment payment) {
            this.ID = payment.ID;
            this.Rental = payment.Rental;
            this.CustomerId = payment.CustomerId;
            this.StaffId = payment.StaffId;
            this.Amount = payment.Amount;
            this.PaymentDate = payment.PaymentDate;


            return this;
        }

    }
}




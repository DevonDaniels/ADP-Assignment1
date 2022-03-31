package za.ac.cput.Entity;

/*      Inventory.java
        Entity for the Staff
        Author: Devon Daniels (217299822)
        Date: 03 April 2022

 */
public class Staff {
    private String ID, Payment, FirstName,LastName, Email, UserName, Password, LastUpdate, Picture;

    private Staff(){}

    private Staff(Builder builder) {
        this.ID = builder.ID;
        this.Payment = builder.Payment;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Email = builder.Email;
        this.UserName =builder.UserName;
        this.Password =builder.Password;
        this.LastUpdate = builder.LastUpdate;
        this.Picture =builder.Picture;
    }
    public String getID() {
        return ID;
    }

    public String getPayment() {
        return Payment;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() { return LastName;}

    public String getEmail() { return Email;}

    public String getUserName() { return UserName;}

    public String getPassword() { return Password;}

    public String getLastUpdate() { return LastUpdate;}

    public String getPicture() { return Picture;}



    @Override
    public String toString() {
        return "za.ac.cput.Entity.Inventory{" +
                "Id='" + ID + '\'' +
                ", Payment='" + Payment + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Last Update='" + LastUpdate + '\'' +
                ", Picture='" + Picture + '\'' +
                '}';
    }

    public static class Builder {
        private String ID, Payment, FirstName,LastName, Email, UserName, Password, LastUpdate, Picture;

        public Builder setID(String ID) {
            this.ID = ID;

            return this;
        }

        public Builder setPayment(String Payment) {
            this.Payment = Payment;

            return this;
        }

        public Builder setFirstName(String FirstName) {
            this.FirstName = FirstName;

            return this;
        }

        public Builder setLastName(String LastName) {
            this.LastName = LastName;

            return this;
        }

        public Builder setEmail(String Email) {
            this.Email = Email;

            return this;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;

            return this;
        }

        public Builder setPassword(String Password) {
            this.Password = Password;

            return this;
        }

        public Builder setLastUpdate(String LastUpdate) {
            this.LastUpdate = LastUpdate;

            return this;
        }

        public Builder setPicture(String Picture) {
            this.Picture = Picture;

            return this;
        }


        public Staff Build() {

            return new Staff(this);
        }

        public Builder copy(Staff staff) {
            this.ID = staff.ID;
            this.Payment = staff.Payment;
            this.FirstName = staff.FirstName;
            this.LastName = staff.LastName;
            this.Email = staff.Email;
            this.UserName =staff.UserName;
            this.Password =staff.Password;
            this.LastUpdate = staff.LastUpdate;
            this.Picture =staff.Picture;

            return this;
        }

    }
}




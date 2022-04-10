package za.ac.cput.user;

/*
    User.java
    User Entity
    Author: Mugammad Tashreeq Emeran (214137805)
    Date: 10/04/2022
 */

public class User {
    private String email;
    private String firstName;
    private String lastName;

private User(Builder builder) {
    this.email = builder.email;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;

}

    public static User createUser(String email, String firstName, String lastName) {
     return new User.Builder().setEmail(email)
             .setFirstName(firstName)
             .setLastName(lastName)
             .build();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String email;
        private String firstName;
        private String lastName;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(User user) {
            this.email = user.email;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}

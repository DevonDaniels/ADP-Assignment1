package za.ac.cput.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void test() {
        User user = User.createUser("214137805@cput.ac.za", "Mugammad", "Emeran");
        assertNotNull(user);
    }

}
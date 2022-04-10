package za.ac.cput.studentaccount;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AcademicStaffTest {

    private AcademicStaff a1;
    private AcademicStaff a2;

    @BeforeEach
    void setUp() {
        a1 = new AcademicStaff("Tawfeeq", "Developer", "Information Technology", 12256);
        a2 = new AcademicStaff("Chad", "CEO", "Information Technology", 256466);
    }
    @Test
    void testEquality() {
        assertNotEquals(a1, a2);
    }

    //object identity
    @Test
    void testIdentity() {
        assertNotSame(a1, a2);
    }

    @Test
    void testFail() {
        a1.getASid();
        fail("This should force the test to fail");
    }

    //timeouts test
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testWithTimeout(){
        a2.setASid(00001);
        a2.show();
    }

}


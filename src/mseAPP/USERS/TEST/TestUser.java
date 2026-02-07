package mseAPP.USERS.TEST;

// IMPORT:

/*
* For testing
* For Assert
* class that will be tested
* print the test passed
*/
import mseAPI.objectBehavior.ObjectModification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import mseAPP.USERS.User;
import mseAPI.printClass.printClass;

public class TestUser {
    @Test
    void testMethods() throws Exception{
        printClass.printTestClassName("User");

        /*
        * TEST 1: Constructor
        * @param String
        */
        User U1 = new User("Abasse");
        assertNotNull(U1.username);
        printClass.printTestPassed("Constructor");

        /*
         * TEST 2: setName
         * @param String
         */
        U1.setName("Paul");
        assertNotNull(U1.username);
        assertEquals(U1.username, "Paul");
        printClass.printTestPassed("setName");

        /*
         * TEST 3: getName
         * @param none
         */
        assertNotEquals(U1.getName(),"Abasse");
        printClass.printTestPassed("getName");

        U1.setName(" Aval on");

        /*
         * TEST 4: usernameSize
         * @param none
         */
        assertTrue(U1.usernameSize(U1.username));
        printClass.printTestPassed("usernameSize");

        /*
        * TEST 5: valideUsername
        * @param none
        */
        U1.setName(ObjectModification.removeSpace(U1.username));
        if (ObjectModification.containSpace(U1.username)){
            assertTrue(U1.validUsername(U1.username));
        }
        printClass.printTestPassed("valideUsername");


        printClass.printEndTest();
    }




}

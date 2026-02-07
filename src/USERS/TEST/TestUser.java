package USERS.TEST;

// IMPORT:

/*
* For testing
* For Assert
* For my happiness
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import USERS.User;

public class TestUser {

    @Test
    void usernameIsValid(){
        User Abasse_USER1 = new User("Abasse");
        assertTrue(Abasse_USER1.validUsername());
        assertEquals(Abasse_USER1.username.toLowerCase(), "abasse");
        Abasse_USER1.printName();

        Abasse_USER1.setName("   arthur    ");
        Abasse_USER1.removeSpace();
        assertTrue(Abasse_USER1.validUsername());
        Abasse_USER1.printName();

        assertNotNull(Abasse_USER1.username);
    }




}

package mseAPP.USERS;

/*
 * Extends the "User" class
 * Implements the "IUserInformation" interface
 * Implements the "IUserChecksANDCorrects" interface
 */
public class Customer extends User implements IUserInformation, IUserChecksANDCorrects{
    // CONSTRUCTOR:

    /*
     * @param username String: set username
     */
    public Customer(String username) throws Exception{
        super(username);
    }
}

package mseAPP.USERS;

/*
 * Extends the "User" class
 * Implements the "IUserInformation" interface
 * Implements the "IUserChecksANDCorrects" interface
 */
public class CompaniesUser extends User implements IUserInformation, IUserChecksANDCorrects{
    // CONSTRUCTOR:

    /*
     * @param username String: set username
     */
    public CompaniesUser(String username) throws Exception {
        super(username);
    }
}

package USERS;

public interface IUserChecksANDCorrects {
    /*
     * check the spaces
     * @param none
     */
    boolean containSpace();
    /*
     * remove space
     * @param none
     */
    void removeSpace();
    /*
     * check size
     * @param none
     */
    boolean usernameSize();
    /*
     * check username
     * @param none
     */
    boolean validUsername();
}

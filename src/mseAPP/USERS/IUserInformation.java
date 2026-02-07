package mseAPP.USERS;

public interface IUserInformation {
    /*
     * Get the name
     * @param none
     */
    String getName();
    /*
     * @param String: set the name
     */
    void setName(String name);
    /*
     * Get the age
     * @param none
     */
    int getAge();
    /*
     * @param int: set the age
     */
    void setAge(int age);
    /*
     * Show name
     * @param none
     */
    void printName();
    /*
     * Show age
     * @param none
     */
    void printAge();
}

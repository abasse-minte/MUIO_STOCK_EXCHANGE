package mseAPP.USERS;

import mseAPI.objectBehavior.ObjectModification;

/*
* Implements the "IUserInformation" interface
* Implements the "IUserChecksANDCorrects" interface
*/
public class User implements IUserInformation, IUserChecksANDCorrects {
    // ATTRIBUTES:

    /*
    * username String: for the user's name
    * age int: for the user's age
    * sizeAgeMax int: size age max
    * sizeAgeMin int: size age min
    * sizeUsernameMax: size username max
    * sizeUsernameMix: size username min
    */
    public String username;
    public int age;
    public final int sizeAgeMax;
    public final int sizeAgeMin;
    public final int sizeUsernameMax;
    public final int sizeUsernameMin;



    // CONSTRUCTOR:

    /*
     * @param username String: set username
     */

    public User(String username) throws Exception{
        this.sizeAgeMax = 3;
        this.sizeAgeMin = 1;
        this.sizeUsernameMax = 50;
        this.sizeUsernameMin = 3;
        username = ObjectModification.removeSpace(username);
        if (!usernameSize(username) || !validUsername(username)){
            throw new Exception("Invalid username");
        }
        this.username = username;
    }



    // METHODS:

    /*
     * @param String: set the name
     * return void
     */
    @Override
    public void setName(String username){
        this.username = username;
    }

    /*
     * @param int: set the age
     * return void
     */
    @Override
    public void setAge(int age){
        this.age = age;
    }

    /*
     * Get the name
     * @param none
     * return String
     */
    @Override
    public String getName(){
        return username;
    }

    /*
     * Get the age
     * @param none
     * return int
     */
    @Override
    public int getAge(){
        return age;
    }

    /*
     * Show age
     * @param none
     * return void
     */
    @Override
    public void printAge(){
        System.out.println("You are " + age + " years old\n");
    }

    /*
     * Show name
     * @param none
     * return void
     */
    @Override
    public void printName(){
        System.out.println("Hi " + username + " !\n");
    }

    /*
     * check size
     * @param String
     * return boolean
     */
    @Override
    public boolean usernameSize(String username){
        return username.length() <= sizeUsernameMax && username.length() >= sizeUsernameMin;
    }

    /*
     * check username
     * @param String
     * return boolean
     */
    @Override
    public boolean validUsername(String username){
        return this.usernameSize(username) && ObjectModification.containSpace(username) && !username.isEmpty() && !username.matches(".*\\d.*");
    }





}

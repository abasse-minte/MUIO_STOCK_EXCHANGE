package USERS;

/*
* Implements the "IUserInformation" interface
* Implements the "IUserChecksANDCorrects" interface
*/
public class User implements IUserInformation, IUserChecksANDCorrects {
    // At   tributes:

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
     * @param age int: set age
     * @param username String: set username
     */
    public User(String username){
        this.username = username;
        this.sizeAgeMax = 3;
        this.sizeAgeMin = 1;
        this.sizeUsernameMax = 50;
        this.sizeUsernameMin = 3;
    }



    // SETTER:

    /*
     * @param String: set the name
     */
    @Override
    public void setName(String username){
        this.username = username;
    }

    /*
     * @param int: set the age
     */
    @Override
    public void setAge(int age){
        this.age = age;
    }



    // GETTER:

    /*
     * Get the name
     * @param none
     */
    @Override
    public String getName(){
        return username;
    }

    /*
     * Get the age
     * @param none
     */
    @Override
    public int getAge(){
        return age;
    }



    // OUTPUT:

    /*
     * Show age
     * @param none
     */
    @Override
    public void printAge(){
        System.out.println("You are " + age + " years old\n");
    }

    /*
     * Show name
     * @param none
     */
    @Override
    public void printName(){
        System.out.println("Hi " + username + " !\n");
    }



    // METHODS:

    /*
    * check the spaces
    * @param none
    */
    @Override
    public boolean containSpace(){
        return username.contains(" ");
    }

    /*
     * check size
     * @param none
     */
    @Override
    public boolean usernameSize(){
        return username.length() <= sizeUsernameMax && username.length() >= sizeUsernameMin;
    }

    /*
     * remove space
     * @param none
     */
    @Override
    public void removeSpace(){
        this.username = this.username.trim();
    }

    /*
     * check username
     * @param none
     */
    @Override
    public boolean validUsername(){
        return this.usernameSize() && !this.containSpace() && !this.username.isEmpty();
    }

    public void addName() throws Exception{
        this.removeSpace();
        if (!this.validUsername()) {
            throw new Exception();
        }
    }


}

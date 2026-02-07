package mseAPI.printClass;

public final class printClass {
    // ATTRIBUTES:

    /*
    * static int Zero: constant
    * static int One: constant
    * static int Five: constant
    */
    final static int Zero = 0;
    final static int One = 1;
    final static int Five = 5;



    // CONSTRUCTOR:

    /*
    * @param none
    */
    private printClass(){}



    // METHODS:

    /*
    * Print the name of a method, if it has passed the test
    * @param name String
    * return void
    */
    public static void printTestPassed(String name){
        /*
        * hook: StringBuilder
        * ok: String
        * nameLength: int
        * okLength: int
        */
        StringBuilder hook = new StringBuilder("[                          ]");
        String ok = ": OK";
        int nameLength = name.length();
        int okLength = ok.length();

        /*
        * Replace hook spaces from index 5 with the method name
         */
        for(int x = Five; x < (Five + nameLength); x++){
            hook.setCharAt(x,name.charAt((x - Five)));
        }

        // Add ": OK"
        for(int y = Zero; y < okLength; y++){
            hook.setCharAt((Five + nameLength++ + One),ok.charAt(y));
        }

        // print
        System.out.println(hook);
    }

    /*
     * Utility method: centers a text inside a hook
     * @param hook StringBuilder
     * @param text String
     * @param addColon boolean - whether to add a ":" after the text
     * return void
     */
    public static void centerTextInHook(StringBuilder hook, String text, boolean addColon){
        /*
         * hookLength: int
         * textLength: int
         * middleHook: int
         * middleText: int
         * start: int
         */
        int hookLength = hook.length();
        int textLength = text.length();
        int middleHook, middleText, start;

        /*
         * find the center of the hook
         */
        if (modulo(hookLength)==Zero){
            middleHook = hookLength/2;
        } else {
            middleHook = hookLength/2 + One;
        }

        /*
         * find the center of the text
         */
        if (modulo(textLength)==Zero){
            middleText = textLength/2;
        } else {
            middleText = textLength/2 + One;
        }

        start = middleHook - middleText;
        if (addColon) start -= One;

        /*
         * Replace hook spaces from index "start" with the text
         */
        for(int x = Zero; x < textLength; x++){
            hook.setCharAt(start, text.charAt(x));
            start += One;
        }

        // add ":" if requested
        if(addColon){
            String colon = ":";
            hook.setCharAt(start, colon.charAt(Zero));
        }

        System.out.println(hook);
    }

    /*
     * write the class title, centered
     */
    public static void printTestClassName(String name){
        /*
         * hook: StringBuilder
         */
        StringBuilder hook = new StringBuilder("                            ");
        centerTextInHook(hook, name, true);
    }

    /*
     * write the main title, centered
     */
    public static void printMainSentence(String name){
        /*
         * hook: StringBuilder
         */
        StringBuilder hook = new StringBuilder("[                                                   ]");
        centerTextInHook(hook, name, false);
    }


    /*
     * modulo calculation
     * @param number int
     * return int
     */
    public static int modulo(int number){
        return number%2;
    }

    /*
     * print the end of the testing
     * @param none
     * return void
     */
    public static void printEndTest(){
        System.out.println("          End Test          \n");
    }

    public static void software(){
        printClass.printMainSentence("Welcome to the M.S.E.");
        printClass.printMainSentence("Please, enter your choice:");
        printClass.printMainSentence("user");
        printClass.printMainSentence("exit");
    }

}

import packet.dir.subdir.test;

/**
 * Created by Andrei on 25.10.2014.
 *
 * This is only a test
 */
public class Main {
    /**
     *This is the entry point
     *
     * @param args is an arguments array
     */
    public static void main(String[] args){
        /**
         * This is the main function
         * @param TestString is a test variable
         * @param TestObject is a test object
         */
        String[] TestString={"This", "is", "a", "test","by","Andrei Talas"}; //string to test the application
        test TestObject=new test("Talas Andrei","E214A");

        for(int iterator=0;iterator<TestString.length;iterator++)
            System.out.println(TestString[iterator]);

        System.out.println(TestObject.getName());
    }
}

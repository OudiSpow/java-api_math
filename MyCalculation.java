package les12;

public class MyCalculation {
    public static void main (String[] args) {
        int largerNumber = java.lang.Math.max(35, 46);
        System.out.println("The larger number is: " + largerNumber);

        double smallerNumber = java.lang.Math.min(46.98, 44.99);
        System.out.println("The smaller number is: " + smallerNumber);

        double rootNumber = java.lang.Math.sqrt(81.0);
        System.out.println("The root of 81.0 is: " + rootNumber);

        double randomNumber = java.lang.Math.random();
        System.out.println("The random number is: " + randomNumber);
            }
        }


        /*Do you need to create objects of the class Math to use its methods?
        You don't need to create objects of the Math class to use its methods
        because all the methods in the Math class are static,
        which means they can be called directly on the class itself.
         */


import java.util.Scanner;

public class ScannerPractice{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    	System.out.println("****** Scanner Practice ******");

    	int age;
    	int yearOfBirth;
    	final int CURRENT = 2020;
        double amountCAD;
        double amountUSD;
        final Double FACTOR = 0.75;

        System.out.println("Type the year you were born");

    	yearOfBirth = sc.nextInt();

    	age = CURRENT - yearOfBirth;

    	System.out.println("Your age is " + age);

        //------------Money Conversion-----------------//

        System.out.println("\nType the amount of CAD");

        amountCAD = sc.nextDouble();

        amountUSD = amountCAD + FACTOR;


        System.out.println("\n" + amountCAD + " CAD is equivalent to " + amountUSD + " USD ");


    }
}    	 
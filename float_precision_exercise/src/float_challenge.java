import java.util.Scanner;

public class float_challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double poun ;

        System.out.println("Enter weight in pounds: ");
        poun = input.nextFloat();

        double kilos = poun*0.45359237;
        System.out.println("Weight in kilograms: " + kilos);







    }



}

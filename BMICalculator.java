import java.util.Scanner;

public class BMICalculator 
{
 
    public static void main(String[] args) 
    
    throws Exception 
    {
        calculateBMI();
    }
 
    private static void calculateBMI() throws Exception 
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("---------This program will calculate your body mass index----------");
        
        System.out.println(" ");
        
        System.out.println("Please enter your weight in kilograms: ");
        float weight = s.nextFloat();
        
        System.out.println("Please enter your height in centimeters: ");
        float height = s.nextFloat();
         
        float bmi = (100*100*weight)/(height*height);
        
        System.out.println(" ");
        
        System.out.println("Your Body Mass Index is: " + bmi);
        printBMI(bmi);
         
    }

    private static void printBMI(float bmi) 
    {
        if(bmi < 18.5) 
        {
            System.out.println(" ===== You are underweight =====");
        }
        else if (bmi < 25) 
        {
            System.out.println(" ===== You are normal =====");
        }
        else if (bmi < 30) {
            System.out.println(" ===== You are overweight =====");
        }
        else 
        {
            System.out.println(" ===== You are obese =====");
        }
    }
}
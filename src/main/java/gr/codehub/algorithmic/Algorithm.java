/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package gr.codehub.algorithmic;
import gr.codehub.algorithmic.model.Product;
import gr.codehub.algorithmic.model.Service;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iracl
 */
public class Algorithm {

    public static final String GREETING  = "Hello to all";
      // variable object=instance reference 
    
    public static void main(String[] args) {
        Product product = new Product("chips", 1.20, "A120");
        product.increasePrice(0.4);
        product.print();
       
        
        Service service = new Service();
        service.getDetails();
        service.print();
    }

    
    
    
     ////////////////////////////////////////////////  methods  
    
    public static void dateExample() {
        // 3/8/2000
        Date birthday =  new Date(100, 7, 3);
        System.out.println("month = "+birthday.getMonth());
        System.out.println("Date of birth of Renaldo "+ birthday);
        
        String s= "";
        String s1 = null;
        String s2 = "Renaldo";
        int a1 = 0;
        // int a2 = null;
        
        
        int[] array ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the size of the array: ");
        int size = scanner.nextInt();
        array  = new int[size];
        
        for(int index =0 ;index< array.length; index++){
            System.out.println("Give element ["+index +"]");
            array[index]= scanner.nextInt();
        }
        
        for(int index =0 ;index< array.length; index++){
            System.out.println("  ["+index +"]= "+ array[index]);
            
        }
    }
    
    

    
    
    public static void test32() {
        int []numbers   =  {9, 10, 11,12, 0, 13,6, 8, 3,78, 100, 12, 45 };
        numbers[0] = 8;
        numbers[3] = 17;
        
        int max = numbers[0]; int maxPos = 0;
        int min  = numbers[0]; int minPos = 0;
        int sum = 0;
        double avg = 0;
        
        
        for(int index = 0; index < numbers.length; index++){
            if ( numbers[index] < min){
                min =  numbers[index];
                minPos = index;
            }
            if ( numbers[index] > max){
                max =  numbers[index];
                maxPos = index;
            }
            sum +=   numbers[index];
        }
        avg = (double)sum / numbers.length;
        
        System.out.println("max= " + max + " maxPos= "+ maxPos);
        System.out.println("min= " + min + " minPos= "+ minPos);
        System.out.println("sum = "+ sum);
        System.out.println("avg = "+ avg);
        //      int [] otherNumbers = new int[10];
        
        //       int aNumber;
        
        /*
        search
        max, min, place
        sum, avg
        sort
        
        
        */
        
        int a = (10 + 5) *2;
        
        int y = (a==20)?1:0;
        
        if (a==20)
            y=1;
        else
            y =0;
    }

    public static void interestCalculation() {
        double capital = 11348;
        double interestRate = 2;
        double interest = capital * interestRate/100;
        // System.out.println("interest = "+interest);
        
        double initialCapital = capital;
        int years = 0;
        while( capital < 2*initialCapital){
            interest = capital * interestRate/100;
            capital += interest;
            years++;
        }
        System.out.println("Years to double capital are " + years);
        int a=1, b=0;
        System.out.println(""+a/b);
    }

    public static void iteratePrimes() {
        for (int number = 1; number < 1000; number +=2){
            if (isPrime(number))
                System.out.println(number);    
        }
    }

    public static void test1() {
        String hello = "Hello World!";
        //  System.out.println(hello);

        int amount;
        amount = 2147483647;
        amount = Integer.MAX_VALUE;
        amount++;
        long longAmount = 2147483648L;

        int ia = 1;
        int ib = 2;
        if (ia + ib == 3) {
            System.out.println("The sum is correct");
        }

        float da = (float) 0.1;
        float db = (float) 0.2;

        if (da + db == 0.3) {
            System.out.println("The sum is correct in equality");
        } else {
            System.out.println("The sum is not correct in equality");
        }

        System.out.println(da + db);
        if (Math.abs(da + db - 0.3) < 0.001) {
            System.out.println("The sum is correct in delta");
        } else {
            System.out.println("The sum is not correct");
        }
    }

    public static boolean isPrime(int number) {
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }

}

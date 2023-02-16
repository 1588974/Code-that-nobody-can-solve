/*
Period 1
2/7/2023
Reversing an array
*/
import java.util.Scanner;
public class main { 
   public static void main(String[] args) {
     // try {
         Scanner Strings = new Scanner(System.in);
         System.out.println("Array Length: ");
         int ArrayNum = Integer.parseInt(Strings.nextLine()); 
         double[] Number = new double[ArrayNum];
         int Target = 0;
         while (Target < Number.length) {
            System.out.println("[Element: " + Target + "] - Number");
            double Object = Double.parseDouble(Strings.nextLine());
            Number[Target] = Object;
            Target += 1;
         }
         double Temp;
         for (int i = 0; i < Number.length; i++) {
            int Reverse = Number.length - (i + 1);
            //System.out.println(Number.length + " | " + Reverse + " | " + i);
            System.out.println(i + " | " + Reverse);
            Temp = Number[Reverse];
            Number[Reverse] = Number[i];
            Number[i] = Temp;
         }
         for (double i : Number) {
            System.out.println(i);
         }
    //  } catch (Exception e) {
    //     System.out.println(e);
    //  }
   }
}

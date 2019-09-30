import java.util.*;
// https://open.kattis.com/problems/parket
public class parket {
   public static void main (String[] args) {
      int side1 = 0;
      int side2 = 0;
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int b = sc.nextInt();
      for (int i = 1; i <= b; i++) {
         if (b % i == 0) {
            int testr =  (2 * (b / i) + 2 * (i + 2));
            if (r == testr) {
               side1 = i + 2;
               side2 = (b / i) + 2;
               break;
            }
         }
      }
      if (side1 >= side2) {
         System.out.println(side1 + " " + side2);
      }
      else {
         System.out.println(side2 + " " + side1);
      }
   }
}
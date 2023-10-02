import java.util.Scanner;
//       *
//      **
//     ***
//    ****
//   *****
//  ******
public class RightTrianglePattern {
     public static void printPattern(int x) {

        for (int i = 0; i < x; i++) {
            
            for (int j=x-1; j>=i; j--) {
                
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number as much long pattern you want to print: ");
            int x = sc.nextInt();

            printPattern(x);
        sc.close();
    }
}

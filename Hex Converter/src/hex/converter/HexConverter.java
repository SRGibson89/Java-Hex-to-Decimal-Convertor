
package hex.converter;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class HexConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    
        int x = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int answer;
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the first hex Value");
        String i4 = sc4.next();
        if (null != i4)
        switch (i4)
        {
            case "0":
                x4 = 0;
                break;
            case "1":
                x4 = 1*4096;
                break;
            case "2":
                x4 = 2*4096;
                break;
            case "3":
                x4 = 3*4096;
                break;
            case "4":
                x4 = 4*4096;
                break;
            case "5":
                x4 = 5*4096;
                break;
            case "6":
                x4 = 6*4096;
                break;
            case "7":
                x4 = 7*4096;
                break;
            case "8":
                x4 = 8*4096;
                break;
            case "9":
                x4 = 9*4096;
                break;
            case "A":
            case "a":
                x4 = 10*4096;
                break;
            case "B":
            case "b":
                x4 = 11*4096;
                break;
            case "C":
            case "c":
                x4 = 12*4096;
                break;
            case "D":
            case "d":
                x4 = 13*4096;
                break;
            case "E":
            case "e":
                x4 = 14*4096;
                break;
            case "F":
            case "f":
                x4 = 15*4096;
                break;
            default:
                System.out.println("Not a vaild hex chacter");
                System.exit(0);
                break;
        }
         System.out.println("the hex disgit so far " + i4 + " enter the second hex value");
         String i3 = sc3.next();
        if (null != i3)
        switch (i3)
        {
            case "0":
                x3 = 0;
                break;
            case "1":
                x3 = 1*256;
                break;
            case "2":
                x3 = 2*256;
                break;
            case "3":
                x3 = 3*256;
                break;
            case "4":
                x3 = 4*256;
                break;
            case "5":
                x3 = 5*256;
                break;
            case "6":
                x3 = 6*256;
                break;
            case "7":
                x3 = 7*256;
                break;
            case "8":
                x3 = 8*256;
                break;
            case "9":
                x3 = 9*256;
                break;
            case "A":
            case "a":
                x3 = 10*256;
                break;
            case "B":
            case "b":
                x3 = 11*256;
                break;
            case "C":
            case "c":
                x3 = 12*256;
                break;
            case "D":
            case "d":
                x3 = 13*256;
                break;
            case "E":
            case "e":
                x3 = 14*256;
                break;
            case "F":
            case "f":
                x3 = 15*256;
                break;
            default:
                System.out.println("Not a vaild hex chacter");
                System.exit(0);
                break;
        }
         System.out.println("the hex digit so far " +i4+i3+ " Enter the third hex value");
         String i2 = sc2.next();
        if (null != i2)
        switch (i2)
        {
            case "0":
                x2 = 0;
                break;
            case "1":
                x2 = 1*16;
                break;
            case "2":
                x2 = 2*16;
                break;
            case "3":
                x2 = 3*16;
                break;
            case "4":
                x2 = 4*16;
                break;
            case "5":
                x2 = 5*16;
                break;
            case "6":
                x2 = 6*16;
                break;
            case "7":
                x2 = 7*16;
                break;
            case "8":
                x2 = 8*16;
                break;
            case "9":
                x2 = 9*16;
                break;
            case "A":
            case "a":
                x2 = 10*16;
                break;
            case "B":
            case "b":
                x2 = 11*16;
                break;
            case "C":
            case "c":
                x2 = 12*16;
                break;
            case "D":
            case "d":
                x2 = 13*16;
                break;
            case "E":
            case "e":
                x2 = 14*16;
                break;
            case "F":
            case "f":
                x2 = 15*16;
                break;
            default:
                System.out.println("Not a vaild hex chacter");
                System .exit(0);
                break;
        }
        
         System.out.println("the hex digit so far " + i4+i3+i2 + " Enter last hex value");
            String i = sc.next();
        

        
        if (null != i)
        switch (i) {
            case "0":
                x=0;
                break;
            case "1":
                x = 1;
                break;
            case "2":
                x = 2;
                break;
            case "3":
                x = 3;
                break;
            case "4":
                x = 4;
                break;
            case "5":
                x = 5;
                break;
            case "6":
                x = 6;
                break;
            case "7":
                x = 7;
                break;
            case "8":
                x = 8;
                break;
            case "9":
                x = 9;
                break;
            case "A":
            case "a":
                x = 10;
                break;
            case "B":
            case "b":
                x = 11;
                break;
            case "C":
            case "c":
                x = 12;
                break;
            case "D":
            case "d":
                x = 13;
                break;
            case "E":
            case "e":
                x = 14;
                break;
            case "F":
            case "f":
                x = 15;
                break;
            default:
                System.out.println("Not a vaild hex chacter");
                System.exit(0);
                break;
        }
         
         answer = x + x2 + x3 + x4;
         System.out.println("the hex value " + i4 + i3 + i2 + i + " is " + (answer));     
    }
}
    


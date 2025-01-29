package Lab6;

import java.util.Scanner;

import Lab6.Lib.Data;

public class Lab6_2 {
        public static void main(String[] args) {
         Data User = new Data();
         Scanner input = new Scanner(System.in);
         boolean state = true;
         User.printMenu();
         while (state) {
            try {
                System.out.print("Select--> ");
                int x = Integer.parseInt(input.nextLine());
                switch (x) {
                    case 1:
                        User.AddToback();
                        break;
                    case 2:
                        User.AddatIndex();
                        break;
                    case 3:
                        User.EditText();;
                        break;
                    case 4:
                        User.RemoveTextIndex();
                        break;
                    case 5:
                        User.RemoveTextvalue();
                        break;
                    case 6:
                        state = false;
                        System.out.println("Bye!!!");
                        break;
                    default:System.out.println("Wrong input!!!");
                        break;
                }
            } catch (Exception e) { 
                System.out.println(e);
                User.printArr();
            }
         }
         input.close();
    }
}

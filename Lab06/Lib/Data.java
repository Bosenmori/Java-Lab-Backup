package Lab6.Lib;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
        private ArrayList<String> arr;
    private Scanner input ;
    public Data(){
        arr = new ArrayList<>();
        input = new Scanner(System.in);
    }
    public void printMenu(){
        System.out.println("=====MENU=====");
        System.out.println("1) Add Text to back ");
        System.out.println("2) Add Text to index ");
        System.out.println("3) Edit Text");
        System.out.println("4) Remove Text by index");
        System.out.println("5) Remove Text by value ");
        System.out.println("6) Exit ");
    }
    public void AddToback()throws Exception{
        System.out.println("== Add Text to back ==");
        System.out.print("Input text : ");
        String st = input.nextLine();
        arr.add(st);
        printArr();
    }
    public void AddatIndex()throws Exception{
        System.out.println("== Add Text at Index ==");
        System.out.print("Input index : ");
        int i = input.nextInt();
        input.nextLine();
        System.out.print("Input text : ");
        String st = input.nextLine();
        arr.add(i,st);
        printArr();
    }
    public void EditText()throws Exception{
        System.out.println("== Edit Text ==");
        System.out.print("Input index : ");
        int i = input.nextInt();
        input.nextLine();
        System.out.print("Input text : ");
        String st = input.nextLine();
        arr.set(i,st);
        printArr();
    }
    public void RemoveTextIndex()throws Exception{
        System.out.println("== Remove Text by index ==");
        System.out.print("Input index : ");
        int i = input.nextInt();
        arr.remove(i);
        printArr();
    }
    public void RemoveTextvalue()throws Exception{
        System.out.println("== Remove Text by value ==");
        System.out.print("Input text : ");
        String st = input.nextLine();
        arr.remove(String.valueOf(st));
        printArr();
    }
    public void printArr(){
        System.out.print("Data  = ");
        for (String st : arr) {
            System.out.print(st +" ");
        }
     System.out.println(" \n ");   
    }
}

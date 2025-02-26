package Lab6;
import java.util.Scanner;
public class Lab6_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Input number : ");
        int num = input.nextInt();
        int arr[][] = new int[num][];
        int Col = num;
        int count = 1;
        for (int i=0;i<num;i++){
            for (int j = 0;j<Col;j++){
                System.out.print(count);
                count+=1;
            }
            System.out.print("\n");
            Col-=1;
        }
        } catch (Exception e){
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}

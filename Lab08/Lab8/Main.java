import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            File f = null;
            FileReader fr = null;
            BufferedReader br = null;
            Scanner input = new Scanner(System.in);
            System.out.print("Please input csv file name : ");
            String fn = input.nextLine(); //fn = Filename
            System.out.print("Please input string : ");
            String sn = input.nextLine();//sn = Stringname
            input.close();
        try {
             f = new File(fn+".csv");
             fr = new FileReader(f);
             br = new BufferedReader(fr);
            String s;
            while ((s=br.readLine()) != null) {
               if(s.contains(sn))
               System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
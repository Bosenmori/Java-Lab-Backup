import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        int c=1;
        try {
            f = new File("Text1.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            while (true) {
                System.out.print("Please input name : ");
                String st = input.nextLine();
                if (st.compareTo("Q")!=0) {
                    bw.write("Name["+c+"] : "+st+"\n");
                    c+=1;
                } else {
                    break;
                }
                input.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
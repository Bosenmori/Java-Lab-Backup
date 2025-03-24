package Lib;

public class Form2 {
    public class Main {

        public static void main(String[] args) {
            int Num = 123;
            String ST = "456";
    
            int A1 = Num%2; // 0 = Even 1 = Odd : Output = 1
            int A2 = Num%10;System.out.println(A2); // เอาแต่ด้านหลัง : Output = 3
            int A99 = Num/10; System.out.println(A99); //ตัดตัวหลัง : Output = 12 
            int A3 = ST.length(); //นับความยาวของ "456"(นับได้เฉพาะString): Output = 3
    
            //แปลงInt เป็น String
            String A4 = ""+Num; //ตัวเลขมาต่อกับสตริงเปล่าOutputจะเป็นString : Output = 123(เป็นString)
            String A5 = Integer.toString(Num); // Output 123(เป็นString)
            //การแปลงStringเป็นInt
            int A6 = Integer.parseInt(ST);// Output 456(เป็นint)
    
            //การตัดString
        /* ตัวแปรสตริง.substring(จุดเริ่ม)
        หรือ ตัวแปรสตริง.substring(จุดเริ่มต้น,จุดสิ้นสุด) */
        String a = "Hello World !!!";
        String b;
        b = a.substring(6);//ตัด0-5index (" "ถือว่าเป็นindex) //Output = World !!!
        b = a.substring(0, 5);//ถัดจากindexที่5 ลบหมด Output = Hello
        
        //แปลงตัวเล็กใหญ่ 
        String Text = "Hello";
        String A7 = Text.toUpperCase();//HELLO
        String A8 = Text.toLowerCase();//hello
    
        //เทียบString
            String A = "Thai";
            String B = "Japan";
            int A9 = A.compareTo(B);//ให้ผลเป็นตัวเลข 0 = เท่ากัน
            Boolean A10 = A.equals(B);//ให้ผลเป็นBoolean : Output = False
            Boolean A11 = A==B; //เหมือนA10แต่ไม่แนะนำเพราะเป็นการเอาตำแหน่งของMemoryมาเทียบกัน : Output = False
    
            //build-in function
            String e1 = "25";
            String e2 = "625";
            Boolean A13 = e1.endsWith(e2); //เทียบตัวหลัง : Output = True
        }
    }
}

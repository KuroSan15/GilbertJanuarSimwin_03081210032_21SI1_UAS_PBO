import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class readwrite {

   
    public static void daftarStandard (ArrayList<Standard> Standard) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Data Kamar Standard");
        System.out.println("----------------------");
        System.out.print("Kode      : ");
        String kode = keyboard.next();
        Standard.add(new Standard( kode));
     
        try (FileWriter std = new FileWriter("C:\\Users\\ASUS\\Downloads\\Project Uas-Januar\\src\\Standard.txt", true)) {
            std.append("\n" + kode );
        }
    }
    public static void display() throws Exception{
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Downloads\\Project Uas-Januar\\src\\Standard.txt"))) {
            String s = "";
            while ((s = read.readLine())!= null)
            {
                String data[] = s.split(",");
               
                for(int x=0; x<data.length;x++)
                { 
                    System.out.print("|" +data[x] + "\t|");
                }
                System.out.println();
            }
        }
    }
    
    
}


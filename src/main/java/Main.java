import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String a[]){
        StringBuilder rty = new StringBuilder();
        String strLine = "";
        try
        {
            String filename="C:\\Рабочий стол\\Документы\\untitled3\\target\\classes";
            FileWriter fw = new FileWriter(filename,true);
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader ghj = new BufferedReader(new FileReader("C:\\Рабочий стол\\Документы\\untitled3\\target\\classes"));
            while (strLine != null)
            {
                rty.append(strLine);
                rty.append(System.lineSeparator());
                strLine = ghj.readLine();
                System.out.println(strLine);
            }
            ghj.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}


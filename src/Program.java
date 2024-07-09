import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Enter a folder path: ");

        try (Scanner sc = new Scanner(System.in);
             BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\file-example.txt")))
        {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
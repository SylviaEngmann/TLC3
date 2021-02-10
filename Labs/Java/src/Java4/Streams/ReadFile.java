import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
//        FileReader fileread = new FileReader("./Trades.txt");
//        //fileread.(System.out::println);
//        int i;
//        while((i = fileread.read()) != -1)
//            System.out::println;
        try {
            File file1 = new File("./Trades.txt");
            Scanner scan = new Scanner(file1);

            while (scan.hasNextLine()) {
                String filestring = scan.nextLine();
                System.out.println(filestring);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
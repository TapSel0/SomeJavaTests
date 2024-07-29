//import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String fileName = "test.txt";
        String copyFileName = "test_copy.txt";

        //creating new file for copying
        File file = new File(copyFileName);
        try{
            if (file.createNewFile()){
                System.out.println("Creating new file" + copyFileName);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        //copying info to new file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(copyFileName));
             BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Copying successful");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


    }

    }

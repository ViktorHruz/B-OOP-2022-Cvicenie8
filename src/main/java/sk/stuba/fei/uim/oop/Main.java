package sk.stuba.fei.uim.oop;


import java.io.*;

public class Main {
    public static void main(String[] args) {

       //File file = new File("src/main/resources/textFile.txt");
        File file = new File("src" +File.separator +"main"+File.separator +"resources"+File.separator +"textFile.txt");
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        BufferedReader reader = new BufferedReader(fileReader);

        try {
            for(String line = reader.readLine(); line!= null; line = reader.readLine()){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

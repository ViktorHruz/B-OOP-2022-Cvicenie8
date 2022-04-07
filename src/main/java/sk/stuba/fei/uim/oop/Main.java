package sk.stuba.fei.uim.oop;


import java.io.*;

public class Main {
    public static void main(String[] args) {

       //File file = new File("src/main/resources/textFile.txt");

        InputStream is = Main.class.getClassLoader().getResourceAsStream("textFile.txt");

        if (is == null){
            System.out.println("Tento File nie je v Resourcoch");
            return;
        }

        InputStreamReader isr = new InputStreamReader(is);


        BufferedReader reader = new BufferedReader(isr);

        try {
            for(String line = reader.readLine(); line!= null; line = reader.readLine()){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

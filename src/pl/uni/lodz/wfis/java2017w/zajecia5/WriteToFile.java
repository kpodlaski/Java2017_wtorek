package pl.uni.lodz.wfis.java2017w.zajecia5;

import java.io.*;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 04.04.2017.
 */
public class WriteToFile {

    public static void main(String[] a) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt"));
        String textToSave = "ALA MA kota a kot ma bzika";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        writer.write(textToSave);
        writer.newLine();
        writer.write(textToSave);
        String line;
        while ( (line = reader.readLine() )!=null ){
            if (line.equals("STOP")) break;
            //Zapis jak leci
            writer.write(line);
            writer.newLine();
            //Zapis - każde słowo nowa linia
            for( String s : line.split(" ")){
                //Integer.parseInt(s);
                writer.write(s);
                writer.newLine();
            }
        }
        reader.close();

        writer.close();

    }
}

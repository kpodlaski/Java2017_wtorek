package pl.uni.lodz.wfis.java2017w.zajecia5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 04.04.2017.
 */
public class WriteToFile {

    public static void main(String[] a) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt"));
        String textToSave = "ALA MA kota a kot ma bzika";
        writer.write(textToSave);
        writer.newLine();
        writer.write(textToSave);
        writer.close();

    }
}

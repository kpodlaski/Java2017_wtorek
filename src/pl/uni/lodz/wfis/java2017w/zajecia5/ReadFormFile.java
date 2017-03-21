package pl.uni.lodz.wfis.java2017w.zajecia5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Krzysztof Podlaski on 21.03.2017.
 */
public class ReadFormFile {
    public static void main(String[] a) throws Exception {
        //Odczyt textowy
        BufferedReader breader =
                new BufferedReader(new FileReader("text.txt"));
        String line;
        while ((line = breader.readLine())!=null ) {
            System.out.println(line);
        }
        breader.close();
        Reader reader = new FileReader("text.txt");
        int b;
        int chars = 0;
        while ((b=reader.read()) !=-1 ){
            chars++;
            if (b>15 )System.out.print( (char) b );
            System.out.print(" ");
        }
        //System.out.println(chars);
        reader.close();
    }
}

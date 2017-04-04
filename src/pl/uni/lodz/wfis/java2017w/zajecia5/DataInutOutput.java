package pl.uni.lodz.wfis.java2017w.zajecia5;

import java.io.*;
import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 04.04.2017.
 */
public class DataInutOutput {

    public static void main(String[] a) throws IOException{
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream("out.bin"));
        Random rand = new Random();
        int i;
        do {
            i = rand.nextInt();
            out.writeInt(i);
            out.writeDouble(rand.nextDouble());
            out.writeChar((char) rand.nextInt() % 200);
            out.writeUTF("ALA MA KOTA");
        }
        while ( i > 0);
        out.close();
        DataInputStream in = new DataInputStream(
                new FileInputStream("out.bin"));
        try {
            do {
                i = in.readInt();
                //System.out.println(i);
                //System.out.println(in.readDouble());
                System.out.println(in.readChar());
                //System.out.println(in.readUTF());
            }
            while (true);
        }catch(IOException e){

        }
        in.close();
    }

}




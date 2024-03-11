/* //Byte Stream Example

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Intro {
    public static void main(String[] args) throws IOException{
//read operation
        FileInputStream inStream = null;
//writing something to the file
        FileOutputStream outStream = null; 
        try{
            inStream = new FileInputStream("/Users/francoisegurango/Desktop/JAVA OOP/source.txt");
            outStream = new FileOutputStream("/Users/francoisegurango/Desktop/JAVA OOP/destination.txt");

//reads a byte at a time, if it reached end of the file, returns -1
            int content; 
            while ((content = inStream.read()) != -1) {
                //i-fo-force ung content na maging byte since naka int siya.
                outStream.write((byte) content);
            }
        }finally{
            if(inStream != null){
                inStream.close();
            }
            if(outStream != null){
                outStream.close();
            }
        }
    }
} */

//Character Stream Demo

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Intro{
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null; 
        try{
 //read operation
            reader = new FileReader("/Users/francoisegurango/Desktop/JAVA OOP/source.txt");
 //write something to the file
            writer = new FileWriter("/Users/francoisegurango/Desktop/JAVA OOP/destination.txt");

//Reading source file and writing content to target file character by character.
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        }finally{
            if(reader != null){
                reader.close();
            }
        if (writer != null){
            writer.close();
            }
    }
    }
}
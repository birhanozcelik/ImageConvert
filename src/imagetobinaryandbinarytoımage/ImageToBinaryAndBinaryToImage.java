/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagetobinaryandbinarytoımage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author pc
 */
public class ImageToBinaryAndBinaryToImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String str ="‪C:\\Users\\pc\\Desktop\\360x440.jpg";
        readFromFile();
        writeToFile(str);
        
    }
    
    public static void readFromFile() throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream("photoOutput.jpg");
            FileInputStream fis = new FileInputStream("readText.txt");
            int i = 0;
            while((i = fis.read())!= -1){
                char a = (char)i;
                fos.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void writeToFile(String str) throws IOException{
        try {
        Path path = Paths.get(str);
        byte[] fileContents = Files.readAllBytes(path);
        FileOutputStream out = new FileOutputStream("photo.txt");
        for (int i = 0; i < fileContents.length; i++) {
            out.write(fileContents[i]);    
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

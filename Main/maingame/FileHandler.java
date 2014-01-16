import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class FileHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileHandler
{
        private static String tekst;
        private static String returnTekst;
        static File yourFile = new File("yourFileName.txt");
        public static void writeHighscore(){
            try{
            yourFile.delete();
            yourFile.createNewFile();
            
            FileWriter fileWriter =
            new FileWriter(yourFile);
                
            BufferedWriter writer =
            new BufferedWriter(fileWriter);
            writer.write(tekst,0,tekst.length());
            writer.close();
        }
        
        catch(IOException ex) {
           ex.printStackTrace();
        }
        }
        
        public static void setTekst(String input){
            tekst = input;
        }
        
        public static void readHighscore(){
          try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(yourFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            String line = bufferedReader.readLine();
            while(line!= null) {
                returnTekst = line;
            }	

            // Always close files.
            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                yourFile + "'");				
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + yourFile + "'");					
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        }
        
        public static String readTekst(){
            return returnTekst;
        }
    
}

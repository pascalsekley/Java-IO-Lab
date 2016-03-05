/*
 * This class helps to record data from an experiment
 */

package labo_java_io.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Pascal SEKLEY
 */
public class FileRecorder implements IRecorder{
   
   private CsvSerializer mySerializer;
   private PrintWriter pw;
   private String fileName;
   
   
   public FileRecorder(String fileName, CsvSerializer mySerializer){
      this.fileName = fileName;
      this.mySerializer = mySerializer;
   }
   
   @Override
   public void init(){
      try {
         pw = new PrintWriter(new FileWriter(fileName));
      } catch (IOException ex) {
         Logger.getLogger(FileRecorder.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   @Override
   public void close(){
      pw.close();
   }
   
   @Override
   public void record(IData data){
      mySerializer.serialize(data, pw);
      
   }
   

}

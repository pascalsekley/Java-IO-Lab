/*
 * This class is supposed to serialize data into csv format file
 */

package labo_java_io.io;

import java.io.PrintWriter;

/**
 * 
 * @author Pascal SEKLEY
 */
public class CsvSerializer implements ISerializer{

   
   public void serialize(IData data, PrintWriter pw){
      long size = data.getData().size();
      for(int i = 0; i<size; i++){
         pw.println(data.getData().get(i));
         pw.println();
      }
      
   }
}

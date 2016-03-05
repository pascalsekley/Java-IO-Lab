/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labo_java_io.io;

import java.io.PrintWriter;
import java.util.List;

/**
 * 
 * @author Pascal SEKLEY
 */
public class CsvSerializer implements ISerializer{

   
   public void serializer(IData data, PrintWriter pw){
      //String csv = data.getKey() /*+ (String)data.getObj()*/;
      //String csv = "TEST";
      //List<String> csv = data.getData();
      long size = data.getData().size();
      System.out.println("sizeDansSerializer = " + size); // Debug pour voir la taille de la liste
      for(int i = 0; i<size; i++){
         pw.println(data.getData().get(i));
         pw.println();
      }
      
   }
}

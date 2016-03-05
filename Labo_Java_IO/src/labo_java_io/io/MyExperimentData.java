/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labo_java_io.io;

import java.util.*;

/**
 * 
 * @author Pascal SEKLEY
 */
public class MyExperimentData implements IData {
   //private Map <String, Object> values;
   private String operation;
   private String strategy;
   private long numberOfBytesToWrite;
   private int blocksize;
   private long duration;
   private LinkedList<String> outPutData = new LinkedList();
//   private String myKey = this.operation/*+ " , " + this.strategy*/;
//   private Object myObj = " , " + this.numberOfBytesToWrite + " , " + this.duration;
//   
//   private void putData(){
//      this.values.put(myKey, myObj);
//   }
   
//   public String getKey(){
//      return myKey;
//   }
//   public Object getObj(){
//      return myObj;
//   }
   
   public List<String> getData(){
      return outPutData;
   }
   
   
   public MyExperimentData(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration){
      //values = new HashMap<>();
      this.operation = operation;
      this.strategy = strategy;
      this.numberOfBytesToWrite = numberOfBytesToWrite;
      this.blocksize = blocksize;
      this.duration = duration;
      
      //outPutData.push(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
      //outPutData.add(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
      outPutData.addLast(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
      
      //putData();
      
   }

}

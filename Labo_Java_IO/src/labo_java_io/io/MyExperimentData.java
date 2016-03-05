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
   private String operation;
   private String strategy;
   private long numberOfBytesToWrite;
   private int blocksize;
   private long duration;
   private LinkedList<String> outPutData = new LinkedList();

   
   public List<String> getData(){
      return outPutData;
   }
   
   
   
   //public MyExperimentData(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration){
   public void MyExperiment(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration){
      this.operation = operation;
      this.strategy = strategy;
      this.numberOfBytesToWrite = numberOfBytesToWrite;
      this.blocksize = blocksize;
      this.duration = duration;
      
      //outPutData.add(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
            
   }
   
   public void insertData(){
      outPutData.add(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
   }

}

/*
 * This class helps to keep data from an experiment
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

   
   @Override
   public List<String> getData(){
      return outPutData;
   }
   
   
   
   //public MyExperimentData(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration){
   @Override
   public void MyExperiment(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration){
      this.operation = operation;
      this.strategy = strategy;
      this.numberOfBytesToWrite = numberOfBytesToWrite;
      this.blocksize = blocksize;
      this.duration = duration;
      
                  
   }
   
   @Override
   public void insertData(){
      outPutData.add(operation + " , " + strategy + " , " + numberOfBytesToWrite+ " , " + blocksize+ " , " + duration);
   }

}

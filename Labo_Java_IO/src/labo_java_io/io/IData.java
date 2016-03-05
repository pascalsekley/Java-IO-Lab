/*
 * This interface helps another class to keep track of an experiment 
*/
package labo_java_io.io;

import java.util.List;

/**
 *
 * @author Pascal SEKLEY
 */
public interface IData {

   public List<String> getData();
   public void MyExperiment(String operation, String strategy, long numberOfBytesToWrite, int blocksize, long duration);
   public void insertData();
}

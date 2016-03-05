/*
 * This interface contains function to help another class to make experiment records
 */
package labo_java_io.io;

/**
 *
 * @author Pascal SEKLEY
 */
public interface IRecorder {
   public void record(IData data);
   public void init();
   public void close();
   
}

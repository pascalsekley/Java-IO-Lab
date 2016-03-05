/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

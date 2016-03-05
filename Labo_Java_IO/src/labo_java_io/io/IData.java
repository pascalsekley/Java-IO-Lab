/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

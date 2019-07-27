/*
 * ?o change this license header, choose License Headers in Project Properties.
 * ?o change this template file, choose ?ools | ?emplates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peter
 *  
 */
public class FileDAL{
    private String path;
    
    public FileDAL(String p)
    {
        this.path=p;
    }
    public BufferedReader createBufferedReader(){
        File file= new File(getPath());
        if(file.exists()){
            BufferedReader br= null;
            try {
                br = new BufferedReader(new FileReader(file));
                return br;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Logger.getLogger("File not found ");
        }
        return null;
    }  
    
    public BufferedWriter createBufferwriter(){
        BufferedWriter bufferedWriter= null;
        try {
            File file= new File(getPath());
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (IOException ex) {
            Logger.getLogger(FileDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             
            return bufferedWriter;
            
        }
        
    }
    
     public static ArrayList<String> getAllSchoolYearExists(){
          ArrayList<String> sy= new ArrayList<>();
          File folder = new File("repository");
          File[] file= folder.listFiles();
          for(File fi:file){
              if(fi.isDirectory()){
               sy.add(fi.getName());   
              }
          }
          Collections.sort(sy);
          return sy;
      }
     
      public static ArrayList<String> getAllClassExists(String year){
          String path="repository"+ File.separator+year;
          ArrayList<String> sy= new ArrayList<>();
          File folder = new File(path);
          File[] file= folder.listFiles();
          for(File fi:file){
              if(fi.isDirectory()){
               sy.add(fi.getName());   
              }
          }
          Collections.sort(sy);
          return sy;
      }
     

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
 
}

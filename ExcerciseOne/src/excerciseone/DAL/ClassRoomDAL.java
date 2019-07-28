/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.BLL.Common;
import excerciseone.DTO.ClassRoomDTO;
import excerciseone.DTO.StudentsDTO;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author peter
 */
public class ClassRoomDAL {   
    
    public LinkedList<ClassRoomDTO> getAllClassRoom(){
        LinkedList<ClassRoomDTO> colcr= new LinkedList<>();
        ArrayList<String> colYear= FileDAL.getAllSchoolYearExists();
        for(String di:colYear){
            ArrayList<String> colClass= FileDAL.getAllClassExists(di);
            for(String fi:colClass){
                    String path="repository"+File.separator+di
                    +File.separator+Common.getNameExceptExtension(fi)+File.separator+fi+".txt";
                    System.out.print("  "+path);
                    LinkedList<StudentsDTO> rclass=getClassRoomByPath(path);
                    if(rclass == null){
                        return null;
                    }
                    ClassRoomDTO croom= new ClassRoomDTO(Common.getNameExceptExtension(fi), rclass, null);
                    colcr.add(croom);
            }
        }
        return colcr;
    }
    
    LinkedList<StudentsDTO> getClassRoomByPath(String path){
       LinkedList<StudentsDTO> colstu=new LinkedList<>();
       FileDAL file= new FileDAL(path);
       BufferedReader buff=file.createBufferedReader();
        try {
            if(buff.ready()){
                String line;
                while((line=buff.readLine()) != null){
                    String [] content=line.split(",");
                    if(content.length >=4){
                        if(StringUtils.isNumeric(content[3])){
                         StudentsDTO student= new StudentsDTO(content[0], content[1],content[2],Long.valueOf(content[3]));   
                         colstu.add(student);
                        }
                    }else{
                        System.out.print("Warning Miss "+line); 
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClassRoomDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return colstu;
    }
//    public static void main(String[] args){
//        ClassRoomDAL a= new ClassRoomDAL();
//        a.getAllClassRoom();
//    }
    ClassRoomDTO importColStudentClass(String path){
        FileDAL filedal= new FileDAL(path);
        String nameclass="";
        LinkedList<StudentsDTO> colstu=new LinkedList<>();
        BufferedReader buff= filedal.createBufferedReader();
        if(buff != null){
            try {
                String line;
                nameclass=buff.readLine();
                while((line=buff.readLine())!=null){
                    String [] content=line.split(",");
                    if(content.length >=4){
                        if(StringUtils.isNumeric(content[3])){
                         StudentsDTO student= new StudentsDTO(content[0], content[1],content[2],Long.valueOf(content[3]));   
                         colstu.add(student);
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ClassRoomDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Error get bufferedReder "+ this.getClass().toString());
            return null;
        }
        return new ClassRoomDTO(nameclass, colstu, null);
    }
    
    void writeClassRoom(ClassRoomDTO classroom){
        // khong co lop thi tao ra thu muc lop
        if(!FileDAL.checkFileExistInSystem(classroom.getNameroom())){
            // tao thu muc lop
        }
        // get tat ca len , kiem tra mssv neu khong co thi them vao classroomdto xong luu xuong lai ok
        
    }
    
}

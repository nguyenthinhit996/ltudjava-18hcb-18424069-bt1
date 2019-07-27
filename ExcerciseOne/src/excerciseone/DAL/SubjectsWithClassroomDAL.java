/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.BLL.Common;
import excerciseone.DTO.StudentsDTO;
import excerciseone.DTO.SubjectsDTO;
import excerciseone.DTO.SubjectsWithClassroomDTO;
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
public class SubjectsWithClassroomDAL {
    
    public LinkedList<SubjectsWithClassroomDTO> getAllSubjectsWithClassroom(){
        LinkedList<SubjectsWithClassroomDTO> colcr= new LinkedList<>();
        ArrayList<String> colYear= FileDAL.getAllSchoolYearExists();
        for(String di:colYear){
            ArrayList<String> colClass= FileDAL.getAllClassExists(di);
            for(String fi:colClass){
               if(Common.isSubjectClass(fi)){
                    String path="repository"+File.separator+di+File.separator+fi;
                    System.out.print("  "+path);
                    LinkedList<StudentsDTO> rclass=getSubjectsWithClassroomByPath(path);
                    if(rclass == null){
                        return null;
                    }   
                    //SubjectsWithClassroomDTO(String name,String codesub,
//                    String namesub, LinkedList<StudentsDTO> colstuden,
//                    LinkedList<StudentsWithPointDTO> colpoint ){
                    System.out.println(Common.getNameExceptHyphen(fi));
                    SubjectsWithClassroomDTO subjectsWithClassroom=
                    new SubjectsWithClassroomDTO(Common.getNameExceptHyphen(fi),);
                    
                     
                }
            }
        }
        return colcr;
    }
    
    LinkedList<StudentsDTO> getSubjectsWithClassroomByPath(String path){
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
    
    public static void main(String [] args){
        SubjectsWithClassroomDAL a= new SubjectsWithClassroomDAL();
        a.getAllSubjectsWithClassroom();
    }
}

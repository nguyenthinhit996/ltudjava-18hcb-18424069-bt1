/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.DTO.StudentsDTO;
import excerciseone.DTO.SubjectsWithClassroomDTO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author peter
 */
public class SubjectsWithClassroomDAL {
    
     
    
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
    
    public boolean writeSubjectWithStudent(final SubjectsWithClassroomDTO ob){
        String filename=ob.getNameroom()+"_"+ob.getCodesubject();
        String path=FileDAL.getPathFile(filename);
        System.out.println("luu mon hoc vs sinh vien: "+path);
        FileDAL filedal=new FileDAL(path);
        BufferedWriter buff= filedal.createBufferwriter();
        if(buff != null){
            Iterator<StudentsDTO> colSub=ob.getCollectionstudent().iterator();
            try {
            while(colSub.hasNext()){
                    StudentsDTO su=colSub.next();
                    buff.append(su.toStringDTO());
                    buff.newLine();
                }
            buff.close();
            } catch (IOException ex) { 
                Logger.getLogger(SubjectsWithClassroomDAL.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }else{
            return false;
        }
        // luu diem
        return true;
    }
    
//     private String nameclass;
//    private String codesubject;
//    private String namesubject;
//    private LinkedList<StudentsWithPointDTO> collectionpoint;
//    private LinkedList<StudentsDTO> collectionstudent;
    
    ArrayList<String> getAllSubjectClass(){
        
    }
    
    public static LinkedList<SubjectsWithClassroomDTO> getAllSubjectOfStudnensPoint(){
        
    }
    
}

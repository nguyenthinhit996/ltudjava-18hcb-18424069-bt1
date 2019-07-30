/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.BLL.Common;
import excerciseone.DTO.StudentsWithPointDTO;
import excerciseone.DTO.SubjectsWithClassroomDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peter
 */
public class StudentsWithPointDAL {
    
    public SubjectsWithClassroomDTO readPointSubjectsWithClassroomByPath(String path){
       LinkedList<StudentsWithPointDTO> colstu=new LinkedList<>();
       FileDAL file= new FileDAL(path);
       BufferedReader buff=file.createBufferedReader();
        try {
            if(buff.ready()){
                String line;
                String nameclass =buff.readLine();
                while((line=buff.readLine()) != null){
                    String [] con=line.split(",");
                    if(con.length >=6){
                        StudentsWithPointDTO a=
                        new StudentsWithPointDTO(
                        con[0],con[1],Integer.valueOf(con[2]),Integer.valueOf(con[3]),Integer.valueOf(con[4]),Integer.valueOf(con[5]));
                         colstu.add(a);
                    }else{
                        System.out.print("Warning Miss "+line); 
                    }
                }
                String []abs=nameclass.split("_");
                SubjectsWithClassroomDTO dss=
                new SubjectsWithClassroomDTO(abs[0],abs[1],"none",null,colstu);
                return dss;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClassRoomDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
}
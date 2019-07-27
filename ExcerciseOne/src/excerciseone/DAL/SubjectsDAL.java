/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.DTO.SubjectsDTO;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author peter
 */
public class SubjectsDAL {
    
    public LinkedList<SubjectsDTO> getAllSubjectsDTO(){
        LinkedList<SubjectsDTO> colcr= new LinkedList<>();
        ArrayList<String> colYear= FileDAL.getAllSchoolYearExists();
        for(String di:colYear){
            ArrayList<String> colClass= FileDAL.getAllClassExists(di);
            for(String fi:colClass){
               if(!Common.isSubjectClass(fi)){
                    String path="repository"+File.separator+di+File.separator+fi;
                    System.out.print("  "+path);
                    LinkedList<StudentsDTO> rclass=getClassRoomByPath(path);
                    if(rclass == null){
                        return null;
                    }
                    ClassRoomDTO croom= new ClassRoomDTO(Common.getNameExceptExtension(fi), rclass, null);
                    colcr.add(croom);
                }
            }
        }
        return colcr;
    }
    
}

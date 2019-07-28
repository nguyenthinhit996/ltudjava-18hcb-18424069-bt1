/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.BLL;

import excerciseone.DAL.ClassRoomDAL;
import excerciseone.DAL.SubjectsDAL;
import excerciseone.DTO.ClassRoomDTO;
import java.util.LinkedList;

/**
 *
 * @author peter
 */
public class Frm0002BLL {
    private static LinkedList<ClassRoomDTO> colClassRoom;
    private static LinkedList<ClassRoomDTO> colStuSubject;
    
//    public static void main(String[] args){
//       FileDAL.getAllSchoolYearExists().forEach((ele)->{
//          System.out.println(ele);
//          System.out.println("----------start---------");
//          FileDAL.getAllClassExists(ele).forEach((el)->{
//              System.out.print("   "+el);
//          });
//          System.out.println("\n---------end----------");
//       });
//    }
    
    static {
        getAllClassRoom();
    }
    
    // get all class
    public  static void getAllClassRoom(){   
        ClassRoomDAL classroomdal= new ClassRoomDAL();
        if(classroomdal.getAllClassRoom()!= null){
            setColClassRoom(classroomdal.getAllClassRoom());
        }
        
    }
    
    public static void getAllStudentWithClassRoom(){   
//        SubjectsWithClassroomDTO classroomdal= new ClassRoomDAL();
//        setColClassRoom(classroomdal.getAllClassRoom());
    }
    
    
    public boolean importStudentsClass( String importpath){
       
        ClassRoomDAL classroom = new ClassRoomDAL();
        ClassRoomDTO cr=classroom.importColStudentClass(importpath);
        if(cr==null){
            return true;
        }
        // thanh công set colClassRoom
        colClassRoom.clear();
        colClassRoom.add(cr);
        // write and check error
        if(!classroom.writeClassRoom(cr)){
            return true;
        }
        // error tra ve lỗi 
        return false;
    }
    
     public boolean importScheduleClass(String strpath){
         SubjectsDAL sub= new SubjectsDAL();
         ClassRoomDTO clasrom=sub.importScheduleClass(strpath);
         if(clasrom != null){
             colClassRoom.clear();
             colClassRoom.add(clasrom);
             ClassRoomDAL classroom = new ClassRoomDAL();
             if(!classroom.writeClassRoom(clasrom)){
                 // sai la true
                    return true;
            }else{
                 return false;
             }
         }else{
             return true;
         }
     }
    
    public boolean writeStudentsClass(ClassRoomDTO cr){
         ClassRoomDAL classroom = new ClassRoomDAL();
         return classroom.writeClassRoom(cr);
    }
     

    /**
     * @return the colClassRoom
     */
    public static LinkedList<ClassRoomDTO> getColClassRoom() {
        return colClassRoom;
    }

    /**
     * @param aColClassRoom the colClassRoom to set
     */
    public static void setColClassRoom(LinkedList<ClassRoomDTO> aColClassRoom) {
        colClassRoom = aColClassRoom;
    }
    
}

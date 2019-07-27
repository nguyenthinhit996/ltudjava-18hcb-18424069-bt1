/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.BLL;

import excerciseone.DAL.ClassRoomDAL;
import excerciseone.DTO.ClassRoomDTO;
import excerciseone.DTO.SubjectsWithClassroomDTO;
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
    static void getAllClassRoom(){   
        ClassRoomDAL classroomdal= new ClassRoomDAL();
        setColClassRoom(classroomdal.getAllClassRoom());
    }
    
    static void getAllStudentWithClassRoom(){   
//        SubjectsWithClassroomDTO classroomdal= new ClassRoomDAL();
//        setColClassRoom(classroomdal.getAllClassRoom());
    }
    
    
    public boolean importStudentsClass( String importpath){
            
        // đọc file 
        // thanh công set colClassRoom ghi vào file 
        // error tra ve lỗi 
        return true;
    }
    public static void main(String[] args){
        
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

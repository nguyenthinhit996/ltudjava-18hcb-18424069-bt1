/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DTO;

import java.util.LinkedList;

/**
 *
 * @author peter
 */
public class SubjectsWithClassroom {
    private String nameroom;
    private String codesubject;
    private String namesubject;
    private LinkedList<StudentsWithPoint> collectionpoint;
    private LinkedList<Students> collectionstudent;
    
    public SubjectsWithClassroom(String name,String codesub,
            String namesub, LinkedList<Students> colstuden,
            LinkedList<StudentsWithPoint> colpoint ){
        this.nameroom=name;
        this.codesubject=codesub;
        this.collectionstudent=colstuden;
        this.collectionpoint=colpoint;
    }

    /**
     * @return the nameroom
     */
    public String getNameroom() {
        return nameroom;
    }

    /**
     * @param nameroom the nameroom to set
     */
    public void setNameroom(String nameroom) {
        this.nameroom = nameroom;
    }

    /**
     * @return the codesubject
     */
    public String getCodesubject() {
        return codesubject;
    }

    /**
     * @param codesubject the codesubject to set
     */
    public void setCodesubject(String codesubject) {
        this.codesubject = codesubject;
    }

    /**
     * @return the namesubject
     */
    public String getNamesubject() {
        return namesubject;
    }

    /**
     * @param namesubject the namesubject to set
     */
    public void setNamesubject(String namesubject) {
        this.namesubject = namesubject;
    }

    /**
     * @return the collectionpoint
     */
    public LinkedList<StudentsWithPoint> getCollectionpoint() {
        return collectionpoint;
    }

    /**
     * @param collectionpoint the collectionpoint to set
     */
    public void setCollectionpoint(LinkedList<StudentsWithPoint> collectionpoint) {
        this.collectionpoint = collectionpoint;
    }

    /**
     * @return the collectionstudent
     */
    public LinkedList<Students> getCollectionstudent() {
        return collectionstudent;
    }

    /**
     * @param collectionstudent the collectionstudent to set
     */
    public void setCollectionstudent(LinkedList<Students> collectionstudent) {
        this.collectionstudent = collectionstudent;
    }

    
}

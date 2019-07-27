/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DTO;

/**
 *
 * @author peter
 */
public class SubjectsDTO {
    private String namesubject;
    private String codesubject;
    
    public SubjectsDTO(String names,String co,String narc){
        this.namesubject=names;
        this.codesubject=co;
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

    
    
}

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
public class ClassRoom {
    private String nameroom;
    private LinkedList<Students> collectionSTU;
    private LinkedList<Subjects> collectionSUB;
    
    public ClassRoom(String na,LinkedList<Students> costu, LinkedList<Subjects> cosub){
        this.nameroom=na;
        this.collectionSTU=costu;
        this.collectionSUB=cosub;
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
     * @return the collectionSTU
     */
    public LinkedList<Students> getCollectionSTU() {
        return collectionSTU;
    }

    /**
     * @param collectionSTU the collectionSTU to set
     */
    public void setCollectionSTU(LinkedList<Students> collectionSTU) {
        this.collectionSTU = collectionSTU;
    }

    /**
     * @return the collectionSUB
     */
    public LinkedList<Subjects> getCollectionSUB() {
        return collectionSUB;
    }

    /**
     * @param collectionSUB the collectionSUB to set
     */
    public void setCollectionSUB(LinkedList<Subjects> collectionSUB) {
        this.collectionSUB = collectionSUB;
    }
    
}

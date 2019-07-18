/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.DAL;

import excerciseone.DTO.AccountSchool;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peter
 */
public class AccountSchoolDAL {
   
    
     public LinkedList<AccountSchool>getAllAccount(){
        LinkedList<AccountSchool> col = new LinkedList<>();
        try {
                FileDAL fileDAL= new FileDAL("account/accountschool.txt");
            BufferedReader br=fileDAL.createBufferedReader();
            String strcurrent;
            while((strcurrent=br.readLine()) != null){
                String[] arrstr=strcurrent.split(",");
                if(arrstr.length == 4){
                    AccountSchool news= new AccountSchool(arrstr[0],arrstr[1],arrstr[2],Integer.valueOf(arrstr[3]));
                    col.add(news);
                }else{
                    return null;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FileDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return col;
    }
   
}
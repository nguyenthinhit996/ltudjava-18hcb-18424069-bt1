/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.BLL;

import excerciseone.DAL.AccountSchoolDAL;
import excerciseone.DTO.AccountSchool;
import java.util.Iterator;
 
 

/**
 *
 * @author peter
 */
public class BLLfrm0001 {
    public static void main(String[] args) {
       AccountSchoolDAL abc= new AccountSchoolDAL();
       Iterator<AccountSchool> in=abc.getAllAccount().iterator();
       while(in.hasNext()){
           System.out.print(in.next().getNamelogin()+ " ");
       }
       
    }
}

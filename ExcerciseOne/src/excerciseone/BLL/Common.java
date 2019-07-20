/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.BLL;

import excerciseone.DAL.AccountSchoolDAL;
import excerciseone.DTO.AccountSchool;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author peter
 */
public class Common {
     public String getTimeCurrent(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }
    
     
      public boolean changePassword(AccountSchool acc,String passold,String passnew){
        if(StringUtils.isNotBlank(passold) && StringUtils.isNotBlank(passnew)){
            if(acc.getPassword().equals(passold)){
                AccountSchoolDAL accDAL= new AccountSchoolDAL();
                LinkedList<AccountSchool> in=accDAL.getAllAccount();
                int index=in.indexOf(acc);
                if(index != -1){
                    in.get(index).setPassword(passnew);
                }
                accDAL.writeAllAccount(in);
                return true;
            }
        }
        return false;
    }
    
    
}

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
public class Students {
    private String mssv;
    private String name;
    private String sex;
    private Long identity;
    
    public Students(String mssv,String n,String se,Long id){
        this.mssv=mssv;
        this.name=n;
        this.sex=se;
        this.identity=id;
    }
    
    public Students(String []ds){
        if(ds.length == 4){
         this.mssv=ds[0];
         this.name=ds[1];
         this.sex=ds[2];
         this.identity=Long.valueOf(ds[3]);   
        }
    }

    /**
     * @return the mssv
     */
    public String getMssv() {
        return mssv;
    }

    /**
     * @param mssv the mssv to set
     */
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the identity
     */
    public Long getIdentity() {
        return identity;
    }

    /**
     * @param identity the identity to set
     */
    public void setIdentity(Long identity) {
        this.identity = identity;
    }
    
    
}

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
public class StudentsWithPoint {
    private String namestudent;
    private String mssv;
    private int pointmid;
    private int pointfinal;
    private int pointdifference;
    private float pointsummary;
    
    public StudentsWithPoint(String name, String ms){
        this.namestudent=name;
        this.mssv=ms;
        this.pointdifference=0;
        this.pointfinal=0;
        this.pointmid=0;
        this.pointsummary=0;
    }

    /**
     * @return the namestudent
     */
    public String getNamestudent() {
        return namestudent;
    }

    /**
     * @param namestudent the namestudent to set
     */
    public void setNamestudent(String namestudent) {
        this.namestudent = namestudent;
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
     * @return the pointmid
     */
    public int getPointmid() {
        return pointmid;
    }

    /**
     * @param pointmid the pointmid to set
     */
    public void setPointmid(int pointmid) {
        this.pointmid = pointmid;
    }

    /**
     * @return the pointfinal
     */
    public int getPointfinal() {
        return pointfinal;
    }

    /**
     * @param pointfinal the pointfinal to set
     */
    public void setPointfinal(int pointfinal) {
        this.pointfinal = pointfinal;
    }

    /**
     * @return the pointdifference
     */
    public int getPointdifference() {
        return pointdifference;
    }

    /**
     * @param pointdifference the pointdifference to set
     */
    public void setPointdifference(int pointdifference) {
        this.pointdifference = pointdifference;
    }

    /**
     * @return the pointsummary
     */
    public float getPointsummary() {
        return pointsummary;
    }

    /**
     * @param pointsummary the pointsummary to set
     */
    public void setPointsummary(float pointsummary) {
        this.pointsummary = pointsummary;
    }
    
    
}

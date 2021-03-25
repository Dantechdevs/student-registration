/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.util.ArrayList;

/**
 *
 * @author kennedy kalucy
 */
public class Departments {

 private String DepName;
    private int DepCode;
    ArrayList<Student> studentsArrayList=new ArrayList<>();

    public Departments(String _DepName, int _courseCode){
        this.DepName=_DepName;
        this.DepCode=_courseCode;

    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }

    public int getDepCode() {
        return DepCode;
    }

    public void setgetDepCode(int getDepCode) {
        this.DepCode = DepCode;
    }

 

    public void addStudent(Student students){
        if (studentsArrayList.size()<30){
           /* if (courseCode/100 > 1 && courseCode/100<4 && students instanceof RegularStudents){
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }
            else if (courseCode/100 == 5 && students instanceof GraduateStudents) {
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }
            else if (courseCode/100 == 7 && students instanceof SpecialStudents) {
                System.out.println("Student is added");
                studentsArrayList.add(students);
            }*/
            System.out.println("Student is added");
            studentsArrayList.add(students);

        }else System.out.println("Capacity is full");

    }
    public void DepartmentInfo(){

        System.out.println("Dep Name:"+DepName+"Dep Code:"+DepCode);
    }
}

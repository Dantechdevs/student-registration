/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

/**
 *
 * @author kennedy kalucy
 */

public class Student {
    
    private String name, sname;
    private int id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }


    Student(String _name, String _sname, int _id, double _cgpa){
        this.name=_name;
        this.sname=_sname;
        this.id=_id;
        this.cgpa=_cgpa;


    }
    Student(){}

    public  void display(){
        System.out.println("Name: "+getName()+ " Surname: " + getSname()+" ID: " + getId()+" CGPA: "+ getCgpa());


    }
}

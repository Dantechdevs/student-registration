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
public class GraduateStudents extends Student {

    GraduateStudents(String name, String sname, int id, double cgpa) {
        super.setName(name);
        super.setSname(sname);
        super.setId(id);
        super.setCgpa(cgpa);
    }

    @Override
    public void display() {
        System.out.println("Graduate Student:");
        super.display();
    }
}
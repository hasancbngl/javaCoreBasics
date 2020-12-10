package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // fetch student record
        Student model = retriveStudentFromDatabase();
        //System.out.println(model.getName() + "  " + model.getRollNo());

        //Create a view: to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);
        controller.updateView(); //print

        //update model data
        controller.setStudentName("jan");
        controller.setStudentRollNo("25");

        controller.updateView(); //print verify


    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("hasan");
        student.setRollNo("10");
        return student;
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wnter an amount:");

        int amount = scanner.nextInt();

        Bank bank = new Bank(amount,"john");
        bank.interestPaid();
         amount = scanner.nextInt();
        GBank gBank = new GBank(amount , "mike");
        gBank.interestPaid();

      /*  Vehicle v = new Vehicle();
        v.speed();
        Child child = new Child();
        child.displayText();

        Student student = new Student();
        student.addMArks();
        student.displayPoints();

        System.out.println("********************************");

        GeoStudent geoStudent = new GeoStudent();
        geoStudent.addMArks();
        geoStudent.addmathMArks();
        geoStudent.addGeoMArks();
        geoStudent.displayPoints();
        geoStudent.displayMathMarks();
        geoStudent.displayGeoStudentMarks();

        System.out.println("********************************");
        BioStudent bioStudent = new BioStudent();
        bioStudent.addMArks();
        bioStudent.addBioMArks();
          bioStudent.displayPoints();
          bioStudent.displayBioMarks();
          System.out.println("********************************");

          EngineeringStudent e = new  EngineeringStudent();
          e.addMArks();
          e.addmathMArks();
          e.displayPoints();
          e.displayMathMarks();

        Child child = new Child();

        child.displayString();
        System.out.println(child.year);
        child.addRandom();
        child.displayRandom();

        Student.displayAge();

        Area area = new Area();
        area.height=7;

        Area place =new Area();
        place.length=780;

        Calculate calculate = new Calculate();
        calculate.calculate(area);

        System.out.println("---------------");

        calculate.calculate(place);

        Student student = new Student(2,5,9,8);
        student.id=95;
        System.out.println(student.id + " chem" + student.chem);


    Person person = new Person();
        person.displayName(7854);


        Sum s = new Sum();
        s.sum(21,54);
        s.sum(21,54,4,5,6.78);
        s.sum(21,4,5,6.78);

        Student hasan = new Student(5,24,57,-247);
        System.out.println(hasan.chem);
        System.out.println(hasan.doTheMath());

        Student student = new Student(1,2,40,8);
        System.out.println(student.id);
        System.out.println(student.doTheMath());


        double hasans_Marks;
        double robs_marks;
        int sum;

        hasan.id=1;
        hasan.chem=60;
        hasan.math = 87;
        hasan.phy = 57;

        sum = hasan.total();
      hasans_Marks = hasan.doTheMath(sum);
        System.out.println("hasans marks: "+ hasans_Marks);
        Student rob = new Student();
    rob.id=2;
        rob.chem=82;
        rob.math = 55;
        rob.phy = 90;

        sum = rob.total();
        robs_marks = rob.doTheMath(sum);
        System.out.println("rob marks: "+robs_marks);

        hasan.Point=25;
        hasan.id = 10;
        hasan.name = "hasan";
        System.out.println(hasan.printStudentInfo(hasan.id, hasan.name, hasan.Point));

        Student rob = new Student();
        rob.id = 24;
        rob.Point=47;
        rob.name="rob";
        System.out.println(rob.printStudentInfo(rob.id, rob.name, rob.Point));


        System.out.println(hasan.getPoint());
        System.out.println(hasan.getId());

        hasan.setPoint(259);
        System.out.println("po,nt changeeed: " + hasan.getPoint());

        hasan.setId(102);
        System.out.println("id changeeed: " + hasan.getId());
*/
    }
}

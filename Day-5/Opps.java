class Opps {

  public static void main(String[] args) {
    Student s1 = new Student(); // object
    Student s2 = new Student();
    Student s3 = new Student();

    s1.name = "ali";
    s1.age = 18;
    s1.rollNumber = 89;
    s1.collage = "KPS";

    s2.name = "Raza";
    s2.age = 5;
    s2.rollNumber = 9;
    s2.collage = "KPS";

    s3.name = "ali Raza";
    s3.age = 18;
    s3.rollNumber = 89;
    s3.collage = "KPS";

    s1.attendanceMark(); // function call
    s2.attendanceMark();
    s3.attendanceMark();

    s1.print(); // function call
    s2.print();
    s3.print();
  }
}

class Student { // class
    String name;
    int age;
    int rollNumber;
    String collage;

    void attendanceMark(){ // fuction
        System.out.println("Attendance Marked BY " + name);
    }

    void print(){
        System.out.println("Name " + name + " age " + age + " Roll Number " +   rollNumber + " Collage name " + collage);
    }
}
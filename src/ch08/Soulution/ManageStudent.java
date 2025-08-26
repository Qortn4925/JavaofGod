package ch08.Soulution;

public class ManageStudent {
    public static void main(String[] args) {

        ManageStudent ms = new ManageStudent();
        Student[] students =null;

        students = ms.addStudent();

      ms.printStudents(students);



    }

    public static Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("sibal");
        student[1] = new Student("hagi");
        student[2] = new Student("sibural", "Seoul", "010xxxxxx", "ask@godofjava.com");

        return  student;
    }

    public void printStudents(Student[] student) {
        for (int i = 0; i < 3; i++) {
            System.out.println(student[i].toString());
        }

    }
 }

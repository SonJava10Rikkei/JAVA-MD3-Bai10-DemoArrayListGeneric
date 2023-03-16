package view;

import model.Student;
import services.studentService.StudentServiceIMPL;

public class Main {
    public static void main(String[] args) {
        StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
        studentServiceIMPL.sort();
    }
}

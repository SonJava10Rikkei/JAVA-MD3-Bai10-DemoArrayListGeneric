package services.studentService;

import model.Student;
import services.IGenericService;

public interface iStudentService extends IGenericService<Student> {
    void sort();
}

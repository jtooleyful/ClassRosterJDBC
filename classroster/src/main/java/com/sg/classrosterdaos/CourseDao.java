/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classrosterdaos;

import com.sg.classrosterentities.Course;
import com.sg.classrosterentities.Student;
import com.sg.classrosterentities.Teacher;
import java.util.List;

/**
 *
 * @author Jtooleyful
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}

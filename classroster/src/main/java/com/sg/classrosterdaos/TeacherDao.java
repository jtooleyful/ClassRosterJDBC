/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classrosterdaos;

import com.sg.classrosterentities.Teacher;
import java.util.List;

/**
 *
 * @author Jtooleyful
 */
public interface TeacherDao {

    Teacher getTeacherById(int id);

    List<Teacher> getAllTeachers();

    Teacher addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacherById(int id);
}

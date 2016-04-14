package com.company;
import java.io.*;

public class SaveCustomObjectInFile {
    public static void main(String[] args){
        Course course = new Course() {{
            name = "Java";
            numberOfStudents = 243;
        }};

        saveObject(course);
        printCourse(loadObject(course));
    }

    private static void saveObject(Course course) {
        try(ObjectOutputStream destination = new ObjectOutputStream(new FileOutputStream("res/course.save"))) {
            destination.writeObject(course);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Course loadObject(Course course) {
        Course cour = new Course();
        try(ObjectInputStream source = new ObjectInputStream(new FileInputStream("res/course.save"))) {
            cour  = (Course) source.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return course;
    }

    private static void printCourse(Course course) {
        System.out.println(course);
    }
}

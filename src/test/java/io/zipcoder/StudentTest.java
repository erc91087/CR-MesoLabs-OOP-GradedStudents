package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {


    private Student testStudent;

//    @Before
//    public void setUp() {
//        // : Given
//        String firstName = "Eric";
//        String lastName = "Cordell";
//
//        Double[] examScores = {100.0, 95.0, 123.0, 98.0};
//        testStudent = new Student(firstName, lastName, examScores);
//    }

    @Test
    public void setFirstNameTest() {
        //  Given
        String firstName = "Eric";
        String lastName = "Cordell";

        Double[] examScores = {100.0, 95.0, 123.0, 98.0};
        testStudent = new Student(firstName, lastName, examScores);
        String expected = "Eric";

        //  When
        testStudent.setFirstName(expected);
        String actual = testStudent.getFirstName();

        //  Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest() {
        //  Given
        String firstName = "Eric";
        String lastName = "Cordell";

        Double[] examScores = {100.0, 95.0, 123.0, 98.0};
        testStudent = new Student(firstName, lastName, examScores);
        String expected = "Cordell";

        //  When
        testStudent.setLastName(expected);
        String actual = testStudent.getLastName();

        //  Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Eric";
        String lastName = "Cordell";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void getNumberOfExamsTaken() {
        //  Given
        String firstName = "Eric";
        String lastName = "Cordell";

        Double[] examScores = {100.0, 95.0, 123.0, 98.0};
        testStudent = new Student(firstName, lastName, examScores);
        int expected = 4;

        //  When
        int actual = testStudent.getNumberOfExamsTaken();

        //  Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String firstName = "Eric";
        String lastName = "Cordell";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void setExamScoreTest() {
        // : Given

        String firstName = "Eric";
        String lastName = "Cordell";
        Double[] examScores = { 40.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String actual = testStudent.getExamScores();
        String expected = "Exam 1 -> 150.0";

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Eric";
        String lastName = "Cordell";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.00 };
        Student student = new Student(firstName, lastName, examScores);
        double expected = 125;

        // When
        double actual = student.getAverageExamScore();


        // Then
        Assert.assertEquals(expected, actual, .001);
    }



}
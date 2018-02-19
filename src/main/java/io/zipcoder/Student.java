package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    // instance variables
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    // constructor, initializing variables
    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList(Arrays.asList(testScores));
        // The asList() method returns a list view of the specified array.


    }


    // generated getters & setters
    public String getFirstName() {
        return this.firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getExamScores() { //define method

        StringBuilder listOfScores = new StringBuilder();

        listOfScores.append("Exam Scores: " + "\n");
        for(int i = 0; i < examScores.size(); i++){
            listOfScores.append("Exam " + (i + 1)  + " -> " + examScores.get(i) + "\n");
        }
        System.out.println(listOfScores.toString());
        return listOfScores.toString();
    }


    public int getNumberOfExamsTaken() {
        return examScores.size();
    }


    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }


    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber - 1, newScore);
    }



    public double getAverageExamScore() {

        double totalExams = 0;

        for (Double scores : this.examScores) {
            totalExams += scores;
            }

        return Math.round(totalExams / this.examScores.size());

        // this.examScores = new ArrayList(Arrays.asList(testScores));
        // method didn't work w/o Arrays.asList() ^^^^^
    }
}

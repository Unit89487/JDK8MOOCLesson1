/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8mooclesson1;


public class Student {
    
    int gradYear;
    double score; 
    
    //constructors
    
    public void Student(){
    
    }
    
    public void Student(int gradYear, double score) {
        this.gradYear = gradYear; 
        this.score = score; 
    }
    
    //getters and setters
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear; 
    }
    
    public int getGradYear() {
        return gradYear; 
    }
    
    public void setScore(double score) {
        this.score = score; 
    }
    
    public double getScore(){
        return score; 
    }
    
}

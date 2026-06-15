package exercise7.academic;

import exercise7.activities.Sport;

public class Report implements Sport {
    public double academicMarks;
    public double totalMarks;
    public double percentage;

    public Report(double academicMarks) {
        this.academicMarks = academicMarks;
        this.totalMarks = academicMarks + marks;
        this.percentage = (totalMarks/80)*100;
    }

    public double getAcademicMarks() {
        return academicMarks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getSportsMarks(){
        return marks;
    }

    @Override
    public String isPlayed() {
        return "Involved in Sports.";
    }

    @Override
    public String toString() {
        return "Academic marks: "+academicMarks+"\n"+isPlayed()+"\nSports marks: "+marks+"\nTotal marks: "+totalMarks+"\nPercentage: "+percentage;
    }
}
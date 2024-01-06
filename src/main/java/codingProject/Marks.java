package codingProject;
/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
 */

public abstract class Marks {
    abstract double getPercentage();
}

class studentA extends Marks {
    private double math;
    private double science;
    private double english;

    public studentA(double math, double science, double english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }
    double getPercentage () {
        return (math + science + english) / 3;
    }

}

class studentB extends Marks {
    private double math;
    private double science;
    private double english;
    private double history;

    public studentB(double math, double science, double english, double history) {
        this.math = math;
        this.science = science;
        this.english = english;
        this.history = history;
    }
    double getPercentage(){
        return (math + science + english + history) / 4;
    }
}

class MarksTester{
    public static void main(String[] args) {

        studentA a = new studentA(89, 91, 75);
        System.out.println("The average marks for student A is: " + a.getPercentage());

        studentB b = new studentB(78,80,87,78);
        System.out.println("The average marks for student B is: " + b.getPercentage());
    }
}

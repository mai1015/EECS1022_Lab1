package eecs1022.lab1;

/**
 * Created by user on 1/18/18.
 */
public class Person {
    private String name;
    private double weight;
    private double height;

    public Person(String n, double w, double h) {
        name = n;
        weight = w;
        height = h;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getState() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight.";
        } else if (bmi >=18.5 && bmi < 25.0) {
            return "Normal.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (30.0 <= bmi && bmi < 100){
            return "Obese.";
        }
        return "unknown. Maybe some value are mistaken.";
    }

    @Override
    public String toString()
    {
        String ret = String.format("%s's BMI is %.2f, Your state is %s", name, getBMI(), getState());
        return ret;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }
}

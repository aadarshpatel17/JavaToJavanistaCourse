package $1classesandobjects.$5methodoverloadingandcodereuse;

public class Employee {
    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;

    public Employee(String name, double experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("\nName: " + name + " Experience: " + experience + " Salary: " + salary);
    }

    public String getName() {
        return name;
    }
    public double getExperience() {
        return experience;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void saveToDatabase() {
        System.out.format("Saving to database... Name: %s, Experience: %.2f, Salary: %.2f", name, experience, salary);
    }

    public void update(String name) {
        System.out.println("update(String name) invoked...");
        setName(name);
//        saveToDatabase();
    }
    public void update(String name, double experience) {
        System.out.println("update(String name, double experience) invoked...");
        update(name);
        setExperience(experience);

//        saveToDatabase();
    }
    public void update(String name, double experience, double salary) {
        System.out.println("update(String name, double experience, double salary) invoked...");
        update(name, experience);
        setSalary(salary);

        saveToDatabase();
    }

    public double calculateBonus(float performancePercentage) {
        double bonus = (salary * performancePercentage * 0.01);
        return bonus;
    }

    public double calculateIncrement() {
        double increment;
        if(salary < 65000) {
            increment = 0.10;
        } else {
            increment = 0.05;
        }
        salary = salary + salary * increment;
        return increment;
    }
}

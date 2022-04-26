package basics;

import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M for Male and F for Female");
        char gender = sc.next().charAt(0);
        System.out.println("Enter salary");
        int salary = sc.nextInt();

        calculateBonus(gender, salary);
    }

    public static void calculateBonus(char gender, int salary) {
        double bonus = 0, incrementedSalary = 0;

        if(salary < 10000) {
            bonus = salary * 0.02;
            incrementedSalary = salary + bonus;
        }
        else if(gender == 'M' || gender == 'm') {
                bonus = salary * 0.05;
                incrementedSalary = salary + bonus;
        }
        else {
            bonus = salary * 0.1;
            incrementedSalary = salary + bonus;
        }

        System.out.format("Bonus: %.2f\nSalary: %.2f", bonus, incrementedSalary);
    }

}

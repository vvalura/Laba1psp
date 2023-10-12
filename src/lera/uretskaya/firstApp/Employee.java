package lera.uretskaya.firstApp;

public class Employee {
    private String surname;
    private float salary;
    private boolean hasKids;

    public Employee() {
        surname = "Иванов";
        salary = 1000;
        hasKids = true;
    }

    public Employee(String surname, float salary, boolean hasKids) {
        this.surname = surname;
        this.salary = salary;
        this.hasKids = hasKids;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setHasKids(boolean hasKids) {
        this.hasKids = hasKids;
    }

    public String getSurname() {
        return surname;
    }

    public float getSalary() {
        return salary;
    }

    public boolean getHasKids() {
        return hasKids;
    }

    public void printSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void printAll() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Зарплата: " + salary);
        if (hasKids) {
            System.out.println("Есть дети.");
        } else {
            System.out.println("Детей нет.");
        }
    }
}

package lera.uretskaya.firstApp;
import lera.uretskaya.firstApp.Employee;

public class WriterInfo {
    private Employee employee;

    public WriterInfo(Employee employee) {
        this.employee = employee;
    }

    public WriterInfo(String surname, float salary, boolean hasKids) {
        this.employee = new Employee(surname,salary,hasKids);
    }

    public void showEmployee (){
        System.out.println("Фамилия: "+ employee.getSurname()
                + ". " + "Зарплата: "+ employee.getSalary()
                + ". " + "Наличие детей: "+ employee.getHasKids());
    }
}

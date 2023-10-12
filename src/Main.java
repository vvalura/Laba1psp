import lera.uretskaya.firstApp.Employee;
import lera.uretskaya.firstApp.WriterInfo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String sd = new String("h");

        Employee e1 = new Employee();
        Employee e2 = new Employee("Чеменцова", 2000, true);

        e1.setSurname("Урецкая");
        e1.setSalary(2000);
        e1.setHasKids(false);

        e1.printSurname();
        e2.printAll();

        int a = 56;

        print(a);

        WriterInfo writerInfo = new WriterInfo(e1);
        WriterInfo writerInfo1 = new WriterInfo("Городная", 2600.90f, false);
        writerInfo.showEmployee();
        writerInfo1.showEmployee();
    }

    public static void print(Integer integer) {
        int a = integer;
        ArrayList<Integer> asd = new ArrayList<>();
        asd.add(5);
    }


}
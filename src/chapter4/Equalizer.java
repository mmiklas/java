package chapter4;

public class Equalizer {
    public static void main(String[] args) {

        Employee a = new Employee("Kowalski", 22, 3400);
        Employee b = new Employee("Kowalski", 22, 3400);
        Employee c = new Employee("Kowalski", 22, 3400);

        Manager m = new Manager("Kowalski", 22, 3400, 500);

        System.out.println("Czy obiekty są referencyjnie równe: " + (a == b));
        System.out.println("Czy obiekty są strukturalnie równe: " + a.equals(b));

        for (int i = 0; i < 1_000_000 ; i++) {
            if (!a.equals(b)) {
                System.out.println("Mamy cię!");
                break;
            }
        }
    }
}

class Manager extends Employee {
    int salaryBonus;
    public Manager(String name, int age, int salary, int salaryBonus) {
        super(name, age, salary);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Manager manager = (Manager)obj;
        return this.salaryBonus == manager.salaryBonus;
    }
}

class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return this.getClass().getName() + "[name='" + name + '\'' + ", age=" + age + ", salary=" + salary + ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee)obj;

        if (!(this.age == employee.age && this.salary == employee.salary)) {
            return false;
        }

        if (this.name == null) {
            return employee == null;
        }

        return this.name.equals(employee.name);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;
        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }*/

}

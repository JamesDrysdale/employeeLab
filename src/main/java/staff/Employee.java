package staff;

public abstract class Employee {
    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNI(){
        return this.NI;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        return this.salary * 1/100;
    }
}
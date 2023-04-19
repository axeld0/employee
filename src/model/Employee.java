package model;

public class Employee {
    private int dni;
    private String name;
    private String surname;
    private float salary;


    /**
     * CONSTRUCTORS
     */
    public Employee ()
    {
        dni = 0 ;
        name = "";
        surname = "";
        salary = 0;
    }

    public Employee(int dni, String name, String surname, float salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }


    /**
     * GETTERS AND SETTERS
     */
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * TOSTRING
     */
    @Override
    public String toString() {
        return "Employee{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public float getAnualSalary ()
    {
        float anual =  (salary*12);
        return anual;
    }

    public void increaseSalary (float percentage)
    {
        this.salary +=  (salary*percentage)/100;
    }

    public String getDescription()
    {
        return "Employee : | NAME :" + name + "| SURNAME : "+surname+ " |DNI : "+dni+ "|SALARY: "+ salary +"|\n";

    }


}

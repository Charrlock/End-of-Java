package com.company;

public class Human {
    public Animal pet;
    public String firstName;
    public String lastName;
    private Double salary;
    private String salarySettingDate = "Never";

    public String getSalarySettingDate(){
        return salarySettingDate;
    }

    public void setSalarySettingDate(){
        this.salarySettingDate = "Just now";
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Your income cannot be making you poorer man");
        } else {
            System.out.println("Previous salary was: "+ this.salary);
            System.out.println("Last changes made: "+getSalarySettingDate());
            setSalarySettingDate();
            System.out.println("Data sent to the accountants");
            System.out.println("Remember to send documentation to Ms. Hania");
            System.out.println("ZUS and US know everything");
            System.out.println("Your new salary is: " + salary);
            this.salary = salary;
        }
    }


}

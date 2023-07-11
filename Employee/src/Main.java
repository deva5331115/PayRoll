class SalariedEmployee {
    String name;
    private double  salary=50000;
    SalariedEmployee(String name){
        this.name=name;
    }


    public void claculatePay() {
        salary=salary+5000;

    }

    public double getSalary() {
        return salary;
    }
}
class HourlyEmployee {
    String name;
    private double hourlyRate=1000;
    private double hoursWorked;
    HourlyEmployee(String name){
        this.name=name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public void claculatePay() {
        hourlyRate +=hoursWorked* hourlyRate;

    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
class Main{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Ram");
        salariedEmployee.claculatePay();
        System.out.println(salariedEmployee.name+" Salary is "+salariedEmployee.getSalary());
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Vijay");
        hourlyEmployee.setHoursWorked(7);
        hourlyEmployee.claculatePay();
        System.out.println(hourlyEmployee.name+" Salary is "+hourlyEmployee.getHourlyRate());
    }
}
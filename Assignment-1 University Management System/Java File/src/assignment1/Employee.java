
package assignment1;
    public class Employee extends UniversityMember{
    protected int salary;

    public Employee(String memberId, String name, int salary){
        super(memberId,name);
        this.salary = salary;
    }

    @Override
    public void displayBasicInfo(){
        super.displayBasicInfo();
        System.out.println("Salary: BDT"+ salary);
    }

    @Override
    public void performDuty(){
        System.out.println(name + " is performing University Employee duties.");
    }

    public void showSalary(){
        System.out.println("Employee: " + name+ "( " + memberId + " )");
        System.out.println("Salary: "+ salary);
    }
}

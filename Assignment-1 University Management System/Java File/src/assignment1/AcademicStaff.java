
package assignment1;
    
public class AcademicStaff extends Employee{
    protected String department;

    //constructor
    public AcademicStaff(String memberId, String name, int salary, String department){
        super(memberId, name, salary);
        this.department = department;
    }

    //overriding displayBasicinfo method
    @Override
    public void displayBasicInfo(){
        super.displayBasicInfo();
        System.out.println("Department: "+ department);
    }
    //overrriding performDuty method
    @Override
    public void performDuty(){
        System.out.println(name + " is performing duties as an Academic Staff of the department of"+ department);
    }

    public void conductClass(){
        System.out.println(name + " is conducting classes for the department of" + department);
    }
}

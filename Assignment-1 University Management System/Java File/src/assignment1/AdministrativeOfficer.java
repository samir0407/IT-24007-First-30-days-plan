
package assignment1;



    

public class AdministrativeOfficer extends Employee{

    private String office;
    //constructor 
    public AdministrativeOfficer(String memberId, String name, int salary, String office){
        super(memberId, name,salary);
        this.office = office;
    }

    //overriding display basic info method
    @Override
    public void displayBasicInfo(){
        super.displayBasicInfo();
        System.out.println("Office section :" + office);
    }

    @Override
    public void performDuty(){
        System.out.println(name + " is in charge of the office section" + office + "of the MBSTU University Administration.");
    }

    //new method
    public void reviewAdmission(String applicantName){
        System.out.println(name + "is reviewing the admission application for" + applicantName);
    }
}


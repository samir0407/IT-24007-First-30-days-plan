
package assignment1;


    
public class Professor extends AcademicStaff{
    private String researchArea;

    //Constructor
    public Professor(String memberId, String name, int salary,String department, String researchArea){
        super(memberId, name, salary, department);
        this.researchArea = researchArea;
    }

    //overriding displayBasicInfo method
    @Override
    public void displayBasicInfo(){
        super.displayBasicInfo();
        System.out.println("Research area: " + researchArea);
    }

    //overriding performDuty method
    public void performDuty(){
        System.out.println("Prof. " + name + " [" + department + " ] is doing research in " + researchArea);
    }

    //new method
    public void showResearchProfile(){
        System.out.println("Professor :" + name);
        System.out.println("Department :" + department);
        System.out.println("Research Area :" + researchArea);

    }

}

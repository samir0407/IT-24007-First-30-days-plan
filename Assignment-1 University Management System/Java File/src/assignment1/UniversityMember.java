
package assignment1;


    public abstract class UniversityMember{
    protected String memberId;
    protected String name;

    //constructor
    public UniversityMember(String memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }

    // method
    public void displayBasicInfo(){
        System.out.println("Member ID:" + memberId);
        System.out.println("Member Name:" + name);
    }

    public abstract void performDuty();
    
}


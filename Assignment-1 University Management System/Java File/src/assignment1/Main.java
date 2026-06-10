package assignment1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creation of objects 
        Professor p1 = new Professor("P01", "Dr. Ziaur Rahman", 150000, "ICT", "Cyber Security");
        Professor p2 = new Professor("P02", "Dr. Sajjad Waheed", 150000, "ICT", "AI");

        AdministrativeOfficer a1 = new AdministrativeOfficer("A01", "Md. Nasir", 76000, "ICT Office");
        AdministrativeOfficer a2 = new AdministrativeOfficer("A02", "Md. Rofiq", 60000, "Finance");

        // Storing all objects in a single ArrayList
        ArrayList<UniversityMember> members = new ArrayList<>();
        members.add(p1);
        members.add(p2);
        members.add(a1);
        members.add(a2);

        System.out.println("======= UNIVERSITY HR MANAGEMENT SYSTEM =======");
        System.out.println("=======        Basic Information        =======");

        for (UniversityMember member : members) {
            member.displayBasicInfo();
            System.out.println();
        }

        // Polymorphism
        System.out.println("======= Dynamic Binding: Runtime Polymorphism =======");
        for (UniversityMember member : members) {
            member.performDuty();
            System.out.println();
        }

        // Downcasting professor 
        System.out.println("======= Downcasting =======");
        for (UniversityMember member : members) {
            if (member instanceof Professor) {
                Professor p = (Professor) member;
                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}

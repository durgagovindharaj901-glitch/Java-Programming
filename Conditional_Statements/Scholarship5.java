import java.util.Scanner;
public class Scholarship5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine(); 
        String scholarshipType = sc.nextLine();

        String eligibility = "Not Eligible";
        double awardAmount = 0.0;
        String awardCategory = "None";

        if (gpa >= 2.5) {
            eligibility = "Eligible";

            if (scholarshipType.equalsIgnoreCase("Merit")) {

                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    awardAmount = 25000;
                    awardCategory = "Full";
                } else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    awardAmount = 15000;
                    awardCategory = "Partial";
                } else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    awardAmount = 8000;
                    awardCategory = "Minimal";
                } else {
                    eligibility = "Not Eligible";
                }

            } else if (scholarshipType.equalsIgnoreCase("Need-Based")) {

                if (familyIncome <= 30000 && gpa >= 3.5) {
                    awardAmount = 30000;
                    awardCategory = "Full";
                } else if (familyIncome <= 50000 && gpa >= 3.0) {
                    awardAmount = 18000;
                    awardCategory = "Partial";
                } else if (familyIncome <= 70000 && gpa >= 2.8) {
                    awardAmount = 10000;
                    awardCategory = "Minimal";
                } else {
                    eligibility = "Not Eligible";
                }

            } else if (scholarshipType.equalsIgnoreCase("Sports")) {

                if (extracurricularScore >= 85 && gpa >= 3.0) {
                    awardAmount = 22000;
                    awardCategory = "Full";
                } else if (extracurricularScore >= 75 && gpa >= 2.8) {
                    awardAmount = 20000;
                    awardCategory = "Partial";
                } else if (extracurricularScore >= 65 && gpa >= 2.5) {
                    awardAmount = 12000;
                    awardCategory = "Minimal";
                } else {
                    eligibility = "Not Eligible";
                }

            } else {
                eligibility = "Not Eligible";
            }
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + awardAmount);
        System.out.println("Award Category: " + awardCategory);

        
    }
}

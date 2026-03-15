import java.util.Scanner;
class ContactBook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int deps = sc.nextInt(); 
        int[][] employees = new int[deps][];

        int totalEmployees = 0;
        for(int i = 0; i < deps; i++){
            int emps = sc.nextInt(); 
            employees[i] = new int[emps];
            for(int j = 0; j < emps; j++){
                employees[i][j] = sc.nextInt(); 
                totalEmployees++;
            }
        }
        System.out.println("Employee Contact Book:");
        for(int i = 0; i < deps; i++){
            System.out.print("Dept " + (i+1) + ": ");
            for(int j = 0; j < employees[i].length; j++){
                System.out.print(employees[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTotal Employees: " + totalEmployees);
    }
}
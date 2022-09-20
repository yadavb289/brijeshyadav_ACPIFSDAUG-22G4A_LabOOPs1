import java.util.*;

public class Employee {
    static CredentialService ob=new CredentialService();
    int choice;
    public static void main(String[] args) {

        System.out.println("Please enter the department from following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner choice = new Scanner(System.in);
        int dept = choice.nextInt();

switch (dept){
    case 1:
        ob.department("tech");
        break;
    case 2:
        ob.department("admin");
        break;
    case 3:
        ob.department("hr");
        break;
    case 4:
        ob.department("legal");
        break;
}
        ob.generateEMailAddress("Brijesh","Yadav");
        ob.showCredentials();

          }
}


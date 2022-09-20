import java.util.Random;
class CredentialService{
  String firstName;
   String lastName;
    String fullName;
    String department;


    void passwordGenerator()
    {

          String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          String lower = "abcdefghijklmnopqrstuvwxyz";
          String specialCharacters = "!@#$%^&*()_+{}:";
          String number = "0123456789";
          String combination = upper + lower + specialCharacters + number;
          int len = 8;
          char[] password = new char[len];
          Random r = new Random();
          for (int i = 0; i < len; i++) {
              password[i] = combination.charAt(r.nextInt(combination.length()));
          }
          System.out.println("Password --> " + new String(password));
    }

   public void generateEMailAddress(String FirstName, String LastName)
    {
        this.firstName=FirstName;
        this.lastName=LastName;
        fullName=firstName+lastName;

    }
    public void department(String Department) {

        this.department=Department;
    }
//

        void showCredentials ()
        {
            System.out.println("Dear " +this.firstName+ " your generated credentials are as follows :");
            System.out.println("Email--> " +this.fullName.toLowerCase() + "@" +this.department+"."+"xyz.com");
            passwordGenerator();


        }
    }


import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_alina_dyadchenko 
{
   public static void main(String[] args) throws FileNotFoundException
   {
      //create an ArrrayList to store Policy objects
      ArrayList<Policy> policies = new ArrayList<>();
      
      //open the file
      File file = new File("PolicyInformation.txt");
      
      //Ensure file exists and read each policy
      if (file.exists())
      {
         Scanner fileScanner = new Scanner(file); //"open"
         
         while (fileScanner.hasNext())
         {
            int policyNumber = fileScanner.nextInt();
            fileScanner.nextLine(); // consume the newline
            
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = fileScanner.nextInt();
            fileScanner.nextLine(); // consume the newline after the int
            
            String smokingStatus = fileScanner.nextLine();
            double height = fileScanner.nextDouble();
            double weight = fileScanner.nextDouble();
            
            fileScanner.nextLine(); //clear the newline
            
            //Create a Policy object with the read values
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            
            //Add the Polucy object to the ArrayList
            policies.add(policy);
         }
         fileScanner.close();
         
         //Display the policy information and calculated results
         for (Policy policy : policies)
         {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getTheName());
            System.out.println("Policyholder's Fist Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getTheAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight());
            System.out.println("Policyholder's Weight: " + policy.getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
         }
      
      //Count smokers and non-smokers
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      for (Policy policy : policies)
      {
         if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         } else 
            {
               nonSmokerCount++;
            }
      }
      
      //Display the counts of smokers and non-smokers
      System.out.println("\nThe number of policies with smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
      
      } else
        {
         System.out.println("File 'PolicyInformation.txt' does not exist. Please ensrue the file is available.");
        }

   }
}
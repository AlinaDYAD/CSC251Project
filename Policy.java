public class Policy
{
   //Attributes to store policy details
   private int policyNumber;
   private String theName; //Provider name
   private PolicyHolder policyHolder; //Use PolicyHolder
   
   //Static field to tracl the number of Policy objects created
   private static int policyCount = 0;
   
   //No-arg constructor: initialize the attributes to default values
   public Policy()
   {
      this.policyNumber = 0;
      this.theName = "Unknown provider";
      this.policyHolder = new PolicyHolder("unknown", "Unknown", 0, "Non-Smoker", 0.0, 0.0);
      policyCount++;
   }
   
   /**
   Argument Constructor: initialize the attributes with specified values
   @param policyNum The policy number
   @param name The provider name
   */
   public Policy(int policyNumber, String theName, PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.theName = theName;
      this.policyHolder = policyHolder;
      policyCount++;
   }
   
   //Getters and setters methods for each attribute
   
   /**
   Get the policy number.
   @return The policy number
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   Set the plicy number.
   @param polNum The policy number to set
   */
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   
   /**
   Get the provides name.
   @return The provider name
   */
   public String getTheName()
   {
      return theName;
   }
   
   /**
   Set the provider name.
   @param name The provider name to set
   */
   public void setTheName(String theName)
   {
      this.theName = theName;
   }
   
   /**
   Get the policyholder
   @param The policyholder
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }
   
   /**
   Set the Policyholder
   @param holder The holder to set
   */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = policyHolder;
   }
   
      
   /** 
   Calculates the price of the insurance policy
   @return The calculated policy price
   */
   public double calculatePolicyPrice()
   {
      double price = 600;
      
      if (policyHolder.getAge() > 50)
      {
         price += 75;
      }
      
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100;
      }
      
      double bmi = policyHolder.calculateBMI();
      if (bmi > 35)
      {
         price += ((bmi - 35) * 20);
      }
      
      return price;
   }
   
   //Static method to get the count of Policy objects
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
    // toString method
    @Override
    public String toString() 
    {
        return "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + theName + "\n" +
                "Policyholder's First Name: " + policyHolder.getFirstName() + "\n" +
                "Policyholder's Last Name: " + policyHolder.getLastName() + "\n" +
                "Policyholder's Age: " + policyHolder.getAge() + "\n" +
                "Policyholder's Smoking Status (Y/N): " + policyHolder.getSmokingStatus() + "\n" +
                "Policyholder's Height: " + policyHolder.getHeight() + " inches\n" +
                "Policyholder's Weight: " + policyHolder.getWeight() + " pounds\n" +
                "Policyholder's BMI: " + String.format("%.2f", policyHolder.calculateBMI()) + "\n" +
                "Policy Price: $" + String.format("%.2f", calculatePolicyPrice()) + "\n";
    }  
   
}
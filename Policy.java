public class Policy
{
   //Attributes to store policy details
   private int policyNumber;
   private String theName; //Provider name
   private PolicyHolder policyHolder; //Use PolicyHolder
   
   //No-arg constructor: initialize the attributes to default values
   public Policy()
   {
      policyNumber = 0;
      theName = " ";
      policyHolder = new PolicyHolder();
   }
   
   /**
   Argument Constructor: initialize the attributes with specified values
   @param policyNum The policy number
   @param name The provider name
   @param first The policyholder's first name
   @param last The policyholder's last name
   @param theAge The policyholder's age
   @param smoke The policyholder's smoking status
   @param h The policyholder's height in inches
   @param w The policyholder's weight in pounds
   */
   public Policy(int policyNum, String name, PolicyHolder holder)
   {
      policyNumber = policyNum;
      theName = name;
      policyHolder = holder;
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
   public void setPolicyNumber(int polNum)
   {
      policyNumber = polNum;
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
   public void setTheName(String name)
   {
      theName = name;
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
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = holder;
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
  
   
}
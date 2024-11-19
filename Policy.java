public class Policy
{
   //Attributes to store policy details
   private int policyNumber;
   private String theName; //Provider name
   private PolicyHolder policyHolder; //Use PolicyHolder
   
   //No-arg constructor: initialize the attributes to default values
   public Policy()
   {
      this.policyNumber = 0;
      this.theName = " ";
      this.policyHolder = new PolicyHolder("", "", 0, "", 0.0, 0.0);
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
   
    // toString method
    @Override
    public String toString() 
    {
        return "Policy{" +
                "Policy Number=" + policyNumber +
                ", Provider Name='" + theName + '\'' +
                ", Policy Holder=" + policyHolder +
                ", Policy Price=$" + String.format("%.2f", calculatePolicyPrice()) +
                '}';
    }
  
   
}
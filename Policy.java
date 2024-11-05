public class Policy
{
   //Attributes to store policy details
   private int policyNumber;
   private String theName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus; //Smoker or Non-Smoker
   private double height; // in inches
   private double weight; // in pounds
   
   //No-arg constructor: initialize the attributes to default values
   public Policy()
   {
      policyNumber = 0;
      theName = " ";
      firstName = " ";
      lastName = " ";
      age = 0;
      smokingStatus = " ";
      height = 0.0;
      weight = 0.0;
   }
   
   /**Argument Constructor: initialize the attributes with specified values
   @param policyNum The policy number
   @param name The provider name
   @param first The policyholder's first name
   @param last The policyholder's last name
   @param theAge The policyholder's age
   @param smoke The policyholder's smoking status
   @param h The policyholder's height in inches
   @param w The policyholder's weight in pounds
   */
   public Policy(int policyNum, String name, String first, String last, int ageParam, 
   String smoke, double h, double w)
   {
      policyNumber = policyNum;
      theName = name;
      firstName = first;
      lastName = last;
      age = ageParam;
      smokingStatus = smoke;
      height = h;
      weight = w; 
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
   Get the policyholder's first name.
   @return The first number
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   Set the plicyholder's fist name.
   @param first The first name to set
   */
   public void setFirstName(String fist)
   {
      firstName = fist;
   }
   
   
   /**
   Get the policyholder's last name.
   @return The last number
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Set the plicyholder's last name.
   @param last The last name to set
   */
   public void setLastName(String last)
   {
      lastName = last;
   }
   
      
   /**
   Get the policyholder's age.
   @return The age
   */
   public int getTheAge()
   {
      return age;
   }
   
   /**
   Set the plicyholder's age.
   @param ageParam The age to set
   */
   public void setTheAge(int ageParam)
   {
      age = ageParam;
   }
   
   
   /**
   Get the policyholder's smoking status.
   @return The smokking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   Set the plicyholder's smoking status.
   @param smoke The smoking status to set
   */
   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }
   
   /**
   Get the policyholder's height in inches.
   @return The height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   Set the plicyholder's height.
   @param h The height to set in inches
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   
   /**
   Get the policyholder's weight in pounds.
   @return The weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   Set the plicyholder's weight.
   @param w The weight to set in pounds
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   
   /** 
   Method to calculate the BMI of the placeholder
   @return The BMI value
   */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }
   
   /** 
   Calculates the price of the insurance policy
   @return The calculated policy price
   */
   public double calculatePolicyPrice()
   {
      double price = 600;
      
      if(age > 50)
      {
         price += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoke"))
      {
         price += 100;
      }
      
      double bmi = calculateBMI();
      if (bmi > 35)
      {
         price += (bmi - 35) * 20;
      }
      
      return price;
   }
  
   
}
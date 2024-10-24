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
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(int polNum)
   {
      policyNumber = polNum;
   }
   
   
   
   public String getTheName()
   {
      return theName;
   }
   
   public void setTheName(String name)
   {
      theName = name;
   }
   
   
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public void setFirstName(String fist)
   {
      firstName = fist;
   }
   
   
   
   public String getLastName()
   {
      return lastName;
   }
   
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   
   
   public int getTheAge()
   {
      return age;
   }
   
   public void setTheAge(int ageParam)
   {
      age = ageParam;
   }
   
   
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }
   
   
   public double getHeight()
   {
      return height;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   
   
   public double getWeight()
   {
      return weight;
   }
   
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
   Method to calculate the price of the insurance policy
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
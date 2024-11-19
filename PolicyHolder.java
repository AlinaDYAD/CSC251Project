public class PolicyHolder {

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; // Smoker or Non-Smoker
    private double height; // in inches
    private double weight; // in pounds

    // No-arg constructor
    public PolicyHolder() {
        firstName = " ";
        lastName = " ";
        age = 0;
        smokingStatus = " ";
        height = 0.0;
        weight = 0.0;
    }

    // Argument constructor
    public PolicyHolder(String first, String last, int ageParam, String smoke, double h, double w) {
        firstName = first;
        lastName = last;
        age = ageParam;
        smokingStatus = smoke;
        height = h;
        weight = w;
    }

    // Getters and setters
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
   public int getAge()
   {
      return age;
   }
   
   /**
   Set the plicyholder's age.
   @param ageParam The age to set
   */
   public void setAge(int ageParam)
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

    // Calculate BMI
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
}

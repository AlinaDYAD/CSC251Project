public class PolicyHolder {

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; // Smoker or Non-Smoker
    private double height; // in inches
    private double weight; // in pounds

    // No-arg constructor
    /*public PolicyHolder() {
        firstName = " ";
        lastName = " ";
        age = 0;
        smokingStatus = " ";
        height = 0.0;
        weight = 0.0;
    }
    */
    
    // Argument constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
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
   public void setFirstName(String fistName)
   {
      this.firstName = firstName;
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
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
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
   public void setAge(int age)
   {
      this.age = age;
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
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
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
   public void setHeight(double height)
   {
      this.height = height;
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
   public void setWeight(double weight)
   {
      this.weight = weight;
   }

    // Calculate BMI
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    
    // toString method
    @Override
    public String toString() 
    {
        return "PolicyHolder{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Age=" + age +
                ", Smoking Status='" + smokingStatus + '\'' +
                ", Height=" + height +
                " inches, Weight=" + weight +
                " pounds, BMI=" + String.format("%.2f", calculateBMI()) +
                '}';
    }
}

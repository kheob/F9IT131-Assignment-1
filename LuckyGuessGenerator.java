/**
 * The class LuckyGuessGenerator generates a number between 1 and 5
 * with use of the java.lang.Math class.
 * 
 * It is used by the Game class to generate a random number to
 * which the player's guess is compared.
 * 
 * Some material in this class has been adapted from the Monash 
 * University FIT9131 tutorial exercises (Lecturer: Andy Cheng).
 * 
 * @author Bai Chan Kheo 22262407
 * @version 1.2 23 Apr 2015
 */
public class LuckyGuessGenerator
{
    private int randomNumber;
    
    /**
     * Constructor with no parameters.
     */
    public LuckyGuessGenerator()
    {
        randomNumber = 0;
    }
    
    /**
     * Constructor which takes all fields as parameters.
     */
    public LuckyGuessGenerator(int newNumber)
    {
        randomNumber = newNumber;
    }
    
    /**
     * This method prints the last random number that was generated or 
     * the value stored in randomNumber if the generateRandomNumber() 
     * has not yet been called.
     */
    public void displayRandomNumber()
    {
        System.out.println(randomNumber);
    }

    /**
     * This method generates a new number between 1 and 5 (inclusive) 
     * and stores it.
     * 
     * The Math.random() method is used to generate a random double 
     * between 0.0 and less than 1.0. It is then multiplied by 5 and 
     * cast as an integer to generate a number between 0 and 4. 
     * Finally it is added to 1 to generate a number between 1 and 5.
     */
    public void generateRandomNumber()
    {
        randomNumber = 1 + (int)(Math.random() * 5);
    }
    
    /**
     * Accessor method for randomNumber variable.
     */
    public int getRandomNumber()
    {
        return randomNumber;
    }
    
    /**
     * Mutator method for randomNumber variable.
     */
    public void setRandomNumber(int newNumber)
    {
        randomNumber = newNumber;
    }
}
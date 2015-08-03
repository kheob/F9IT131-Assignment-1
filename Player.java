/**
 * The Player class creates a new player and stores their name, 
 * prizes they have won, total value of their prizes won, and how 
 * much money they have spent.
 * 
 * It is used by the Game class to store information pertaining to
 * the current player.
 * 
 * @author Bai Chan Kheo 22262407
 * @version 1.3 18 May 2015
 */
public class Player
{
    private String name;
    private String prizesWon;
    private int prizesWorth;
    private int totalSpent;
    
    /**
     * Constructor with no parameters.
     */
    public Player()
    {
        name = "";
        prizesWon = "";
        prizesWorth = 0;
        totalSpent = 0;
    }
    
    /**
     * Constructor which takes all fields as parameters.
     */
    public Player(String newName, String newPrizesWon, int newPrizesWorth, 
                  int newTotalSpent)
    {
        name = newName;
        prizesWon = newPrizesWon;
        prizesWorth = newPrizesWorth;
        totalSpent = newTotalSpent;
    }
    
    /**
     * This method adds a prize to the player's current list of prizes.
     */
    public void addPrize(String newPrize) // Change to an array of prizes.
    {
        prizesWon += "[" + newPrize + "] ";
    }    

    /**
     * This method adds the player's guess to the total amount that the 
     * player has spent.
     */
    public void addSpent(int newSpent)
    {
        totalSpent += newSpent;
    }    
    
    /**
     * This method adds a prize's worth to the total worth off all the 
     * player's won prizes.
     */
    public void addWorth(int newWorth)
    {
        prizesWorth += newWorth;
    }    
    
    /**
     * Method to display all relevant information about the player. 
     * Includes all fields.
     */
    public void displayPlayer()
    {
        System.out.println("----- [Player Information] -----");
        System.out.println("Name: " + name);
        System.out.println("Prizes won:\n" + prizesWon);
        System.out.println("Total value of prizes won: $" + prizesWorth);
        System.out.println("Total spent: $" + totalSpent);
    }    
    
    /**
     * Accessor method for name variable.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor method for prizesWon variable.
     */
    public String getPrizesWon()
    {
        return prizesWon;
    }
    
    /**
     * Accessor method for prizesWorth variable.
     */
    public int getPrizesWorth()
    {
        return prizesWorth;
    }
    
    /**
     * Accessor method for totalSpent variable.
     */
    public int getTotalSpent()
    {
        return totalSpent;
    }
    
    /**
     * Mutator method for name variable.
     */
    public boolean setName(String newName)
    {
        if (validName(newName))
            name = newName;
        return validName(newName);
    }
    
    /**
     * Mutator method for prizesWon variable.
     */
    public void setPrizesWon(String newPrizesWon)
    {
        prizesWon = newPrizesWon;
    }
    
    /**
     * Mutator method for prizesWorth variable.
     */
    public void setPrizesWorth(int newPrizesWorth)
    {
        prizesWorth = newPrizesWorth;
    }
    
    /**
     * Mutator method for totalSpent variable.
     */
    public void setTotalSpent(int newTotalSpent)
    {
        totalSpent = newTotalSpent;
    }
    
    /**
     * Validation method for the name attribute.
     */
    public boolean validName(String newName)
    {
        boolean valid = false;
        if (newName.trim().length() > 0 && Character.isLetter(newName.charAt(0)))
            valid = true;
        return valid;
    }
}
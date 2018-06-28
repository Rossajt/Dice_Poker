import java.util.Random;
/**
 * The Game class holds all the logic behind the Dice Poker program. 
 * 
 * @author Ross Taylor 
 * @version (a version number or a date)
 */
public class Game
{
    private int setDice;
    private String diceSet1;
    private String diceSet2;
    private String diceSet3;
    private String diceSet4;
    private String diceSet5;
    private Random diceRoll;
    private int dice1;
    private int dice2;
    private int dice3;
    private int dice4;
    private int dice5;
    private int diceCount;
    private String victory;
    private String reRollString;
    private String rulesString;
    private String helpString;
    /**
     * constructor for game
     */
    public Game()
    {
        diceCount = 0;
        setDice = 0;
        diceSet1 = Integer.toString(setDice);
        diceSet2 = Integer.toString(setDice);
        diceSet3 = Integer.toString(setDice);
        diceSet4 = Integer.toString(setDice);
        diceSet5 = Integer.toString(setDice);
        reRollString = new String("You can not re-roll these dice now!");
    }

    public void rollDice(){
        // converts dice from string to integer
        diceRoll = new Random();
        dice1 = Integer.valueOf(diceSet1);
        dice2 = Integer.valueOf(diceSet2);
        dice3 = Integer.valueOf(diceSet3);
        dice4 = Integer.valueOf(diceSet4);
        dice5 = Integer.valueOf(diceSet5);

        // when roll dice is pressed, it will check all dice variables if they are equal to 0, where it then will randomly
        // generate a number between 1 and 6.
        if(dice1 == 0){
            dice1 = diceRoll.nextInt(6);
            dice1 = dice1 + 1;
        }
        if(dice2 ==0){
            dice2 = diceRoll.nextInt(6);
            dice2 = dice2 + 1; 
        }
        if(dice3 ==0){
            dice3 = diceRoll.nextInt(6);
            dice3 = dice3 + 1;
        }
        if(dice4 ==0){
            dice4 = diceRoll.nextInt(6);
            dice4 = dice4 + 1;
        }
        if(dice5 ==0){
            dice5 = diceRoll.nextInt(6);
            dice5 = dice5 + 1;
        }
        // converts dice values back to string to go back into the labels.
        diceSet1 = Integer.toString(dice1);
        diceSet2 = Integer.toString(dice2);
        diceSet3 = Integer.toString(dice3);
        diceSet4 = Integer.toString(dice4);
        diceSet5 = Integer.toString(dice5);

        // increase victory count by 1
        incrementDiceCount();

        // game with automatically finish when dice hits 2.
        if(diceCount == 2){
            dice1 = Integer.valueOf(diceSet1);
            dice2 = Integer.valueOf(diceSet2);
            dice3 = Integer.valueOf(diceSet3);
            dice4 = Integer.valueOf(diceSet4);
            dice5 = Integer.valueOf(diceSet5);

            // victory conditions
            if(dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5){
                victory = new String("You got five of a kind!");
            }
            else if(dice1 == dice2 && dice1 == dice3 && dice1 == dice4 || dice1 == dice3 && dice1 == dice4 && dice1 == dice5 || dice1 == dice2 && dice1 == dice4 && dice1 == dice5 || dice1 == dice2 && dice1 == dice3 && dice1 == dice5 || dice2 == dice3 && dice2 == dice4 && dice2 == dice5){
                victory = new String("You got four of a kind!");
            }
            else if(dice1 == dice2 && dice1 == dice3 || dice1 == dice2 && dice1 == dice4 || dice1 == dice2 && dice1 == dice5 || dice1 == dice3 && dice1 == dice4 || dice1 == dice3 && dice1 == dice5 || dice1 == dice4 && dice1 == dice5 || dice2 == dice3 && dice2 == dice4 || dice2 == dice3 && dice2 == dice5 || dice2 == dice4 && dice2 == dice5 || dice3 == dice4 && dice3 == dice5){
                victory = new String("You got three of a kind!");
            }

            else if(dice1 == dice2 || dice1 == dice3 || dice1 == dice4 || dice1 == dice5 || dice2 == dice3 || dice2 == dice4 || dice2 == dice5 || dice3 == dice4 || dice3 == dice5 || dice4 == dice5){
                victory = new String("You got a pair!");
            }
            else{
                victory = new String("You got nothing!");
            }
        }
    }

    /**
     * Rolls the dice for dice1
     */
    public void changeDice1(){
        // converts dice to int and sets to 0
        dice1 = Integer.valueOf(diceSet1);
        dice1 = 0;
        // converts dice to string to put back into labels
        diceSet1 = Integer.toString(dice1);
    }

    /**
     * Rolls the dice for dice2
     */
    public void changeDice2(){
        // converts dice to int and sets to 0
        dice2 = Integer.valueOf(diceSet2);
        dice2 = 0;
        // converts dice to string to put back into labels
        diceSet2 = Integer.toString(dice2);
    }

    /**
     * Rolls the dice for dice3
     */
    public void changeDice3(){
        // converts dice to int and sets to 0
        dice3 = Integer.valueOf(diceSet3);
        dice3 = 0;
        // converts dice to string to put back into labels
        diceSet3 = Integer.toString(dice3);
    }

    /**
     * Rolls the dice for dice4
     */
    public void changeDice4(){
        // converts dice to int and sets to 0
        dice4 = Integer.valueOf(diceSet4);
        dice4 = 0;
        // converts dice to string to put back into labels
        diceSet4 = Integer.toString(dice4);
    }

    /**
     * Rolls the dice for dice5
     */
    public void changeDice5(){
        // converts dice to int and sets to 0
        dice5 = Integer.valueOf(diceSet5);
        dice5 = 0;
        // converts dice to string to put back into labels
        diceSet5 = Integer.toString(dice5);
    }

    /**
     * Resets the program.
     */
    public void reset(){
        // sets all dice variables to 0 and sets diceCount to 0
        dice1 = Integer.valueOf(diceSet1);
        dice1 = 0;
        diceSet1 = Integer.toString(dice1);

        dice2 = Integer.valueOf(diceSet2);
        dice2 = 0;
        diceSet2 = Integer.toString(dice2);

        dice3 = Integer.valueOf(diceSet3);
        dice3 = 0;
        diceSet3 = Integer.toString(dice3);

        dice4 = Integer.valueOf(diceSet4);
        dice4 = 0;
        diceSet4 = Integer.toString(dice4);

        dice5 = Integer.valueOf(diceSet5);
        dice5 = 0;
        diceSet5 = Integer.toString(dice5);

        resetDiceCount();
    }

    /**
     * adds a rules section into the menuBar
     */
    public String rules()
    {
        rulesString = new String("To win the game, you must have either have two, three, four or five sets of numbers the same.");
        return rulesString;
    }

    /**
     * adds a help section into the menuBar
     */
    public String help()
    {
        helpString = new String("To play the game, you will need to use the change dice buttons to re-roll values you do not want.\nThe number indicated next to the corrosponding dice represents its value, where 0 means the\ndice has not been rolled yet. When you finish the game, you will either need to quit using the quit\nbutton in the options menu or you can reset the game by clicking the reset button on the main screen\n by pushing the reset button.");
        return helpString;
    }

    /**
     * adds a quit function to the menuBar
     */
    public void quit()
    {
        System.exit(0);
    }

    /**
     * gets the string victory conditions
     */
    public String getVictory()
    {
        return victory;
    }

    /**
     * gets the int diceCount
     */
    public int getDiceCount()
    {
        return diceCount;
    }

    /**
     * gets the reRollString
     */
    public String getReRollString()
    {
        return reRollString;
    }

    /**
     * gets the string changeDice1
     */
    public String getChangeDice1()
    {
        return diceSet1;
    }

    /**
     * gets the string changeDice2
     */
    public String getChangeDice2()
    {
        return diceSet2;
    }

    /**
     * gets the string changeDice3
     */
    public String getChangeDice3()
    {
        return diceSet3;
    }

    /**
     * gets the string changeDice4
     */
    public String getChangeDice4()
    {
        return diceSet4;
    }

    /**
     * gets the string changeDice5
     */
    public String getChangeDice5()
    {
        return diceSet5;
    }

    /**
     * Resets the diceCount variable
     */
    public void resetDiceCount()
    {
        diceCount = 0;
    }
    
    /**
     * Increments diceCount variable by 1
     */
    public void incrementDiceCount()
    {
        diceCount = diceCount + 1;
    }
}

import javax.swing.*;
public class Guessing
{

    public static void main(String[] args) 
    {
       int computerNumber=(int)(Math.random()*100+1);
       int userAnswer=0;
       System.out.println("The Correct Guess Would Be :"+computerNumber);
       int count=0;
       int countLimit=2;
       JOptionPane.showMessageDialog(null , "You only have 3 chances");
       while(userAnswer != computerNumber)
       {
           if(count<=countLimit)
           {
           String response=JOptionPane.showInputDialog(null, " Enter a Number between 1 and 100","Guessing Game",3);
           userAnswer=Integer.parseInt(response);
           count++;
           JOptionPane.showMessageDialog(null, " "+determineGuess(userAnswer,computerNumber, count));
           }
       }
    }  
    public static String determineGuess(int userAnswer, int computerNumber, int count)
    {
        if(userAnswer <=0 || userAnswer>100)
            return " Your guess is invalid";
        else if(userAnswer == computerNumber)
            return" CORRECT!! \n Total Guesses :"+count;
            else if(userAnswer> computerNumber)
                return " Your guess is HIGH, Pease Try Lower Number.\n Try Number:"+count;
            else if(userAnswer< computerNumber)
                return " Your guess is LOW, Please Try Higher Number. \n Try Number :"+count;
            else 
                return " Your guess is INCORRECT \n Try Number :"+count; 
    }    
}
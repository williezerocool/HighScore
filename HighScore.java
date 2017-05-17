/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highscore;


import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class HighScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Scanner keyboard = new Scanner(System.in);
        PrintWriter textfile = new PrintWriter(new FileWriter("HighScore.txt"));
        int userScore;
        String userName;
        
        System.out.println("you got a high score! ");
        
        System.out.println("please enter your high score ");
        userScore = keyboard.nextInt();
        
        System.out.println("please enter your name");
        userName = keyboard.next();
        
        textfile.println(userName + ", " + userScore);
        textfile.close();
    } 
        
    
    
    

}

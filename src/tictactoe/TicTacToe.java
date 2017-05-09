/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import TicTacToeClass.*;
import java.util.Scanner;

/**
 *
 * @author jkira
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        Board b = new Board();
        System.out.println("Player 1, Please enter your name : ");
        String player1 = inp.nextLine();
        System.out.println("Player 2, Please enter your name : ");
        String player2 = inp.nextLine();
        int player = 1;
        int n=0;
        while(n==0){
            if(b.boardfull(b.Board)==false){
                if(player%2!=0){
                System.out.printf("%s, It's your turn.\n", player1);
                System.out.println("Enter Row : ");
                int row = inp.nextInt();
                System.out.println("Enter Col : ");
                int col = inp.nextInt();
                if((row>=0&&row<=2) && (col>=0&&col<=2)){
                    Marker k = Marker.nul;
                    if(b.Board[row][col]==k.getchar()){
                        b.placemarker(Marker.X, row, col);
                    boolean x  = b.gameover(b.Board);
                    
                    b.draw();
                if(x== true){
                
                System.out.printf("%s won the game.",player1);
                n=1;
                }
                else{
                    player++;
                }
                    }
                    else{
                        System.out.println("Given co-ordinates are already occupied.");
                    }
                }
                
                    
                
                else{
                    System.out.println("Invalid Co-ordinates. Row and col must be in range of 0-2.");
                }
            }            
        
        else{
            System.out.printf("%s, It's your turn.\n", player2);
                System.out.println("Enter Row : ");
                int row = inp.nextInt();
                System.out.println("Enter Col : ");
                int col = inp.nextInt();
                if((row>=0&&row<=2) && (col>=0&&col<=2)){
                    Marker k = Marker.nul;
                    if(b.Board[row][col]==k.getchar()){
                        b.placemarker(Marker.O, row, col);
                    boolean x  = b.gameover(b.Board);
                   
                    b.draw();
                if(x== true){
                
                System.out.printf("%s won the game.",player2);
                n=1;
                }
                else{
                    player++;
                }
                    }
                    else{
                        System.out.println("Given co-ordinates are already occupied.");
                    }
                }
                
                    
                
                else{
                    System.out.println("Invalid Co-ordinates. Row and col must be in range of 0-2.");
                }
        }
        
    }
            else{
                System.out.println("Game Over");
                System.out.println("New Game Starts Now");
                b.clear();
            }
            }
            
}
    
}


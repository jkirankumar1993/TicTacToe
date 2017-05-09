/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeClass;

/**
 *
 * @author jkira
 */
public enum Marker {
    /**
     * Placing characters in the board
     */
    X('x'),O('o'),nul(' ');
    public char ch;
    Marker(char ch){
        this.ch = ch;
    }
    
   
    public char getchar(){
        return  this.ch;
    }
    
}

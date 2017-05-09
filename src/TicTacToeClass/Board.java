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
public class Board {
    
    public char[][] Board;
    
   public Board(){
        this.Board = new char[3][3];
        this.clear();
    }
    
    public void clear(){
        Marker k = Marker.nul;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.Board[i][j] = k.getchar();
            }
        }
    }
    
    public void draw(){
        System.out.printf("  0  1  2 \n");
        for(int i=0;i<3;i++){
            System.out.printf("%d ",i);
            for(int j=0;j<3;j++){
                System.out.printf("%s |", Board[i][j]);
            }
            System.out.printf("\n ---------");
            System.out.println();
        }
    }
    
    public boolean placemarker(Marker m,int row,int col){
   
        Marker k = Marker.nul;
        if(this.Board[row][col] == k.getchar()){
          this.Board[row][col] = m.getchar();  
        }
        else{
            return false;
        }
        return true;
        
    }
    
    public boolean gameover(char[][] b){
       boolean a = checkrows(b);
       boolean c = checkcols(b);
       boolean d = checkdiagonals(b);
        if(a==true){
            return true;
        }
        else if(c==true){
            return true;
        }
        else if(d==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkrows(char[][] b){
        Marker k = Marker.nul;
        if(b[0][0]==b[0][1] && b[0][0]==b[0][2] && b[0][0]!= k.getchar()){
            return true;
        }
        else if(b[1][0]==b[1][1] && b[1][0]==b[1][2] && b[1][0]!=k.getchar()){
            return true;
        }
        else if(b[2][0]==b[2][1] && b[2][0]==b[2][2] && b[2][0]!=k.getchar()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkcols(char[][] b){
        Marker k = Marker.nul;
        if(b[0][1]==b[1][1] && b[0][1]==b[2][1] && b[0][1]!=k.getchar()){
            return true;
        }
        else if(b[0][2]==b[1][2] && b[0][2]==b[2][2] && b[0][2] !=k.getchar()){
            return true;
        }
        else if(b[0][0]==b[1][0] && b[0][0]==b[2][0] && b[0][0]!=k.getchar()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkdiagonals(char[][] b){
                Marker k = Marker.nul;
        if(b[0][0]==b[1][1] && b[0][0]==b[2][2] && b[0][0]!=k.getchar()){
            return true;
        }
        else if(b[0][2]==b[1][1] && b[0][2]==b[2][0] && b[0][2] != k.getchar()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean boardfull(char[][] b){
        boolean res = true;
        Marker k = Marker.nul;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b[i][j]==k.getchar()){
                    return false;
                }
               
            }
        }
        return res;
    }
    
}

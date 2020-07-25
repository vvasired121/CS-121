
/**
* This program determines the multiples of three numbers entered by the 
* three numbers entered by the three players in a range that is preedetermined.
* @author Vivek Vasireddy
* @version 1.0
*/

public class SnapCracklePop {
   /**
   *This is the number inputted by the first user.
   */
   private int Snap;
   
   /**
   *This is the number inputted by the second user.
   */
   private int Crackle;
   
   /**
   *This is the number inputted by the third user.
   */
   private int Pop;

   private int rounds;
      
      
   
   /**
   * Constructor that initializes Snap to snap, Crackle to crackle,
   * and Pop to pop.
   * @param snap is the number that is entred by the first user
   * @param crackle is the number that is entered by the second user. 
   * @param pop is the number entered by the third user   
   */
    
     public SnapCracklePop(int snap, int crackle, int pop){
         Snap = snap;
         Crackle = crackle;
         Pop = pop;
      
   }
      
      
   
   
   /**
   * This is a helper method for playGame.
   * @param rounds is the current round that is going on.
   * @return It returns the result for each specified round.
   */ 
     
   
   public String playRound(int rounds){
      String result = "";
   
      if(rounds % Snap == 0){  
         result += "snap";
        
   }               
      
      if(rounds % Crackle == 0){
         result += "crackle";
     
   } 
      if(rounds % Pop == 0){
         result += "pop";
            
   } 
      if(rounds%Snap!=0 && rounds%Crackle !=0 && rounds%Pop!=0){
         result += rounds;
   }
         
  return result;
 }       
      
   
   /**
   * This prints the results of the entire game.  
   * @param rounds is the number of rounds in the game
   * @return This string represents the result of the entire game.
   */ 
   
      
    public String playGame(int rounds){ 
   
      for (int i = 1; i <= rounds; i++){
         System.out.println("round "+i+": "+playRound(i));
   }
      return "";
   
   }
  
   /**
   * This method provides access to the value of the Snap variable of the object.
   * @return value of the Snap variable
   */ 

  public int getSnap(){
      return Snap;      
    } 
   
   
   /**
   * This method provides access to the value of the Crackle variable of the object
   * @return value of the Crackle variable
   */ 
   
   public int getCrackle(){
      return Crackle; 
    }
   /**
   * This method provides access to the value of the Pop variable of the object.
   * @return value of the Pop variable   
   */ 
     
    public int getPop(){
      return Pop;
    }
}
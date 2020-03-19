public class Knight extends Character {
    
   private int durability;
    
    public Knight(String n, int d, int i) {
        super(n, 25, d, i, 2);
        durability = 20;
    }
    public int block(int damage){
        if(damage < 6){
            durability = durability - 6; //if umiwas pero natamaan mababawasan un stamina
        }else{
            return damage; 
        }
        return 0; //evade succesfully
    }
    
    
   @Override
    public void wound(int damage) {
      currentLife = currentLife - damage;
      if(currentLife <= 0){  //negative current life will change to zero! WALANG NEGATIVE NA CURRENT LIFE!
          currentLife = 0;
      }
}
    public int attack(int d){
        
        return dice.roll() + dexterity;
    }
   @Override
      public void heal(int heal) {
      if (currentLife + heal > maxLife){  //Currentlife must not exceed to the maxlife! 
          currentLife = maxLife;
      }  

  }
            
 
}


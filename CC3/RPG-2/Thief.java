public class Thief extends Character {
    
   private int stamina;
    
    public Thief(String n, int s, int i) {
        super(n, s, 25, i, 2);
        stamina = 20;
    }
    public int evade(int damage){
        if(damage < 6){
            stamina = stamina - 6; //if umiwas pero natamaan mababawasan un stamina
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


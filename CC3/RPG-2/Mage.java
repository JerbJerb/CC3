public class Mage extends Character {

  
    private int manapoints;
        
    
    
    public Mage(String n, int s, int d) {
        super(n, s, d, 25, 2);
        manapoints = 20;
    }
    
    @Override
    public void wound(int damage) {
    currentLife = currentLife - damage;
         if(currentLife <= 0){  //negative current life will change to zero! WALANG NEGATIVE NA CURRENT LIFE!
          currentLife = 0;
      }
      
    }
    
    public int fireball( int damage){
        if(manapoints <= 6 ){
            damage = manapoints - 6; 
        }
        else{
            
        }
        return dice.roll() + intelligence;
        
    } 
    public int attack(int i){
        
        return dice.roll() + intelligence;
    }
    @Override
      public void heal(int heal) {
      if (currentLife + heal > maxLife){  //Currentlife must not exceed to the maxlife! 
          currentLife = maxLife;
      }  

  }
}
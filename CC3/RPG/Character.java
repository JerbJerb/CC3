public class Character {
    static Dice dice = new Dice();

    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentLife;
    protected int armor;


   Character (String n, int s , int d , int i, int a){
      this.name = n;
      this.armor = a;
      this.strength = s;
      this.dexterity = d;
      this.intelligence = i;
      this.maxLife = dice.roll()+5000; //Dice: first random number of health + 30
      this.currentLife = maxLife;

    }
   
  
  public int attack() {
      return dice.roll() + strength;
      //HAHHAHA random number + strength
    }

  public void wound(int damage) {
      currentLife = currentLife - damage;
      if(currentLife <= 0){  //negative current life will change to zero! WALANG NEGATIVE NA CURRENT LIFE!
          currentLife = 0;
      }
      
      

    }

  public void heal(int heal) {
      if (currentLife + heal > maxLife){  //Currentlife must not exceed to the maxlife! 
          currentLife = maxLife;
      }  

  }

  public String getName() {
        return name;
    }

  public int getStrength() {
        return strength;
    }

  public int getDexterity() {
        return dexterity;
    }

public int getIntelligence() {
         return intelligence;
}

public int getCurrentLife() {
          return currentLife;
}

public int getMaxLife() {
          return maxLife;
    }
}
public class Battle {
    Dice dice = new Dice();
    Mage m = new Mage("MAGE", 25, 2);
    Thief t = new Thief("THIEF", 25, 3);
    Knight k = new Knight("KNIGHT", 25, 5);
    
    public void battle(){
    	int mLife = m.currentLife;
    	int tLife = m.currentLife;
    	int kLife = m.currentLife;
    	
        for(int i = 1; m.getCurrentLife() >=0 && t.getCurrentLife() >=0 && k.getCurrentLife() >=0; i++){
            System.out.println("Round " + i);
            System.out.println(m.name + " : " + m.getCurrentLife()
                             + "\n"+t.name + " : " + t.getCurrentLife()
                             + "\n"+k.name + " : " + k.getCurrentLife());
            fight();
            System.out.println("");
        }
    }
    
    public void fight(){
        int r = dice.rolll();       //roll up to 10
        int q = dice.rolllll();       //roll up to 2
        int x = dice.rollll();       //roll up to 3
        
        switch (x) {
            case 1:                     // Knight Attacking
                if(q == 1){
                    if(t.getCurrentLife() != 0){
                        KnightAttackThief(r, q);
                    }
                    else if(m.getCurrentLife() != 0){
                        KnightAttackMage(r);
                    }
                    else{
                        System.out.println(k.name + " Wins!");
                        System.exit(0);
                    }
                }
                else{
                    if(m.getCurrentLife() != 0){
                        KnightAttackMage(r);
                    }
                    else if(t.getCurrentLife() != 0){
                        KnightAttackThief(r, q);
                    }
                    else{
                        System.out.println(k.name + " Wins!");
                        System.exit(0);
                    }
                }
                break;
            case 2:                     // Thief Attacking
                if(q == 1){
                    if(k.getCurrentLife() != 0){
                        ThiefAttackKnight(r, q);
                    }
                    else if(m.getCurrentLife() != 0){
                        ThiefAttackMage(r);
                    }
                    else{
                        System.out.println(t.name + " Wins!");
                        System.exit(0);
                    }
                }
                else{
                    if(m.getCurrentLife() != 0){
                        ThiefAttackMage(r);
                    }
                    else if(k.getCurrentLife() != 0){
                        ThiefAttackKnight(r, q);
                    }
                    else{
                        System.out.println(t.name + " Wins!");
                        System.exit(0);
                    }
                }  
                break;
            default:                    // Mage Attacking
                if(q == 1){
                    if(t.getCurrentLife() != 0){
                        MageAttackThief(r, x);
                    }
                    else if(k.getCurrentLife() != 0){
                        MageAttackKnight(r, x);
                    }
                    else{
                        System.out.println(m.name + " Wins!");
                        System.exit(0);
                    }
                }
                else{
                    if(k.getCurrentLife() != 0){
                        MageAttackKnight(r, x);
                    }
                    else if(t.getCurrentLife() != 0){
                        MageAttackThief(r, x);
                    }
                    else{
                        System.out.println(m.name + " Wins!");
                        System.exit(0);
                        
                    }
                }
        }
    }
    
    public void KnightAttackThief(int r, int q){
        if(k.getCurrentLife() == 0){
            fight();
        }
        else if(r < 6){
            switch (q) {
                case 1:
                    System.out.println(k.name + " attacked " + t.name+" but...");
                    System.out.println(t.name + " evaded the attack");
                    t.wound(t.evade(t.dexterity));
                    break;
                default:
                    System.out.println(k.name + " use heal");
                    k.heal(k.intelligence);
                    break;
            }
        }
        else{
            System.out.println(k.name + " attacked " + t.name);
            t.wound(k.attack());
        }
    }
    
    public void KnightAttackMage(int r){
        if(k.getCurrentLife() == 0){
            fight();
        }
        else if(r < 6){
            System.out.println(k.name + " use heal");
            k.heal(k.intelligence);
        }
        else{
            System.out.println(k.name + " attacked " + m.name);
            m.wound(k.attack());
        }
    }
    
    public void MageAttackKnight(int r, int x){
        if(m.getCurrentLife() == 0){
            fight();;
        }
        else if(r < 6){
            switch (x) {
                case 1:
                    System.out.println(m.name + " used Fireball on " + k.name);
                    k.wound(m.attack());
                    break;
                case 2:
                    System.out.println(m.name + " attacked "+k.name +" but...");
                    System.out.println(k.name + " blocked.");
                    k.wound(k.block(r));
                    break;
                default:
                    System.out.println(m.name + " used heal");
                    m.heal(m.intelligence);
                    break;
            }
        }
        else{
            System.out.println(m.name + " attacked " + k.name);
            k.wound(m.attack());
        }
    }
    
    public void MageAttackThief(int r, int x){
        if(m.getCurrentLife() == 0){
            fight();
        }
        else if(r < 6){
            switch (x) {
                case 1:
                    System.out.println(m.name + " used Fireball");
                    t.wound(m.attack());
                    break;
                case 2:
                    System.out.println(m.name + " attacked " + t.name + " but...");
                    System.out.println(t.name + " evaded.");
                    t.wound(t.evade(t.dexterity));
                    break;
                default:
                    System.out.println(m.name + " used heal");
                    m.heal(m.intelligence);
                    break;
            }
        }
        else{
            System.out.println(m.name + " attacks ");
            t.wound(m.attack());
        }
    }
    
    public void ThiefAttackMage(int r){
        if(t.getCurrentLife() == 0){
            fight();
        }
        else if(r < 6){
            System.out.println(t.name + " used heal");
            t.heal(t.intelligence);
        }
        else{
            System.out.println(t.name + " attacked " + m.name);
            m.wound(t.attack());
        }
    }
    
    public void ThiefAttackKnight(int r, int q){
        if(t.getCurrentLife() == 0){
            fight();
        }
        else if(r < 6){
            switch (q) {
                case 1:
                    System.out.println(t.name + " attacked" + k.name + " but...");
                    System.out.println(k.name + " blocked. ");
                    k.wound(k.block(q));
                    break;
                default:
                    System.out.println(t.name + " use heal");
                    t.heal(t.intelligence);
                    break;
            }
        }
        else{
            System.out.println(t.name + " attacked " + k.name);
            k.wound(t.attack());
        }
    }
}

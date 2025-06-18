class Character {
    public void attack() {
        System.out.println("Character performs a basic attack.");
    }
}

class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("Warrior swings a sword.");
    }
}

class Mage extends Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a fireball.");
    }
    
}
public class MainCharacter{
    public static void main(String[] args) {
        Character base = new Character();
        Character warrior = new Warrior();
        Character mage = new Mage();

        base.attack();
        warrior.attack();
        mage.attack();
    }
}


package fighter;

public class Fighter {
    String name;
    int damage, health, weight, dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " hasarı blokladı ");
            return foe.health;
        }
        if(foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    
       
    
    
}

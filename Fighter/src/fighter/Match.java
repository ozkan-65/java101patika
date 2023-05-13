
package fighter;

public class Match {
     Fighter f1, f2;
    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        if(isChance()){
            this.f1 = f1;
            this.f2 = f2;
        }else {
            this.f1 = f2;
            this.f2 = f1;
        }

        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=======YENİ ROUND=======");
                System.out.println("HEALTH : " + this.f1.name + " " + this.f1.health + " VS " + this.f2.health + " " + this.f2.name);
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
            }
        }
        else{
            System.out.println("Dövüşçülerin Sikletleri Uymuyor!!!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }

    boolean isWin(){
        if(f1.health == 0){
            System.out.println(this.f2.name + " kazandı ! ");
            return true;
        }
        if(f2.health == 0){
            System.out.println(this.f1.name + " kazandı ! ");
            return true;
        }

        return false;
    }

    boolean isChance(){
        double randomChance = Math.random() * 100;
        if(randomChance <= 50){
            return true;
        }
        return false;

    }
}

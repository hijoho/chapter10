public class Matango {
    int hp;
    final int level = 10;
    char suffix;

    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
    }
    public void attack(Hero h){
        int currHp = h.hp;
        h.hp -= level;
        System.out.println(h.name+"に"+level+"のダメージ");
        System.out.println(h.name+"のHP:"+h.hp+"/"+currHp);
    }
}

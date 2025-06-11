public class SuperHero extends Hero {
    boolean flying;
    //追加の処置
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run(){ //Heroクラスのrunメソッドを上書きした
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m){//superは親クラスを呼び出す
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }
    public void test(){
        super.test();
        System.out.println("子test");
    }
}
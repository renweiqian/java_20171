package reflect;

/**
 * Created by 任纹乾 on
 * 2017/5/3.
 */
class Animals {
    public int age;
    private double weight;

    public Animals(){
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    public int sleep(int hours){
        return hours;
    }
    public void eat(String food){
        System.out.println("eating"+food);
    }
}
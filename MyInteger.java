public class MyInteger implements Smaller<MyInteger>{

    public int x;

    public MyInteger(int x){
        this.x = x;
    }

    public boolean smaller (MyInteger other){
        return (this.x < other.x);
    }
}
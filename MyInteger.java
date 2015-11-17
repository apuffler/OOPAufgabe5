public class MyInteger implements Smaller{

    public int x;

    public MyInteger(int x){
        this.x = x;
    }

    public boolean smaller (int x){
        return (this.x < x);
    }
}
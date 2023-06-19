package lesson2.Task1;

public class Numeric implements IOper{
    int start;
    int val;
    int prev;

    public Numeric() {
       start=0;
       val=0;
       prev = -2;
    }

    @Override
    public int getNext() {
        prev=val;
        val+=2;

        return val ;
    }

    @Override
    public void reset() {
        prev=-2;
        val=0;
        start =0;

    }

    @Override
    public void setStart(int x) {
        prev=x-2;
        start=x;
        val=x;
    }
    public int getPrev(){
        return prev;
    }
}

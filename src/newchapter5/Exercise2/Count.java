package newchapter5.Exercise2;

public class Count {
    private int count = 0;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void increment() {
        this.count++;
    }

    public void decrement() {
        this.count--;
    }

    public void reset() {
        this.setCount(0);
    }

}

/**
 * Created by nollp on 2016. 05. 20..
 */
public class MyClass<T> {
    public int X;
    public int Y;
    protected T tempi;
    public T getTemplate() {
        return tempi;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void F(int x, int y) {
        int res = 0;
        for (int x1: new int[]{1,2,3,4,5,6} ) {
            res += x1;
        }

    }

}


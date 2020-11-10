package Behavioral.Iterator;

public class Numbers {
    public int[] num = {1, 2, 3};

    public Iterator getIterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterator {
        int ind;

        @Override
        public boolean hasNext() {
            return ind < num.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return num[ind++];
            }
            return null;
        }
    }
}

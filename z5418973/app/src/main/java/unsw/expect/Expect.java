package unsw.expect;

public class Expect<E> {
    
    private E inner;

    protected Expect() {}

    public Expect(E obj) {
    }

    public Expect<E> toEqual(E other) {
        return null;
    }

    public<T extends Comparable<E>> Expect<E> lessThan(T other) {
        return null;
    }

    public<T extends Comparable<E>> Expect<E> greaterThanOrEqualTo(T other) {
        return null;
    }

    public Expect<E> not() {
        return null;
    }

    public Expect<E> skip() {
        return null;
    }

    public void evaluate() {

    }

    protected E getInner() {
        return inner;
    }

}

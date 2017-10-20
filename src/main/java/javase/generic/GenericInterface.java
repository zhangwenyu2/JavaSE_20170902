package javase.generic;

import java.io.Serializable;


public interface GenericInterface<T extends Serializable, E, S, U, V> {
    V method(T t, E e, U u);
}

//class GenericImpl<T> implements GenericInterface<T> {
//
//    @Override
//    public T method(T t) {
//        return null;
//    }
//}

class GenericImpl<T extends Serializable, E, S, U, V> implements GenericInterface<T, E, S, U, V> { // *****
    @Override
    public V method(T t, E e, U u) {
        return null;
    }
}
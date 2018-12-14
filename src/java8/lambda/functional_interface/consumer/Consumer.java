package java8.lambda.functional_interface.consumer;

/**
 * 函数式接口Consumer<T>定义了一个名叫accept的抽象方法，它接受泛型T的对象，然后对T进行某些操作(没有返回值)
 * @param <T>
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

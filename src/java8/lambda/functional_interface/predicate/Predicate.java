package java8.lambda.functional_interface.predicate;

/**
 * 函数式接口Predicate<T>定义了一个名叫test的抽象方法，它接受泛型T对象，并返回一个boolean.
 * 一般用于筛选元素
 * @param <T>
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

package java8.lambda.functional_interface.function;

/**
 * 函数式接口Function<T>定义了一个名叫apply的抽象方法，它接受一个泛型T的对象，返回一个泛型R的对象。
 * 一般用于映射操作，如将字符串映射到它的长度
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

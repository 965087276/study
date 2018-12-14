package java8.lambda.method_references;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造函数引用
 */
@Slf4j
public class ConstructFunction {

    public static void main(String[] args) {
        // 以下两种写法等价
        Supplier<Apple> c1 = () -> new Apple();
        Supplier<Apple> c2 = Apple::new;
        Apple a1 = c1.get();
        Apple a2 = c2.get();
        log.info("a1 is {}", a1);
        log.info("a2 is {}", a2);

        // 以下两种写法等价
        Function<String, Apple> c3 = color -> new Apple(color);
        Function<String, Apple> c4 = Apple::new;
        Apple a3 = c3.apply("red");
        Apple a4 = c4.apply("yellow");
        log.info("a3 is {}", a3);
        log.info("a4 is {}", a4);

        // 以下两种写法等价
        BiFunction<String, Integer, Apple> c5 = (color, weight) -> new Apple(color, weight);
        BiFunction<String, Integer, Apple> c6 = Apple::new;
        Apple a5 = c5.apply("green", 11);
        Apple a6 = c6.apply("black", 22);
        log.info("a5 is {}", a5);
        log.info("a6 is {}", a6);
    }
}

@Data
class Apple {

    String color;
    int weight;

    public Apple() {}

    public Apple(String color) {
        this.color = color;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}

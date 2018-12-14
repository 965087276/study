package java8.lambda.method_references;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 引用某个类型(ClassType)的实例方法(非静态方法), ClassType::methodName
 * 如调用String类型的length方法，写作 String::length
 */
@Slf4j
public class ClassType_method {

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "22", "333", "4444");
        // lambda表达式写法
        List<Integer> result1 = map(list, s -> s.length());
        // 方法引用写法
        List<Integer> result2 = map(list, String::length);

        log.info("Lambda : The length of these strings are {}", result1);
        log.info("Method reference: The length of these strings are {}", result2);

        // 单独使用
        Function<String, Integer> function = String::length;
        Integer length = function.apply("55555");
        log.info("The length of 55555 is {}", length);
    }
}

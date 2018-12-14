package java8.lambda.method_references;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 引用静态方法, ClassName::staticMethod
 * 例如调用Integer的parseInt方法可写作Integer::parseInt
 */
@Slf4j
public class ClassType_staticMethod {

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> list_str = Arrays.asList("1", "2", "3", "4");
        // lambda表达式写法
        List<Integer> list1 = map(list_str, s -> Integer.parseInt(s));
        // 方法引用写法
        List<Integer> list2 = map(list_str, Integer::parseInt);


        log.info("Lambda: {}", list1);
        log.info("Method reference: {}", list2);
    }
}

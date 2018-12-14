package java8.lambda.functional_interface.predicate;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Main {

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                Apple.builder().color("red").weight(5).build(),
                Apple.builder().color("yellow").weight(8).build(),
                Apple.builder().color("red").weight(3).build(),
                Apple.builder().color("blue").weight(6).build(),
                Apple.builder().color("blue").weight(4).build(),
                Apple.builder().color("red").weight(6).build()
        );

        List<Apple> colorOfRed = filter(apples, apple -> "red".equals(apple.getColor()));
        List<Apple> weightMoreThan5 = filter(apples, apple -> apple.getWeight() > 5);

        log.info("The red apples are:");
        colorOfRed.forEach(apple -> log.info(apple.toString()));
        log.info("");
        log.info("The apples whose weight more than 5:");
        weightMoreThan5.forEach(apple -> log.info(apple.toString()));
    }
}

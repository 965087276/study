package java8.lambda.method_references;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * 引用现有对象的实例方法 className::methodName
 */
@Slf4j
public class className_instanceMethod {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("aabbcc", "aaabbbccc", "abc");
        List<String> list2 = Arrays.asList("aabbcc", "aaabbbccc", "abc");
        ComparisonProvider comparisonProvider = new ComparisonProvider();

        // lambda写法
        list1.sort((s1, s2) -> comparisonProvider.compare(s1, s2));
        // 方法引用写法
        list2.sort(comparisonProvider::compare);

        log.info("list1 is {}", list1);
        log.info("list 2 is {}", list2);
    }
}

class ComparisonProvider {
    public int compare(String a, String b) {
        if (a.length() == b.length()) {
            return 0;
        }
        return a.length() < b.length() ? -1 : 1;
    }
}

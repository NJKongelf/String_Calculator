import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {




public int Add(String numbers) {
    if (numbers==null)
        return 0;
    if (numbers.contains("-")) {
        List<Integer> message = Arrays.stream(numbers.split(Arrays.toString(new String[]{",", "\n", ";"})))
                .mapToInt(Integer::parseInt)
                .boxed()
                .filter(n -> n < 0)
                .collect(Collectors.toList());
        throw new IllegalArgumentException("negatives not allowed: "+message);
    }

        return Arrays
            .stream(numbers.split(Arrays.toString(new String[]{",", "\n", ";","*","%"})))
            .filter((n) -> n.matches("\\d+"))
            .mapToInt(Integer::parseInt)
            .filter(c -> c < 1000)
            .sum();
}
}

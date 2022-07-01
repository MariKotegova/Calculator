import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new; // возвращает обьект не принимает ничего

    public Calculator() {
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> {
        //return x > 0 ? x : x * -1;
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    };

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println; // выводит на печать

}

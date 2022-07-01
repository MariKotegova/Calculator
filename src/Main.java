// Ответ на вопросс про ошибку: Вообще при реализации этого кода ни какой ошибки мне не выдало,
//   в том числе в int f = calc.abs.apply(-10); В таком случае предполагаю что это просто не корректный
//   способ отражения информации , так как это уже не однострочное выражение а блок кода с условием и
//   двумя вариантами результата, соответственно оно должно обрамляться фигурными скобками и так как оно
//   возвращает значение то надо использовать return,  записать можно либо коротко
//   UnaryOperator<Integer> abs = x -> {
//        return x > 0 ? x : x * -1;
//            };
//   либо длиньше через if, как в моем премере.


public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(6, 2);
        int d = calc.multiply.apply(3, 5);
        int e = calc.pow.apply(6);
        int f = calc.abs.apply(-10);


        System.out.println(calc.isPositive.test(-6));
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
    }
}

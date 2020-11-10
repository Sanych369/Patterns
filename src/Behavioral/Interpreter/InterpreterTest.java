package Behavioral.Interpreter;

/**
 * Интерпретатор (Interpreter) - Решает часто встречающуюся, но подверженную изменениям, задачу.
 * Пример в java - все подклассы java.text.Format.
 */
public class InterpreterTest {
    public static void main(String[] args) {
        String str = "tExT";
        Context context = new Context();
        Expression lowerExp = new LowerExpression(str);
        String low = lowerExp.interpret(context);
        System.out.println(low);
        Expression upperExp = new UpperExpression(str);
        String upp = upperExp.interpret(context);
        System.out.println(upp);

    }
}

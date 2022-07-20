import Models.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello !!!!");

        Test test = new Test();
        test.someMethod();

        Other.Test other = new Other.Test();
        other.someMethod();

    }
}

/**
 * вам расказывали уже о "пакетах", пространстве имен?
 * вроде нет
 * у тебя видны все окошки, которые я открываю?
 * а откуда ж я знаю что ты открываешь? может ты открываешь а я этого не вижу
 * это простые примеры, в разных пакетах могут находится классы с одинаковым названием, методоами
 */
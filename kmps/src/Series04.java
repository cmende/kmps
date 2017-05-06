import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import Series03a.Option;

/**
 * Created by Christoph on 05.05.2017.
 */
public class Series04 {
    public static void aufgabe1() {
        Number[] numbers = new Number[4];
        Integer[] integers = numbers; // Zuweisung nicht möglich, da Number kein Untertyp von Integer ist
        Object[] objects = numbers; // Zuweisung möglich, da Number ein Untertyp von Object ist

        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = numberList; // Zuweisung nicht möglich, weil a) Number kein Integer, b) List nicht kovariant
        List<Integer> integerList1 = new ArrayList<Integer>(numberList); // Zuweisung nicht möglich, weil Number kein Integer
        List<Object> objectList = numberList; // Zuweisung nicht möglich, weil List nicht kovariant
        List<Object> objectList1 = new ArrayList<>(numberList); // Zuweisung möglich, weil Object<-Integer und Konstruktor kovariant
    }

    static <T> T coGet(List<? extends T> list, int index) { return list.get(index); } // möglich, weil der Supertyp der Listenelemente zurückgegeben werden kann (Beispiel: String-Liste kann Object zurückgeben)
    static <T> T conGet(List<? super T> list, int index) { return list.get(index); } // nicht möglich, weil nicht ein beliebiger Untertyp zurückgegeben werden kann (Beispiel: Object-Liste kann nicht String zurückgeben)
    static <T> void coSet(List<? extends T> list, int index, T value) { list.set(index, value); } // nicht möglich, weil ein Supertyp nicht in der Liste gespeichert werden kann (Beispiel: String-Liste kann nicht Object speichern)
    static <T> void conSet(List<? super T> list, int index, T value) { list.set(index, value); } // möglich, weil ein Untertyp in der Liste gespeichert werden kann (Beispiel: Object-Liste kann String speichern)

    public static <T> Option<T> map(Function<T, T> func, Option<T> opt) {
        if (opt.isPresent()) {
            return Option.of(func.apply(opt.get()));
        }
        return Option.empty();
    }

    public static <T> Option<T> flatMap(Function<T, Option<T>> func, Option<T> opt) {
        return null;
    }
}

import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Created by Christoph on 22.04.2017.
 */
public class Series03a {
    public static abstract class Option<T> {

        private Option() {}

        public static <T> Option<T> empty() { return new None(); }
        // hier kann man jetzt auch null übergeben und bekommt ein Some(none)
        // ich bin mir nicht sicher, ob das jetzt ein Bug oder Feature ist
        // falls Bug, würde ich die of()-Methode einsparen und stattdessen nur ofNullable() benutzen
        public static <T> Option<T> of(T value) { return new Some(value); }
        public static <T> Option<T> ofNullable(T value) {
            if (value == null)
                return new None();
            return new Some(value);
        }

        public abstract T get();
        public abstract boolean isPresent();
        public abstract T orElse(T other);
        public abstract <R> R fold(R initial, Function<T, R> f);

        // map f xs = foldr (\ a b -> f a : b) [] xs
        public Option<T> map(Function<T, T> func) { return null; }

        
        public Option<T> flatMap(Function<T, Option<T>> func) { return null; }


        public static class Some<T> extends Option<T> {
            private final T value;

            private Some(T value) { this.value = value; }

            public T get() { return value; }
            public boolean isPresent() { return true; }
            public T orElse(T other) { return value; }

            // TODO
            public <R> R fold(R initial, Function<T, R> f) {
                return null;
            }

            public String toString() { return "Some(" + value.toString() + ")"; }
        }

        public static class None<T> extends Option<T> {
            public T get() { throw new NoSuchElementException("No value present"); }
            public boolean isPresent() { return false; }
            public T orElse(T other) { return other; }

            // TODO
            public <R> R fold(R initial, Function<T, R> f) {
                return null;
            }

            public String toString() {´return "Empty"; }
        }
    }
}

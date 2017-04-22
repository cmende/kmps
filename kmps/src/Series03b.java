import Series03a.Option;

/**
 * Created by Christoph on 22.04.2017.
 */
public class Series03b {
    public static enum RNA {
        U,A,C,G

        public static Option<RNA> parseBase(char c) {
            switch (Character.toUpperCase(c)) {
                case 'U': return Option.of(U);
                case 'A': return Option.of(A);
                case 'C': return Option.of(C);
                case 'G': return Option.of(G);
                default: return Option.empty();
            }
        }
    }
}

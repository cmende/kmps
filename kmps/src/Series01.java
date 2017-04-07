/**
 * Created by Christoph on 07.04.2017.
 */
public class Series01 {

    public static void main(String[] args) {
        Value[] x = {new CharValue('a'), new BoolValue(false), new CharValue('c')};

        for (Value v : x) {
            System.out.println(neg(v));
        }
    }

    public static Value odd(boolean b) {
        if (b) {
            return new CharValue('a');
        } else {
            return new BoolValue(false);
        }
    }

    public static Value neg(Value v) {
        if (v instanceof BoolValue)
            return new BoolValue(!((BoolValue) v).getV());
        return v;
    }

    public static class Value {}

    public static class CharValue extends Value {
        private char v;
        public CharValue(char v) { this.v = v; }

        @Override
        public String toString() {
            return String.valueOf(v);
        }

        public char getV() { return v; }
    }

    public static class BoolValue extends Value {
        private boolean v;
        public BoolValue(boolean v) { this.v = v; }

        @Override
        public String toString() {
            return String.valueOf(v);
        }

        public boolean getV() { return v; }
    }
}

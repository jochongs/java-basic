package ch12;

public class Ex4 {
    static enum Direction2 {
        EAST(1, ">"),
        SOUTH(2, "V"),
        WEST(3, "<"),
        NORTH(4, "^");

        private static final Direction2[] DIR_ARR = Direction2.values();
        private final int value;
        private final String symbol;

        private Direction2(int value, String symbol) {
            this.value = value;
            this.symbol = symbol;
        }

        static Direction2[] getDirArr() {
            return DIR_ARR;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(200);

            sb.append('[');
            for (Direction2 direction2 : DIR_ARR) {
                sb.append(direction2.value);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Direction2 south = Direction2.EAST;

        System.out.println(south.toString());
    }
}

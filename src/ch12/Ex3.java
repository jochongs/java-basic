package ch12;

public class Ex3 {
    static enum Direction {
        EAST,
        SOUTH,
        WEST,
        NORTH
    }

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.SOUTH;

        switch (d1) {
            case Direction.WEST -> System.out.println("The Direction is WEST");
            case Direction.EAST -> System.out.println("The Direction is EAST.");
            case SOUTH -> System.out.println("The Direction is SOUTH"); // 이렇게 써도 됨
        }
    }
}

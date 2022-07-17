package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if (i == sideLength / 2)
                for (int j = 0; j < sideLength - 1; j++) System.out.print('8');
            else
                for (int j = 0; j < sideLength / 2; j++) System.out.print(' ');

            System.out.print('8');
            System.out.println(' ');
        }
    }

    public static void main(String[] args) {
        printCross(3);
    }
}

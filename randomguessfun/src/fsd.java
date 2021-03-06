import java.util.Scanner;

public class bars {
    public bars(int bar, boolean aStarts) {
        if (aStarts) {
            aTurn(bar);
        } else {
            bTurn(bar);
        }

    }

    public static void aTurn(int bar) {
        System.out.printf("Bars = %d      Player A picks: ", bar);
        Scanner console = new Scanner(System.in);
        int y = console.nextInt();
        if (y > 3) {
            aTurn(bar);
        } else {
            bar -= y;
            if (bar <= 0) {
                System.out.println(" Player B wins!");
            } else {
                bTurn(bar);
            }
        }

    }

    public static void bTurn(int bar) {
        System.out.printf("Bars = %d      Player B picks: ", bar);
        Scanner console = new Scanner(System.in);
        int y = console.nextInt();
        if (y > 3) {
            bTurn(bar);
        } else {
            bar -= y;
            if (bar <= 0) {
                System.out.println("A wins!");
            } else {
                aTurn(bar);
            }
        }

    }

    public static void main(String[] args) {
        int bar = 21;
        boolean aStarts = System.currentTimeMillis() % 2L == 0L;
        new bars(bar, aStarts);
    }
}

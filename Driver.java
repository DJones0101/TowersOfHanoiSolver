/**
 * Created by Darius Jones on 5/31/2017.
 */
public class Driver {
    public static void main(String[] args) {
        Hanoi solver = new Hanoi();

        solver.solveHanoi(3, 'A', 'B', 'C');
    }
}

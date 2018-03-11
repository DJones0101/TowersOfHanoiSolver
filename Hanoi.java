/**
 * Created by Darius Jones on 5/31/2017.
 * <p>
 * A program that recursively calculates the steps for solving the Towers Of Hanoi Problem
 * with any number of plates.
 * Go to : https://www.coolmath-games.com/0-tower-of-hanoi to test the program!
 *
 */
public class Hanoi {

    public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo) {

        if (n == 1) {
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return;
        }
        solveHanoi(n - 1, rodFrom, rodTo, middleRod);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        solveHanoi(n - 1, middleRod, rodFrom, rodTo);

    }

}

package island;

import java.util.ArrayList;
import java.util.Scanner;

import island.islands.*;

public class StateMachine {
    public State currentState = new PiratesIsland();
    public boolean hasReachedFinalState = false;

    public static void main(String[] args) {

    }

    public void run() {
        ArrayList<State> stateHistory = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (!hasReachedFinalState) {
            stateHistory.add(currentState);
            System.out.printf("Your current State is '%s' with possible moves %s\n", this.currentState.str(),
                    this.currentState.info());
            System.out.println("Please choose next move (A/B): ");
            String actionInput = input.next();
            switch (actionInput) {
                case "A":
                    this.currentState = this.currentState.transition(Action.A);
                    break;
                case "B":
                    this.currentState = this.currentState.transition(Action.B);
                    break;
                default:
                    break;
            }
            if (this.currentState.str().equals("Treasure Island")) hasReachedFinalState = true;
        }
        input.close();
        System.out.println(stateHistory);
    }
}
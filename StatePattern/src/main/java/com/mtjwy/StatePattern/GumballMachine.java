package com.mtjwy.StatePattern;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
		
		public void insertQuarter() {
			state.insertQuarter();
		}
		public void ejectQuarter() {
			state.ejectQuarter();
		}
		public void turCrank() {
			state.turCrank();
			state.dispense();
		}
		
		void setState(State state) {
			this.state = state;
		}
		
		void releaseBall() {
			System.out.println("A gumball comes rolling out the slot...");
			if (count != 0) {
				count--;
			}
		}
		
		int getCount() {
			return count;
		}
		
		void refill(int count) {
			this.count = count;
			state = noQuarterState;
		}
		
		public State getState() {
			return state;
		}
		
		public State getSoldOutState() {
			return soldOutState;
		}
		public State getNoQuarterState() {
			return noQuarterState;
		}
		public State getHasQuarterState() {
			return hasQuarterState;
		}
		public State getSoldState() {
			return soldState;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("\nMighty Gumball, Inc.");
			sb.append("\nJava-enabled Standing Gumball Model #2015");
			sb.append("/nInventory: " + count + " gumball");
			if (count != 1) {
				sb.append("s");
			}
			sb.append("\n");
			sb.append("Machine is " + state + "\n");
			return sb.toString();
		}

}

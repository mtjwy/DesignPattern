package com.mtjwy.CommandPattern;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light("Living Room");
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remoteControl.setCommand(0, lightOn, lightOff);
		
		System.out.println(remoteControl);
		
		System.out.println("--- Pushing Light On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Light Off---");
		remoteControl.offButtonWasPushed(0);
		
		System.out.println("--- Pushing Undo ---");
		remoteControl.undoButtonWasPushed();
		
		
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
		
		System.out.println("--- Pushing ceilingFanMedium ---");
		remoteControl.onButtonWasPushed(1);
		System.out.println("--- Pushing ceilingFanOff ---");
		remoteControl.offButtonWasPushed(1);
		
		System.out.println("--- Pushing Undo ---");
		remoteControl.undoButtonWasPushed();
		
		System.out.println("--- Pushing ceilingFanHigh ---");
		remoteControl.onButtonWasPushed(2);
		System.out.println("--- Pushing ceilingFanOff ---");
		remoteControl.offButtonWasPushed(2);
		
		System.out.println("--- Pushing Undo ---");
		remoteControl.undoButtonWasPushed();
		
	}
}

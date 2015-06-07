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
	}
}

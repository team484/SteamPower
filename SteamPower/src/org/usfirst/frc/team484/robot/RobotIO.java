package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

public class RobotIO {
	
	public static AnalogGyro topGyro;
	public static AnalogGyro bottomGyro;
	public static AnalogInput gearSense;
	
	public static Talon flWheel;
	public static Talon rlWheel;
	public static Talon frWheel;
	public static Talon rrWheel;
	public static Talon fcWheel;
	public static Talon rcWheel;
	public static Talon rClimber;
	public static Talon lClimber;
	
	public static Joystick driveStick;
	public static Joystick opStick;
	
	public static DoubleSolenoid gEject;
	public static DoubleSolenoid gRaise;
	public static DoubleSolenoid gClamp;
	
	public static Encoder lEnc;
	public static Encoder rEnc;
	public static Encoder fcEnc;
	public static Encoder rcEnc;
	
	public static Compressor compressor;
	
	
	
	public RobotIO() {
		topGyro = new AnalogGyro(RobotMap.topGyro);
		bottomGyro = new AnalogGyro(RobotMap.bottomGyro);
		gearSense = new AnalogInput(RobotMap.gearSense);
		
		flWheel = new Talon(RobotMap.flWheel);
		rlWheel = new Talon(RobotMap.rlWheel);
		frWheel = new Talon(RobotMap.frWheel);
		rrWheel = new Talon(RobotMap.rrWheel);
		fcWheel = new Talon(RobotMap.fcWheel);
		rcWheel = new Talon(RobotMap.rcWheel);
		rClimber = new Talon(RobotMap.rClimber);
		lClimber = new Talon(RobotMap.lClimber);
		
		gEject = new DoubleSolenoid(RobotMap.gEjectOut, RobotMap.gEjectIn);
		gRaise = new DoubleSolenoid(RobotMap.gRaiseDown, RobotMap.gRaiseUp);
		gClamp = new DoubleSolenoid(RobotMap.gClampClose, RobotMap.gClampOpen);
		
		lEnc = new Encoder(RobotMap.lEncA, RobotMap.lEncB);
		rEnc = new Encoder(RobotMap.rcEncA, RobotMap.rcEncB);
		fcEnc = new Encoder(RobotMap.fcEncA, RobotMap.fcEncB);
		rcEnc = new Encoder(RobotMap.rcEncA, RobotMap.rcEncB);
		
		compressor = new Compressor();
		
		driveStick = new Joystick(RobotMap.driveStick);
		opStick = new Joystick(RobotMap.opStick);
	}
}

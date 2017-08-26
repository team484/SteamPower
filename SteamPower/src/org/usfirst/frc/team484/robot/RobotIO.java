package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;

public class RobotIO {
	
	AnalogGyro topGyro;
	AnalogGyro bottomGyro;
	AnalogInput gearSense;
	
	Talon flWheel;
	Talon rlWheel;
	Talon frWheel;
	Talon rrWheel;
	Talon fcWheel;
	Talon rcWheel;
	Talon rClimber;
	Talon lClimber;
	
	DoubleSolenoid gEject;
	DoubleSolenoid gRaise;
	DoubleSolenoid gClamp;
	
	Encoder lEnc;
	Encoder rEnc;
	Encoder fcEnc;
	Encoder rcEnc;
	
	Compressor compressor;
	
	
	
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
	}
}

package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends Command {

    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//TODO: uhh?
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.drive(0, 0, 0);
    }
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
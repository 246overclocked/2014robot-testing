// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc246.subsystems;

import org.usfirst.frc246.RobotMap;
import org.usfirst.frc246.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftShootMotor = RobotMap.shooterleftShootMotor;
    SpeedController rightShootMotor = RobotMap.shooterrightShootMotor;
    DoubleSolenoid kicker1 = RobotMap.shooterkicker1;
    DoubleSolenoid kicker2 = RobotMap.shooterkicker2;
    DoubleSolenoid kicker3 = RobotMap.shooterkicker3;
    DoubleSolenoid kicker4 = RobotMap.shooterkicker4;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ShooterOff());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void prepToShoot() {
        leftShootMotor.set(1.0);
        rightShootMotor.set(1.0);
    }
    
    public void pickup(){
        leftShootMotor.set(-1.0);
        rightShootMotor.set(-1.0);
    }
    
    public void stopMotors(){
        leftShootMotor.set(0.0);
        rightShootMotor.set(0.0);
    }
    
    public void punch() {
        kicker1.set(DoubleSolenoid.Value.kForward);
        kicker2.set(DoubleSolenoid.Value.kForward);
        kicker3.set(DoubleSolenoid.Value.kForward);
        kicker4.set(DoubleSolenoid.Value.kForward);
    }
    
    public void depunch() {
        kicker1.set(DoubleSolenoid.Value.kReverse);
        kicker2.set(DoubleSolenoid.Value.kReverse);
        kicker3.set(DoubleSolenoid.Value.kReverse);
        kicker4.set(DoubleSolenoid.Value.kReverse);
    }
}


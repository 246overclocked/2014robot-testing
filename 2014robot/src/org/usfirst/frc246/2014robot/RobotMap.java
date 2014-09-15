// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc246.2014robot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. Stores all the "magic numbers"
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainLeftDriveMotor1;
    public static SpeedController drivetrainLeftDriveMotor2;
    public static SpeedController drivetrainRightDriveMotor1;
    public static SpeedController drivetrainRightDriveMotor2;
    public static RobotDrive drivetrainDrive;
    public static SpeedController armleftArmMotor;
    public static SpeedController armrightArmMotor;
    public static AnalogChannel armPotentiometer;
    public static SpeedController shooterleftShootMotor;
    public static SpeedController shooterrightShootMotor;
    public static DoubleSolenoid shooterkicker1;
    public static DoubleSolenoid shooterkicker2;
    public static DoubleSolenoid shooterkicker3;
    public static DoubleSolenoid shooterkicker4;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainLeftDriveMotor1 = new Victor(1, 1);
	LiveWindow.addActuator("Drivetrain", "LeftDriveMotor1", (Victor) drivetrainLeftDriveMotor1);
        
        drivetrainLeftDriveMotor2 = new Victor(1, 2);
	LiveWindow.addActuator("Drivetrain", "LeftDriveMotor2", (Victor) drivetrainLeftDriveMotor2);
        
        drivetrainRightDriveMotor1 = new Victor(1, 3);
	LiveWindow.addActuator("Drivetrain", "RightDriveMotor1", (Victor) drivetrainRightDriveMotor1);
        
        drivetrainRightDriveMotor2 = new Victor(1, 4);
	LiveWindow.addActuator("Drivetrain", "RightDriveMotor2", (Victor) drivetrainRightDriveMotor2);
        
        drivetrainDrive = new RobotDrive(drivetrainLeftDriveMotor1, drivetrainLeftDriveMotor2,
              drivetrainRightDriveMotor1, drivetrainRightDriveMotor2);
	
        drivetrainDrive.setSafetyEnabled(true);
        drivetrainDrive.setExpiration(0.1);
        drivetrainDrive.setSensitivity(0.5);
        drivetrainDrive.setMaxOutput(1.0);
        armleftArmMotor = new Victor(1, 5);
	LiveWindow.addActuator("Arm", "leftArmMotor", (Victor) armleftArmMotor);
        
        armrightArmMotor = new Victor(1, 6);
	LiveWindow.addActuator("Arm", "rightArmMotor", (Victor) armrightArmMotor);
        
        armPotentiometer = new AnalogChannel(1, 1);
	LiveWindow.addSensor("Arm", "Potentiometer", armPotentiometer);
        
        shooterleftShootMotor = new Victor(1, 7);
	LiveWindow.addActuator("Shooter", "leftShootMotor", (Victor) shooterleftShootMotor);
        
        shooterrightShootMotor = new Victor(1, 8);
	LiveWindow.addActuator("Shooter", "rightShootMotor", (Victor) shooterrightShootMotor);
        
        shooterkicker1 = new DoubleSolenoid(1, 1, 2);      
	
        
        shooterkicker2 = new DoubleSolenoid(1, 3, 4);      
	
        
        shooterkicker3 = new DoubleSolenoid(1, 5, 6);      
	
        
        shooterkicker4 = new DoubleSolenoid(1, 7, 8);      
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

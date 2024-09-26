// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.InstantCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ActivateTurbo extends InstantCommand {
  public ActivateTurbo() {
    // Use addRequirements() here to declare subsystem dependencies.
    // No subsystem nescessary, we are using a static variable from the robot contatiner.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.kSpeedModifier = 1.2;
  }
}

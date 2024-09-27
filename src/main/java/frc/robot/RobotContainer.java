package frc.robot;

import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

    public RobotContainer()
    {
        // Configures button bindings on startup.
        configureButtonBindings();
    }

    private void configureButtonBindings()
    {
        // Handles turbo
        // Can't use an andThen() because the commands are instantaneous.
        new JoystickButton(Robot.m_controller, Button.kRightBumper.value).whileTrue(new ActivateTurbo());
        new JoystickButton(Robot.m_controller, Button.kRightBumper.value).onFalse(new DeactivateTurbo());
    }
}

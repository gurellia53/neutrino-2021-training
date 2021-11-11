package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.commands.DefaultArmCommand;
import frc.robot.commands.ArmDown;
import frc.robot.commands.ArmUp;

import frc.robot.subsystems.ArmSubsystem;

/******************************************************************************/
public class RobotContainer
{
    private enum UsbPort
    {
        OPERATOR_CONTROLLER_PORT;
    }

    private final XboxController m_OperatorController = new XboxController( UsbPort.OPERATOR_CONTROLLER_PORT.ordinal() );
    private final JoystickButton m_B = new JoystickButton( m_OperatorController, Button.kB.value );

    private final ArmSubsystem m_arm_subsystem = new ArmSubsystem();

    /**************************************************************************/
    public RobotContainer()
    {
        m_arm_subsystem.setDefaultCommand( new DefaultArmCommand( m_arm_subsystem ) );

        configureButtonBindings();
    }

    /**************************************************************************/
    private void configureButtonBindings()
    {
        // changed from whileHeld()
        m_B.whenPressed(
            new SequentialCommandGroup(
                new ArmUp( m_arm_subsystem ),
                new ArmDown( m_arm_subsystem ) ) );
    }

}

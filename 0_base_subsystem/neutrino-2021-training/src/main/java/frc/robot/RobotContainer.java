package frc.robot;

import frc.robot.subsystems.ArmSubsystem;

/******************************************************************************/
public class RobotContainer
{
    private final ArmSubsystem m_arm_subsystem = new ArmSubsystem();

    /**************************************************************************/
    public RobotContainer()
    {
        configureButtonBindings();
    }

    /**************************************************************************/
    private void configureButtonBindings()
    {
    }

}

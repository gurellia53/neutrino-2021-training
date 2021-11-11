package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase
{
    Victor m_arm_motor;

    public ArmSubsystem()
    {
        System.out.println("## Construct ArmSubsystem");
        m_arm_motor = new Victor( 0 );
    }

    @Override
    public void periodic()
    {
        // System.out.println("## ArmSubsystem Periodic");
    }

    public void SetMotor( double volts )
    {
        m_arm_motor.set( volts );
    }
}

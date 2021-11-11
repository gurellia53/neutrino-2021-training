package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase
{
    private final int ARM_MOTOR_PORT = 0;
    private final int SHOULDER_PORT = 6;

    Victor m_arm_motor;
    DutyCycleEncoder m_shoulder;

    public ArmSubsystem()
    {
        System.out.println( "## Construct ArmSubsystem" );
        m_arm_motor = new Victor( ARM_MOTOR_PORT );
        m_shoulder = new DutyCycleEncoder( SHOULDER_PORT );
    }

    @Override
    public void periodic()
    {
        // System.out.println("## ArmSubsystem Periodic");
    }

    public void SetMotor( double volts )
    {
        // System.out.println("## ArmSubsystem SetMotor " + volts);
        m_arm_motor.set( volts );
    }

    public double GetArmAngle()
    {
        return m_shoulder.get();
    }
}

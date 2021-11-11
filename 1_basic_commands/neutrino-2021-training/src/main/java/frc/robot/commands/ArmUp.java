package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.ArmSubsystem;

public class ArmUp extends CommandBase
{
    private final ArmSubsystem m_subsystem;

    // constructor
    public ArmUp( ArmSubsystem subsystem )
    {
        m_subsystem = subsystem;
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {
        System.out.println( "## Schedule ArmUp" );
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute()
    {
        m_subsystem.SetMotor( 1.0 );
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {
        System.out.println( "## End ArmUp" );
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished()
    {
        return false;
    }
}

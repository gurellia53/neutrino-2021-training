package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.ArmSubsystem;

public class DefaultArmCommand extends CommandBase
{
    private final ArmSubsystem m_subsystem;

    // constructor
    public DefaultArmCommand( ArmSubsystem subsystem )
    {
        m_subsystem = subsystem;
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {
        System.out.println( "## Schedule DefaultArmCommand" );
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute()
    {
        m_subsystem.SetMotor( 0.0 );
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {
        System.out.println( "## End DefaultArmCommand" );
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished()
    {
        return false;
    }
}

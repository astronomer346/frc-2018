/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team166.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team166.chopshoplib.commands.SubsystemCommand;

import java.util.Set;;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Vision extends Subsystem {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("/GRIP/VisionTarget");

    public Vision() {
        addChild(getTableKeys());
    }

    public Set<String> getTableKeys() {
        return table.getKeys();
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new SubsystemCommand(this) {

            @Override
            protected void initialize() {

            }

            @Override
            protected void execute() {

            }

            @Override
            protected boolean isFinished() {
                return false;
            }

            @Override
            protected void end() {

            }
        });
    }
}

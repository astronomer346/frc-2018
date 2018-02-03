/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team166.robot.subsystems;

import java.util.Set;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.vision.VisionRunner;
import edu.wpi.first.wpilibj.vision.VisionThread;
import edu.wpi.first.wpilibj.vision.VisionRunner.Listener;
import frc.team166.chopshoplib.commands.SubsystemCommand;
import frc.team166.robot.subsystems.GripPipeline;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Vision extends Subsystem {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("VisionTarget");

    final Listener<GripPipeline> listener;
    final VisionRunner<GripPipeline> gripRunner;

    public Vision() {
        addChild(getTableKeys());
        new VisionThread(CameraServer.getInstance(), new GripPipeline(), listener);
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

package org.firstinspires.ftc.teamcode.action;

import org.firstinspires.ftc.teamcode.util.RobotHardware;

/**
 * Created by djfigs1 on 1/27/18.
 */

public class LiftBlockAction implements Action {

    boolean init = true;
    double endTime;

    @Override
    public boolean doAction(RobotHardware hardware) {
        if (init) {
            endTime = System.currentTimeMillis() + 2000;
            init = false;
        }

        if (System.currentTimeMillis() < endTime) {
            hardware.lift_verticalServo.setPower(-1);
        } else {
            hardware.lift_verticalServo.setPower(0);
            return true;
        }
        return false;
    }
}
package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomous.sequences.JewelActionSequence;
import org.firstinspires.ftc.teamcode.util.ActionExecutor;

/**
 * Created by lvern on 12/2/2017.
 */

@Autonomous(name = "Jewels - Red")
public class JewelsRed extends ActionExecutor {

    @Override
    public void init() {
        super.init();
        this.actionSequence = new JewelActionSequence(Team.Red);
        this.initVuforia = false;
        armServo.setPosition(1);
    }
}
package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomous.sequences.FullAutoSequence;
import org.firstinspires.ftc.teamcode.util.ActionExecutor;

/**
 * Created by djfigs1 on 1/20/18.
 */

@Autonomous(name = "BLUE - Bottom")
public class AutoBlueBottomExec extends ActionExecutor {

    @Override
    public void init() {
        this.initVuforia = true;
        super.init();
        FullAutoSequence sequence = new FullAutoSequence(Team.Blue, Position.Bottom);
        this.actionSequence = sequence;
        sequence.init(this);
    }
}

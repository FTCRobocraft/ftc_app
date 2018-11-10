package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.util.OmniDrive;

public class RoverRuckusHardware extends BaseHardware {

    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    public OmniDrive omniDrive;

    public enum GOLD_MINERAL_POSITION {
        LEFT,
        CENTER,
        RIGHT,
        UNKNOWN
    }

    @Override
    public void init() {
        super.init();

        try {
            frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
            frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        } catch (Exception e) {
            telemetry.addData("Not Found:", e.getMessage());
        }

        try {
            frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        } catch (Exception e) {
            telemetry.addData("Not Found:", e.getMessage());
        }

        try {
            backLeft = hardwareMap.get(DcMotor.class, "backLeft");
            backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        } catch (Exception e) {
            telemetry.addData("Not Found:", e.getMessage());
        }

        try {
            backRight = hardwareMap.get(DcMotor.class, "backRight");
        } catch (Exception e) {
            telemetry.addData("Not Found:", e.getMessage());
        }

        omniDrive = new OmniDrive(frontLeft, frontRight, backLeft, backRight);


    }

}
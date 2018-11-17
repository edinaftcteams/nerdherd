package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name = "Setup", group = "Pushbot")
//@Disabled
public class Setup extends LinearOpMode {
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;
    private DcMotor liftMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        liftMotor = hardwareMap.dcMotor.get("lift_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        if (opModeIsActive()) {
            liftMotor.setPower(-20);
            sleep(4350);// wait for two seconds
            liftMotor.setPower(20);
            sleep(4000);
        }
    }
}

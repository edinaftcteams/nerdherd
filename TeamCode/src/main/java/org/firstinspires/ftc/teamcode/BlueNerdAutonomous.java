package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name = "BlueAutonomous", group = "Pushbot")
//@Disabled
public class BlueNerdAutonomous extends LinearOpMode {
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;
    private DcMotor liftMotor = null;
    private Servo  servo_x  = null;
@Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        liftMotor = hardwareMap.dcMotor.get("lift_motor");
    servo_x = hardwareMap.get(Servo.class, "servo_x");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        if (opModeIsActive()) {
            liftMotor.setPower(-25);
            sleep(4500);// wait for two seconds
            liftMotor.setPower(0);
            rightMotor.setPower(-25);
            leftMotor.setPower(-25);
            sleep(3500);
            rightMotor.setPower(-25);
            leftMotor.setPower(0);
            sleep(1000);
            leftMotor.setPower(0);
            rightMotor.setPower(0);
            liftMotor.setPower(20);
            sleep(4000);
            liftMotor.setPower(0);
            servo_x.setPosition(0);
            sleep(10);
            leftMotor.setPower(25);
            rightMotor.setPower(25);
            sleep(750);
            servo_x.setPosition(0);
            leftMotor.setPower(0);
            rightMotor.setPower(0);
            servo_x.setPosition(0);
        }
    }
}

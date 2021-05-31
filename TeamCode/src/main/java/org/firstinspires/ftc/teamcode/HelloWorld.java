package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorld extends OpMode {

// This is called when the driver presses INIT

    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }

// This is called repeatedly while OpMode is playing
    @Override
    public void loop() {
    // intentionally left blank 123
    }
}

package com.meditab.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(DoorTimer doorTime)
    {
        while (true) {
            if (isPersonClose()) {
                doorTime.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
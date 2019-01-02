package com.meditab.training.isp.exercise;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final DoorTimer doorTime)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                doorTime.timeOutCallback();
            }
        }, timeOut);
    }
}
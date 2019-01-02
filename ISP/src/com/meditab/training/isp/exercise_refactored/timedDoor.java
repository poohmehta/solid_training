package com.meditab.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements Door,DoorTimer
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

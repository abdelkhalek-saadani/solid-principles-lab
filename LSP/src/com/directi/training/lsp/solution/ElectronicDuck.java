package com.directi.training.lsp.solution;

public class ElectronicDuck implements IDuck, Switchable
{
    private boolean _on = false;

    public void quack()
    {
        if (!_on) {
            turnOn();
        };
        System.out.println("Electronic duck quack...");
    }

    public void swim()
    {
        if (!_on) {
            turnOn();
        };
        System.out.println("Electronic duck swim...");
        
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}

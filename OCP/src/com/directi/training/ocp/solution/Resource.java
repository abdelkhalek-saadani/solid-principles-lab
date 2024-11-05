package com.directi.training.ocp.solution;

public interface Resource {

    public int findFree();
    public void markBusy(int resourceId);
    public void markFree(int resourceId);
}

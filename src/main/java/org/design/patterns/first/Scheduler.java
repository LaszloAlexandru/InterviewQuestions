package org.design.patterns.first;

public class Scheduler {
    private static Scheduler instance;

    private Scheduler() {}

    public static Scheduler getInstance() {
        if (instance == null) {
            instance = new Scheduler();
        }
        return instance;
    }

//    public void scheduleTask(Task task) {
//        task.execute();
//    }
}
package com.kodilla.patterns.factory.tasks;

public final class ShopingTask implements Task{
    final private String taskName;
    final private String whatToBuy;
    final double quantity;
    private boolean isDone = false;

    public ShopingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if(!isDone) {
            System.out.println(toString());
            isDone = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ShopingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", is executing";
    }
}

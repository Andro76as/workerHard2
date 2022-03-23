package ru.netology.AndreyS;


public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public int x;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    // @FunctionalInterface
    // public interface OnTaskErrorListener {
    //     void onError(String result);
    // }

    // @FunctionalInterface
    // public interface OnTaskDoneListener {
    //     void onDone(String result);
    // }

    public void start() {
        for (int i = 30; i < 35; i++) {
            if (i == x) {
                errorCallback.onError("Error " + i);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
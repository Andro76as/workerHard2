package ru.netology.AndreyS;


@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
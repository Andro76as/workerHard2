package ru.netology.AndreyS;


@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
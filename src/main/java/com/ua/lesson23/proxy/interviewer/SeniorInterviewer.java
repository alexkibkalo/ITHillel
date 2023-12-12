package com.ua.lesson23.proxy.interviewer;

public class SeniorInterviewer implements Interviewer {
    @Override
    public void doInterview() {
        System.out.println("Senior Java developer check a candidate");
    }
}

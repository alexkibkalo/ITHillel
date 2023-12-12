package com.ua.lesson23.proxy.interviewer;

public class ProxySeniorInterviewer implements Interviewer {
    private SeniorInterviewer seniorInterviewer;
    private Boolean hasDoubts;

    public ProxySeniorInterviewer(Boolean hasDoubts) {
        this.hasDoubts = hasDoubts;
    }

    @Override
    public void doInterview() {
        if(seniorInterviewer == null){
            seniorInterviewer = new SeniorInterviewer();
        }

        System.out.println("Middle Java developer check a candidate");

        // additional logic
        if(hasDoubts){
            checkEnglish();
            doTestTask();
        }

        seniorInterviewer.doInterview();
    }

    void checkEnglish(){
        System.out.println("Checking English");
    }

    void doTestTask(){
        System.out.println("Implementing a test task");
    }
}

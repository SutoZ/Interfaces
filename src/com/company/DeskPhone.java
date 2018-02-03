package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing: " + phoneNumber);
    }

    @Override
    public void answer() {
        if (Boolean.toString(isRinging).equals(true)) {
            System.out.println("Answering the desk phone.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("ring ring");
            return true;
        } else return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

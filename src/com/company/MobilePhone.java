package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("mobilephone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (!isOn) {
            System.out.println("Mobile phone is not turned on!");
        } else {
            System.out.println("Now ringing: " + phoneNumber);
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Melody playing");
            return isRinging;
        } else isRinging = false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

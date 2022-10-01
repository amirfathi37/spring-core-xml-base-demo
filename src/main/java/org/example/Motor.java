package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Motor implements Vehicle {

    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive() {
        System.out.println("Motor is Driving...");
    }
}

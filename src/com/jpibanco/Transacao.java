package com.jpibanco;

public abstract class Transacao {

    public boolean transactionOk() {
        return true;
    }
    public boolean transactionNoOk() {
        return false;
    }

}

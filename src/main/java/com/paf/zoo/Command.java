package com.paf.zoo;

public enum Command {
    EXIT("exit"),
    HELP("help"),
    DISPLAY("display"),
    LIVE("live one day"),
    UNKNOWN("unknown");

    private final String value;

    Command(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

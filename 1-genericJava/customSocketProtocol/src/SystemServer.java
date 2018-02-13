package com.example;

import java.util.HashMap;

/**
 * Created by meishan on 16/12/1.
 */
public class SystemServer {

    private static HashMap<String, State> sStates = new HashMap<>();

    public enum State {
        RUNNING("running"),
        STOPPING("stopping"),
        STOPPED("stopped"),
        RESTARTING("restarting");

        State(String state) {
            sStates.put(state, this);
        }

    }

    public HashMap<String, State> getHashMap() {
        return sStates;
    }
}
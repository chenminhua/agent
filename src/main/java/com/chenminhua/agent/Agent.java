package com.chenminhua.agent;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String args, Instrumentation instrumentation) {
        AgentTransformer agentTransformer = new AgentTransformer();
        instrumentation.addTransformer(agentTransformer);
    }
}

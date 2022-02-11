package com.myorg;

import software.amazon.awscdk.App;

public final class TestApp {
    public static void main(final String[] args) {
        App app = new App();

        System.out.println("tryGetContext=" + app.getNode().tryGetContext("notExisting"));

        new TestStack(app, "TestStack");

        app.synth();
    }
}

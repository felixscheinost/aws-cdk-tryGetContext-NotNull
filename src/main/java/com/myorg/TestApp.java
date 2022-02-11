package com.myorg;

import software.amazon.awscdk.App;

public final class TestApp {
    public static void main(final String[] args) {
        App app = new App();

        System.out.println("tryGetContext is null" + (app.getNode().tryGetContext("notExisting") == null));

        new TestStack(app, "TestStack");

        app.synth();
    }
}

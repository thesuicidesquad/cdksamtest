package com.myorg;

import software.amazon.awscdk.core.App;

public final class CdksamtestApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdksamtestStack(app, "CdksamtestStack");

        app.synth();
    }
}

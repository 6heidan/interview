package com.heidan.principe.lawofdemeter.test03;

public class Client {
    public static void main(String[] args) {
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}

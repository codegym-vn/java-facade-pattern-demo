package com.codegym;

public class Main {

    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        Client client = new Client();
        client.startComputer(computerFacade);
    }
}

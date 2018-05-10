package com.codegym;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data...");
        return new byte[1024];
    }
}

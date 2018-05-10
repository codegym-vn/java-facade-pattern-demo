package com.codegym;

public class ComputerFacade {
    private static int BOOT_ADDRESS = 1000;
    private static int BOOT_SECTOR = 2;
    private static int SECTOR_SIZE = 10;
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

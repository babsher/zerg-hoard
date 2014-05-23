package edu.gmu.zergHoard;

import jnibwapi.BWAPIEventListener;
import jnibwapi.JNIBWAPI;
import jnibwapi.Position;
import jnibwapi.Unit;
import jnibwapi.types.TechType;
import jnibwapi.types.TechType.TechTypes;
import jnibwapi.types.UnitType;
import jnibwapi.types.UnitType.UnitTypes;
import jnibwapi.types.UpgradeType;
import jnibwapi.types.UpgradeType.UpgradeTypes;

public class BWInterface  implements BWAPIEventListener {
    private final JNIBWAPI bwapi;
    private final Thread reader;
    private int supplyCap;
    private Unit poolDrone;

    public BWInterface() {
        bwapi = new JNIBWAPI(this, true);
        reader = new Thread(new Reader(bwapi));
    }

    public void start() {
        reader.start();
    }

    public void shutdown() {}

    @Override
    public void connected() {
        System.out.println("Connected");
    }

    @Override
    public void matchStart() {
        System.out.println("Game Started");

        bwapi.enableUserInput();
        bwapi.enablePerfectInformation();
        bwapi.setGameSpeed(0);

        // reset agent state
        poolDrone = null;
        supplyCap = 0;
    }

    @Override
    public void matchFrame() {

    }

    @Override
    public void matchEnd(boolean winner) {

    }

    @Override
    public void keyPressed(int keyCode) {

    }

    @Override
    public void sendText(String text) {

    }

    @Override
    public void receiveText(String text) {

    }

    @Override
    public void playerLeft(int playerID) {

    }

    @Override
    public void nukeDetect(Position p) {

    }

    @Override
    public void nukeDetect() {

    }

    @Override
    public void unitDiscover(int unitID) {

    }

    @Override
    public void unitEvade(int unitID) {

    }

    @Override
    public void unitShow(int unitID) {

    }

    @Override
    public void unitHide(int unitID) {

    }

    @Override
    public void unitCreate(int unitID) {

    }

    @Override
    public void unitDestroy(int unitID) {

    }

    @Override
    public void unitMorph(int unitID) {

    }

    @Override
    public void unitRenegade(int unitID) {

    }

    @Override
    public void saveGame(String gameName) {

    }

    @Override
    public void unitComplete(int unitID) {

    }

    @Override
    public void playerDropped(int playerID) {

    }

    private static class Reader implements Runnable {
        private final JNIBWAPI bwapi;

        public Reader(JNIBWAPI bwapi) {
            this.bwapi = bwapi;
        }
        @Override
        public void run() {
            bwapi.start();
        }
    }
}

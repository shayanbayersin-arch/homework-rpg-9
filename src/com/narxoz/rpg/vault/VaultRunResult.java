package com.narxoz.rpg.vault;
public class VaultRunResult {
    private final int appraised, mementos, restored;
    public VaultRunResult(int a, int m, int r) { this.appraised = a; this.mementos = m; this.restored = r; }
    @Override public String toString() { return "Result -> Appraised: " + appraised + ", Snapshots: " + mementos + ", Restored: " + restored; }
}
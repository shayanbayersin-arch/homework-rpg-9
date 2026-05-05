package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chronomancer's Vault Demo ===");
        Hero h = new Hero("Arthur", 100, 20, 10);
        h.getInventory().addArtifact(new Weapon("Sword", 50, 5, 10));

        ChronomancerEngine engine = new ChronomancerEngine();
        VaultRunResult result = engine.runVault(List.of(h));
        System.out.println(result);
    }
}
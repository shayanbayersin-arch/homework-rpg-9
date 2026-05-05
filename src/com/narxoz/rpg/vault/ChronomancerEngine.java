package com.narxoz.rpg.vault;
import com.narxoz.rpg.artifact.GoldAppraiser;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.memento.Caretaker;
import java.util.List;

public class ChronomancerEngine {
    public VaultRunResult runVault(List<Hero> party) {
        Caretaker caretaker = new Caretaker();
        for (Hero h : party) {
            h.getInventory().accept(new GoldAppraiser());
            caretaker.save(h.createMemento());
            h.takeDamage(50); // Трагедия
            h.restoreFromMemento(caretaker.undo()); // Откат
        }
        return new VaultRunResult(party.size(), party.size(), party.size());
    }
}
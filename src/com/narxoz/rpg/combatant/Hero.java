package com.narxoz.rpg.combatant;
import com.narxoz.rpg.artifact.Inventory;

public class Hero {
    private final String name;
    private int hp, mana, gold;
    private final int maxHp, attackPower, defense;
    private Inventory inventory;

    public Hero(String name, int hp, int attackPower, int defense) {
        this(name, hp, 0, attackPower, defense, 0, new Inventory());
    }

    public Hero(String name, int hp, int mana, int attackPower, int defense, int gold, Inventory inventory) {
        this.name = name; this.hp = hp; this.maxHp = hp; this.mana = mana;
        this.gold = gold; this.attackPower = attackPower; this.defense = defense;
        this.inventory = inventory == null ? new Inventory() : inventory;
    }

    public void takeDamage(int amount) { hp = Math.max(0, hp - amount); }
    public void addGold(int amount) { gold += amount; }
    public Inventory getInventory() { return inventory; }
    public void setInventory(Inventory inventory) { this.inventory = inventory; }

    public HeroMemento createMemento() {
        return new HeroMemento(name, hp, mana, gold, maxHp, attackPower, defense, inventory.getArtifacts());
    }

    public void restoreFromMemento(HeroMemento memento) {
        if (memento == null) return;
        this.hp = memento.getHp();
        this.mana = memento.getMana();
        this.gold = memento.getGold();
        this.inventory = new Inventory(memento.getInventorySnapshot());
    }

    @Override public String toString() { return name + " [HP: " + hp + ", Gold: " + gold + "]"; }
}
package com.narxoz.rpg.artifact;

public class GoldAppraiser implements ArtifactVisitor {
    @Override public void visit(Weapon w) { System.out.println("[Gold] " + w.getName() + ": " + (w.getValue() + 50) + "g"); }
    @Override public void visit(Potion p) { System.out.println("[Gold] " + p.getName() + ": " + p.getValue() + "g"); }
    @Override public void visit(Scroll s) { System.out.println("[Gold] " + s.getName() + ": " + (s.getValue() * 2) + "g"); }
    @Override public void visit(Ring r) { System.out.println("[Gold] " + r.getName() + ": " + (r.getValue() + 100) + "g"); }
    @Override public void visit(Armor a) { System.out.println("[Gold] " + a.getName() + ": " + (a.getValue() + 30) + "g"); }
}
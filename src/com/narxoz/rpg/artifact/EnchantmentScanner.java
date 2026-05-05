package com.narxoz.rpg.artifact;

public class EnchantmentScanner implements ArtifactVisitor {
    @Override public void visit(Weapon w) { System.out.println("[Scan] Atk: +" + w.getAttackBonus()); }
    @Override public void visit(Potion p) { System.out.println("[Scan] Heal: " + p.getHealing()); }
    @Override public void visit(Scroll s) { System.out.println("[Scan] Spell: " + s.getSpellName()); }
    @Override public void visit(Ring r) { System.out.println("[Scan] Magic: +" + r.getMagicBonus()); }
    @Override public void visit(Armor a) { System.out.println("[Scan] Def: +" + a.getDefenseBonus()); }
}
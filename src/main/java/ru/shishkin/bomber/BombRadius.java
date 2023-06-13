package ru.shishkin.bomber;

public class BombRadius extends AbstractPowerup {
    public BombRadius(int rowIndex, int colIndex) {
        super(colIndex, rowIndex);
    }

    public void addToPlayer(Player player) {
        int currentExplosionRadius = player.getExplosionRadius();
        player.setExplosionRadius(currentExplosionRadius + 1);
    }

    public String getName() {
        final String name = "BombRadius";
        return name;
    }
}

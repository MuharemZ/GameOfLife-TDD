package org.iths.Murre;

public enum CellState {
    ALIVE ("X"),
    DEAD ("O");

    private final String message;

    CellState(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}


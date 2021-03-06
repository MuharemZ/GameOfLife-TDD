package org.iths.Murre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    @Test
    public void cellShouldDieWithOnlyOneNeighbour() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(0);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithZeroNeighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(1);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldLiveWithTwoNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(2);
        CellState actual = cell.getState();
        assertEquals(CellState.ALIVE, actual);
    }

    @Test
    public void cellShouldLiveWithThreeNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(3);
        CellState actual = cell.getState();
        assertEquals(CellState.ALIVE, actual);
    }
    @Test
    public void cellShouldDieWithFourNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(4);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithFiveNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(5);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithSixNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(6);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithSevenNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(7);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void cellShouldDieWithEightNeighbours(){
        Cell cell = new Cell(CellState.ALIVE);
        cell.update(8);
        CellState actual = cell.getState();
        assertEquals(CellState.DEAD, actual);
    }

    @Test
    public void deadCellShouldBecomeAliveWithThreeNeighbours(){
        Cell cell = new Cell(CellState.DEAD);
        cell.update(3);
        CellState actual = cell.getState();
        assertEquals(CellState.ALIVE, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "ALIVE,0,DEAD",
            "ALIVE,1,DEAD",
            "ALIVE,2,ALIVE",
            "ALIVE,3,ALIVE",
            "ALIVE,4,DEAD",
            "ALIVE,5,DEAD",
            "ALIVE,6,DEAD",
            "ALIVE,7,DEAD",
            "ALIVE,8,DEAD",
            "DEAD,0,DEAD",
            "DEAD,1,DEAD",
            "DEAD,2,DEAD",
            "DEAD,3,ALIVE",
            "DEAD,4,DEAD",
            "DEAD,5,DEAD",
            "DEAD,6,DEAD",
            "DEAD,7,DEAD",
            "DEAD,8,DEAD"
    })
    void parameterizedTestOnAllCases(String initial, int numberOfNeighbours, String expected) {
        CellState initialState = CellState.valueOf(initial);
        Cell cell = new Cell(initialState);
        cell.update(numberOfNeighbours);
        CellState actual = cell.getState();
        CellState expectedState = CellState.valueOf(expected);
        assertEquals(expectedState, actual);
    }

    @ParameterizedTest
    @CsvSource({"ALIVE","DEAD"})
    public void shouldReturnItsState(String initial){
        CellState initialState = CellState.valueOf(initial);
        Cell cell = new Cell(initialState);
        assertEquals(initialState, cell.getState());
    }
}
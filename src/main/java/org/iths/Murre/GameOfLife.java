package org.iths.Murre;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Arrays;

public class GameOfLife extends Application {

    private static final CellState O = CellState.DEAD;
    private static final CellState X = CellState.ALIVE;

    @Override
    public void start(Stage stage) {
//        View view = new View();
//        Scene scene = new Scene(view, 640, 480);
//        stage.setScene(scene);
//        stage.show();
//        view.draw();

    }
    public static void main(String[] args) {
        CellState[][] startBoard = getCellStates();


    }
    private static CellState[][] getCellStates() {
        CellState[][] startBoard = new CellState[][]{
                {X, X, X, O, X, O, O, X, X, O},
                {X, X, X, O, O, O, X, O, O, X},
                {X, X, X, O, O, O, X, X, O, X}
        };
        return startBoard;
    }
}





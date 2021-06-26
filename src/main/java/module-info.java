module ru.gb.karachev {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.gb.karachev to javafx.fxml;
    exports ru.gb.karachev;
}
package es.israeldelamo.tiledcarga;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import java.io.IOException;

/**
 * Una clase para crear pequeños tiles dentro de un tilepane de javafx pero que contengan muy poca información
 *
 */

public class TiledCarga extends HBox {
    @FXML
    private Button btn_reservar;

    @FXML
    private Label lb_cantidad_bultos;

    @FXML
    private Label lb_dimension_a;

    @FXML
    private Label lb_dimension_h;

    @FXML
    private Label lb_dimension_l;

    @FXML
    private Label lb_fecha_creacción;

    @FXML
    private Label lb_pais_destino;

    @FXML
    private Label lb_pais_origen;

    @FXML
    private Label lb_peso_unitario;

    public TiledCarga() {
        FXMLLoader loader = new FXMLLoader(TiledCarga.class.getResource("tilePaneCargaParcial.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setPaisOrigen(String text) {
        lb_pais_origen.setText(text);
    }
}

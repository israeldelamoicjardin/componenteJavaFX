package es.israeldelamo.tiledcarga;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.io.IOException;

/**
 * Una clase para crear pequeños tiles dentro de un tilepane de javafx pero que contengan muy poca información
 *
 */

public class TiledCarga extends HBox {
    @FXML
    private Button btn_reservar;


    @FXML
    private Label lb_carga_completa_o_grupaje;
    @FXML
    private Label lb_cantidad_bultos;


    @FXML
    private Label lb_dimension;

    @FXML
    private Label lb_fecha_creaccion;
    public void setLb_fecha_creaccion(String lb_fecha_creaccion) { this.lb_fecha_creaccion.setText(lb_fecha_creaccion);}

    @FXML
    private Label lb_provincia_destino;

    @FXML
    private Label lb_provincia_origen;

    @FXML
    private Label lb_pais_destino;

    @FXML
    private Label lb_pais_origen;

    public void setLb_peso_unitario(Label lb_peso_unitario) {
        this.lb_peso_unitario = lb_peso_unitario;
    }

    @FXML
    private Label lb_peso_unitario;

    @FXML
    private ImageView iv_pais_destino;
    public void setIv_pais_destino(Image iv_pais_destino) {
        this.iv_pais_destino.setImage(iv_pais_destino);
    }

    @FXML
    private ImageView iv_pais_origen;
    public void setIv_pais_origen(Image iv_pais_origen) {
        this.iv_pais_origen.setImage(iv_pais_origen);
    }





    public void setLb_provincia_origen(String lb_provincia_origen) {this.lb_provincia_origen.setText(lb_provincia_origen);    }

    public void setLb_provincia_destino(String lb_provincia_destino) {this.lb_provincia_destino.setText(lb_provincia_destino);    }

    public void setLb_pais_origen(String lb_pais_origen) {
        this.lb_pais_origen.setText(lb_pais_origen);
    }

    public void setLb_pais_destino(String lb_pais_destino) {
        this.lb_pais_destino.setText(lb_pais_destino);
    }




    public void setLb_carga_completa_o_grupaje(String lb_carga_completa_o_grupaje) {this.lb_carga_completa_o_grupaje.setText(lb_carga_completa_o_grupaje);    }


    public void setLb_peso_unitario(String lb_peso_unitario) {
        this.lb_peso_unitario.setText(lb_peso_unitario);
    }



    public void setLb_dimension(String lb_dimension) {
        this.lb_dimension.setText(lb_dimension);
    }




    public void setLb_cantidad_bultos(String lb_cantidad_bultos) { this.lb_cantidad_bultos.setText(lb_cantidad_bultos);
    }


    public Label getLb_pais_destino(){
        return this.lb_pais_destino;
    };
    public Label getLb_pais_origen(){
        return this.lb_pais_origen;
    };

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

    @FXML
    public void onReservar(ActionEvent event) {

    }

    public Button getBtn_reservar() {
        return btn_reservar;
    }
}

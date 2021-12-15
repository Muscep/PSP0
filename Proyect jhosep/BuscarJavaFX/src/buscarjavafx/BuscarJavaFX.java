/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarjavafx;

import java.net.URI;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Mi Pc
 */
public class BuscarJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
       // URI uri = Paths.get("src/ buscarjavafx/FXMLDocument.fxml").toAbsolutePath().toUri();
        
       // System.err.println("URI: ");
       
       ImageView imgView = new ImageView();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

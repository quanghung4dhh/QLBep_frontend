package com.frontend.controllers;

import com.frontend.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainLayoutController implements Initializable {

    @FXML
    private BorderPane mainBorderPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Mặc định khi mở lên sẽ vào trang Dashboard ngay
        loadPage("views/dashboard");
    }

    // Hàm dùng chung để chuyển trang (sẽ dùng khi bấm các nút menu sau này)
    private void loadPage(String page) {
        try {
            // Tải file FXML con
            FXMLLoader loader = new FXMLLoader(App.class.getResource(page + ".fxml"));
            Parent root = loader.load();
            
            // Đặt file con vào giữa màn hình (Center)
            mainBorderPane.setCenter(root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
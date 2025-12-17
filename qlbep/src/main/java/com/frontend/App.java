package com.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // SỬA DÒNG NÀY: Đổi "primary" thành "login"
        // 800, 500 là chiều rộng và cao của cửa sổ (khớp với file fxml của bạn)
        scene = new Scene(loadFXML("main_layout"), 900, 600);
        
        stage.setScene(scene);
        stage.setTitle("Hệ thống Quản lý Bếp ăn"); // Đặt tiêu đề cho cửa sổ
        stage.show();
    }

    // Hàm hỗ trợ chuyển cảnh (Sau này đăng nhập thành công sẽ dùng hàm này để sang trang chủ)
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
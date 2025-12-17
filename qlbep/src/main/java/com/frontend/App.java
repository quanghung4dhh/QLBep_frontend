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
    // SỬA LẠI THÀNH "login" (Lúc nãy bạn đang để "main_layout")
    // Kích thước login nên nhỏ gọn (800x500)
    scene = new Scene(loadFXML("login"), 800, 500);

    stage.setScene(scene);
    stage.setTitle("Hệ thống Quản lý Bếp ăn");
    stage.show();
  }

  // Hàm này để các Controller khác gọi tới khi muốn chuyển cảnh
  // Ví dụ: LoginController gọi setRoot("main_layout")
  public static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));

    // Mẹo nhỏ: Khi vào trang chủ thì nên phóng to cửa sổ ra cho đẹp
    if (fxml.equals("main_layout")) {
      Stage stage = (Stage) scene.getWindow();
      stage.setWidth(1000); // Chiều rộng mới
      stage.setHeight(650); // Chiều cao mới
      stage.centerOnScreen(); // Căn giữa màn hình lại
    }
  }

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    return fxmlLoader.load();
  }

  public static void main(String[] args) {
    launch();
  }
}
package com.frontend.controllers; // Đảm bảo đúng tên package của bạn

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController {

    // Khai báo các biến tương ứng với fx:id bên file FXML
    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblMessage;

    // Hàm này chạy khi bấm nút (do bên FXML đã set onAction="#handleLoginButtonAction")
    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String username = txtUser.getText();
        String password = txtPass.getText();

        // Giả lập kiểm tra đăng nhập (Sau này sẽ kết nối Database ở đây)
        if ("admin".equals(username) && "123".equals(password)) {
            lblMessage.setStyle("-fx-text-fill: green;");
            lblMessage.setText("Đăng nhập thành công!");
            
            System.out.println("Chuyển sang màn hình chính...");
            // TODO: Viết code chuyển sang màn hình Dashboard tại đây
            
        } else {
            lblMessage.setStyle("-fx-text-fill: red;");
            lblMessage.setText("Sai tài khoản hoặc mật khẩu!");
        }
    }
}
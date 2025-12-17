package com.frontend.controllers;

import com.frontend.App; // Import class App để dùng hàm chuyển cảnh
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Label lblMessage;

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        // BỎ QUA KIỂM TRA MẬT KHẨU (Theo yêu cầu của bạn)
        // Cứ bấm nút là chuyển trang luôn
        
        System.out.println("Đăng nhập thành công! Đang chuyển trang...");
        
        try {
            // Gọi hàm setRoot trong App.java để chuyển sang màn hình 'main_layout'
            App.setRoot("main_layout");
            
        } catch (IOException e) {
            e.printStackTrace();
            lblMessage.setText("Lỗi: Không tìm thấy file giao diện Trang chủ!");
        }
    }
}
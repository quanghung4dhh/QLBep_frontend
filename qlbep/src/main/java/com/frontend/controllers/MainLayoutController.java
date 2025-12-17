package com.frontend.controllers;

import com.frontend.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button; // Nhớ import Button
import javafx.scene.layout.BorderPane;

public class MainLayoutController implements Initializable {

    @FXML
    private BorderPane mainBorderPane;

    // Khai báo các nút bấm từ FXML
    @FXML private Button btnTrangChu;
    @FXML private Button btnNhanVien;
    // @FXML private Button btnThucDon; (Khai báo thêm nếu bạn đã đặt fx:id cho các nút khác)

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Mặc định load Dashboard
        loadPage("views/dashboard");
        // Mặc định set nút Trang chủ là Active
        updateActiveButton(btnTrangChu);
    }

    // --- SỰ KIỆN KHI BẤM NÚT ---

    @FXML
    private void handleDashboardButton(ActionEvent event) {
        loadPage("views/dashboard");
        updateActiveButton(btnTrangChu); // Đổi màu nút
    }

    @FXML
    private void handleStaffButton(ActionEvent event) {
        loadPage("views/staff");
        updateActiveButton(btnNhanVien); // Đổi màu nút
    }

    // --- HÀM XỬ LÝ ĐỔI MÀU (LOGIC CHÍNH) ---
    private void updateActiveButton(Button clickedButton) {
        // 1. Xóa style "active" khỏi TẤT CẢ các nút
        // (Nếu bạn có nhiều nút hơn, hãy copy dòng này cho các nút đó)
        btnTrangChu.getStyleClass().remove("sidebar-btn-active");
        btnNhanVien.getStyleClass().remove("sidebar-btn-active");
        
        // 2. Thêm style "active" cho nút VỪA BẤM
        clickedButton.getStyleClass().add("sidebar-btn-active");
    }

    // Hàm chuyển trang giữ nguyên
    private void loadPage(String page) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(page + ".fxml"));
            Parent root = loader.load();
            mainBorderPane.setCenter(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
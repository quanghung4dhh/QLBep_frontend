package com.frontend.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class StaffController implements Initializable {

    @FXML
    private ComboBox<String> cbVaiTro;
    @FXML
    private ComboBox<String> cbCaTruc;
    @FXML
    private ComboBox<String> cbTrangThai;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Khởi tạo dữ liệu mẫu cho các ComboBox
        
        // Tab 1: Vai trò
        cbVaiTro.getItems().addAll("Quản lý", "Đầu bếp", "Phụ bếp", "Phục vụ", "Thu ngân");
        
        // Tab 2: Ca trực
        cbCaTruc.getItems().addAll("Ca Sáng (6h-14h)", "Ca Chiều (14h-22h)", "Full-time");
        
        // Tab 3: Trạng thái chấm công
        cbTrangThai.getItems().addAll("Đúng giờ", "Đi muộn", "Vắng có phép", "Vắng không phép");
        
        System.out.println("Đã tải trang Quản lý Nhân viên");
    }
}
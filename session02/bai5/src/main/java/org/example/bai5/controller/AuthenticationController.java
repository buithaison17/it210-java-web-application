package org.example.bai5.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @GetMapping({"/", "/login"})
    private String login(@RequestParam(value = "username", required = false) String username,
                         @RequestParam(value = "password", required = false) String password,
                         Model model,
                         HttpSession session) {

        // Nếu chưa đăng nhập, chuyển đến trang login
        if (username == null) {
            return "login";
        }

        // Chuyển trang nếu đăng nhập đúng
        if (username.equals("hr_manager") && password.equals("hr123") ||
                username.equals("hr_staff") && password.equals("staff456")) {
            // Lưu lại thông tin
            session.setAttribute("username", username);
            return "redirect:/employees";
        }

        // Nếu đăng nhập sai hiển thị lỗi
        model.addAttribute("error", "Thông tin đăng nhập không chính xác");
        return "login";
    }
}

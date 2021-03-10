package rikkeitalen_k1.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;
import rikkeitalen_k1.com.demo.service.KhachHangService;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class KhachHangController {

    @Autowired
    private KhachHangService khachhangservice;

    @GetMapping("/list-khachhang")
    public ModelAndView ListKhachHang(){
        List<KhachHangEntity> ListKhachhang = khachhangservice.findAll();
        ModelAndView ModelAndView = new ModelAndView("/KhachHang/DanhSach");
        ModelAndView.addObject("ListKhachhang",ListKhachhang );
        return ModelAndView;
    }
    @GetMapping("/create-khachhang")
    public ModelAndView ShowCreate() {
        ModelAndView modelAndView = new ModelAndView("/KhachHang/Create");
        modelAndView.addObject("Createkhachhang", new KhachHangEntity());
        return modelAndView;
    }
    @PostMapping("/create-khachhang")
    public ModelAndView saveCustomer(@ModelAttribute("createKhachHang") KhachHangEntity creareKhachHang) {
        khachhangservice.save(creareKhachHang);

        ModelAndView modelAndView = new ModelAndView("/KhachHang/Create");
        modelAndView.addObject("createKhachHang", new KhachHangEntity());
        modelAndView.addObject("message", "Thêm Thành Công");
        return modelAndView;
    }

    @GetMapping
    public String showIndex(){
        return "index";
    }
}

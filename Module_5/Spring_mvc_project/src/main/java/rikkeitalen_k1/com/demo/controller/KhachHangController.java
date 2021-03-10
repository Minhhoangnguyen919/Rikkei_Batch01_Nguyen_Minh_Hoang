package rikkeitalen_k1.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;
import rikkeitalen_k1.com.demo.service.KhachHangService;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class KhachHangController {

    @Autowired
    KhachHangService khachhangservice;

    @GetMapping("/khachhang")
    public ModelAndView ListKhachHang(){
        List<KhachHangEntity> ListKhachhang = khachhangservice.findAll();
        ModelAndView ModelAndView = new ModelAndView("/KhachHang/DanhSach");
        ModelAndView.addObject("ListKhachhang",ListKhachhang );
        return ModelAndView;
    }

    @GetMapping("/create-khachhang")
    public ModelAndView ShowKhachHang() {
        ModelAndView modelAndView = new ModelAndView("KhachHang/Create");
        modelAndView.addObject("createkhachhang", new KhachHangEntity());
        return modelAndView;
    }
    @PostMapping("/save-khachhang")
    public ModelAndView saveKhachHang(@ModelAttribute("createkhachhang") KhachHangEntity saveKhachhang) {
        khachhangservice.save(saveKhachhang);

        ModelAndView modelAndView = new ModelAndView("KhachHang/Create");
        modelAndView.addObject("createkhachhang", new KhachHangEntity());
        modelAndView.addObject("message", "Thêm Thành Công");
        return modelAndView;
    }
    @GetMapping("/edit-khachhang/{maKhachHang}")
    public ModelAndView showEditForm(@PathVariable String maKhachHang){
        KhachHangEntity kh = khachhangservice.findById(maKhachHang);
        if(kh != null) {
            ModelAndView modelAndView = new ModelAndView("KhachHang/edit");
            modelAndView.addObject("khachhang", kh);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/khong thanh cong");
            return modelAndView;
        }
    }

    @PostMapping("/edit-khachhang")
    public ModelAndView UppdateKhachhang(@ModelAttribute("khachhang") KhachHangEntity kh){
        khachhangservice.save(kh);
        ModelAndView modelAndView = new ModelAndView("/KhachHang/edit");
        modelAndView.addObject("khachhang", kh);
        modelAndView.addObject("message", "Khachhang updated successfully");
        return modelAndView;
    }

    @GetMapping
    public String showIndex(){
        return "index";
    }
}

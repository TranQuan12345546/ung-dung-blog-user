package com.example.blog.controller;

import com.example.blog.dto.projection.BlogPublic;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class AdminController {
    // Trang chủ
    @GetMapping("admin")
    public String getInfo() {
        return "admin/blog/index";
    }

    // Danh sách tất cả bài viết

    @GetMapping("admin/blogs")
    public String getBlogPage(@RequestParam(required = false, defaultValue = "1") Integer page,
                              @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                              Model model) {
//        Page<BlogPublic> pageInfo = blogService.getAllBlog(page, pageSize);
//        model.addAttribute("page", pageInfo);
//        model.addAttribute("currentPage", page);
        return "admin/blog/blog-index";
    }

    // Danh sách bài viết của tôi
    @GetMapping("admin/blogs/blog-yourself")
    public String getOwnBlogPage(Model model) {
//        List<BlogPublic> blogList = blogService.getAllOwnBlog();
//        model.addAttribute("blogList", blogList);
        return "admin/blog/blog-yourself";
    }

    // Tạo bài viết
    @GetMapping("admin/blogs/create")
    public String getBlogCreatePage(Model model) {
        return "admin/blog/blog-create";
    }

    // Chi tiết bài viết
    @GetMapping("admin/blogs/{id}/detail")
    public String getBlogDetailPage(@PathVariable Integer id, Model model) {
        return "admin/blog/blog-detail";
    }
}


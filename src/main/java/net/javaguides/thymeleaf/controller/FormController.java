package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm",userForm);

        List<String> professions = Arrays.asList("Developer","Tester","Architect");
        model.addAttribute("professions",professions);

        return "register-form";
    }

    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {

        model.addAttribute("userForm",userForm);

        return "register-success";
    }
}

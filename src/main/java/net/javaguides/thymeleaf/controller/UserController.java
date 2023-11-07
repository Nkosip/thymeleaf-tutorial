package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Nkosi","nkosi@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);

        return "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Nkosi","nkosi@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);

        return "selection-expression";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id",1);
        return "link-expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin","admin@gmail.com","ADMIN","Male");
        User nkosi = new User("Nkosi","nkosi@gmail.com","USER","Male");
        User meena = new User("Meena","meena@gmail.com","USER","Female");

        List<User> users = new ArrayList<>();

        users.add(admin);
        users.add(nkosi);
        users.add(meena);

        model.addAttribute("users",users);

        return "users";

    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin","admin@gmail.com","ADMIN","Male");
        User nkosi = new User("Nkosi","nkosi@gmail.com","USER","Male");
        User meena = new User("Meena","meena@gmail.com","USER","Female");

        List<User> users = new ArrayList<>();

        users.add(admin);
        users.add(nkosi);
        users.add(meena);

        model.addAttribute("users",users);

        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User nkosi = new User("Nkosi","nkosi@gmail.com","USER","Male");

        model.addAttribute("user",nkosi);

        return "switch-case";
    }

}

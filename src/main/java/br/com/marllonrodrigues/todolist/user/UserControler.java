package br.com.marllonrodrigues.todolist.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")

public class UserControler {

    /**
     * String (texto)
     * Integer (int) Números inteiros
     * Double (double) Número 0.000
     * Float (float) Números 0.000
     * char (A C)
     * Date (data)
     * void
     */
    /**
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}

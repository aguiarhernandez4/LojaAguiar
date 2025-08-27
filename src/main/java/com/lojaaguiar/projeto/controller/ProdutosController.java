package com.lojaaguiar.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;




import com.lojaaguiar.projeto.service.ProdutosService;
import com.lojaaguiar.projeto.entity.Produtos;
@Controller
public class ProdutosController {
    @Autowired
    ProdutosService produtoService;

    @PostMapping("/save")
    public String addProdutos(@ModelAttribute Produtos p) {
        produtoService.save(p);
        return "redirect:produtos";
    }

    @GetMapping("produtos-list")
    public ModelAndView availableProdutos() {
        List<Produtos> listOfProdutos = produtoService.getAllProdutos();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Produtos");
        mav.addObject("Produto", listOfProdutos);
        return mav;
    }

}

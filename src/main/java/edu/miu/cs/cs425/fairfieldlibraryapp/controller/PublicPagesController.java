package edu.miu.cs.cs425.fairfieldlibraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/fairfieldlibrary"})
public class PublicPagesController {

    @GetMapping(value = {"/", "/public/home"})
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHomePage() {
        return "index";
    }

    @GetMapping(value = {"/public/about"})
    public String displayAboutUsPage() {
        return "about";
    }

    @GetMapping(value = {"/public/login"})
    public String displayLoginPage() {
        return "login";
    }

}

package com.fhlbny.technutgarage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class MainController {
    @GetMapping("/")
    public String getCheck(Model model) {
        model.addAttribute("output", "All is good in the machine");
        return "greeting";
    }

    @GetMapping("/getmyip")
    public String getMyIp(Model model) {
        try {
            InetAddress my_address = InetAddress.getLocalHost();
            model.addAttribute("ip", my_address.getHostAddress());
            model.addAttribute("host", my_address.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Couldn't find the local address.");
        }
        return "ipandhost";
    }
}

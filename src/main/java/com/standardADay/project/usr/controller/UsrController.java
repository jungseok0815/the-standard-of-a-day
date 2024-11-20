package com.standardADay.project.usr.controller;

import com.standardADay.project.usr.dto.UsrDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr")
public class UsrController {

    @PostMapping("/insert")
    public void insert(@ModelAttribute UsrDTO usrDTO){
        System.out.println("userid : " + usrDTO.getUsrId());
    }

    @PostMapping("/update")
    public void update(){

    }

    @PostMapping("/delete")
    public void delete(){

    }

    @PostMapping("/select")
    public void select(){

    }

}

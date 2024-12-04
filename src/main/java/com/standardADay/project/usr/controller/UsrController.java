package com.standardADay.project.usr.controller;

import com.standardADay.project.usr.dto.UsrDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usr")
@Slf4j
@CrossOrigin(origins = "http://localhost:3000") // React 개발 서버 주소
public class UsrController {

    @PostMapping("/insert")
    public void insert(@ModelAttribute UsrDTO usrDTO){
        log.info("usrId : " + usrDTO.getUsrId());
        log.info("usrPwd : " + usrDTO.getUsrPwd());
    }

    @PostMapping("/update")
    public void update(){
    }

    @PostMapping("/delete")
    public void delete(){

    }

    @PostMapping("/select")
    public UsrDTO select(@ModelAttribute UsrDTO usrDTO){
        log.info(usrDTO.getUsrEmail());
        return usrDTO;
    }
}

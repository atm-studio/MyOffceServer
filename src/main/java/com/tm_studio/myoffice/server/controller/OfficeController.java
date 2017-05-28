package com.tm_studio.myoffice.server.controller;

import com.tm_studio.myoffice.server.entity.Remind;
import com.tm_studio.myoffice.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getNotification() {
        List<Remind> list = remindRepository.findAll();
        return createMockRemind();
    }


    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setMeetDate(new Date());
        remind.setTitle("My first Meet");
        return  remind;
    }

}

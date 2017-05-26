package com.tm_studio.myoffice.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/office")
public class OfficeController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getNotification(ModelMap model) {
        return "MyOffice";
    }

}

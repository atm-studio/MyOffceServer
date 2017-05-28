package com.tm_studio.myoffice.server.controller;

import com.tm_studio.myoffice.server.entity.Remind;
import com.tm_studio.myoffice.server.repository.RemindRepository;
import com.tm_studio.myoffice.server.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfficeController {

    @Autowired
    private OfficeService service;

    @RequestMapping(value = "/office", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllNotifications() {
        return service.getAll();
    }

    @RequestMapping(value = "/office/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getNotification(@PathVariable("id") long remindID) {
        return service.getById(remindID);
    }

    @RequestMapping(value = "/office", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveNotification(@RequestBody Remind remind) {
        return service.save(remind);
    }

    //DELETE or POST ???
    @RequestMapping(value = "/office/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteNotification(@PathVariable("id") long remindID) {
        service.delete(remindID);
    }

}

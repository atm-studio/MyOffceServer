package com.tm_studio.myoffice.server.service;

import com.tm_studio.myoffice.server.entity.Remind;

import java.util.List;

public interface OfficeService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void delete(long id);
}

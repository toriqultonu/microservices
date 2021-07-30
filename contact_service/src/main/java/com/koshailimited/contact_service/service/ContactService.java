package com.koshailimited.contact_service.service;

import com.koshailimited.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}

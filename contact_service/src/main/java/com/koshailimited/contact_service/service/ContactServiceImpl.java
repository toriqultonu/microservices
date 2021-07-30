package com.koshailimited.contact_service.service;

import com.koshailimited.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(

            new Contact(1L, "toriqultonu22@gmail.com", "Toriqul", 1803121L),
            new Contact(1L, "stu.awbe@gmail.com", "Jing", 1803121L),
            new Contact(2L, "nafis.walid@gmail.com", "Nafis", 1803122L),
            new Contact(3L, "shakib@gmail.com", "Shakib", 1803123L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}

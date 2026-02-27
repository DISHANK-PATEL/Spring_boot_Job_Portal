package com.dishank.jobportal.contact.service;

import com.dishank.jobportal.dto.ContactRequestDto;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

}

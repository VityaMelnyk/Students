package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class StructuredStudent {
    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private boolean gender;
    private String phoneNumber;
    private Adress adress;
    private String contactPersonPhone;
    private Group group;
    private String yearOfEntry;
    private Grant grant;
    private List<Sport> sports;
    private Adress currentAdress;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}

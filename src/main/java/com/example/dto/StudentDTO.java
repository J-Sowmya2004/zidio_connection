package com.example.dto;

import lombok.Builder;

@Builder
public class StudentDTO {
    //to connect with Student table

    public Long id;
    public String name;
    public String email;
    public String phone;
    public String qualification;
    public String resumeURL;

    public StudentDTO(Long id2,String name2,String email2,String phone2,String qualification2,String resumeURL2){
        this.id=id2;
        this.email=email2;
        this.phone=phone2;
        this.qualification=qualification2;
        this.resumeURL=resumeURL2;
    }
}

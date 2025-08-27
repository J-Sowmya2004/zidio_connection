package com.example.dto;

import java.util.Date;

public class JobPostDTO {
    public Long id;
    public String jobTitle;
    public String jobType;
    public String jobLocation;
    public String jobDescription;
    public String companyName;
    public String postedByEmail;
    public Date postedDate;

    public JobPostDTO(){ }

    public JobPostDTO(Long id, String jobTitle, String jobType, String jobLocation, String jobDescription, String companyName, String postedByEmail, Date postedDate) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.jobType = jobType;
        this.jobLocation = jobLocation;
        this.jobDescription = jobDescription;
        this.companyName = companyName;
        this.postedByEmail = postedByEmail;
        this.postedDate = postedDate;
    }
}

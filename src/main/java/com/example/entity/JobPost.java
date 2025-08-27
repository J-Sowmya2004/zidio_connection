package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="jobPosts")
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String jobTitle;
    private  String jobDescription;
    private String jobLocation;
    private String jobType;
    private String companyName;
    private String postedByemail;
    private Data postedDate;

    public JobPost() {

    }

    public JobPost(Long id, String jobTitle, String jobDescription, String jobLocation, String jobType, String companyName, String postedByemail, Data postedDate) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.companyName = companyName;
        this.postedByemail = postedByemail;
        this.postedDate = postedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPostedByemail() {
        return postedByemail;
    }

    public void setPostedByemail(String postedByemail) {
        this.postedByemail = postedByemail;
    }

    public Data getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Data postedDate) {
        this.postedDate = postedDate;
    }
}

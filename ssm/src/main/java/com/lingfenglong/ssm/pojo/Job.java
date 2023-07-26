package com.lingfenglong.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String jobId;
    private String jobTitle;
    private Double minSalary;
    private Double maxSalary;

}

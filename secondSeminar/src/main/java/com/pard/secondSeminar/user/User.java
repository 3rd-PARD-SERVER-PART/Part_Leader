package com.pard.secondSeminar.user;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer studentId;
    private String studentName;
}

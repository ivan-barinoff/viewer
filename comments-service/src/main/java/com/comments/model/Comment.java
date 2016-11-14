package com.comments.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String text;
    private User user;
}

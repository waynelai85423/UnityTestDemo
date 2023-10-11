package com.example.demo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Account {
    private Long id ;

    private int deposit ;

    void add(Integer money){
        this.deposit += money;
    }
}

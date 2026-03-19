package com.example.demo.domain.ports.in;

import com.example.demo.domain.models.Need;

public interface NeedUseCase {
    Need createNeed(Need need);
    Need updateNeed(Need need);
    Need deleteNeed(Need need);
    Need getNeed(Long id);
    List<Need> getAllNeeds();
}
package com.example.baitaphotro2.service;

import com.example.baitaphotro2.model.ChungCake;
import com.example.baitaphotro2.repository.ChungCakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChungCakeService {
    @Autowired
    private ChungCakeRepository chungCakeRepository;

    public List<ChungCake> getChungCakeList() {
        return chungCakeRepository.getChungCakeList();
    }

    public void createChungCake(ChungCake chungCake) {
        chungCakeRepository.createChungCake(chungCake);
    }

    public ChungCake getChungCakeById(int id) {
        return chungCakeRepository.getChungCakeById(id);
    }

    public void updateChungCake(ChungCake chungCake) {
        chungCakeRepository.updateChungCake(chungCake);
    }
}

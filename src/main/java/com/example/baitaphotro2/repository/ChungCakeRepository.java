package com.example.baitaphotro2.repository;

import com.example.baitaphotro2.model.ChungCake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChungCakeRepository {
    List<ChungCake> chungCakeList = new ArrayList<>();

    public ChungCakeRepository() {
        ChungCake chungCake = new ChungCake(1,"Banh Chung 1","Banh man",22,true);
        ChungCake chungCake1 = new ChungCake(2,"Banh Chung 2","Banh chay",21,true);
        ChungCake chungCake2 = new ChungCake(3,"Banh Chung 3","Banh dac biet",28,true);
        ChungCake chungCake3 = new ChungCake(4,"Banh Chung 4","Banh man",22,true);

        chungCakeList.add(chungCake);
        chungCakeList.add(chungCake1);
        chungCakeList.add(chungCake2);
        chungCakeList.add(chungCake3);
    }

    public List<ChungCake> getChungCakeList() {
        return chungCakeList;
    }

    public void createChungCake(ChungCake chungCake) {
        chungCakeList.add(chungCake);
    }

    public ChungCake getChungCakeById(int id) {
        for (ChungCake chungCake : chungCakeList) {
            if (chungCake.getId() == id) {
                return chungCake;
            }
        }
        return null;
    }

    public void updateChungCake(ChungCake chungCake) {
        ChungCake chungCakeEdit = getChungCakeById(chungCake.getId());

        chungCakeEdit.setName(chungCake.getName());
        chungCakeEdit.setType(chungCake.getType());
        chungCakeEdit.setPrice(chungCake.getPrice());
        chungCakeEdit.setStatus(chungCake.isStatus());
    }

    public void deleteChungCake(int id) {
        ChungCake chungCakeDelete = getChungCakeById(id);

        chungCakeList.remove(chungCakeDelete);
    }

    public List<ChungCake> searchChungCakeByName(String name) {
        List<ChungCake> result = new ArrayList<>();

        for (ChungCake chungCake : chungCakeList) {
            if (chungCake.getName().equals(name)) {
                result.add(chungCake);
            }
        }

        return result;

    }



}

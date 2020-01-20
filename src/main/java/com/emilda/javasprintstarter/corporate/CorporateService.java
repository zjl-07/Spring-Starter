package com.emilda.javasprintstarter.corporate;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CorporateService {
    private List<Corporate> corporates = new ArrayList<>(Arrays.asList(
            new Corporate(1,"emilda","batam","lagi terpuruk"),
            new Corporate(2,"indah","surga","karena hidup butuh keindahan"),
            new Corporate(3,"hidup aja", "mana ya","semoga aman sejahtera")
    ));


    public List<Corporate> getAllCorporates(){
        return corporates;
    }

    public Corporate getCorporate(Integer id) {
        return corporates.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addCorporate(Corporate corporate) {
        corporates.add(corporate);
    }

    public void updateCorporate(Corporate corporate, Integer id) {
        for (int i = 0; i < corporates.size(); i++) {
            Corporate c = corporates.get(i);
            if(c.getId().equals(id)){
                corporates.set(i, corporate);
                return;
            }
        }
    }


    public void deleteCorporate(Integer id) {
        corporates.removeIf(corporate -> corporate.getId().equals(id));
    }
}

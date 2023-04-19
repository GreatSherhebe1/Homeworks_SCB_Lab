package com.example.homeworks.beans.partyCell;

import com.example.homeworks.beans.palace.CollectivePalace;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class PartyCell {

    @Setter(onMethod_ = @Autowired)
    List<CollectivePalace> managePoints;

    @PostConstruct
    public void postConstruct(){
        var totalPartyCellPower = 0.0;
        for (CollectivePalace palace : managePoints) {
            System.out.printf("\npalace managed by %s as commander and %s as secretary\n",
                    palace.getCommander().getName(), palace.getSecretary().getName());
            System.out.printf("total palace political power: %.2f\n", palace.GetTotalPalacePower());
            totalPartyCellPower += palace.GetTotalPalacePower();
        }
        System.out.printf("\ntotal party-cell political power: %.2f\n", totalPartyCellPower);
    }
}

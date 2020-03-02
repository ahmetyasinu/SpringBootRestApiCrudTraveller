package com.devau.travel.controller;

import com.devau.travel.entity.Traveller;
import com.devau.travel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/traveller")
public class TravelController {
    private TravelService travelService;

    @Autowired
    public TravelController(TravelService theTravelService) {
        travelService = theTravelService;
    }

    @GetMapping("/list")
    public List<Traveller> listTraveller() {
        // get employees from db
        List<Traveller> theTraveller = travelService.findAll();
        return theTraveller;
    }

    @DeleteMapping("/delete/{travellerId}")
    public String deleteTraveller(@PathVariable int travellerId) {

        Traveller tempTraveller = travelService.findById(travellerId);

        // throw exception if null

        if (tempTraveller == null) {
            throw new RuntimeException("Traveller id not found - " + travellerId);
        }

        travelService.deleteById(travellerId);

        return "Deleted traveller id - " + travellerId;
    }

    @PostMapping("/add")
    public Traveller addTraveller(@RequestBody Traveller theTraveller) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update


        travelService.save(theTraveller);

        return theTraveller;
    }

    @GetMapping("/update/{travellerId}")
    public Traveller getTraveller(@PathVariable int travellerId) {

        Traveller theTraveller = travelService.findById(travellerId);

        // throw exception if null

        if (theTraveller == null) {
            throw new RuntimeException("Traveller not found - " + travellerId);
        }


        return theTraveller;
    }

    @PutMapping("/update/{travellerId}")
    public Traveller updateTraveller(@PathVariable int travellerId ,@RequestBody Traveller theTraveller) {
        Traveller thTraveller = travelService.findById(travellerId);
        if (travellerId!=theTraveller.getId()){
            throw new RuntimeException("Traveller id not match - " + travellerId);
        }
        travelService.update(theTraveller,travellerId);


        return theTraveller;
    }

}

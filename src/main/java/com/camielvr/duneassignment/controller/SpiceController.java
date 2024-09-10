package com.camielvr.duneassignment.controller;

import com.camielvr.duneassignment.domain.OrderSpiceRequest;
import com.camielvr.duneassignment.service.SpiceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spices/melange")
public class SpiceController {

    private final SpiceService spiceService;

    public SpiceController(SpiceService spiceService) {
        this.spiceService = spiceService;
    }

    @PostMapping
    public ResponseEntity<Void> orderSpice(@Valid final OrderSpiceRequest orderSpiceRequest) {
        spiceService.orderSpice(orderSpiceRequest);
        return ResponseEntity.ok().build();
    }
}

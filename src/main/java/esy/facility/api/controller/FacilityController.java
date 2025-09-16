package esy.facility.api.controller;

import esy.facility.api.model.FacilityRequest;
import esy.facility.api.service.FacilityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/facilities")
public class FacilityController {
    private final FacilityService facilityService;

    @PostMapping
    public ResponseEntity<Void> createFacility(@RequestBody @Valid FacilityRequest facilityRequest) {
        facilityService.createFacility(facilityRequest);
        return ResponseEntity.ok().build();
    }
}

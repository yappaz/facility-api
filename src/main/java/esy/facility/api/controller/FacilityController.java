package esy.facility.api.controller;

import esy.facility.api.model.FacilityDto;
import esy.facility.api.model.FacilityRequest;
import esy.facility.api.service.FacilityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<FacilityDto>> getAll() {
        return ResponseEntity.ok(facilityService.getAll());
    }
}

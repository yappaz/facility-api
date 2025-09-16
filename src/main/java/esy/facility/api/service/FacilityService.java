package esy.facility.api.service;

import esy.facility.api.mapper.FacilityMapper;
import esy.facility.api.model.Facility;
import esy.facility.api.model.FacilityRequest;
import esy.facility.api.repository.FacilityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FacilityService {

    private final FacilityRepository facilityRepository;
    private final FacilityMapper facilityMapper;

    public void createFacility(FacilityRequest facilityRequest) {
        Facility entity = facilityMapper.mapToEntity(facilityRequest);
        facilityRepository.save(entity);
    }
}

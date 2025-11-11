package esy.facility.api.service;

import esy.facility.api.enums.FacilityStatus;
import esy.facility.api.mapper.FacilityMapper;
import esy.facility.api.model.Facility;
import esy.facility.api.model.FacilityDto;
import esy.facility.api.model.FacilityRequest;
import esy.facility.api.repository.FacilityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FacilityService {

    private final FacilityRepository facilityRepository;
    private final FacilityMapper facilityMapper;

    public void createFacility(FacilityRequest facilityRequest) {
        Facility entity = facilityMapper.mapToEntity(facilityRequest);
        entity.setStatus(FacilityStatus.ACTIVE);
        entity.setCreatedAt(Instant.now());
        entity.setCreatedBy("me");
        entity.setUpdatedAt(Instant.now());
        entity.setUpdatedBy("me");
        entity.setOpenedIn(Instant.now());
        facilityRepository.save(entity);
    }

    public List<FacilityDto> getAll() {
        List<Facility> facilityList = facilityRepository.findAll();
        return facilityList.stream()
                .map(facilityMapper::mapEntityToDto)
                .toList();
    }
}

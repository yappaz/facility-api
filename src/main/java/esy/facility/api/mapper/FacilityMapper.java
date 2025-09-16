package esy.facility.api.mapper;

import esy.facility.api.model.Facility;
import esy.facility.api.model.FacilityRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacilityMapper {
    Facility mapToEntity(FacilityRequest facilityRequest);
}

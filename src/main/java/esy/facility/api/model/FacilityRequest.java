package esy.facility.api.model;

import esy.facility.api.enums.FacilityType;
import esy.facility.api.enums.SupportedCountry;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacilityRequest {

    @NotNull
    private String name;

    @NotNull
    private SupportedCountry country;

    @NotNull
    private String city;

    @NotNull
    private String street;

    @NotNull
    private String streetNumber;

    @NotNull
    private String postCode;

    private double latitude;

    private double longitude;

    @NotNull
    private FacilityType type;


}

package com.tobeto.pair8.services.dtos.car.responses;

import com.tobeto.pair8.services.dtos.color.resposes.GetAllListColorResponse;
import com.tobeto.pair8.services.dtos.color.resposes.GetColorNameResponse;
import com.tobeto.pair8.services.dtos.model.responses.GetAllListModelRespose;
import com.tobeto.pair8.services.dtos.model.responses.GetModelNameResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {

    private short modelYear;
    private Long kilometer;
    private String plate;
    private Float dailyPrice;

    private GetModelNameResponse modelNameResponse;
    private String colorName;
}
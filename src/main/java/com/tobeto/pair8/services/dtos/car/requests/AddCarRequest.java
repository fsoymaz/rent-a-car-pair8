package com.tobeto.pair8.services.dtos.car.requests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {

    @Min(value = 2005, message = "Model yılı en az 2005 olabilir.")
    @Max(value = 2024, message = "Model yılı 2024'ten büyük olmaz")
    private short modelYear;

    @Pattern(regexp = "^(\\d{1,2}\\s?[A-Z]{1,3}\\s?\\d{1,4})?$", message = "Geçersiz plaka formatı")
    private String plate;

    public void setPlate(String plate) {
        this.plate = plate != null ? plate.replaceAll("\\s", "") : null;
    }

    @NotNull
    @Positive
    @Min(value = 50,message = "Kredi Notunuz 50 den düşük olamaz.")
    private short minFindeksRate;


    @NotNull
    @PositiveOrZero(message = "Kilometere 0 'dan küçük olamaz.")
    private Long kilometer;



    @Positive(message ="Günlük Ücret için geçerli bir değer giriniz!")
    private Float dailyPrice;


    private String imagePath;

    @Positive
    private int modelId;
    @Positive
    private int colorId;
}

package com.camielvr.duneassignment.domain;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OrderSpiceRequest {
    @NonNull @NotBlank
    private String customerName;
    @NotNull @Min(1)
    private Integer spiceQuantity;
    @NonNull
    private LocalDateTime orderDate;
}

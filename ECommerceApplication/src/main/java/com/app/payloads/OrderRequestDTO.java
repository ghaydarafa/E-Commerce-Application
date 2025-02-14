package com.app.payloads;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Data
public class OrderRequestDTO {
    @NotBlank
    private String email;

    private Long cartId;

    @NotBlank
    private String paymentMethod;

    @Pattern(regexp = "\\d{16}", message = "Card number must be exactly 16 digits")
    private String cardNumber;

    @Pattern(regexp = "\\d{3}", message = "CVC must be exactly 3 digits")
    private String cvc;
}

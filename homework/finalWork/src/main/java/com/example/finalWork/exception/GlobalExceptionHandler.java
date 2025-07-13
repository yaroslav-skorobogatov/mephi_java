package com.example.finalWork.exception;

import com.example.finalWork.entity.Country;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Обработка неверного json
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, Object>> handleEnumConversionError(HttpMessageNotReadableException ex) {
        Throwable cause = ex.getCause();

        //для случаев когда хотят отправить страну которой нет в перечислении
        if (cause instanceof InvalidFormatException formatException) {
            if (formatException.getTargetType().isEnum()) {
                Map<String, Object> body = new LinkedHashMap<>();
                body.put("status", 400);
                body.put("message", "Invalid country value. Allowed: " + Arrays.toString(Country.values()));

                return ResponseEntity.badRequest().body(body);
            }
        }

        // для остальных случаев
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", 400);
        body.put("message", "Invalid request format");

        return ResponseEntity.badRequest().body(body);
    }

    // Обработка валидации полей
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationError(MethodArgumentNotValidException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", 400);
        body.put("message", "Validation failed");
        body.put("errors",
                ex.getBindingResult().getFieldErrors().stream()
                        .map(error -> error.getField() + ": " + error.getDefaultMessage())
                        .toList());

        return ResponseEntity.badRequest().body(body);
    }

}
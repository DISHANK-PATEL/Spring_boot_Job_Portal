package com.dishank.jobportal.dto;

public record LoginResponseDto(String message, UserDto user, String jwtToken) {
}

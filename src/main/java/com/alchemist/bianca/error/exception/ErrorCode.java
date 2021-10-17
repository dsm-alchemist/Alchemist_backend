package com.alchemist.bianca.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    USER_NOT_FOUND(404, "user not found"),
    INVALID_TOKEN(401, "Invalid token"),
    EXPIRED_ACCESS_TOKEN(401, "Expired access token"),
    EXPIRED_REFRESH_TOKEN(401, "Expired refresh token"),
    MISMATCHED_PASSWORD(400, "Mismatched password");

    private final int status;
    private final String message;
}

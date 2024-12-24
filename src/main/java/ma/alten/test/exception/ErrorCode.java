package ma.alten.test.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    NOT_FOUND("not found."),
    UNEXPECTED_ERROR("Unexpected error occurred."),
    RESOURCE_NOT_FOUND("The requested resource was not found.");

    private final String description;

    ErrorCode(String description) {
        this.description = description;
    }
}

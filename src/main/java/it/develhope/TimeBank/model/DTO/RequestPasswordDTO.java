package it.develhope.TimeBank.model.DTO;

public class RequestPasswordDTO {

    private String email;

    public RequestPasswordDTO() {
    }

    public RequestPasswordDTO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

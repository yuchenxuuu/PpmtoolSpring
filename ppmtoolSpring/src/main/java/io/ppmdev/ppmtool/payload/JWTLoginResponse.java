package io.ppmdev.ppmtool.payload;

public class JWTLoginResponse {

    private boolean success;
    private String token;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JWTLoginResponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }

    @Override
    public String toString() {
        return "JWTLoginResponse{" +
                "success=" + success +
                ", token='" + token + '\'' +
                '}';
    }
}

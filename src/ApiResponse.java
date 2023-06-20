import com.google.gson.Gson;

public class ApiResponse {
    public String status;
    public String email;
    public String domain;
    public String mx;
    public String disposable;
    public String alias;
    public String did_you_mean;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getMx() {
        return mx;
    }

    public void setMx(String mx) {
        this.mx = mx;
    }

    public String getDisposable() {
        return disposable;
    }

    public void setDisposable(String disposable) {
        this.disposable = disposable;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDid_you_mean() {
        return did_you_mean;
    }

    public void setDid_you_mean(String did_you_mean) {
        this.did_you_mean = did_you_mean;
    }

    public static ApiResponse fromJson(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, ApiResponse.class);
    }

    @Override
    public String toString() {
        return String.format("RESPOSTA DA API\nstatus: %s\nemail: %s\ndomain: %s\nmx: %s\ndisposable: %s\nalias: %s\ndid_you_mean: %s\n", status, email, domain, mx, disposable, alias, did_you_mean);
    }
}

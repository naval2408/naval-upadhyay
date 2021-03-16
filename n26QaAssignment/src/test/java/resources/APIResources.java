package resources;

public enum APIResources {
    USER_RESOURCE("/user");
    private String resource;


    APIResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}

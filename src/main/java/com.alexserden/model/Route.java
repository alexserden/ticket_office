package model;


public class Route extends IdEntity {
    private Long id;
    private String route;

    public Route(Long id, String route) {
        this.id = id;
        this.route = route;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

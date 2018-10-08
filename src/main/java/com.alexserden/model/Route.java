package model;

public class Route extends IdEntity {
    private Long id;
    private String route;

    public Route(Long id,String route) {
        super(id);
        this.route = route;

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return  route+"";
    }
}

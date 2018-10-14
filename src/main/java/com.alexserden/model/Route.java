package model;




public class Route extends IdEntity {
    private String route;
    Airport name;

    public Route(Long id, String route, Airport name) {
        super(id);
        this.route = route;
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route1 = (Route) o;

        if (route != null ? !route.equals(route1.route) : route1.route != null) return false;
        return name != null ? name.equals(route1.name) : route1.name == null;
    }

    @Override
    public int hashCode() {
        int result = route != null ? route.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Route{" +
                "route='" + route + '\'' +
                ", name=" + name +
                '}';
    }
}

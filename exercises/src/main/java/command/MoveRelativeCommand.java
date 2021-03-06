package command;

import java.util.Optional;

public class MoveRelativeCommand implements Command {

    private String id;

    private int x;

    private int y;

    public MoveRelativeCommand(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isCreate() {
        return false;
    }

    @Override
    public String getLocationId() {
        return id;
    }

    @Override
    public Location createLocation() {
        throw new IllegalStateException("Not implemented");
    }

    @Override
    public void modifyLocation(Location location) {
        location.setX(location.getX() + x);
        location.setY(location.getY() + y);
    }
}

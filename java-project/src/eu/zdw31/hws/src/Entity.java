package eu.zdw31.hws.src;

import java.util.UUID;

public class Entity {

    private UUID id;

    protected void setId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "[ENTITY: " + this.id.toString() + "]";
    }

}
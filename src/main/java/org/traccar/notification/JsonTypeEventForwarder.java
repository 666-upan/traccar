package org.traccar.notification;

import org.traccar.model.Event;
import org.traccar.model.Position;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Entity;
import java.util.Set;

public class JsonTypeEventForwarder extends EventForwarder {

    @Override
    protected void executeRequest(Event event, Position position, Set<Long> users, AsyncInvoker invoker) {
        invoker.post(Entity.json(preparePayload(event, position, users)));
    }

}

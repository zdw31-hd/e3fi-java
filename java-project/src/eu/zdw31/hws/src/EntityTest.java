package eu.zdw31.hws.src;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class EntityTest {
    Entity entity = new Entity();

    @Test
    void testToString() {
        entity.setId();
        String result = entity.toString();
        assertThat(result, containsString("[ENTITY"));    
        System.out.println(result);    
    }
}

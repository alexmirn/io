import entity.Person;

import java.io.IOException;

public interface EntityInput {

    public Person readPerson() throws IOException;
}

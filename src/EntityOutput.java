import entity.Person;

import java.io.IOException;

public interface EntityOutput {

    public void writePerson(Person person) throws IOException;
}

import entity.Person;
import entity.Sex;

import java.io.DataOutput;
import java.io.IOException;

public class EntityDataOutput implements EntityOutput {
    private final DataOutput out;

    public EntityDataOutput(DataOutput out) {
        this.out = out;
    }

    public void writePerson(Person person) throws IOException {
        out.writeBoolean(person.getName() != null);
        if (person.getName() != null) {
            out.writeUTF(person.getName());
        }
        out.writeInt(person.getAge());
        out.writeInt(person.getSex().length);
        for (Sex sex : person.getSex()) {
            out.writeBoolean(sex == Sex.F);
        }
    }

}

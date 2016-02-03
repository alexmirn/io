import entity.Person;
import entity.Sex;

import javax.swing.text.html.parser.Entity;
import java.io.DataInput;
import java.io.IOException;

public class EntityDataInput implements EntityInput {
    private final DataInput in;

    public EntityDataInput(DataInput in) {
        this.in = in;
    }


    @Override
    public Person readPerson() throws IOException {
        String name = in.readBoolean() ? in.readUTF() : null;
        int age = in.readInt();
        Sex[] sexArray = new Sex[in.readInt()];
        for (int k = 0; k < sexArray.length; k++ ) {
            sexArray[k] = in.readBoolean() ? Sex.F : Sex.M;
        }
        return new Person(name, age, sexArray);
    }
}

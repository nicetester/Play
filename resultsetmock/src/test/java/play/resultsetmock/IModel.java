package play.resultsetmock;

import play.baseline.model.Pet;

import java.util.List;

public interface IModel {

    List<Pet> loadPets(String name, int age);
}

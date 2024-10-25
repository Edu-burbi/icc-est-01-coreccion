
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();
        Carro[] carros = generator.generarCarros();
        System.out.println("Listado de carros generadas:");
        for (Carro carro : carros) {
            System.out.println(carros);
        }


        PersonasGenerator personaGenerator = new PersonasGenerator();
        Person[] personas = personaGenerator.generarPersonas();
        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }



        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithInsertion(personas);
        mOB.showPeople(personas);
        int result = mOB.searchBinaryByAge(personas, 25);
        if (result == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Encontro la posicion");
        }
    }
}


    
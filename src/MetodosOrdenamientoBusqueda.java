import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {
    // Selection sort by age

    public void sortByAgeWithSelection(Person[] people) {
        int  tamanio = people.length;
        for (int i = 0; i<tamanio; i++){
            int min = i;

            for (int j = i+1; j<tamanio; j++ ){
                if (people[min].getAge() < people[min].getAge()){
                    min = j;
                }
            } 
            Person temp = people[min];
            people[min] = people[i];
            people[i] =temp;
        }
    }


    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        int tamanio = people.length;
        for (int i = 0; i<tamanio; i++){
            int min = i;

            for (int j = i+1; j<tamanio; j++ ){
                if (people[min].getHeight() < people[min].getHeight()){
                    min = j;
                }
            } 
            Person temp = people[min];
            people[min] = people[i];
            people[i] =temp;
        }
    }    

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        int  tamanio = people.length;
        for (int i = 1; i < tamanio; i++){
            Person peopleAux = people [i];
            int j = i-1;
            while (j >= 0 && people[i].getAge() > peopleAux.getAge()) {
                people[j+1]=people[j];
                j = j-1;
            }
            people[j + 1] = peopleAux;

        }

    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        int  tamanio = people.length;
        for (int i = 1; i < tamanio; i++){
            Person peopleAux = people [i];
            int j = i-1;
            while (j >= 0 && people[i].getHeight() > peopleAux.getHeight()) {
                people[j+1]=people[j];
                j = j-1;
            }
            people[j + 1] = peopleAux;

        }

    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length -1;
        while (left <= right) {
            int mid = left +(right - left)/2;
            if (people[mid].getAge() == age){
                return mid;
            }
            if (people[mid].getAge() < age){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right = people.length -1;
        while (left <= right) {
            int mid = left +(right - left)/2;
            if (people[mid].getHeight() == height){
                return mid;
            }
            if (people[mid].getHeight() < height){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] people) {
        for (Person person : people){
            System.out.println("Persona de edad: " + person.getName() + ": " + person.getAge());
        }
    }
}

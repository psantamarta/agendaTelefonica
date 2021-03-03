import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica{

    private HashMap<String, String> agenda;

    public AgendaTelefonica(){
        agenda = new HashMap<String, String>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number){        
        agenda.put(name,number);
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name){
        String numAsociado = agenda.get(name);
        return numAsociado;
    }

    /**
     * Imprime todos los nombres de los contactos registrados
     * en la agenda
     */
    public void printAllNames(){
        agenda.forEach((k,v) -> System.out.println( k + " - " + v));
    }

    /**
     * Imprime todos los nombres de los contactos registrados
     * en la agenda uno en cada linea
     */
    public void printAllNamesOneMultiline(){
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

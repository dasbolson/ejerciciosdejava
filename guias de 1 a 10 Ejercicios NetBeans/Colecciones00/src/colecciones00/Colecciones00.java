/*
 ArrayList<Integer> numerosA = new ArrayList();
        int val = 1;
        for (int i = 0; i < 5; i++) {
            numerosA.add(val);
            val++;
        }
        System.out.println(numerosA);
        
        HashSet<Integer> numerosHash = new HashSet();
        for (int i = 0; i < 5; i++) {
            numerosHash.add(val);
            val++;
        }
        
        System.out.println(numerosHash);
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 45789323;
        for (int i = 0; i < 5; i++) {
            alumnos.put(dni, sc.nextLine());
            dni++;
        }
        
        System.out.println(alumnos);
        
        numerosA.remove(0);
        numerosHash.remove(7);
        alumnos.remove(45789325);
        
        System.out.println(numerosA);
        System.out.println(numerosHash);
        System.out.println(alumnos);
 */
package colecciones00;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Casa
 */
public class Colecciones00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO ArrayList<Integer> numerosA = new ArrayList();
        int val = 1;
        for (int i = 0; i < 5; i++) {
            numerosA.add(val);
            val++;
        }
        System.out.println(numerosA);
        
        HashSet<Integer> numerosHash = new HashSet();
        for (int i = 0; i < 5; i++) {
            numerosHash.add(val);
            val++;
        }
        
        System.out.println(numerosHash);
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 45789323;
        for (int i = 0; i < 5; i++) {
            alumnos.put(dni, sc.nextLine());
            dni++;
        }
        
        System.out.println(alumnos);
        
        numerosA.remove(0);
        numerosHash.remove(7);
        alumnos.remove(45789325);
        
        System.out.println(numerosA);
        System.out.println(numerosHash);
        System.out.println(alumnos); 
    
        forE;  
                
                
                
                }
    
    
    
    //DETECCION DE ERRORES
  /*  HashMap<Integer, String> personas = new HashMap();
    String n1 = "Albus";
    String n2 = "Severus";
    personas.put(1, n1);
    personas.put(2, n2);
    */
  
  ArrayList<String> lista = new ArrayList();
  lista.add("hola");
  lista.add("Mundo");
  
  Iterator iterador = lista.iterator();
        System.out.println("Elementos de la lista: ");
        
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }
        
        System.out.println("");
        
        
    ArrayList<String> lista1 = new ArrayList();
  lista.add("hola");
  lista.add("Mundo");
  lista.add("!!!!");
  Iterator it = lista1.iterator();
  
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
            if (it.next() == "Mundo") {
                it.remove();
                
            }
            
        }
        for (String listado : lista1) {
            System.out.println(listado);
        }
}

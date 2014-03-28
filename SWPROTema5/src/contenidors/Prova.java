package contenidors;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.HashMap;

public class Prova {
	public void ProvaPilaGenerict() {
		Pila<String> pilaPlats;
		pilaPlats = new Pila<>();
		System.out.println("Mira si la pila está vacia /empty/");
		System.out.println(pilaPlats.empty());
		System.out.println("Se introduce un plato tortilla /push/");
		pilaPlats.push("Tortilla");
		System.out.println("se muestra el ultimo valor que es Tortilla/peek/");
		System.out.println(pilaPlats.peek());
		System.out.println("Mira si la pila está vacia");
		System.out.println(pilaPlats.empty());
		System.out.println("borra el ultimo resultado de la pila");
		pilaPlats.pop();
		System.out.println("Mira si la pila está vacia");
		System.out.println(pilaPlats.empty());
		System.out.println("Se introduce el valor Tortilla");
		pilaPlats.push("Tortilla");
		System.out.println("Se introduce el valor Pasta");
		pilaPlats.push("Pasta");
		System.out.println("Borra y devuelve el valor borrado de la pila");
		System.out.println(pilaPlats.poll());

	}

	public void provaCoaArrayDeque() {

		ArrayDeque deQue = new ArrayDeque();
		System.out.println("Mira si la pila o cola está vacia /isEmpty/");
		System.out.println(deQue.isEmpty());
		System.out.println("Se introduce una persona a la cola /push/");
		deQue.add("Pedro");
		deQue.add("Pedro2");
		System.out
				.println("se muestra la primera persona de la cola de la pila/element/");
		System.out.println(deQue.element());
		System.out.println("borra la primera persona de la cola/remove/");
		deQue.remove();
		System.out.println(deQue.element());
		System.out.println("muestra cuantas personas hay en la cola/size/");
		System.out.println(deQue.size());
		System.out.println("borra las personas de la cola/clear/");
		deQue.clear();
		System.out
				.println("muestra cuantas personas hay en la cola despues de eliminarla");
		System.out.println(deQue.size());

	}

	public void provesHashSet() {

		HashSet preferencia = new HashSet();
		Preferencia paella = new Preferencia(1, "paella");
		Preferencia paella2 = new Preferencia(1, "paella");
		preferencia.add(paella);
		preferencia.add(paella2);
		System.out
				.println("No son iguals ya que aunque el contingut es el mateix la posicio de memoria que utilitzen es distinta");
		Preferencia tortilla = new Preferencia(2, "tortilla");
		preferencia.add(tortilla);
		System.out.println("Muestra si ay el objeto tortilla en el conjunto");
		System.out.println(preferencia.contains(tortilla));
		System.out.println("Muestra el conjunto");
		System.out.println(preferencia);
		System.out.println("Muestra el tamaño");
		System.out.println(preferencia.size());
		System.out.println("borra el primer objeto");
		System.out.println(preferencia.remove(paella));
		System.out.println("Muestra el conjunto");
		System.out.println(preferencia);

	}

	public void provesHashSet2() {

		HashSet preferencia = new HashSet();
		Preferencia2 paella = new Preferencia2(1, "paella");
		Preferencia2 paella2 = new Preferencia2(1, "paella");
		preferencia.add(paella);
		preferencia.add(paella2);
		System.out
				.println("No son iguals ya que aunque el contingut es el mateix la posicio de memoria que utilitzen es distinta");
		Preferencia2 tortilla = new Preferencia2(2, "tortilla");
		preferencia.add(tortilla);
		System.out.println("Muestra si ay el objeto tortilla en el conjunto");
		System.out.println(preferencia.contains(tortilla));
		System.out.println("Muestra el conjunto");
		System.out.println(preferencia);
		System.out.println("Muestra el tamaño");
		System.out.println(preferencia.size());
		System.out.println("borra el primer objeto");
		System.out.println(preferencia.remove(paella));
		System.out.println("Muestra el conjunto");
		System.out.println(preferencia);

	}

	public void provesHashMap() {
		HashMap<String, Integer> preferencia = new HashMap();
		preferencia.put("tortilla", 1);
		preferencia.put("pizza", 2);
		preferencia.put("macarrones", 3);
		System.out.println(preferencia.put("macarrones", 4));
		for (Integer i : preferencia.values()) {
			System.out.println(i);
		}
		System.out.println("Muestra si la clave pizza esta en el mapa");
		System.out.println(preferencia.containsKey("pizza"));
		System.out.println("Muestra si el valor 2 esta en el mapa");
		System.out.println(preferencia.containsValue(2));
		System.out.println(preferencia.get("tortilla"));
		System.out.println(preferencia);
		System.out.println("numero de elementos del mapa");
		System.out.println(preferencia.size());
		System.out.println("borramos el plato tortilla");
		System.out.println(preferencia.remove("tortilla"));
		System.out.println(preferencia);
		System.out.println("muestra si esta vacio el mapa");
		System.out.println(preferencia.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PilaSencers pila = new PilaSencers();
		 * System.out.println("Mira si la pila está vacia /empty/");
		 * System.out.println(pila.empty());
		 * System.out.println("Se introduce el valor 6 /push/"); pila.push(6);
		 * System.out.println("se muestra el ultimo valor que es 6/peek/");
		 * System.out.println(pila.peek());
		 * System.out.println("Mira si la pila está vacia");
		 * System.out.println(pila.empty());
		 * System.out.println("borra el ultimo resultado de la pila");
		 * pila.pop(); System.out.println("Mira si la pila está vacia");
		 * System.out.println(pila.empty());
		 * System.out.println("Se introduce el valor 8"); pila.push(8);
		 * System.out.println("Se introduce el valor 1"); pila.push(1);
		 * System.out.println("Borra y devuelve el valor borrado de la pila");
		 * System.out.println(pila.poll());
		 * 
		 * System.out.println("-----------------------"); Prova p = new Prova();
		 * p.ProvaPilaGenerict();
		 */
		Prova p = new Prova();
		// p.provaCoaArrayDeque();
		// p.provesHashSet();
		// p.provesHashSet2();
		p.provesHashMap();
	}

}

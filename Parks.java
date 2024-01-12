package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Parks {
    public static void main(String[] args) {
        Collection<String> park = new ArrayList<>();
        park.add("Central Park");
        park.add("Hyde Park");
        park.add("Golden Gate Park");
        park.add("Stanley Park");
        park.add("Griffith Park");
        park.add("Millennium Park");
        park.add("Tiergarten");
        park.add("Chapultepec Park");
        park.add("Phoenix Park");
        park.add("Ueno Park");
        park.add("Royal");
        park.add("Park Güell");
        park.add("Garden of the Gods");
        park.add("High Park");
        park.add("Bois de Boulogne");
        park.add("Forest Park");
        park.add("Vondelpark");
        park.add("City Park");
        park.add("Balboa Park");
        park.add("Yellowstone");
        park.add("Phoenix Park");
        park.add("Ibirapuera Park");
        park.add("Algonquin Provincial");
        park.add("Bukit Timah Nature Reserve");
        park.add("Hampstead Heath");
        park.add("Redwood and State Parks");
        park.add("Banff");
        park.add("Griffiths Park");
        park.add("Olympic");
        park.add("Yosemite");
        park.add("Joshua Tree");
        park.add("Acadia");
        park.add("Great Smoky Mountains");
        park.add("Arches");
        park.add("Zion");
        park.add("Everglades");
        park.add("Glacier");
        park.add("Kruger");
        park.add("Serengeti");
        park.add("Yellowstone");
        park.add("Grand Canyon");
        park.add("Denali");
        park.add("Rocky Mountain");
        park.add("Sequoia");
        park.add("Bryce Canyon");
        park.add("Grand Teton");
        park.add("Great Sand Dunes");
        park.add("Death Valley");
        park.add("Shenandoah");
        park.add("Yosemite");
        park.add("Redwood and State Parks");
        park.add("Olympic");
        park.add("Yellowstone");
        park.add("Everglades");
        park.add("Glacier");
        park.add("Zion");
        park.add("Sequoia");
        park.add("Grand Canyon");
        park.add("Joshua Tree");
        park.add("Mount Rainier");
        Iterator<String> ref = park.iterator();
        while (ref.hasNext()){
            String parks = ref.next();
            if (parks.startsWith("B")|parks.endsWith("k")){
                System.out.println(parks);
            }
        }

    }
}

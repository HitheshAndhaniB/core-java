package CollectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner  {
    public static void main(String[] args) {
        Paper paper = new Paper(5.2,"black",2.1,"smooth");
        Paper paper1 = new Paper(7.0, "blue",3.2,"glossy");
        Paper paper2 = new Paper(3.4, "orange",7.5,"rough");
        Paper paper3 = new Paper(2.1, "blue",2.5,"smoot");
        Paper paper4 = new Paper(10, "pink",10.2,"rough");
        List<Paper> papers = new ArrayList<>();
        papers.add(paper);
        papers.add(paper1);
        papers.add(paper2);
        papers.add(paper3);
        papers.add(paper4);

        Collections.sort(papers, Comparator.comparing(Paper::getColor));
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
                  );
    }
        System.out.println("reversing");
        Collections.sort(papers, Comparator.comparing(Paper::getColor).reversed());
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );
        }
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );
        }
        System.out.println("After reversing");
        Collections.sort(papers,Comparator.comparingDouble(Paper::getWidth).reversed());
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );
        }
        Collections.sort(papers,Comparator.comparingDouble(Paper::getWeight));
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );
        }
        System.out.println("After reversing");
        Collections.sort(papers,Comparator.comparingDouble(Paper::getWeight).reversed());
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );
        }
        Collections.sort(papers,Comparator.comparing(Paper::getTexture));
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );

        }
        Collections.sort(papers,Comparator.comparing(Paper::getTexture).reversed());
        for (Paper p : papers) {
            System.out.println(
                    ", Color: " + p.getColor()+", width: " + p.getWidth()+", weight: " + p.getWeight()+" Texture: " + p.getTexture()
            );      }
}


    }


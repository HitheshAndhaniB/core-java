package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper(5.2, "black", 2.1, "smooth");
        Paper paper1 = new Paper(7.0, "blue", 3.2, "glossy");
        Paper paper2 = new Paper(3.4, "orange", 7.5, "rough");
        Paper paper3 = new Paper(2.1, "blue", 2.5, "smoot");
        Paper paper4 = new Paper(10, "pink", 10.2, "rough");
        List<Paper> papers = new ArrayList<>();
        papers.add(paper);
        papers.add(paper1);
        papers.add(paper2);
        papers.add(paper3);
        papers.add(paper4);

        System.out.println("Ascending Weight based on Cost......");
        Comparator<Paper> comparatorWidth = new PaperComparater();
        Collections.sort(papers, comparatorWidth);
        for (Paper cost : papers
        ) {
            System.out.println(cost);
        }
        System.out.println("==============================================");
        System.out.println("Descending  Weight on quantity......");
        Comparator<Paper> comparatorWidth1 = new PapaerWidthDesc();
        Collections.sort(papers, comparatorWidth1);
        for (Paper quantity : papers
        ) {
            System.out.println(quantity);
        }

        System.out.println("Ascending Weight based on Cost......");
        Comparator<Paper> comparator = new PapaerWeightAsc();
        Collections.sort(papers, comparator);
        for (Paper weight : papers
        ) {
            System.out.println(weight);
        }
        System.out.println("==============================================");
        System.out.println("Descending  Weight ......");
        Comparator<Paper> comparator1 = new PapaerWeightDesc();
        Collections.sort(papers, comparator1);
        for (Paper weight1 : papers
        ) {
            System.out.println(weight1);
        }
        System.out.println("Ascending Color ......");
        Comparator<Paper> comparatorColor = new PapaerColorAsc();
        Collections.sort(papers, comparator);
        for (Paper cost : papers
        ) {
            System.out.println(cost);
        }
        System.out.println("==============================================");
        System.out.println("Descending Color ......");
        Comparator<Paper> comparatorColor1 = new PapaerColorDesc();
        Collections.sort(papers, comparator1);
        for (Paper quantity : papers
        ) {
            System.out.println(quantity);
        }
        System.out.println("Ascending Texture ......");
        Comparator<Paper> comparatorTexture = new PapaerTextureAsc();
        Collections.sort(papers, comparator);
        for (Paper cost : papers
        ) {
            System.out.println(cost);
        }
        System.out.println("==============================================");
        System.out.println("Descending Texture ......");
        Comparator<Paper> comparatorTexture1 = new PapaertextureDesc();
        Collections.sort(papers, comparator1);
        for (Paper quantity : papers
        ) {
            System.out.println(quantity);
        }


    }
}


package collectionsListTask;

import java.util.Comparator;

public class PaperComparater implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return Double.compare(o1.getWidth(), o2.getWidth());
    }
    }
    class PapaerWidthDesc implements Comparator<Paper> {
        @Override
        public int compare(Paper o1, Paper o2) {
            return Double.compare(o2.getWidth(), o1.getWidth());
        }
    }
class PapaerColorAsc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getColor(), o2.getColor());
    }
}class PapaerColorDesc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getColor(), o1.getColor());
    }
}
class PapaerWeightAsc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}class PapaerWeightDesc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }
}class PapaerTextureAsc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getTexture(), o2.getTexture());
    }
}class PapaertextureDesc implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getTexture(), o1.getTexture());
    }
}
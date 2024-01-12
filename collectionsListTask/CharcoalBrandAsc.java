package collectionsListTask;

import java.util.Comparator;

public class CharcoalBrandAsc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}

    class CharcoalBrandDesc implements Comparator<Charcoal> {
        @Override
        public int compare(Charcoal o1, Charcoal o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
        }
    }
class CharcoalTypeAsc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class CharcoalTypeDesc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}
class CharcoalWeightAsc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
class CharcoalWeightDesc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }
}
class CharcoalPurposeAsc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getPurpose(), o2.getPurpose());
    }
}
class CharcoalPurposeDesc implements Comparator<Charcoal> {
    @Override
    public int compare(Charcoal o1, Charcoal o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getPurpose(), o1.getPurpose());
    }
}


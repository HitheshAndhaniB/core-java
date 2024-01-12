package collectionsListTask;

import java.util.Comparator;

public class CoverMaterialAsc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getMaterial(), o2.getMaterial());
    }
}
class CoverMaterialDesc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getMaterial(), o1.getMaterial());
    }
}
class CoverColorAsc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getColor(), o2.getColor());
    }
}
class CoverColorDesc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getColor(), o1.getColor());
    }
}
class CoverSizeAsc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return Integer.compare(o1.getSize(), o2.getSize());
    }
}
class CoverSizeDesc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return Integer.compare(o2.getSize(), o1.getSize());
    }
}
class CoverDesinAsc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getDesign(), o2.getDesign());
    }
}
class CoverDesinDesc implements Comparator<Cover> {
    @Override
    public int compare(Cover o1, Cover o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getDesign(), o1.getDesign());
    }
}
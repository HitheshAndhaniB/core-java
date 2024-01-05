package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BodyParts {
    public static void main(String[] args) {
        Collection<String> bodyParts = new ArrayList<>();
        bodyParts.add("Head");
        bodyParts.add("Hair");
        bodyParts.add("Forehead");
        bodyParts.add("Temple");
        bodyParts.add("Eyebrow");
        bodyParts.add("Eyelid");
        bodyParts.add("Eyelash");
        bodyParts.add("Eye");
        bodyParts.add("Nose");
        bodyParts.add("Nostril");
        bodyParts.add("Cheek");
        bodyParts.add("Mouth");
        bodyParts.add("Lip");
        bodyParts.add("Tongue");
        bodyParts.add("Tooth");
        bodyParts.add("Gums");
        bodyParts.add("Chin");
        bodyParts.add("Jaw");
        bodyParts.add("Throat");
        bodyParts.add("Neck");
        bodyParts.add("Shoulder");
        bodyParts.add("Arm");
        bodyParts.add("Elbow");
        bodyParts.add("Wrist");
        bodyParts.add("Hand");
        bodyParts.add("Palm");
        bodyParts.add("Finger");
        bodyParts.add("Chest");
        bodyParts.add("Rib");
        bodyParts.add("Abdomen");
        bodyParts.add("Navel");
        bodyParts.add("Back");
        bodyParts.add("Spine");
        bodyParts.add("Leg");
        bodyParts.add("Knee");
        bodyParts.add("Calf");
        bodyParts.add("Ankle");
        bodyParts.add("Heel");
        bodyParts.add("Foot");
        bodyParts.add("Toe");
        bodyParts.add("Heart");
        bodyParts.add("Lungs");
        bodyParts.add("Liver");
        bodyParts.add("Kidney");
        bodyParts.add("Brain");
        bodyParts.add("Skull");
        bodyParts.add("Leg");
        bodyParts.add("Arm");
        bodyParts.add("Face");
        bodyParts.add("Mole");
        bodyParts.add("Acne");
        bodyParts.add("Back");
        bodyParts.add("Bone");
        bodyParts.add("Bicep");
        bodyParts.add("Ear");
        bodyParts.add("Hand");
        bodyParts.add("Jaw");
        bodyParts.add("Knee");
        bodyParts.add("Lung");
        bodyParts.add("Mouth");
        bodyParts.add("Nail");
        bodyParts.add("Neck");
        bodyParts.add("Nose");
        bodyParts.add("Palm");
        bodyParts.add("Rib");
        bodyParts.add("Skin");
        bodyParts.add("Thigh");
        bodyParts.add("Throat");
        bodyParts.add("Toe");
        bodyParts.add("Tongue");
        bodyParts.add("Tooth");
        bodyParts.add("Uvula");
        bodyParts.add("Vein");
        bodyParts.add("Wrist");
        bodyParts.add("Lip");
        Iterator<String> ref = bodyParts.iterator();
        while (ref.hasNext()){
            String parts = ref.next();
            if (parts.length()<5){
                System.out.println(parts);
            }
        }

    }
}

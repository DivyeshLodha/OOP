package Abstraction;

public abstract class FeatureService {
    FeatureService(){
        System.out.println("Feature Service constructor");
    }
    abstract void addFeature();
}

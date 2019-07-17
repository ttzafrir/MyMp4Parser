package lib;//package FeatureExtractors.FeatureExtractorsFixedFeatures.KnowledgeBased;

//import FeatureExtractors.AFeatureExtractor;
//import FeatureExtractors.FeatureExtractorsFixedFeatures.AFeatureExtractorFixedFeatures;
//import Utils._Exceptions.FeatureExtractionException;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FeatureExtractorFixedFeaturesKnowledgeBasedMp4 {

    private enum featuresName {
        Duration,
        Minor_Version,
        Major_Brand,
        Height,
        Width,
        Sample_Size,
        Sample_Rate,
    } // list of the feature names

    public FeatureExtractorFixedFeaturesKnowledgeBasedMp4() {
    } // Empty constructor


    public LinkedHashMap<String, String> extractFeaturesFromSingleElement(Object element)  {
        LinkedHashMap<String, String> features = new LinkedHashMap<>();


        features.put(featuresName.Duration.toString(), someFunction());
        //Using the Mp4 Parser to extract the relevant features and add them to the Map.
        //Make sure to insert the features to the map at the same order as they are in the enum.
        //Use try-catch to protect the code

        return features;
    }

    //<editor-fold desc="Extractor Methods">
    private String someFunction() {
        return "some value";
    }
    //</editor-fold>
    //@Override
        public ArrayList<String> getFeaturesHeaders() {
        ArrayList<String> featuresHeaders = new ArrayList<>();
        for (featuresName featureName : featuresName.values()) {
            featuresHeaders.add(featureName.toString());
        }
        return featuresHeaders;
    } // Feature Headers are the features names

    //@Override
    public String getID() {
        return null;
    }

    //@Override
    public String getName() {
        return "Mp4 Knowledge-Based";
    }

    //@Override
    public String getDescription() {
        return "Extracts set of X knowledge-based features from a Mp4 image.";
    }
    /**
    @Override
    public AFeatureExtractor clone() {
        return new lib.FeatureExtractorFixedFeaturesKnowledgeBasedMp4();
    }*/
}

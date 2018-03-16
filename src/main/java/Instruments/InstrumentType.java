package Instruments;

public enum InstrumentType {
    WOODWIND("peeeeep"),
    KEYBOARD("plink-plonk"),
    DRUMS("badum tssss"),
    STRING("screeching"),
    GUITAR("strum thrum"),
    BRASS("pah-pa-rah");
    
    private String sound;
    
    InstrumentType(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}

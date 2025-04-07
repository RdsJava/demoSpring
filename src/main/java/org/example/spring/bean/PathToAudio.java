package org.example.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class PathToAudio {

    // private String pathToAudio = "/Users/recmac/Yandex.Disk.localized/textToAudio/";

    private String pathToAudio = "F:/YandexDisk/textToAudio/";

    private String voice = "DM";

    private String pathLanguageCiklo = pathToAudio + "Ciklo_" + voice;
    private String pathLanguageNomernoi = pathToAudio + "Nomernoi_" + voice;
    private String pathLanguageRitmo = pathToAudio + "Ritmo_" + voice;
    private String pathLanguageR100 = pathToAudio + "R100_" + voice;
    private String pathLanguageRadasteid = pathToAudio + "Radasteid_" + voice;
    private String pathLanguageCikloMp3 = pathToAudio + "CikloMp3_" + voice;
    private String pathLanguageNomernoiMp3 = pathToAudio + "NomernoiMp3_" + voice;
    private String pathLanguageRitmoMp3 = pathToAudio + "RitmoMp3_" + voice;
    private String pathLanguageR100Mp3 = pathToAudio + "R100Mp3_" + voice;
    private String pathLanguageRadasteidMp3 = pathToAudio + "RadasteidMp3_" + voice;


    public String getPathToAudio() {
        return pathToAudio;
    }
    public String getPathLanguageCikloMp3() {
        return pathLanguageCikloMp3;
    }
    public String getPathLanguageNomernoiMp3() {
        return pathLanguageNomernoiMp3;
    }

    public String getPathLanguageRitmoMp3() {
        return pathLanguageRitmoMp3;
    }

    public String getPathLanguageR100Mp3() {
        return pathLanguageR100Mp3;
    }

    public String getPathLanguageRadasteidMp3() {
        return pathLanguageRadasteidMp3;
    }

    public String getPathLanguageCiklo() {
        return pathLanguageCiklo;
    }

    public String getPathLanguageNomernoi() {
        return pathLanguageNomernoi;
    }

    public String getPathLanguageRitmo() {
        return pathLanguageRitmo;
    }

    public String getPathLanguageR100() {
        return pathLanguageR100;
    }

    public String getPathLanguageRadasteid() {
        return pathLanguageRadasteid;
    }

    public String getVoice() {
        return voice;
    }
}



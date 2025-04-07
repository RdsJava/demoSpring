package org.example.spring.maps;

import org.example.spring.bean.PathToAudio;
import java.util.HashMap;
import java.util.Map;

public class MapCiklo {
    public String replace(char a) {

        PathToAudio pathToAudio = new PathToAudio();
        Map<Character, String> ciklohladovit = new HashMap<>();

        ciklohladovit.put('_', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() +"/_оль.wav"); // пробел
        ciklohladovit.put('А', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Аоль.wav");
        ciklohladovit.put('Б', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Боль.wav");
        ciklohladovit.put('В', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Воль.wav");
        ciklohladovit.put('Г', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Голь.wav");
        ciklohladovit.put('Д', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Доль.wav");
        ciklohladovit.put('Е', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Еоль.wav");
        ciklohladovit.put('Ё', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ёоль.wav");
        ciklohladovit.put('Ж', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Жоль.wav");
        ciklohladovit.put('З', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Золь.wav");
        ciklohladovit.put('И', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Иоль.wav");
        ciklohladovit.put('Й', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Йоль.wav");
        ciklohladovit.put('К', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Коль.wav");
        ciklohladovit.put('Л', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Лоль.wav");
        ciklohladovit.put('М', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Моль.wav");
        ciklohladovit.put('Н', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ноль.wav");
        ciklohladovit.put('О', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ооль.wav");
        ciklohladovit.put('П', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Поль.wav");
        ciklohladovit.put('Р', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Роль.wav");
        ciklohladovit.put('С', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Соль.wav");
        ciklohladovit.put('Т', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Толь.wav");
        ciklohladovit.put('У', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Уоль.wav");
        ciklohladovit.put('Ф', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Фоль.wav");
        ciklohladovit.put('Х', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Холь.wav");
        ciklohladovit.put('Ц', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Цоль.wav");
        ciklohladovit.put('Ч', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Чоль.wav");
        ciklohladovit.put('Ш', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Шоль.wav");
        ciklohladovit.put('Щ', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Щоль.wav");
        ciklohladovit.put('Ъ', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ъоль.wav");
        ciklohladovit.put('Ы', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ыоль.wav");
        ciklohladovit.put('Ь', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Ьоль.wav");
        ciklohladovit.put('Э', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Эоль.wav");
        ciklohladovit.put('Ю', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Юоль.wav");
        ciklohladovit.put('Я', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/Яоль.wav");

        ciklohladovit.put('а', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/аоль.wav");
        ciklohladovit.put('б', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/боль.wav");
        ciklohladovit.put('в', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/воль.wav");
        ciklohladovit.put('г', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/голь.wav");
        ciklohladovit.put('д', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/доль.wav");
        ciklohladovit.put('е', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/еоль.wav");
        ciklohladovit.put('ё', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ёоль.wav");
        ciklohladovit.put('ж', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/жоль.wav");
        ciklohladovit.put('з', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/золь.wav");
        ciklohladovit.put('и', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/иоль.wav");
        ciklohladovit.put('й', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/йоль.wav");
        ciklohladovit.put('к', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/коль.wav");
        ciklohladovit.put('л', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/лоль.wav");
        ciklohladovit.put('м', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/моль.wav");
        ciklohladovit.put('н', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ноль.wav");
        ciklohladovit.put('о', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ооль.wav");
        ciklohladovit.put('п', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/поль.wav");
        ciklohladovit.put('р', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/роль.wav");
        ciklohladovit.put('с', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/соль.wav");
        ciklohladovit.put('т', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/толь.wav");
        ciklohladovit.put('у', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/уоль.wav");
        ciklohladovit.put('ф', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/фоль.wav");
        ciklohladovit.put('х', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/холь.wav");
        ciklohladovit.put('ц', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/цоль.wav");
        ciklohladovit.put('ч', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/чоль.wav");
        ciklohladovit.put('ш', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/шоль.wav");
        ciklohladovit.put('щ', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/щоль.wav");
        ciklohladovit.put('ъ', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ъоль.wav");
        ciklohladovit.put('ы', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ыоль.wav");
        ciklohladovit.put('ь', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/ьоль.wav");
        ciklohladovit.put('э', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/эоль.wav");
        ciklohladovit.put('ю', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/юоль.wav");
        ciklohladovit.put('я', pathToAudio.getPathToAudio() + "Ciklo_" + pathToAudio.getVoice() + "/яоль.wav");


        return ciklohladovit.get(a);
    }
}

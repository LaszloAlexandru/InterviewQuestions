package org.design.patterns.second.service.translator;

import org.design.patterns.second.dto.Language;
import org.springframework.stereotype.Component;

@Component
public class GermanTranslator implements Translator {
    @Override
    public String translate(String sentence) {
        return "Hallo, " + sentence;
    }
    @Override
    public Language getLanguage() {
        return Language.GERMAN;
    }
}
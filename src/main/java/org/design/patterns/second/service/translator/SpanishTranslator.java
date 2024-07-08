package org.design.patterns.second.service.translator;

import org.design.patterns.second.dto.Language;
import org.springframework.stereotype.Component;

@Component
public class SpanishTranslator implements Translator {
    @Override
    public String translate(String sentence) {
        return "Hola, " + sentence;
    }
    @Override
    public Language getLanguage() {
        return Language.SPANISH;
    }
}
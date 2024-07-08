package org.design.patterns.second.service;

import org.design.patterns.second.dto.Language;
import org.design.patterns.second.service.translator.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class MagicClass {

    private final Map<Language, Translator> translatorMap;

    @Autowired
    public MagicClass(List<Translator> translators) {
        translatorMap = translators.stream()
                .collect(Collectors.toMap(Translator::getLanguage, Function.identity()));
    }

    public Translator getTranslator(Language language) {
        return translatorMap.get(language);
    }
}

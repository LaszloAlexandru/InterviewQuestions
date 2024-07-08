package org.design.patterns.second.service.translator;

import org.design.patterns.second.dto.Language;

public interface Translator {
    String translate(String sentence);
    Language getLanguage();
}

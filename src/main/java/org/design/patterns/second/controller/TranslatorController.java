package org.design.patterns.second.controller;

import org.design.patterns.second.dto.InputDto;
import org.design.patterns.second.service.MagicClass;
import org.design.patterns.second.service.translator.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/translator")
public class TranslatorController {

    private final MagicClass magicClass;

    @Autowired
    public TranslatorController(MagicClass magicClass) {
        this.magicClass = magicClass;
    }

    @PostMapping
    public String translate(InputDto inputDto) {
        Translator translator = magicClass.getTranslator(inputDto.getLanguage());
        return translator.translate(inputDto.getSentence());
    }
}

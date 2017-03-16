package pl.ajn.combo.customers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ajn.combo.customers.entities.Dictionary;
import pl.ajn.combo.customers.repositories.DictionaryRepository;
import pl.ajn.combo.customers.services.DictionaryService;

@Service
public class DefaultDictionaryService implements DictionaryService {

    @Autowired
    DictionaryRepository dictionaryRepository;

    @Override
    public Dictionary getDictionaryById(Long dictionaryId) {
        return dictionaryRepository.findOne(dictionaryId);
    }
}

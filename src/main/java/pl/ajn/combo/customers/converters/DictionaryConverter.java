package pl.ajn.combo.customers.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ajn.combo.customers.dtos.DictionaryDTO;
import pl.ajn.combo.customers.entities.Dictionary;
import pl.ajn.combo.customers.repositories.DictionaryRepository;

@Component
public class DictionaryConverter implements AbstractConverter<Dictionary, DictionaryDTO> {

    @Autowired
    DictionaryRepository dictionaryRepository;

    @Override
    public DictionaryDTO convertToDto(Dictionary entity) {
        DictionaryDTO dictionaryDTO = new DictionaryDTO();
        dictionaryDTO.setCategory(entity.getCategory());
        dictionaryDTO.setName(entity.getName());
        dictionaryDTO.setDescription(entity.getDescription());
        return dictionaryDTO;
    }

    @Override
    public Dictionary convertToEntity(DictionaryDTO dto) {
        Dictionary dictionaryEntity = new Dictionary();
        dictionaryEntity.setCategory(dto.getCategory());
        dictionaryEntity.setName(dto.getName());
        dictionaryEntity.setDescription(dto.getDescription());
        return dictionaryEntity;
    }

    public Dictionary convertIdToEntity(Long id) {
        return dictionaryRepository.findOne(id);
    }
}

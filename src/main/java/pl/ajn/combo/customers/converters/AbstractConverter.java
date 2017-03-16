package pl.ajn.combo.customers.converters;

import java.util.List;
import java.util.stream.Collectors;

public interface AbstractConverter<E, D> {

    D convertToDto(E entity);

    E convertToEntity(D dto);

    default List<D> convertToDtoList(final List<E> entities) {
        return entities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    default List<E> convertToEntityList(final List<D> dtos) {
        return dtos.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
    }
}

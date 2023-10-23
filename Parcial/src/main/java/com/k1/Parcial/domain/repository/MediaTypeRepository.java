package com.k1.Parcial.domain.repository;

import com.k1.Parcial.infrastructure.entity.MediaType;

import java.util.Optional;

public interface MediaTypeRepository {
    Optional<MediaType> getById(Long id);

}

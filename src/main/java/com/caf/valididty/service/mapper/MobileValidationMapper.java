package com.caf.valididty.service.mapper;

import com.caf.valididty.domain.*;
import com.caf.valididty.service.dto.MobileValidationDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity MobileValidation and its DTO MobileValidationDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MobileValidationMapper extends EntityMapper <MobileValidationDTO, MobileValidation> {
    
    
    default MobileValidation fromId(Long id) {
        if (id == null) {
            return null;
        }
        MobileValidation mobileValidation = new MobileValidation();
        mobileValidation.setId(id);
        return mobileValidation;
    }
}

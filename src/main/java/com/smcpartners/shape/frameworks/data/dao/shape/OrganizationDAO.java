package com.smcpartners.shape.frameworks.data.dao.shape;

import com.smcpartners.shape.frameworks.data.dao.CrudDAO;
import com.smcpartners.shape.frameworks.data.exceptions.DataAccessException;
import com.smcpartners.shape.shared.dto.shape.OrganizationDTO;

import java.util.List;

/**
 * Responsible:</br>
 * 1. </br>
 * <p>
 * <p>
 * Created by johndestefano on 10/29/15.
 * </p>
 * <p>
 * <p>
 * Changes:</br>
 * 1. </br>
 * </p>
 */
public interface OrganizationDAO extends CrudDAO<OrganizationDTO, Integer> {

    /**
     * Find all organizations
     *
     * @return
     * @throws DataAccessException
     */
    List<OrganizationDTO> findAll() throws DataAccessException;


    /**
     * Inactivate the organization
     *
     * @param id
     * @throws DataAccessException
     */
    void changeOrganizationActiveStatus(int id, boolean status) throws DataAccessException;
}

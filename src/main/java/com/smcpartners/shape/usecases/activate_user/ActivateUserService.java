package com.smcpartners.shape.usecases.activate_user;


import com.smcpartners.shape.shared.dto.common.BooleanValueDTO;
import com.smcpartners.shape.shared.usecasecommon.UseCaseException;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Responsible:</br>
 * 1.  Support REST framework</br>
 * <p>
 * Created by johndestefano on 3/15/16.
 * </p>
 * <p>
 * Changes:</br>
 * 1. </br>
 * </p>
 */
@Path("/admin")
public interface ActivateUserService {

    /**
     * Activate the targetUser. This is an Admin function so the
     * method call should be protected to allow only Admin user dao.
     *
     * @param targetUserId - The user to be activated
     * @throws UseCaseException
     */
    @PUT
    @Path("/activate/{targetUserId}")
    @Produces("application/json")
    BooleanValueDTO activateUser(@PathParam("targetUserId") String targetUserId) throws UseCaseException;
}

package com.smcpartners.shape.usecases.login;

import com.smcpartners.shape.shared.dto.shape.UserDTO;
import com.smcpartners.shape.usecases.UsecaseAdapter;

/**
 * Responsible:<br/>
 * 1.
 * <p>
 * Created by johndestefano on 10/9/15.
 * <p>
 * Changes:<b/>
 */
public interface AuthLoginUsecaseAdapter extends UsecaseAdapter {

    public static final String USER_ID = "userId";
    public static final String PASSWORD = "password";

    UserDTO getUser(String userId, String password);
}

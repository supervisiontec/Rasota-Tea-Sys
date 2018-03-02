
package com.mycompany.main_rest.zexception;

import com.mycompany.main_rest.zexception.handler.SystemErrorResponse;
import com.mycompany.main_rest.zexception.handler.SystemException;

/**
 *
 * @author Mohan
 */
@SystemErrorResponse(4001)
public class EntityNotFoundException extends SystemException {

    public EntityNotFoundException(String message) {
        super(message);
    }

}

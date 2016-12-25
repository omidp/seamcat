package org.omidbiz.seamcat;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityController;

@Name("authenticator")
@Scope(ScopeType.EVENT)
public class Authenticator extends EntityController
{

    
    public boolean authenticate()
    {
        return false;
    }
    
}

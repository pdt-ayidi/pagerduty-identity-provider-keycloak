package com.arthuryidi.provider;

import org.keycloak.broker.oidc.mappers.AbstractJsonUserAttributeMapper;

public class PagerDutyUserAttributeMapper extends AbstractJsonUserAttributeMapper {

    private static final String[] cp = new String[] { PagerDutyIdentityProviderFactory.PROVIDER_ID };

    @Override
    public String[] getCompatibleProviders() {
        return cp;
    }

    @Override
    public String getId() {
        return "pagerduty-user-attribute-mapper";
    }
}

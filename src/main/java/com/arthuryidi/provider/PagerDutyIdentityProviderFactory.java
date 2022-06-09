package com.arthuryidi.provider;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

public class PagerDutyIdentityProviderFactory extends AbstractIdentityProviderFactory<PagerDutyIdentityProvider> implements SocialIdentityProviderFactory<PagerDutyIdentityProvider> {
    public static  final String PROVIDER_ID = "pagerduty";

    @Override
    public String getName() {
        return "PagerDuty";
    }

    @Override
    public PagerDutyIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new PagerDutyIdentityProvider(session, new OAuth2IdentityProviderConfig(model));
    }

    @Override
    public IdentityProviderModel createConfig() {
        return new OAuth2IdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}

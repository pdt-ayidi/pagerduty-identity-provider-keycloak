# PagerDuty Social Identity Provider for Keycloak

Adds the ability to "Sign in with PagerDuty."

## Installation

- Download the latest release in [Maven](https://search.maven.org/search?q=g:com.arthuryidi.provider) or [GitHub](https://github.com/pdt-ayidi/pagerduty-identity-provider-keycloak/releases/latest).
- Install the plugin by copying the JAR file to `/opt/keycloak/providers/`. [See Server Developer Guide.](https://www.keycloak.org/docs/latest/server_development/index.html#deploy-the-script-jar)

### Build Setup Advice

Use one of the following endpoints to download the JAR plugin in your CI/Build:
- `https://search.maven.org/remotecontent?filepath=com/arthuryidi/provider/pagerduty-identity-provider-keycloak/<version>/pagerduty-identity-provider-keycloak-<version>.jar`
- `https://github.com/pdt-ayidi/pagerduty-identity-provider-keycloak/releases/download/v<version>/pagerduty-identity-provider-<version>.jar`

If you are using Keycloak's Docker distribution, modify the Dockerfile and use the `ADD` command to download the plugin:

```
ADD --chown=keycloak <https://...jar> /opt/keycloak/providers/
```

---

### Development

#### Publishing

```
./gradlew signMavenPublication 
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```
[View Staging Logs](https://s01.oss.sonatype.org/#stagingRepositories)

---

_Project not sponsored by PagerDuty._

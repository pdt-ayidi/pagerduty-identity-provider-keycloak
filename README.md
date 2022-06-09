# PagerDuty Social Identity Provider for Keycloak

Adds the ability to "Sign in with PagerDuty".

## Installation

- Download the latest release in [Maven](https://search.maven.org/search?q=g:com.arthuryidi.provider) or [GitHub](https://github.com/pdt-ayidi/pagerduty-identity-provider-keycloak/releases/latest).
- Install the plugin by copying the JAR file to `/opt/keycloak/providers/`. [See Server Developer Guide.](https://www.keycloak.org/docs/latest/server_development/index.html#deploy-the-script-jar)

### Hint

Use one of the following endpoints to download the JAR plugin in your CI/Build:

```shell
https://search.maven.org/remotecontent?filepath=com/arthuryidi/provider/pagerduty-identity-provider-keycloak/<version>/pagerduty-identity-provider-keycloak-<version>.jar

https://github.com/pdt-ayidi/pagerduty-identity-provider-keycloak/releases/download/v<version>/pagerduty-identity-provider-<version>.jar
```

If you are using Keycloak's Docker distrubtion, modify the Dockerfile and use the `ADD` command to download the plugin:

```
ADD <https://...jar> /opt/keycloak/providers/
```

_Project not sponsored by PagerDuty._

---

### Development

#### Publishing

```
./gradlew signMavenPublication 
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```
[View Staging Logs](https://s01.oss.sonatype.org/#stagingRepositories)



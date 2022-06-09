# PagerDuty Social Identity Provider for Keycloak

Adds the ability to "Sign in with PagerDuty".

## Installation

- Download the latest release in [maven](https://search.maven.org/search?q=g:com.arthuryidi.provider) or [GitHub](https://github.com/pdt-ayidi/pagerduty-identity-provider-keycloak/releases/latest).
- Install the provider JAR by copying it to `/opt/keycloak/providers/`. [See Server Developer Guide.](https://www.keycloak.org/docs/latest/server_development/index.html#deploy-the-script-jar)

_Project not sponsored by PagerDuty._

---

### Development

#### Publishing

```
./gradlew signMavenPublication 
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```
[View Staging Logs](https://s01.oss.sonatype.org/#stagingRepositories)



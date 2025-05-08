# Template

This project is based on https://github.com/capralifecycle/liflig-baseline-archetypes/tree/master/rest-service-baseline-archetype.
Compare this to your project from time to time, to include any upstream improvements.

This project was generated using:

```shell
mvn archetype:generate -DarchetypeCatalog=local \
  -DarchetypeGroupId=no.liflig -DarchetypeArtifactId=lambda-baseline-archetype -DarchetypeVersion=RELEASE \
  -DgroupId=no.cargonet -DartifactId=cnops-hitrail-integration -Dversion=1.0.0 -Dpackage=no.cargonet.hitrail.integration \
  -DgitRepoName=cnops-hitrail-integration \
  -DsonarProjectKey=capralifecycle_todo \
  "-DbuildFailureSlackChannel=#TODO" \
  -DapplicationNameForS3Key=cnops-hitrail-integration \
  -DawsBuildAccountNumber=590183946679 \
  -DawsCustomerName=cargonet \
  -DotelNamespace=${otelNamespace} \
  -DjavaJdkVersion=21
```

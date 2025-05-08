# Cnops Hitrail Integration

<!-- Keep/add/modify the badges you want -->
![Java Badge](https://img.shields.io/badge/java-21-blue?logo=java)
![Kotlin Badge](https://img.shields.io/badge/kotlin--blue?logo=kotlin)
[![Build Status](https://github.com/capralifecycle/cnops-hitrail-integration/actions/workflows/ci.yaml/badge.svg)](https://github.com/capralifecycle/cnops-hitrail-integration/actions/workflows/ci.yaml)


Responsible for &lt;REPLACE ME: processing SQS messages, a daily CRON job, etc.>

## Documentation

<!-- Optional links to other pages -->
More information is found here:

<!-- Add links that suits your project. These are just exammples: -->

- [Main confluence page](https://liflig.atlassian.net/wiki/${awsCustomerName}/${cdkAppVersionVariable})
- [API Docs]()

## Contributing

<!-- If this section gets long, you can use a CONTRIBUTING.md file and link to it here instead. -->

### Getting started

#### Tool dependencies

You need to install:

- Maven (or run maven through IntelliJ)
- JDK  21
  - `brew tap homebrew/cask-versions` and then`brew install --cask temurin21`


### Running tests

```shell
mvn verify
```

### Deploying

Push the master branch.
You can track the progress in [GitHub Actions](https://github.com/capralifecycle/cnops-hitrail-integration/actions/workflows/ci.yaml)
and in the [AWS CodePipeline](https://eu-west-1.console.aws.amazon.com/codesuite/codepipeline/pipelines/cargonet-apps-prod/view?region=eu-west-1)
(`cargonet-build-admin`).

## License

> Copyright 2025 Liflig AS.
> Private project. No reuse allowed.

**Or (pick one)**

```text
Copyright 2025 Liflig AS

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

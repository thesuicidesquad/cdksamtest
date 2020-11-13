# How to deploy this Serverless Application?
This application consists of AWS Lambda Functions and related AWS resources including VPC/Nat Gateway/API Gateway etc.. need AWS CLI, AWS CDK and AWS SAM to deploy.

## Install AWS CLI (AWS Command Line Interface)
- Follow this [link](https://docs.aws.amazon.com/cli/latest/userguide/install-cliv2.html) to install AWS CLI on a Linux/MacOS/Windows workstation, you will issue commands to AWS from this workstation to setup various resources and workloads.

- Configure the credentials used in AWS CLI by this [guide](https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-quickstart.html#cli-configure-quickstart-config).

## Install AWS CDK (Cloud Development Kit)
Make sure the workstation has nodejs/npm installed, also with java JDK 8+ and maven 3.5+ installed. Then run the following in command shell to install AWS CDK
```
npm install -g aws-cdk
```
Run the following command to verify correct installation and print the version number of the AWS CDK.
```
cdk --version
```
## Install AWS SAM CLI (Serverless Application Model)
Please follow this [link](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html) to install.

## Deploy the Serverless Application to AWS
1. git clone this repo to your workstation in command shell, cd to this project directory.
2. Run maven to init/package the project:
   ```
   mvn package
   ```
3. Generate Cloudformation template yaml from CDK:
   ```
   cdk synth > template.yaml
   ```
4. Build the project using AWS SAM:
   ```
   sam build
   ```
5. Deploy the application to AWS:
   ```
   sam deploy -g
   ```
   - **Stack Name** just input a name you like for this stack
   - **AWS Region** input a AWS region you would like this stack/application deploy to, for example Hong Kong region is ***ap-east-1***
   - Input **y** for all other options

   Wait for the stack to deploy, let's goto your AWS Console --> Cloudformation, click the stack that is running to monitor the deployment status. When status is completed.


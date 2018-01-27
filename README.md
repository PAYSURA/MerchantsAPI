# MerchantsAPI

## How to install
- Install Java8
- Install Maven 3.6.0
- maven shade plugin is neccessary for creating a .jar file for AWS Lambda Deployment
- AWS Command Line Interface

## How to test
- Run `mvn test`. Tests will be written with Mockito framework together with Google Guice.


## How to locally test it with Serverless Application Model ( SAM ) local
- for local testing Serverless Application Model from Amazon webservices is recommended.

- install Docker
- install SAM local
https://github.com/awslabs/aws-sam-local#installation

Create a .jar file with `mvn package shade:shade ` 

- Set the path to your shaded  .jar file in your sam local [template.yaml](./serverless.yaml) file at `CodeUri`.


- Run `sam local invoke --event {event}` 
- with SAM local different events are possible.

## How to deploy

 Run `sam deploy --template-file template.yaml --stack-name {Paysura-Merchants-Service} --profile paysura-deployment-autotest --region eu-central-1`

## Amazon Webservices Command Line Interface - AWS CLI
This command will upload your .jar file into a s3 bucket and generate a cloudformation file from your template file.
Run `aws cloudformation package --template-file template.yaml  --output-template-file merchantsService.yaml  --s3-bucket merchants-service-deployment --force-upload --region eu-central-1 --profile paysura-development`

After packaging deploy your package into your stack.
Run `aws cloudformation deploy --template-file merchantsService.yaml --stack-name Paysura-Merchants-Service --region eu-central-1 --profile paysura-development --capabilities CAPABILITY_IAM`


```

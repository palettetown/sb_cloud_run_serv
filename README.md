# sb_cloud_run_serv
spring boot cloud run service

Setup:
    1. Run Trigger for cloudbuild.yaml to build image in artifact registry
    2. Run another Trigger for resourcebuild.yaml to create Cloud Run Service referecing this image

Test:

    <Console Cloud Shell>
    kasinyee01@cloudshell:~ (august-water-417802)$ curl -H "Authorization: Bearer $(gcloud auth print-identity-token)" https://cloudrun-srv-u7t73bxk3a-uc.a.run.app/welcome
    welcome to my appkasinyee01@cloudshell:~ (august-water-417802)$ 

    <locally>
    docker image build -t springbootrestapi-image:latest .
    docker run -p 8080:8080 springbootrestapi-image:latest


This repo has sample springboot microservices which will give basic understanding of microservice architecture 

![architecture](https://user-images.githubusercontent.com/126108247/221373669-2332238a-2b45-4e1d-b9fc-748c025b0f5a.PNG)


1) Department service -- will be used to save and get departments
2) User service -- will be used to save and get users
3) Service-registry -- Here all the service will be registered in eureka service registry. So, service to service communcation will be easier with out remembering the on which port service is running
4) config-server -- Which will get the configuration from the cloud (in this case it will get from gitHubRepo https://github.com/RameshKorva/config-server)
5) cloud-gateway -- Which will act like a router, all external calls will goto cloud-gateway and it will transfer the calls to specifi service based on url path

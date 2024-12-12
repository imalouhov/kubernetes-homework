mvn clean package  
docker build -t imalouhov/kubernetes-homework:0.0.1 .  
docker image ls  
docker run -d -p 8080:8080 imalouhov/kubernetes-homework:0.0.1  
curl http://localhost:8080/health  
docker ps  
docker push imalouhov/kubernetes-homework:0.0.1  
docker stop $(docker ps -a -q)  
docker system prune -a --volumes  

Run Windows PowerShell as Administrator:  
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All  
minikube start --vm-driver hyperv # --force  
minikube addons enable ingress  

kubectl create namespace homework
kubectl apply -f . -n=homework
kubectl delete -f . -n=homework

ipconfig /flushdns
ipconfig /displaydns | clip
minikube service kubernetes-service

kubectl apply -f deployment.yml  
kubectl get deployments
kubectl get pod  

kubectl apply -f service.yml  
kubectl get service

kubectl get nodes -o wide  

kubectl apply -f ingress.yml   

curl http://arch.homework:80/health   

minikube ip  

curl http://172.17.237.152:80/health/  

kubectl describe service kubernetes-homework

kubectl delete ingress --all  
kubectl delete service --all  
kubectl delete deploy --all  
minikube stop
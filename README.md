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

kubectl apply -f deployment.yml  
kubectl get deployments  
NAME                  READY   UP-TO-DATE   AVAILABLE   AGE  
kubernetes-homework   1/1     1            1           13s  

kubectl get pod  
NAME                                   READY   STATUS    RESTARTS   AGE  
kubernetes-homework-7668f8bd44-44qjl   1/1     Running   0          26s  

kubectl apply -f service.yml  
kubectl get service  
NAME                 TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE  
kubernetes           ClusterIP   10.96.0.1       <none>        443/TCP          83s  
kubernetes-service   NodePort    10.105.65.121   <none>        8080:30000/TCP   6s  

kubectl get nodes -o wide  
NAME       STATUS   ROLES    AGE   VERSION   INTERNAL-IP     EXTERNAL-IP   OS-IMAGE              KERNEL-VERSION   CONTAINER-RUNTIME  
minikube   Ready    <none>   37m   v1.31.0   172.21.197.44   <none>        Buildroot 2023.02.9   5.10.207         docker://27.2.0  

kubectl apply -f ingress.yml  
NAME                 CLASS   HOSTS           ADDRESS   PORTS   AGE  
kubernetes-ingress   nginx   arch.homework             80      8s  

curl http://arch.homework:80/health  
curl : Unable to connect to the remote server  
At line:1 char:1  
+ curl http://arch.homework:80/health  
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
    + CategoryInfo          : InvalidOperation: (System.Net.HttpWebRequest:HttpWebRequest) [Invoke-WebRequest], WebException  
    + FullyQualifiedErrorId : WebCmdletWebResponseException,Microsoft.PowerShell.Commands.InvokeWebRequestCommand  

minikube ip  
172.21.197.44  
curl http://172.21.197.44:80/health/  
curl : Unable to connect to the remote server  
At line:1 char:1  
+ curl http://172.21.197.44:80/health/  
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
    + CategoryInfo          : InvalidOperation: (System.Net.HttpWebRequest:HttpWebRequest) [Invoke-WebRequest], WebException  
    + FullyQualifiedErrorId : WebCmdletWebResponseException,Microsoft.PowerShell.Commands.InvokeWebRequestCommand  


kubectl delete ingress --all  
kubectl delete service --all  
kubectl delete deploy --all  
minikube stop  


kubectl logs kubernetes-homework-deployment-7d85b8864c-ktjks  
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission  
curl http://localhost:8080/actuator/health  
curl http://localhost:8080/v3/api-docs  
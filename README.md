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
172.17.232.155  
curl http://172.17.232.155:80/health/  

kubectl describe service kubernetes-homework

kubectl delete ingress --all  
kubectl delete service --all  
kubectl delete deploy --all  
minikube stop  


minikube delete --all --purge
kubectl logs kubernetes-homework-7d85b8864c-kcg77 
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission  
curl http://localhost:8080/actuator/health  
curl http://localhost:8080/v3/api-docs

PS C:\Users\pusto\Documents\java projects\kubernetes-homework\manifests> kubectl get service
NAME                  TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE
kubernetes            ClusterIP   10.96.0.1        <none>        443/TCP          114s
kubernetes-homework   NodePort    10.103.202.215   <none>        8080:30000/TCP   88s
PS C:\Users\pusto\Documents\java projects\kubernetes-homework\manifests> minikube service kubernetes-homework
|-----------|---------------------|-------------|-----------------------------|
| NAMESPACE |        NAME         | TARGET PORT |             URL             |
|-----------|---------------------|-------------|-----------------------------|
| default   | kubernetes-homework |        8080 | http://172.17.232.155:30000 |
|-----------|---------------------|-------------|-----------------------------|

❌  Exiting due to SVC_UNREACHABLE: service not available: no running pod for service kubernetes-homework found

╭───────────────────────────────────────────────────────────────────────────────────────────────────────────╮
│                                                                                                           │
│    😿  If the above advice does not help, please let us know:                                             │
│    👉  https://github.com/kubernetes/minikube/issues/new/choose                                           │
│                                                                                                           │
│    Please run `minikube logs --file=logs.txt` and attach logs.txt to the GitHub issue.                    │
│    Please also attach the following file to the GitHub issue:                                             │
│    - C:\Users\pusto\AppData\Local\Temp\minikube_service_66e1fe5394effddea239e5945616811750aef126_0.log    │
│                                                                                                           │
╰───────────────────────────────────────────────────────────────────────────────────────────────────────────╯

PS C:\Users\pusto\Documents\java projects\kubernetes-homework\manifests> kubectl get svc -n ingress-nginx
NAME                                 TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)                      AGE
ingress-nginx-controller             NodePort    10.103.100.64   <none>        80:31324/TCP,443:32052/TCP   2d21h
ingress-nginx-controller-admission   ClusterIP   10.105.160.29   <none>        443/TCP                      2d21h


PS C:\Users\pusto\Documents\java projects\kubernetes-homework\manifests> kubectl get pods -n kube-system
NAME                               READY   STATUS    RESTARTS        AGE
coredns-6f6b679f8f-8mxmd           1/1     Running   3 (9m ago)      2d21h
etcd-minikube                      1/1     Running   1 (9m5s ago)    2d7h
kube-apiserver-minikube            1/1     Running   1 (8m54s ago)   2d7h
kube-controller-manager-minikube   1/1     Running   3 (9m5s ago)    2d21h
kube-proxy-w85qh                   1/1     Running   3 (9m4s ago)    2d21h
kube-scheduler-minikube            1/1     Running   3 (9m5s ago)    2d21h
storage-provisioner                1/1     Running   5 (9m5s ago)    2d21h



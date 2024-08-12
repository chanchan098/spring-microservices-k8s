kubectl delete -f ../k8s/rbac-cluster-role.yaml -n default

kubectl delete -f ../k8s/mongodb-deployment.yaml -n mongo
kubectl delete -f ../k8s/mongodb-configmap.yaml -n mongo
kubectl delete -f ../k8s/mongodb-secret.yaml -n mongo

kubectl delete -f ../k8s/department-configmap.yaml -n department
kubectl delete -f ../k8s/department-secret.yaml -n department
kubectl delete -f ../k8s/department-deployment.yaml -n department


kubectl delete -f ../k8s/gateway-configmap.yaml -n gateway
kubectl delete -f ../k8s/gateway-deployment.yaml -n gateway


kubectl delete -f ../k8s/employee-configmap.yaml -n employee
kubectl delete -f ../k8s/employee-secret.yaml -n employee
kubectl delete -f ../k8s/employee-deployment.yaml -n employee


kubectl delete -f ../k8s/organization-configmap.yaml -n organization
kubectl delete -f ../k8s/organization-secret.yaml -n organization
kubectl delete -f ../k8s/organization-deployment.yaml -n organization

kubectl delete -f ../k8s/ingress.yaml
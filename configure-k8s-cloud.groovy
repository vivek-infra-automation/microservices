import jenkins.model.*
import org.csanchez.jenkins.plugins.kubernetes.*

def jenkins = Jenkins.getInstance()

def kubernetesCloud = new KubernetesCloud("kubernetes")
kubernetesCloud.setServerUrl("https://kubernetes.default.svc.cluster.local")
kubernetesCloud.setNamespace("jenkins")
kubernetesCloud.setJenkinsUrl("http://jenkins.jenkins.svc.cluster.local:80")
kubernetesCloud.setJenkinsTunnel("jenkins.jenkins.svc.cluster.local:50000")
kubernetesCloud.setSkipTlsVerify(true)

jenkins.clouds.add(kubernetesCloud)
jenkins.save()

println "Kubernetes cloud configured successfully"
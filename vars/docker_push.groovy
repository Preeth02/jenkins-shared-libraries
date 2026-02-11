def call(String projectName, String imageTag){
   withCredentials([usernamePassword(credentialsId: 'dockerhubCred', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                sh "docker login -u ${env.USERNAME} -p ${env.PASSWORD}"
                sh "docker image tag notes-app:latest ${env.USERNAME}/notes-app:latest"
                sh "docker push ${env.USERNAME}/${projectName}:${imageTag}"
}

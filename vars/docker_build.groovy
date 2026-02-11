def call(String projectName,String dockerHubUser,String imageTag){ 
echo 'This is a build stage'
sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}

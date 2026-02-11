def call(String url,String branch){
    echo 'Code cloning has been started'
    git url:"${url}", branch:"${branch}"
    echo 'Code cloning successful'
                
}

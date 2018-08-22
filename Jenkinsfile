node {
  
  stage('checkout') {
        //Using the Pretested integration plugin to checkout out any branch in the ready namespace
        checkout(
            [$class: 'GitSCM', 
            branches: [[name: '*/ready/**']], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [[$class: 'CleanBeforeCheckout'], 
            pretestedIntegration(gitIntegrationStrategy: squash(), 
            integrationBranch: 'master', 
            repoName: 'origin')], 
            submoduleCfg: [], 
            userRemoteConfigs: [[credentialsId: 'a7bafce7-ca72-4b42-b6f4-a454977b7731', //remember to change credentials and url.
            url: 'git@github.com:thevinge/jenkins-workshop.git']]])
    }
   
   stage('Clean Build'){
        sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn clean package'
   }
   
   stage('Test'){
       sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn test'
   }
   

  // stage('Archive'){
  //     sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn site'
//       archiveArtifacts artifacts: 'target/apidocs/*', onlyIfSuccessful: true
 //      archiveArtifacts artifacts: 'target/site/*', onlyIfSuccessful: true
 //      archiveArtifacts artifacts: 'target/gildedrose-*.jar', onlyIfSuccessful: true
 //  }

    stage('publish'){
        //This publishes the commit if the tests have run without errors
        pretestedIntegrationPublisher()
    }

}
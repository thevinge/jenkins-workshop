node {
  
   stage('Repo Clone'){
       checkout scm
   }
   
   stage('Clean Build'){
        sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn clean package'
   }
   
   stage('Test'){
       sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn test'
   }
   
   stage('Archive '){
       sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn site'
       archiveArtifacts artifacts: 'target/apidocs/*', onlyIfSuccessful: true
       archiveArtifacts artifacts: 'target/site/*', onlyIfSuccessful: true
       archiveArtifacts artifacts: 'target/gildedrose-*.jar', onlyIfSuccessful: true
   }
}
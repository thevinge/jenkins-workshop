node {
  
   stage('Repo Clone'){
       git branch: 'master', credentialsId: 'a7bafce7-ca72-4b42-b6f4-a454977b7731', url: 'git@github.com:thevinge/jenkins-workshop.git'
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
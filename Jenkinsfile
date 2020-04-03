pipeline{
   agent any
   stages{
     stage("development"){
       steps{
         git credentialsId: 'bendevet-demo-jenkins', url: 'https://github.com/Bendevet/jenkinsDemo.git'
       }
     }
     stage('build') {
            steps {
                mvnHome = tool name: 'maven@3.6', type: 'maven'
                sh "${mvnHome}/bin/mvn clean package"
            }
        }
   }
}

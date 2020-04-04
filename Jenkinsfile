pipeline{
   agent any
   environment {
    mvnHome = tool name: 'myMaven', type: 'maven'
   }
   stages{
      //stage("init"){
        // steps{
          //  def dockerHome = tool 'myDocker'
          // def mavenHome  = tool 'myMaven'
          // env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
        // }
      //}
     stage("development"){
       steps{
        git credentialsId: 'bendevet', url: 'https://github.com/Bendevet/jenkinsDemo.git'
       }
     }
     stage('build') {
            steps {
               sh "${mvnHome}/bin/mvn clean package"
            }
        }
   }
}

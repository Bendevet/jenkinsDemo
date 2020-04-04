pipeline{
   agent any
   //environment {
    //mvnHome = tool name: 'maven@3.6', type: 'maven'
   //}
   stages{
      stage("init"){
         def dockerHome = tool 'myDocker'
         def mavenHome  = tool 'myMaven'
         env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
      }
     stage("development"){
       steps{
        git credentialsId: 'bendevet', url: 'https://github.com/Bendevet/jenkinsDemo.git'
       }
     }
     stage('build') {
            steps {
                sh "mvn clean package"
            }
        }
   }
}

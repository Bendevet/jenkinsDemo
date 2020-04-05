pipeline{
   agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
  // environment {
   // mvnHome = tool name: 'myMaven', type: 'maven'
  // }
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
               sh "mvn clean package"
            }
        }
   }
}

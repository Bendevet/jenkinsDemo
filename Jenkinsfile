pipeline{
   agent any
   //environment {
    //mvnHome = tool name: 'maven@3.6', type: 'maven'
   //}
   stages{
     stage("development"){
       steps{
        git credentialsId: 'bendevet-demo-jenkins', url: 'https://github.com/Bendevet/jenkinsDemo.git'
       }
     }
     stage('build') {
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }
   }
}

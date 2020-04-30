pipeline{
   agent any
   //agent {
       // docker {
         //   image 'maven:3-alpine'
        //    args '-v /root/.m2:/root/.m2'
      //  }
   // }
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
       when { branch 'master' }
            agent {
                 docker {
                 image 'maven:3-alpine' 
                 args '-v /root/.m2:/root/.m2' 
               }
            }
            steps {
               sh "mvn clean package"
               //sh "docker build -t bendevetJenkins:v1 -f Dockerfile ./"
               echo "image built successfully"
              
               }
              
            }
        }
   }

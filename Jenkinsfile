pipeline {
  agent any
  environment{
    NEW_VERSION = '1.0.0'
    // SERVER_CREDENTIALS = credentials('SERVER-CRED')
  }
  tools{
    maven 'maven'
  }
  stages {
    stage("test") {
      steps {
        echo 'Testing the application'
        echo "Testing Version: ${NEW_VERSION}"
        sh "maven test"
      }
    }
    stage("deploy"){
      steps{
        echo 'Deploying the application'
        //withCredentials([
         // usernamePassword(credentials: 'SERVER-CRED', usernameVariable: USER, passwordVariable: PWD)]){
         // sh "USER: ${USER} Password: ${PWD}"
        //}
      }
    }
  }
}

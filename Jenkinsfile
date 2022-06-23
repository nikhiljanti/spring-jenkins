pipeline {
  agent any
  environment{
    NEW_VERSION = '1.0.0'
    // SERVER_CREDENTIALS = credentials('SERVER-CRED')
  }
  stages {
    stage("test") {
      steps {
        echo 'Testing the application'
        echo "Testing Version: ${NEW_VERSION}"
      }
    }
    stage("deploy"){
      steps{
        echo 'Deploying the application'
        //echo "Credentials: ${SERVER_CREDENTIALS}"
        // Using Groovy wrapper syntax
        withCredentials([usernamePassword: 'SERVER-CRED', usernameVariable: USER, passwordVariable: PWD]){
          sh "USER: ${USER} PASSWORD: ${PWD}"
        }
      }
    }
  }
}

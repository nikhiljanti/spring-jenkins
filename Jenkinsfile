pipeline {
  agent any
  environment{
    NEW_VERSION = '1.0.0'
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
      }
    }
  }
}

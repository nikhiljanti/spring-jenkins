pipeline {
  agent any
  environment{
    NEW_VERSION = '1.0.0'
//     SERVER_CREDENTIALS = credentials('SERVER-CRED')
  }
  tools{
    maven 'maven'
  }
  parameters{
//     choice(name: 'VERSION', choices: ['1.0.0', '1.0.1', '1.0.2'], description: '' )
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  stages {
    stage("test") {
//        when{
//           expression{
//             params.executeTests
//           }
//         }
      steps {
        echo 'Testing the application'
        echo "Version: ${NEW_VERSION}"
//         echo "Testing Version: ${VERSION}"
        sh "mvn test"
      }
    }
    stage("deploy"){
      steps{
        echo 'Deploying the application'
//         withCredentials([
//          usernamePassword(credentials: 'SERVER-CRED', usernameVariable: USER, passwordVariable: PWD)]){
//          sh "USER: ${USER} Password: ${PWD}"
//         }
        sh "mvn clean"
        sh "mvn build"
      }
    }
  }
}

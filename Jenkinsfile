pipeline {
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean test-compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn clean test'
      }
    }
  }
  
  tools {
    jdk 'jdk-12'
    maven 'maven'
  }
}

pipeline {
    agent any

    tools {
        jdk 'jdk-12'
    }

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
}

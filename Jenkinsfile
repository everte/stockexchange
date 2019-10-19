pipeline {
    agent any

    tools {
        jdk 'jdk-12'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean test-compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}

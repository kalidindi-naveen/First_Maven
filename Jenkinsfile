pipeline {
    agent {
        node {
            label 'maven'
        }
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: 'github-tkn', url: 'https://github.com/kalidindi-naveen/First_Maven.git'
            }
        }
        stage('Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
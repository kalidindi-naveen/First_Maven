pipeline {
    agent {
        node {
            label 'maven'
        }
    }
    environment {
        PATH="/opt/maven/bin:$PATH"
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        // No Need this if we use Poll SCM (it will automatically clone code)
        // stage('Git Clone') {
        //    steps {
        //        git branch: 'main', credentialsId: 'github-tkn', url: 'https://github.com/kalidindi-naveen/First_Maven.git'
        //    }
        // }

        stage('Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Static code analysis: Sonarqube') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'sonar-tkn', variable: 'SONAR_TOKEN')]){
                        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://3.89.81.238:9000/ -Dsonar.login=${SONAR_TOKEN}'
                    }
                }
            }
        }
    }
}
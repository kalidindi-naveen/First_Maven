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
        // No Need this if we use Poll SCM (it will automatically clone code)
        // stage('Git Clone') {
        //    steps {
        //        git branch: 'main', credentialsId: 'github-tkn', url: 'https://github.com/kalidindi-naveen/First_Maven.git'
        //    }
        // }
        stage('Maven') {
            steps {
                sh '/opt/maven/bin/mvn clean install'
            }
        }
    }
}
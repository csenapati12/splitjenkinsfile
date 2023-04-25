// Jenkinsfile-part1.groovy
pipeline {
    agent any
    stages {
        stage('Stage 1') {
            steps {
               echo "stage1"
            }
        }
        stage('Stage 2') {
            steps {
                 echo "stage2"
            }
        }
    }
}

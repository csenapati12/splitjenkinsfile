pipeline {
    agent any
    stages {
        stage('Part 1') {
            steps {
                load 'jenkinsfile1.groovy' // Load contents of Jenkinsfile-part1.groovy
            }
        }
        stage('Part 2') {
            steps {
                load 'jenkinsfile2.groovy' // Load contents of Jenkinsfile-part2.groovy
            }
        }
    }
}

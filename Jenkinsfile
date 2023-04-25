pipeline{
agent any
stages{
stage("call"){
steps{
def jenkinsfile1 = load 'jenkinsfile1.groovy'
def jenkinsfile2 = load 'jenkinsfile2.groovy'

// Call Jenkinsfile1 as a closure
jenkinsfile1.call()
jenkinsfile2.call()
}}
}

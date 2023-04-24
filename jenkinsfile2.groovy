pipeline{
agent any
stages {
    stage('Stage 3') {
        steps {
             script{
			   echo "stage2"
			   }
        }
    }
    stage('Stage 4') {
        steps {
             script{
			   echo "stage4"
			   }
        }
    }
  }
}

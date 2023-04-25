
        stage('Stage 1') {
            steps {
               script{
			   echo "stage1"
			   }
            }
        }
        stage('Stage 2') {
            steps {
               script{
			   echo "stage2"
			   }
            }
        }
    

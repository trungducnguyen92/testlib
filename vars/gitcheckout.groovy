def call(string myurl) {
    pipeline {
      agent master
      stages {
        stage('Checkoutgit') {
          steps {
		  echo "The build number is even ${myurl}"
          }
        }
      }
    }

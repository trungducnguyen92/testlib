def call(String mygiturl = 'https://github.com/trungducnguyen92/Test_repo.git'){
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
	    echo "Your repo url is: ${mygiturl}"
	    ls -a
        }
      }
    }
  }
}

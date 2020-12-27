def call(String mygiturl = 'https://github.com/trungducnguyen92/Test_repo.git'){
  pipeline {
    agent any
    stages {
      stage('Echo url) {
        steps {
          echo "Your repo url is: ${mygiturl}"
        }
      }
    }
  }
}

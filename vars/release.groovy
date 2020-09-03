def call(release, scm) {

    checkout scm

    def scmVars = [:]

    
    dir('testlib') {

        def repoScmVars = checkout([
            $class: 'GitSCM',
            branches: [[name: gitRef]], 
            browser: [$class: 'GithubWeb', repoUrl: 'https://github.com/canhnp/testlib.git'],
            extensions: [
                [$class: 'CleanBeforeCheckout'],
               
        ])
        scmVars.put('testlib', repoScmVars)
    }
}

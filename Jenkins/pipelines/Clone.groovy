pipeline {
    agent {
        docker {
            image 'python'
        }
    }
    stages {
        stage('Do job stage') {
            steps {
                git branch: 'main', url: 'https://github.com/tomoNakami/continuous-integration.git'
            }
        }
    }
}
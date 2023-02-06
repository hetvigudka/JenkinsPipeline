pipeline {
    agent any

    stages {
        stage('Code') {
            steps {
                echo 'Coding'
            }
        }
        stage('Build') {
            steps {
                echo 'Building'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Release') {
            steps {
                echo 'Released'
            }
        }
    }
}

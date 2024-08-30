def call(){
    sh 'clean package sonar:sonar -DargLine="--add-opens java.base/java.lang=ALL-UNNAMED
'
}
def call(Map stageParams){
    checkout([
        $class: 'GitSCN',
        branches: [[name: stageParams.branch ]],
        userRemoteConfigs: [[ urls: stageParams.url]]
    ])
}
repoNames = ("vagrant-snapshot")
artifactory('art1') {
  security{
  permissions {
 permission('vagrantSnapshotPerm') {
          anyLocal true
          anyRemote false
          anyDistribution false
          repositories (repoNames)
          groups {
            'vagrant-devs' (['delete', 'deploy', 'annotate', 'read'])
          }
 }
  }
}
}
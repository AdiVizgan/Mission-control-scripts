repoNames = ("vagrant-snapshot")
artifactory('art1') {
  security{
  permissions {
 permission('vagrantSnapshotPerm') {
          anyLocal false
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
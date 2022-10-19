node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/patchport.git'), string(name: 'PORT_DESCRIPTION', value: 'Patch takes a patch file containing a difference listing produced by the diff program and applies those differences to one or more original files, producing patched versions.' )]
  }
}

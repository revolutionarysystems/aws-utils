module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    subgrunt: {
        options: {
          limit:1
        },
        deploy: {
          'kinesis-js':'deploy',
        },
        ci: {
          'kinesis-js':'ci',
        }
      },
  });

  grunt.loadNpmTasks('grunt-subgrunt');

  // Tasks
  grunt.registerTask('deploy', ['subgrunt:deploy']);
  
  grunt.registerTask('ci', ['subgrunt:ci']);

  // Default task(s).
  grunt.registerTask('default', ['deploy']);

};
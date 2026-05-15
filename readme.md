# Kotlin Scripts

A simple setup to quickly test kotlin code snippets, without the need of a full project. There are
probably many ways to do this, but this works nicely enough, and intelij will even add the play
button at the top of your script, in case you are really lazy with the terminal.

## Setup for macos

1) `brew install kotlin`
   PS: If you are in a company that cannot use openjdk, let brew do its thing and then just remove
   openjdk. Scripts will build fine with other jdks.

2) Create a script file with name {$scriptName}.main.kts

3) Add kotlin shebang `#!/usr/bin/env kotlin` at the start of your script

4) Write your script

5) Make the script executable with command `chmod +x {$scriptName}.main.kts`

6) execute with `./{$scriptName}.main.kts`

TODO:
- Try out some scripts with non-core dependencies


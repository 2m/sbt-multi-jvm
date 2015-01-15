PLUGIN MOVED TO sbt/sbt-multi-jvm
=================================
In an effort to centralise all plugins under the [sbt](https://github.com/sbt) organisation on github, 
this plugin has moved to: 

**https://github.com/sbt/sbt-multi-jvm**

Where it will remain to be developed under the same terms and licenses as it was developed here.
Please report all issues and pull requests to that repository.

sbt-multi-jvm
-------------

An [sbt] plugin for running scalatest tests in multiple JVMs. This plugin
requires sbt 0.12.x

[sbt]: http://www.scala-sbt.org


Add plugin
----------

To use the plugin in a project add the following to `project/plugins.sbt`:

    addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.9")


More information
----------------

For more information about using sbt-multi-jvm see the
[akka documentation][akka-docs].

[akka-docs]: http://akka.io/docs/akka/snapshot/dev/multi-jvm-testing.html

License
-------
Copyright 2012 Typesafe, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

Pixijs API for Scala.js
===============================

CLONED FROM https://github.com/scalajs-io/pixijs
Moving to version 7.3 of PixiJS

[pixijs](http://pixijs.download/release/docs/index.html) - Super fast HTML 5 2D rendering engine that uses webGL with canvas fallback

### Description

The aim of this project is to provide a fast lightweight 2D library that works across all devices. 
The Pixi renderer allows everyone to enjoy the power of hardware acceleration without prior knowledge of WebGL. 
Also, it's fast. Really fast.

### Build Requirements

* [SBT v1.9.x](http://www.scala-sbt.org/download.html)


### Running the tests

Before running the tests the first time, you must ensure the npm packages are installed:

```bash
$ npm install
```

Then you can run the tests:

```bash
$ sbt test
```

### Artifacts and Resolvers

To add the `Pixijs` binding to your project, add the following to your build.sbt:  

```sbt
libraryDependencies += "io.scalajs.npm" %%% "pixijs" % "0.7.3"
```

Optionally, you may add the Sonatype Repository resolver:

```sbt   
resolvers += Resolver.sonatypeRepo("releases") 
```

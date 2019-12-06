# PafZoo
This is a simple Java console project(Maven) for developer test assignment of PAF.
 
#### Usage
**build**
 ```shell script
mvn clean package
```
After build, a jar file --`PafZoo-1.0-SNAPSHOT.jar` will be generated under target folder.

**start**

```shell script
java -cp target/PafZoo-1.0-SNAPSHOT.jar com.paf.zoo.Main
```

After the program starts, a usage instruction will be shown by default. The program
supports 4 types of command: `display`, `live`, `help` and `exit`.

```shell script
-------------- Help/Usage ---------------
Commands in the zoo system:
display		Show current status of all animals in zoo
live		Live one day in zoo, all changes in zoo will be displayed
help		Show help information of command usage
exit		Exit system
```

#### Important aspects
1. Friendship actions(build/break) of different animals should occur in parallel;
2. Command design pattern makes the program extendable;
3. If A and B are already friends, they couldn't establish friendship again;
4. Animal couldn't build friendship with itself;

#### questions
* If package Mockito is allowed to use, some unit tests of `Command` implementation could be added
* Could two animals have the same name? I assume `Yes`, two animals with with exactly the same 
properties shouldn't be equal. In the program, there a `UUID` property to identify `Animal`.
* Which properties of animal are required, which properties are optional? In my program,
`name` and `favoriteFood` are obligatory， other properties are optional.  
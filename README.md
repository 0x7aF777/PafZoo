# PafZoo
This is a simple Java console project(Maven) for developer test assignment of PAF.
 
#### Usage
**build**
 ```shell script
mvn clean package
```
After build, a jar file --`PafZoo-1.0-SNAPSHOT.jar` will be generated under target folder.

**start program**

```shell script
java -cp target/PafZoo-1.0-SNAPSHOT.jar com.paf.zoo.Main
```

#### Important aspects
1. Friendship actions(build/break) of different animals should occur in parallel;
2. Command design pattern makes the program extendable;


#### questions
* If package Mockito is allowed to use, some unit tests of `Command` implementation could be added
* Could two animals have the same name? I assume `Yes`, two animals with with exactly the same 
properties shouldn't be equal. In the program, there a `UUID` property to identify `Animal`.
* Which properties of animal are required, which properties are optional? In my program,
`name` and `favoriteFood` are obligatory， other properties are optional.  
zerg-hoard
==========

Java AI for Starcraft Broodwars using JNIBWAPI.

## Requirements
* StarCraft BroodWars: 1.16.1
* BWAPI: 3.7.4 
** https://code.google.com/p/bwapi/downloads/list
* Choasloader with BWAPI dll injector
* JDK 7

## Building

```
git clone https://github.com/babsher/zerg-hoard.git
cd ./zerg-hoard
./gradlew build
```

## Run

in bwapi.ini set ai = null

Run zerg-hoard:
```
./gradlew run
```
Start StarCraft match and AI should take control
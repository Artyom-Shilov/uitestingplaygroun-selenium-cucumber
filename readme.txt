Dynamic id exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@DynamicId clean test
Class attribute exercise:
mvn -Dbrowser=chrome -Dcucumber.filter.tags=@ClassAttribute clean test
Load delay exercise:
mvn -Dbrowser=chrome -Dcucumber.filter.tags=@LoadDelay clean test
Hidden layer exercise:
mvn -Dbrowser=chrome -Dcucumber.filter.tags=@HiddenLayer clean test
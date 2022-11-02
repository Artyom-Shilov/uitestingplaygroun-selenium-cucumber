Dynamic id exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@DynamicId clean test
Class attribute exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@ClassAttribute clean test
Load delay exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@LoadDelay clean test
Hidden layer exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@HiddenLayer clean test
AJAX data exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@AJAXData clean test
Client side delay exercise:
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@ClientSideDelay clean test
Click exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@Click clean test
Text input exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@TextInput clean test
Progress bar exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@ProgressBar clean test
Dynamic table exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@DynamicTable clean test
Scrollbars exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@Scrollbars clean test
Visibility exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@Visibility clean test
Mouse over exercise
mvn -Dbrowser=${browser} -Dcucumber.filter.tags=@MouseOver clean test

browsers: chrome, firefox, edge



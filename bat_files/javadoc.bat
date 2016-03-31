CD C:\cse231

::root>javadoc [options] [packagenames] [Java sourcefilenames]

:: -private can be used in the line below as well
::javadoc -version -author -overview source\overview.html -d source\edu\oakland\javadoc_api -sourcepath source edu.oakland.homework edu.oakland.helper
javadoc -version -author -overview source\overview.html -d source\edu\oakland\javadoc_api -classpath c:\junit.jar; -sourcepath source edu.oakland.helper edu.oakland.test
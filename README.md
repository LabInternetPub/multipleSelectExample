# Multiple Select Example

This is a very simple example on how you can use a multiple select to create an object with a list 
of other objects. In this example is a document (with content attribute) and with a list of 
tags selected from a given multiple selection.

It is solved in two ways:
+ The first commit: where the document has a list of Strings as tags. That is a tag is just a String 
+ The last commit: where the document has a list of Tags (objects from a class). Note that the example only works if 
the class Tag has the constructor with the name of the tag
as a parameter.
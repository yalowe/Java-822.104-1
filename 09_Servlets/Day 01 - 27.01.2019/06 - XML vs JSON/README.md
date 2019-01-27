# Json vs Xml

json:
```json
{
    "age" : 12,
    "name" : "Danielle"
}
```
xml:
```xml
<person>
    <age>12</age>
    <name>Danielle</name>
</person>
```
## JSON
#### Pro:
* Simple syntax, which results in less "markup" overhead compared to XML.
* Easy to use with JavaScript as the markup is a subset of JS object literal notation and has the same basic data types as JavaScript.
* Less verbose- XML uses more words than necessary
* JSON is faster- Parsing XML in some software is slow and cumbersome.
* JSON Schema for description and datatype and structure validation
* JsonPath for extracting information in deeply nested structures
#### Con:
* Simple syntax, only a handful of different data types are supported.
* No support for comments.


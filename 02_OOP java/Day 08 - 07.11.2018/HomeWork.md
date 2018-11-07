
## Create a `Task` class:
#### Properties:
* taskContent - `<T>`
* taskDuration - int


## Craete a `App` class:
#### In tha `main` function:
* Create a Hashtable 
    * the key is `String` type (person name)
    * the value is `Queue<Task>` type  (ToDo list for this person)

* add to the Hashtable 2 elements with this content:
    * "Bob" -
        * `taskContent - <String>`: "Buy food", `taskDuration - int`:  20
        * `taskContent - <String[]>`: ["Clean room", "Clean garden"], `taskDuration - int`: 50
    * "Alice" - 
        * `taskContent - <String>`: "Cook food", `taskDuration - int`: 20
        * `taskContent - <String[][]>`: [ ["Buy drink","Buy food"] , ["Pay to post", "Pay to bank"] ], `taskDuration - int`: 120

* Print for each person the following content:
    * Person name
    * Total duration of all tasks
    * Details of each task

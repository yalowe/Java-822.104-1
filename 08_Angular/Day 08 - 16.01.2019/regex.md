### Good online regex tester
https://regex101.com/

### QUANTIFIERS
* `*` - 0 or more times (of the left value)
Example: `a*` - Zero or more of `a` char
* `+` - 1 or more times (of the left value)
Example: `a+` - One or more of a `a` char
* `?` - 0 or 1 time (of the left value)
Example: `a?` - Zero or one of `a` char
* `{n}` - Exactly n times (of the left value)
Example: `a{3}` requires three times the `a` char
* `{n,}` - At least n times (of the left value)
Example: `a{3}` requires at least three times the `a` char
* `{n,m}` - From n to m times (of the left value)
Example: `a{3,5}` requires the `a` char between 3 to 5 times

### ANCHORS (Use To specify position)
* `^` - At start of string or line
* `\A` - At start of string
* `\z` - At end of string
* `\Z` - At end (or before \n at end) of string
* `$` - At end (or before \n at end) of string or line
* `\G` - Where previous match ended
* `\b` - On word boundary
* `\B` - Not on word boundary
 
### SINGLE CHARACTERS (Use To match any character)
* `[set]` - In that set
Example: 
    * `^[abc]$` - A word that contains only a single character of: a, b or c
    * `^[abc]{2}$` - A word that contains only two characters of: a, b or c
* `[^set]` - Not in that set
Example: 
    * `^[^abc]$` - A word that contains only a single character that is not: a, b or c
    * `^[^abc]{2}$` - A word that contains only two characters that is not: a, b or c
* `[a–z]` - In the a-z range
Example: 
    * `^[a-c]$` - A word that contains only a single character that is : a, b or c
    * `^[2-5]$` - A word that contains only a single character that is : 2, 3 , 4 or 5
* `[^a–z]` - Not in the a-z range
Example: 
    * `^[^a-c]$` - A word that contains only a single character that is not : a, b or c
    * `^[^2-5]$` - A word that contains only a single character that is not : 2, 3 , 4 or 5
* `.` - Any character or Any whitespace character
* prefix of `\` to a char- in order to scape special character
Example: `^a\?$` - matches only `a?`

* `[a-zA-Z]` - A character in the range: a-z or A-Z
Example: `^[a-cA-C1-8d]$`- A word that contains only a single character that is : a-c, or A-C or 1-8 or d
* `(a|b)` - Match either a or b
Example: `^(bob|alice)$` - A word that is bob or alice




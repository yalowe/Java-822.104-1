/**
 * 
 */


 function ReadCookie() {
            let allcookies = document.cookie;

            // Get all the cookies pairs in an array
            let cookiearray = allcookies.split(';');

            // Now take key value pair out of this array
            for (let i = 0; i < cookiearray.length; i++) {
                let name = cookiearray[i].split('=')[0];
                let value = cookiearray[i].split('=')[1];
                console.log("Key : " + name + " , Value : " + value);
            }
        }
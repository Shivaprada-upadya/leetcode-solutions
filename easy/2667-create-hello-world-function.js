/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
       return "Hello World"; //->Solution code
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
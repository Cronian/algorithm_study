/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
  
    var result = address.replace(/\./gi, '[.]');
    
    return result;
};

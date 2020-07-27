/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let num = 0;
    let edge = ["I", "X", "C"];
    let edge2 = [["V", "X"], ["L", "C"], ["D", "M"]];
    
    let conv = {
        M: 1000,
        D: 500,
        C: 100,
        L: 50,
        X: 10,
        V: 5,
        I: 1
    }
    
    
    for (let i = 0; i < s.length; i++) {
        let current_numeral = s[i];
        let next_numeral = s[i + 1];
        let pos = edge.indexOf(current_numeral)
        let minus = pos === 0 ? 1 : (pos === 1 ? 10 : 100);
        let edge3 = edge2[pos];
        let not_edge_case = !edge.includes(current_numeral);
        let valid_edge_case = edge.includes(current_numeral) && !edge3.includes(next_numeral);
        if (not_edge_case || valid_edge_case) {
            num += conv[current_numeral];
        } else {
            num += conv[next_numeral] - minus;
            i++;
        }
        console.log(num);
        
    }
    
    return num;
};
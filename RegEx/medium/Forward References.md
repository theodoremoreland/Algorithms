<?php

$Regex_Pattern = '/^(\2tic|(tac))+$/'; //Do not delete '/'. Replace __________ with your regex.

// ^ The 2 references the innermost group, but fails on first evalutaion because
// ...the group has yet to be captured. Subsequently, the first match is tac, then tactic
// ...the anchors ensure the pattern persist throughout entire line,

$handle = fopen ("php://stdin","r");
$Test_String = fgets($handle);
if(preg_match($Regex_Pattern, $Test_String, $output_array)){
    print ("true");
} else {
    print ("false");
}

fclose($handle);
?>
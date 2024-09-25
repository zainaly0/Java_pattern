<?php

$arr = [1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 2, 0];
$max = $arr[0];

for($a = 0; $a<count($arr)-1; $a++){
    for($b = 0; $b<count($arr)-1; $b++){
        if($arr[$b] > $arr[$b+1]){
            $temp = $arr[$b];
            $arr[$b] = $arr[$b+1];
            $arr[$b+1] = $temp;
        }
    }
}

// echo $max;
foreach($arr as $a){
    echo $a. " ";
}
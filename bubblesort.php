<?php
function burbuja($array)
{
    for($i=1;$i<count($array);$i++)
    {
        for($j=0;$j<count($array)-$i;$j++)
        {
            if($array[$j]>$array[$j+1])
            {
                $k=$array[$j+1];
                $array[$j+1]=$array[$j];
                $array[$j]=$k;
            }
        }
    }
 
    return $array;
}
 
$arrayA=array(5,9,4,7,10,3,8,2,1,6);
 
echo "Array Desordenado<br>";
for($i=0;$i<count($arrayA);$i++)
    echo $arrayA[$i]."\n";
 
$arrayB=burbuja($arrayA);
 
echo "<br><br>Array ordenado por metodo Burbuja<br>";
for($i=0;$i<count($arrayB);$i++)
    echo $arrayB[$i]."\n";
?>

// I'm close to you. Look around you carefully.

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

function main() {
    var n = parseInt(readLine());
    for(var a0 = 0; a0 < n; a0++){
        var grade = parseInt(readLine());
        var incrementedGrade = grade;
        if(grade < 38){
            console.log(grade);
            continue;
        }
        
        while(incrementedGrade % 5 != 0){
            incrementedGrade++
        }
        
        if(incrementedGrade - grade < 3 )
            console.log(incrementedGrade);
        else
            console.log(grade);
            
    }

}

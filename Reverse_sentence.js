//2 a. Take a sentence as an input and reverse every word in that sentence

var sentence = "This is a sunny day";
var words = sentence.split(" ");

for (var i = 0; i < words.length; i++) {
    var word = words[i];
    words[i] = word.split('').reverse().join('');
}

var reversedSentence = words.join(" ");

console.log(reversedSentence);


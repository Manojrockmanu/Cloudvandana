
function reverseWords(sentence) {
    // Split the sentence into words.
    const words = sentence.split(' ');
  
    // Reverse each word.
    const reversedWords = words.map(word => word.split('').reverse().join(''));
  
    // Join the reversed words back into a sentence.
    return reversedWords.join(' ');
  }
  
  // Example usage:
  const sentence = 'This is a sunny day';
  const reversedSentence = reverseWords(sentence);
  
  console.log(reversedSentence); // 'sihT si a ynnus yad'
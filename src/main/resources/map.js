 function() {
    var document = this;
    var stopwords = ["the","be","to","of","and","a","in"];
    for(var prop in document) {
      if(prop === "_id" || typeof document[prop] !== 'string') {
        continue
      }
      (document[prop]).split(" ").forEach(
        function(word){
          var cleanedWord = word.replace(/[;,.]/g,"")
          if(
            stopwords.indexOf(cleanedWord) > -1 ||
            !(isNaN(parseInt(cleanedWord))) ||
            !(isNaN(parseFloat(cleanedWord)))
          ) {
            return
          }
          var value={
        		userId:document.userId,
  		  		docId:document._id
          }
          emit(cleanedWord,value)
        }
      ) 
    }
  }
 
 
 
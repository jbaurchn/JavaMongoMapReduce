function(key,reducedValue){

        var finalValue = {documents:[]}
        if(reducedValue.documents) {
          finalValue.documents = reducedValue.documents.filter(
            function(item,pos,self){
              var loc = -1;
              for(var i=0;i<self.length;i++){
                if(self[i].valueOf() === item.valueOf()){
                  loc = i;
                  break
                }
              }
              return loc === pos;
              }
          );
        } else {
              
              if (!reducedValue.documents)
                     {
            	  var values = { 'userId': '', 'docIdStr': []};
                      
                       values.userId=reducedValue.userId ;
                       values.docIdStr.push(reducedValue.docId.str);
                      finalValue.documents.push(values)
                     }
              
              else{
          finalValue.documents =reducedValue.documents 
              }
        }
        
        return finalValue
      }
  

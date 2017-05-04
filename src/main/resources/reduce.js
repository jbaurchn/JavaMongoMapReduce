function(k,v){
   var output={'documents':[] };
   v.forEach(
      function(vs){
    	  var values = { 'userId': '', 'docIdStr': []};
         var checkExisting = false;
         
         output.documents.forEach(
	           function(test){
	                      if (test.userId ===vs.userId)
                             {
            	  				if(!(test.docIdStr.indexOf(vs.docId) > -1))
                                  {
            	  					test.docIdStr.push(vs.docId);
                                  }
                                 checkExisting =true;
                             }
	           }
         )
        if(!checkExisting)
                {
	                values.userId=vs.userId ;
	                values.docIdStr.push(vs.docId);
	                output.documents.push(values);
                }
      }
     
     )
     return output
  }



 var app = {};

 app.attachEvents = function(){
 
 
 var links = document.getElementsByTagName('a');
 
   console.log(links.length);
   
   
   for(var i=0;i<links.length;i++){
   
   
   links[i].addEventListener('click',function(event){
   
                 
                 event.preventDefault();
                 
                                  alert(this.getAttribute('href'));
                 
                 
   
          });
   }
 
 }

app.attachEvents();

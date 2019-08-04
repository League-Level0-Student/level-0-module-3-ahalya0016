int size = 200;

void setup() {
 
  size(400,600);
 
 for(int i=0; i<8;i++){
   if (i%2==0){
    fill(0,0,0);
   
  }
  else{
    fill(255,0,0);
  }
   ellipse(200,200,size,size); 
  size-=30;

 
  
}}

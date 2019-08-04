int x1 = 100;
int x2 = 500;
int speed = 5;
int speed1= 5;
void setup() {
 
  size(600,600);
}
void draw(){
  background(100,100,100);
  int size = 200;
int size1 = 200;
 for(int i=0; i<40;i++){
   noFill();
   ellipse(x1,300,size,size); 
  size-=10;
  }
   
for(int i=0; i<40;i++){
   noFill();
   ellipse(x2,300,size1,size1); 
  size1-=10;
  }
  x1+= speed;
  x2-=speed1;
  if(x1>600){
    speed=-speed;
  }
  else if(x1<0) {
    speed=-speed;
  }
  
  if(x2<0){
    speed1=-speed1;
  }
  else if(x2>600){
    speed1=-speed1;
  }
}

 
  

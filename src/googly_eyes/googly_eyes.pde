void setup(){
  PImage face = loadImage ("face.jpg");
  size(800,600);
  face.resize(width,height);
  background(face);
}

void draw(){
  if(mousePressed){
  println(mouseX +" "+mouseY);
  }
  fill(255,255,255);
ellipse(303,248,150,150);
ellipse(523,259,150,150);
fill(0,0,0);

if(mouseX<261){
mouseX=261;
}
if (mouseY<220){
  mouseY=220;
}

if (mouseX>332){
 mouseX =332; 
}
if (mouseY>293){
 mouseY=293; 
}
if (mousePressed){
  fill(random(256),random(256),random(256));
}
ellipse(mouseX,mouseY,50,50);
ellipse(mouseX+220,mouseY+11,50,50);










}
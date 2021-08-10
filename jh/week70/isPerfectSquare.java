public boolean isPerfectSquare(int num) {
  int base = 1;
  if(num ==1) return true;
  if(num ==0) return false;
  // base와 base를 곱할 때 num이 나오는 경우 true 그것보다 커지면 false return
  
  while(base < num) {
     if(base*base == num) { 
        return true;
     } else if (base*base > num) {
        return false;
     }
     
     base++;
  }
  return false;
}
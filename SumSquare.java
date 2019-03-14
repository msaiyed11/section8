public class SumSquare {
public static void main(String[] args) {

int count = 0;
int result = 0;
int sum = 0;
while (count < 33)
{
count += 3;
result = count * count;
           
System.out.printf("Cumulation result:%5d%5s%5d%5s%5d\n", result, " : " , count , " * " , count);
sum += result;
}
System.out.println("The SUM of squares of multiples of 3 is " + sum);
}
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int amount = 50;
boolean isRegistered = true;
int percent;

if (isRegistered) {
    percent = 3;
} else {
    percent = 1;
}
  //int percent = isRegistered ? 3 : 1;

int bonus = amount / 100 * percent;
if (bonus > 500) {
    bonus = 500;
}
System.out.println("Итоговый бонус: " + bonus);

}

}
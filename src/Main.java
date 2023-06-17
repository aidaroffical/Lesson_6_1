public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getWeapon().setWeapon(WeaponType.ak47);
        boss.setDamage(80);
        boss.setHealth(300);
        boss.getWeapon().setWeaponType("Russian Weapon ");
        System.out.println(boss.info());
        System.out.println("----------------------------------------------------");
        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        Skeleton skeleton3 = new Skeleton();
        skeleton1.setDamage(35);
        skeleton1.setHealth(300);
        skeleton1.setNumberOfShots(120);
        skeleton1.getWeapon().setWeapon(WeaponType.ak47);
        skeleton1.getWeapon().setWeaponType("Firearm ");
        skeleton2.setDamage(20);
        skeleton2.setHealth(200);
        skeleton2.setNumberOfShots(36);
        skeleton2.getWeapon().setWeapon(WeaponType.pistol);
        skeleton2.getWeapon().setWeaponType("Firearm ");
        System.out.println(skeleton1.info());
        System.out.println("----------------------------------------------------");
        System.out.println(skeleton2.info());
        System.out.println("----------------------------------------------------");
        skeleton3.setDamage(10);
        skeleton3.setHealth(150);
        skeleton3.setNumberOfShots(20);
        skeleton3.getWeapon().setWeapon(WeaponType.knife);
        skeleton3.getWeapon().setWeaponType("Cold Weapon ");
        System.out.println(skeleton1.info());
        System.out.println("----------------------------------------------------");
        System.out.println(skeleton3.info());
    }
}
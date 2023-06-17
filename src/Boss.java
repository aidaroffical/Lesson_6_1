public class Boss extends GameEntity {
    Weapon weapon = new Weapon();
    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return "Health Boss: " + getHealth() + " Damage Boss: " + getDamage() + " WeaponType Boss: " + weapon.getWeapon()+
                " Weapon Boss: " + weapon.getWeaponType();
    }
}

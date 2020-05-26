public abstract class Character {

    public Character() {
    }

    private WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w){
        weapon.useWeapon();
    }
}
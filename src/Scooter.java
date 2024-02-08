class Scooter extends Vehicle
{
    private int engineCapacity;

    public Scooter(String make, String model, int yom, int engineCapacity)
    {
        super(make, model, yom);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", " + engineCapacity + "cc engine capacity";
    }
}

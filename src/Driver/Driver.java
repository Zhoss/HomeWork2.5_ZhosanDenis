package Driver;

public abstract class Driver {
    String fullName;
    boolean havingLicense;
    int drivingExperience;

    public Driver(String fullName, boolean havingLicense, int drivingExperience) {
        if (fullName != null && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            System.out.println("Нужно указать фамилию, имя, отчество");
        }

        this.havingLicense = havingLicense;

        setDrivingExperience(drivingExperience);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isHavingLicense() {
        return havingLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setHavingLicense(boolean havingLicense) {
        this.havingLicense = havingLicense;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience > 0 && drivingExperience < 100) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = 0;
        }
    }

    public abstract void startDriving();

    public abstract void stopDriving();

    public abstract void refillTransport();
}

public class NextDayCalculator {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator() {}

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isnamNhuan() {
        boolean isnamNhuan = false;
        boolean c4 = year % 4 == 0;
        boolean c100 = year % 100 == 0;
        boolean c400 = year % 400 == 0;
        if (c4) {
            if (c100) {
                if (c400) {
                    isnamNhuan = true;
                }
            } else {
                isnamNhuan = true;
            }
        }
        return isnamNhuan;
    }

    public NextDayCalculator nextDayCalculator() {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (day == 31) {
                        day = 1;
                        month++;
                    } else if (day < 31 && day >1) {
                        day++;
                    } else {
                        day = 0;
                        month = 0;
                        year = 0;
                    }
                    break;
                case 12:
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                    } else if (day < 31 && day >1) {
                        day++;
                    } else {
                        day = 0;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day == 30) {
                        day = 1;
                        month++;
                    } else if (day < 30 && day >1) {
                        day++;
                    } else {
                        day = 0;
                    }
                    break;
                case 2:
                    if (day == 28) {
                        if (isnamNhuan()) {
                            day++;
                        } else {
                            month++;
                            day = 1;
                        }
                    } else if (day < 28 && day >1) {
                        day++;
                    } else {
                        day = 0;
                    }
                    break;
                default:
                    day = 0;
        }
        return this;
    }
    @Override
    public String toString() {
        if (day != 0 && year > 0) {
            return "The next Day \n"
                    + "Day " + day
                    + " Month " + month
                    + " Year " + year;
        } else {
            return "Date Not Found";
        }
    }
}

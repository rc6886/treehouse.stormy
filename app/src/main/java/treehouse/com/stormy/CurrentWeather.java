package treehouse.com.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by rc6886 on 3/31/2015.
 */
public class CurrentWeather {
    private String _icon;
    private long _time;
    private double _temperature;
    private double _humidity;
    private double _precipChance;
    private String _summary;
    private String _timeZone;

    public String getIcon() {
        return _icon;
    }

    public void setIcon(String icon) {
        _icon = icon;
    }

    public long getTime() {
        return _time;
    }

    public void setTime(long time) {
        _time = time;
    }

    public double getTemperature() {
        return (int) Math.round(_temperature);
    }

    public void setTemperature(double temperature) {
        _temperature = temperature;
    }

    public double getHumidity() {
        return _humidity;
    }

    public void setHumidity(double humidity) {
        _humidity = humidity;
    }

    public int getPrecipChance() {
        return (int) Math.round(_precipChance * 100);
    }

    public void setPrecipChance(double precipChance) {
        _precipChance = precipChance;
    }

    public String getSummary() {
        return _summary;
    }

    public void setSummary(String summary) {
        _summary = summary;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));

        return formatter.format(new Date(getTime() * 1000));
    }

    public String getTimeZone() {
        return _timeZone;
    }

    public void setTimeZone(String timeZone) {
        _timeZone = timeZone;
    }

    public int getIconId() {
        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night.
        int iconId = R.drawable.clear_day;

        if (_icon.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (_icon.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (_icon.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (_icon.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (_icon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (_icon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (_icon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (_icon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (_icon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (_icon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }
}

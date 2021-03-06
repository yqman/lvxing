package androidx.core.location;

import android.location.LocationManager;
import android.os.Build.VERSION;

public final class LocationManagerCompat {
    public static boolean isLocationEnabled(LocationManager locationManager) {
        if (VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        boolean z = locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
        return z;
    }

    private LocationManagerCompat() {
    }
}

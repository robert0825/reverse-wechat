package c.t.m.g;

import android.annotation.SuppressLint;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.Collections;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public final class df
  extends di
{
  public int a = 0;
  public int b = 460;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public int g = Integer.MAX_VALUE;
  public int h = Integer.MAX_VALUE;
  private final long i = System.currentTimeMillis();
  private List<NeighboringCellInfo> j;
  
  @SuppressLint({"NewApi"})
  @Nullable
  public static df a(cj paramcj, CellInfo paramCellInfo)
  {
    int k = -88;
    if (paramCellInfo == null) {
      paramcj = null;
    }
    df localdf;
    do
    {
      return paramcj;
      paramcj = paramcj.b();
      localdf = new df();
      int n;
      int m;
      try
      {
        if ((paramCellInfo instanceof CellInfoCdma))
        {
          paramCellInfo = (CellInfoCdma)paramCellInfo;
          CellIdentityCdma localCellIdentityCdma = paramCellInfo.getCellIdentity();
          localdf.a = 2;
          localdf.a(paramcj);
          localdf.c = localCellIdentityCdma.getSystemId();
          localdf.d = localCellIdentityCdma.getNetworkId();
          localdf.e = localCellIdentityCdma.getBasestationId();
          localdf.g = localCellIdentityCdma.getLatitude();
          localdf.h = localCellIdentityCdma.getLongitude();
          n = paramCellInfo.getCellSignalStrength().getDbm();
          m = k;
          if (n > -110)
          {
            m = k;
            if (n < -40) {
              m = n;
            }
          }
          localdf.f = m;
          return localdf;
        }
      }
      catch (Throwable paramcj)
      {
        paramcj.toString();
        return localdf;
      }
      if ((paramCellInfo instanceof CellInfoGsm))
      {
        paramcj = (CellInfoGsm)paramCellInfo;
        localdf.a = 1;
        paramCellInfo = paramcj.getCellIdentity();
        localdf.d = paramCellInfo.getLac();
        localdf.e = paramCellInfo.getCid();
        localdf.b = paramCellInfo.getMcc();
        localdf.c = paramCellInfo.getMnc();
        n = paramcj.getCellSignalStrength().getDbm();
        m = k;
        if (n > -110)
        {
          m = k;
          if (n < -40) {
            m = n;
          }
        }
        localdf.f = m;
        return localdf;
      }
      if ((paramCellInfo instanceof CellInfoWcdma))
      {
        paramcj = (CellInfoWcdma)paramCellInfo;
        localdf.a = 1;
        paramCellInfo = paramcj.getCellIdentity();
        localdf.d = paramCellInfo.getLac();
        localdf.e = paramCellInfo.getCid();
        localdf.b = paramCellInfo.getMcc();
        localdf.c = paramCellInfo.getMnc();
        n = paramcj.getCellSignalStrength().getDbm();
        m = k;
        if (n > -110)
        {
          m = k;
          if (n < -40) {
            m = n;
          }
        }
        localdf.f = m;
        return localdf;
      }
      paramcj = localdf;
    } while (!(paramCellInfo instanceof CellInfoLte));
    paramcj = (CellInfoLte)paramCellInfo;
    localdf.a = 1;
    paramCellInfo = paramcj.getCellIdentity();
    localdf.d = paramCellInfo.getTac();
    localdf.e = paramCellInfo.getCi();
    localdf.b = paramCellInfo.getMcc();
    localdf.c = paramCellInfo.getMnc();
    k = paramcj.getCellSignalStrength().getDbm();
    if ((k > -110) && (k < -40)) {}
    for (;;)
    {
      localdf.f = k;
      return localdf;
      k = -88;
    }
  }
  
  @Nullable
  public static df a(cj paramcj, CellLocation paramCellLocation, SignalStrength paramSignalStrength)
  {
    if ((!paramcj.e()) || (paramCellLocation == null)) {
      return null;
    }
    TelephonyManager localTelephonyManager = paramcj.b();
    paramcj = new df();
    try
    {
      if (!(paramCellLocation instanceof CdmaCellLocation)) {
        break label117;
      }
      paramCellLocation = (CdmaCellLocation)paramCellLocation;
      paramcj.a = 2;
      paramcj.a(localTelephonyManager);
      paramcj.c = paramCellLocation.getSystemId();
      paramcj.d = paramCellLocation.getNetworkId();
      paramcj.e = paramCellLocation.getBaseStationId();
      paramcj.g = paramCellLocation.getBaseStationLatitude();
      paramcj.h = paramCellLocation.getBaseStationLongitude();
      if (paramSignalStrength == null)
      {
        paramcj.f = -1;
        return paramcj;
      }
    }
    catch (Throwable paramCellLocation)
    {
      paramCellLocation.toString();
      return paramcj;
    }
    paramcj.f = paramSignalStrength.getCdmaDbm();
    return paramcj;
    label117:
    paramCellLocation = (GsmCellLocation)paramCellLocation;
    paramcj.a = 1;
    paramcj.a(localTelephonyManager);
    paramcj.d = paramCellLocation.getLac();
    paramcj.e = paramCellLocation.getCid();
    if (paramSignalStrength == null)
    {
      paramcj.f = -1;
      return paramcj;
    }
    paramcj.f = (paramSignalStrength.getGsmSignalStrength() * 2 - 113);
    return paramcj;
  }
  
  private void a(TelephonyManager paramTelephonyManager)
  {
    int[] arrayOfInt = new int[2];
    dt.a(paramTelephonyManager, arrayOfInt);
    if ((arrayOfInt[0] > 0) && (arrayOfInt[1] >= 0))
    {
      this.b = arrayOfInt[0];
      this.c = arrayOfInt[1];
    }
  }
  
  @NonNull
  public final List<NeighboringCellInfo> a()
  {
    try
    {
      if (this.j == null) {
        this.j = Collections.emptyList();
      }
      List localList = this.j;
      return localList;
    }
    finally {}
  }
  
  public final void a(@Nullable List<NeighboringCellInfo> paramList)
  {
    if (paramList != null) {}
    for (;;)
    {
      try
      {
        this.j = Collections.unmodifiableList(paramList);
        return;
      }
      finally {}
      this.j = Collections.emptyList();
    }
  }
  
  public final String b()
  {
    return this.b + this.c + this.d + this.e;
  }
  
  public final String toString()
  {
    return "TxCellInfo [PhoneType=" + this.a + ", MCC=" + this.b + ", MNC=" + this.c + ", LAC=" + this.d + ", CID=" + this.e + ", RSSI=" + this.f + ", LAT=" + this.g + ", LNG=" + this.h + ", mTime=" + this.i + "]";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
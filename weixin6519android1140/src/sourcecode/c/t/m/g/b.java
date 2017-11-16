package c.t.m.g;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.util.Base64;
import com.tencent.tencentmap.lbssdk.service.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Key;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends PhoneStateListener
{
  volatile boolean a;
  private final cj b;
  private CellLocation c = null;
  private SignalStrength d = null;
  private ServiceState e = null;
  private long f;
  private HandlerThread g;
  private Handler h;
  
  public b(cj paramcj)
  {
    this.b = paramcj;
  }
  
  private void a(int paramInt)
  {
    TelephonyManager localTelephonyManager = this.b.b();
    try
    {
      localTelephonyManager.listen(this, paramInt);
      return;
    }
    catch (Exception localException) {}
  }
  
  private boolean a(CellLocation paramCellLocation)
  {
    if (paramCellLocation == null) {
      return false;
    }
    try
    {
      GsmCellLocation localGsmCellLocation = (GsmCellLocation)paramCellLocation;
      if (localGsmCellLocation.getCid() == 0)
      {
        int i = localGsmCellLocation.getLac();
        if (i == 0) {
          return false;
        }
      }
    }
    catch (ClassCastException localClassCastException)
    {
      if (dt.a(paramCellLocation) < 0) {
        return false;
      }
      if (dt.a(this.c, paramCellLocation)) {
        return false;
      }
      paramCellLocation = df.a(this.b, paramCellLocation, null);
      if (paramCellLocation == null) {}
      for (boolean bool = true; bool; bool = dt.a(paramCellLocation)) {
        return true;
      }
    }
    return false;
  }
  
  private void c()
  {
    if (!this.a) {}
    for (;;)
    {
      return;
      if (this.c != null)
      {
        long l = System.currentTimeMillis();
        if (l - this.f > 2000L) {}
        for (int i = 1; i != 0; i = 0)
        {
          this.f = l;
          df localdf = df.a(this.b, this.c, this.d);
          try
          {
            if ((this.h != null) && (localdf != null))
            {
              c localc = new c(this.b);
              localc.a(localdf);
              this.h.post(localc);
            }
            return;
          }
          finally {}
        }
      }
    }
  }
  
  public final void a()
  {
    if (this.a) {
      return;
    }
    this.a = true;
    this.g = new HandlerThread("CellProvider");
    this.g.start();
    this.h = new b(this.g.getLooper(), (byte)0);
    this.h.sendEmptyMessageDelayed(0, 3000L);
    CellLocation localCellLocation = dt.a(this.b);
    if (a(localCellLocation))
    {
      df localdf = df.a(this.b, localCellLocation, null);
      if (localdf != null)
      {
        this.c = localCellLocation;
        this.b.c(localdf);
      }
    }
    a(273);
  }
  
  public final void b()
  {
    if (!this.a) {
      return;
    }
    this.a = false;
    a(0);
    try
    {
      if (this.h != null)
      {
        this.h.removeCallbacksAndMessages(null);
        this.h = null;
      }
      this.g.quit();
      this.g = null;
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = 0L;
      return;
    }
    finally {}
  }
  
  public final void onCellLocationChanged(CellLocation paramCellLocation)
  {
    super.onCellLocationChanged(paramCellLocation);
    if (a(paramCellLocation))
    {
      this.c = paramCellLocation;
      c();
      return;
    }
    new StringBuilder("onCellLocationChanged: illegal cell or same cell ").append(paramCellLocation);
  }
  
  public final void onServiceStateChanged(ServiceState paramServiceState)
  {
    int j = 1;
    super.onServiceStateChanged(paramServiceState);
    if (paramServiceState == null) {}
    do
    {
      ServiceState localServiceState;
      do
      {
        return;
        localServiceState = this.e;
      } while ((localServiceState != null) && (localServiceState.getState() == paramServiceState.getState()));
      this.e = paramServiceState;
    } while (!this.a);
    int i;
    boolean bool;
    if (this.e != null) {
      if (this.e.getState() == 0)
      {
        i = 1;
        paramServiceState = this.b.b();
        bool = dt.a(this.b.a);
        if (paramServiceState == null) {
          break label171;
        }
        if (paramServiceState.getSimState() != 5) {
          break label166;
        }
      }
    }
    for (;;)
    {
      if ((bool) || (j == 0)) {
        i = 0;
      }
      paramServiceState = new Message();
      paramServiceState.what = 12999;
      paramServiceState.arg1 = 12003;
      paramServiceState.arg2 = i;
      this.b.c(paramServiceState);
      return;
      if (this.e.getState() == 1)
      {
        i = 0;
        break;
      }
      i = -1;
      break;
      label166:
      j = 0;
      continue;
      label171:
      j = 0;
    }
  }
  
  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    if (paramSignalStrength == null) {}
    for (;;)
    {
      return;
      try
      {
        SignalStrength localSignalStrength = this.d;
        int i = this.b.h().b;
        if ((localSignalStrength == null) || (dt.a(i, localSignalStrength, paramSignalStrength)))
        {
          this.d = paramSignalStrength;
          c();
          return;
        }
      }
      catch (Exception paramSignalStrength)
      {
        paramSignalStrength.toString();
      }
    }
  }
  
  public final class a
  {
    Context a;
    int b;
    boolean c;
    String d = "";
    String e = "";
    String f = "0M100WJ33N1CQ08O";
    
    public a(String paramString1, String paramString2)
    {
      this.a = this$1.getApplicationContext();
      this.b = 100;
      this.c = true;
      this.d = paramString1;
      this.e = paramString2;
    }
    
    private static double a(double paramDouble)
    {
      return 3.141592653589793D * paramDouble / 180.0D;
    }
    
    public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
    {
      paramDouble1 = a(paramDouble1);
      paramDouble3 = a(paramDouble3);
      paramDouble2 = a(paramDouble2);
      paramDouble4 = a(paramDouble4);
      double d1 = Math.pow(Math.sin((paramDouble1 - paramDouble3) / 2.0D), 2.0D);
      return Math.round(Math.asin(Math.sqrt(Math.cos(paramDouble1) * Math.cos(paramDouble3) * Math.pow(Math.sin((paramDouble2 - paramDouble4) / 2.0D), 2.0D) + d1)) * 2.0D * 6378.137D * 10000.0D) / 10000.0D * 1000.0D;
    }
    
    public static double a(double paramDouble, int paramInt)
    {
      try
      {
        if (Double.isNaN(paramDouble)) {
          return 0.0D;
        }
        paramDouble = BigDecimal.valueOf(paramDouble).setScale(paramInt, RoundingMode.HALF_DOWN).doubleValue();
        return paramDouble;
      }
      catch (Exception localException) {}
      return 0.0D;
    }
    
    public static String a(Context paramContext)
    {
      int i = c(paramContext);
      if (i != -1)
      {
        if (i == 0) {
          return "mobile";
        }
        if (i == 1) {
          return "wifi";
        }
      }
      return "none";
    }
    
    public static String a(df paramdf, boolean paramBoolean)
    {
      if (paramdf == null) {
        return "[]";
      }
      int j = paramdf.b;
      int k = paramdf.c;
      int m = paramdf.a;
      Object localObject1 = new ArrayList();
      Object localObject2 = paramdf.a();
      int i;
      int n;
      int i1;
      if (dt.a(m, j, k, paramdf.d, paramdf.e))
      {
        i = paramdf.d;
        int i2 = paramdf.e;
        int i3 = paramdf.f;
        n = paramdf.g;
        i1 = paramdf.h;
        paramdf = new StringBuilder();
        paramdf.append("{");
        paramdf.append("\"mcc\":");
        paramdf.append(j);
        paramdf.append(",\"mnc\":");
        paramdf.append(k);
        paramdf.append(",\"lac\":");
        paramdf.append(i);
        paramdf.append(",\"cellid\":");
        paramdf.append(i2);
        paramdf.append(",\"rss\":");
        paramdf.append(i3);
        paramdf.append(",\"seed\":");
        if (paramBoolean)
        {
          i = 1;
          paramdf.append(i);
          if ((n != Integer.MAX_VALUE) && (i1 != Integer.MAX_VALUE))
          {
            paramdf.append(",\"stationLat\":");
            paramdf.append(String.format("%.6f", new Object[] { Float.valueOf(n / 14400.0F) }));
            paramdf.append(",\"stationLng\":");
            paramdf.append(String.format("%.6f", new Object[] { Float.valueOf(i1 / 14400.0F) }));
          }
          paramdf.append("}");
          ((ArrayList)localObject1).add(paramdf.toString());
        }
      }
      for (;;)
      {
        try
        {
          paramdf = ((List)localObject2).iterator();
          if (paramdf.hasNext())
          {
            localObject2 = (NeighboringCellInfo)paramdf.next();
            i = ((NeighboringCellInfo)localObject2).getLac();
            n = ((NeighboringCellInfo)localObject2).getCid();
            if (!dt.a(m, j, k, i, n)) {
              break label561;
            }
            i1 = ((NeighboringCellInfo)localObject2).getRssi();
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("{");
            ((StringBuilder)localObject2).append("\"mcc\":");
            ((StringBuilder)localObject2).append(j);
            ((StringBuilder)localObject2).append(",\"mnc\":");
            ((StringBuilder)localObject2).append(k);
            ((StringBuilder)localObject2).append(",\"lac\":");
            ((StringBuilder)localObject2).append(i);
            ((StringBuilder)localObject2).append(",\"cellid\":");
            ((StringBuilder)localObject2).append(n);
            ((StringBuilder)localObject2).append(",\"rss\":");
            ((StringBuilder)localObject2).append((i1 << 1) - 113);
            ((StringBuilder)localObject2).append("}");
            ((ArrayList)localObject1).add(((StringBuilder)localObject2).toString());
            continue;
          }
          i = 0;
        }
        catch (Exception paramdf)
        {
          paramdf = new StringBuilder("[");
          localObject2 = new dv(",");
          localObject1 = ((Iterable)localObject1).iterator();
          paramdf.append(((dv)localObject2).a(new StringBuilder(), (Iterator)localObject1).toString());
          paramdf.append("]");
          return paramdf.toString();
        }
        break;
        a("illeagal main cell! ", j, k, m, paramdf.d, paramdf.e);
        continue;
        label561:
        a("illeagal neighboringCell! ", j, k, m, i, n);
      }
    }
    
    public static String a(dg paramdg)
    {
      if (paramdg == null) {
        return "{}";
      }
      Location localLocation = paramdg.a;
      StringBuilder localStringBuilder = new StringBuilder();
      double d1 = a(localLocation.getLatitude(), 6);
      double d2 = a(localLocation.getLongitude(), 6);
      double d3 = a(localLocation.getAltitude(), 1);
      double d4 = a(localLocation.getAccuracy(), 1);
      double d5 = a(localLocation.getBearing(), 1);
      double d6 = a(localLocation.getSpeed(), 1);
      localStringBuilder.append("{");
      localStringBuilder.append("\"latitude\":");
      localStringBuilder.append(d1);
      localStringBuilder.append(",\"longitude\":");
      localStringBuilder.append(d2);
      localStringBuilder.append(",\"additional\":");
      localStringBuilder.append("\"" + d3 + "," + d4 + "," + d5 + "," + d6 + "," + paramdg.b + "\"");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public static String a(dj paramdj)
    {
      if ((paramdj == null) || (paramdj.a() == null)) {
        return "[]";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      if ((paramdj.a() == null) || (paramdj.a().size() <= 0))
      {
        localStringBuilder.append("]");
        return localStringBuilder.toString();
      }
      paramdj = paramdj.a();
      Iterator localIterator = paramdj.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        ScanResult localScanResult = (ScanResult)localIterator.next();
        paramdj.size();
        if (i > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("{\"mac\":\"").append(localScanResult.BSSID).append("\",");
        localStringBuilder.append("\"rssi\":").append(localScanResult.level).append("}");
        i += 1;
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    
    public static String a(String paramString)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      return str;
    }
    
    public static String a(String paramString1, String paramString2, int paramInt)
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        throw new IllegalArgumentException("wrong mode.");
      }
      if (paramString1 == null) {
        return null;
      }
      try
      {
        localObject = new SecretKeySpec(paramString2.getBytes("UTF-8"), "AES");
        paramString2 = Cipher.getInstance("AES/ECB/NoPadding");
        paramString2.init(paramInt, (Key)localObject);
        if (paramString2 == null) {
          return null;
        }
        if (paramInt == 1) {
          paramString1 = paramString1.getBytes();
        } else if (paramInt == 2) {
          paramString1 = Base64.decode(paramString1.getBytes(), 2);
        }
      }
      catch (Throwable paramString1)
      {
        return null;
      }
      int j = paramString1.length;
      Object localObject = new byte[j];
      int i = 0;
      break label173;
      label111:
      paramString2.doFinal(paramString1, i, 16, (byte[])localObject, i);
      i += 16;
      for (;;)
      {
        if (paramInt == 1) {
          return Base64.encodeToString((byte[])localObject, 2);
        }
        if (paramInt == 2)
        {
          paramString1 = new String((byte[])localObject);
          return paramString1;
        }
        return null;
        paramString1 = null;
        if (paramString1 != null) {
          break;
        }
        return null;
        label173:
        if (i < j)
        {
          if (i + 16 <= j) {
            break label111;
          }
          while (i < j)
          {
            localObject[i] = ((byte)(paramString1[i] ^ 0x5B));
            i += 1;
          }
        }
      }
    }
    
    public static HashMap<String, String> a()
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("https", "true");
      localHashMap.put("up_apps", "true");
      localHashMap.put("up_wifis", "true");
      localHashMap.put("start_daemon", "true");
      localHashMap.put("up_daemon_delay", "300000");
      localHashMap.put("gps_kalman", "false");
      localHashMap.put("min_wifi_scan_interval", "8000");
      localHashMap.put("collect_bles", "false");
      localHashMap.put("start_event_track", "false");
      return localHashMap;
    }
    
    private static void a(Closeable paramCloseable)
    {
      if (paramCloseable != null) {}
      try
      {
        paramCloseable.close();
        return;
      }
      catch (IOException paramCloseable) {}
    }
    
    private static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      boolean bool = true;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("getCellInfoWithJsonFormat: ");
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.append("isGsm=");
      if (paramInt3 == 1) {}
      for (;;)
      {
        paramString.append(bool);
        localStringBuilder.append(", mcc,mnc=").append(paramInt1).append(",").append(paramInt2);
        localStringBuilder.append(", lac,cid=").append(paramInt4).append(",").append(paramInt5);
        return;
        bool = false;
      }
    }
    
    /* Error */
    public static void a(byte[] paramArrayOfByte, java.io.File paramFile)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_3
      //   2: new 441	java/io/BufferedOutputStream
      //   5: dup
      //   6: new 443	java/io/FileOutputStream
      //   9: dup
      //   10: aload_1
      //   11: iconst_1
      //   12: invokespecial 446	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   15: invokespecial 449	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   18: astore_2
      //   19: aload_2
      //   20: astore_1
      //   21: aload_2
      //   22: aload_0
      //   23: invokevirtual 452	java/io/BufferedOutputStream:write	([B)V
      //   26: aload_2
      //   27: astore_1
      //   28: aload_2
      //   29: invokevirtual 455	java/io/BufferedOutputStream:flush	()V
      //   32: aload_2
      //   33: invokestatic 457	c/t/m/g/b$a:a	(Ljava/io/Closeable;)V
      //   36: return
      //   37: astore_0
      //   38: aconst_null
      //   39: astore_1
      //   40: aload_0
      //   41: athrow
      //   42: astore_0
      //   43: aload_1
      //   44: invokestatic 457	c/t/m/g/b$a:a	(Ljava/io/Closeable;)V
      //   47: aload_0
      //   48: athrow
      //   49: astore_0
      //   50: aload_3
      //   51: astore_1
      //   52: goto -9 -> 43
      //   55: astore_0
      //   56: aload_2
      //   57: astore_1
      //   58: goto -18 -> 40
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	61	0	paramArrayOfByte	byte[]
      //   0	61	1	paramFile	java.io.File
      //   18	39	2	localBufferedOutputStream	java.io.BufferedOutputStream
      //   1	50	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	19	37	java/io/IOException
      //   21	26	42	finally
      //   28	32	42	finally
      //   40	42	42	finally
      //   2	19	49	finally
      //   21	26	55	java/io/IOException
      //   28	32	55	java/io/IOException
    }
    
    public static boolean a(int paramInt)
    {
      return paramInt == 0;
    }
    
    public static boolean a(Location paramLocation, double[] paramArrayOfDouble)
    {
      int n = (int)(paramLocation.getLatitude() * 1000000.0D);
      int i1 = (int)(paramLocation.getLongitude() * 1000000.0D);
      paramLocation = c("tencent_loc_lib");
      int k = 0;
      int m = 0;
      while (k < paramLocation.length())
      {
        int i2 = paramLocation.charAt(k);
        int j = 256;
        int i = j;
        if (i2 >= 65)
        {
          i = j;
          if (i2 <= 90) {
            i = i2 - 65;
          }
        }
        j = i;
        if (i2 >= 97)
        {
          j = i;
          if (i2 <= 122) {
            j = i2 - 97 + 64;
          }
        }
        i = j;
        if (i2 >= 48)
        {
          i = j;
          if (i2 <= 57) {
            i = i2 + 128 - 48;
          }
        }
        m += i;
        k += 1;
      }
      paramLocation = new double[2];
      try
      {
        e.b(n ^ m, m ^ i1, paramLocation);
        paramArrayOfDouble[0] = paramLocation[0];
        paramArrayOfDouble[1] = paramLocation[1];
        return true;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        for (;;) {}
      }
    }
    
    public static boolean a(Object paramObject)
    {
      return paramObject == null;
    }
    
    public static boolean a(Object paramObject1, Object paramObject2)
    {
      return (paramObject1 == null) || (paramObject2 == null);
    }
    
    public static boolean a(Object paramObject, Object... paramVarArgs)
    {
      if ((paramVarArgs == null) && (paramObject == null)) {}
      for (int i = 1; i == 0; i = 0) {
        return false;
      }
      int j = paramVarArgs.length;
      i = 0;
      for (;;)
      {
        if (i >= j) {
          break label44;
        }
        if (paramVarArgs[i] != null) {
          break;
        }
        i += 1;
      }
      label44:
      return true;
    }
    
    public static boolean a(List<ScanResult> paramList1, List<ScanResult> paramList2)
    {
      boolean bool = false;
      if ((paramList1 == null) || (paramList2 == null)) {}
      int j;
      do
      {
        return false;
        j = paramList1.size();
        k = paramList2.size();
        if ((j == 0) && (k == 0)) {
          return true;
        }
      } while ((j == 0) || (k == 0));
      if (paramList1.size() > paramList2.size()) {}
      int i;
      for (;;)
      {
        paramList2 = paramList2.iterator();
        i = 0;
        for (;;)
        {
          if (!paramList2.hasNext()) {
            break label152;
          }
          localObject = (ScanResult)paramList2.next();
          Iterator localIterator = paramList1.iterator();
          if (localIterator.hasNext())
          {
            if (!((ScanResult)localIterator.next()).BSSID.equals(((ScanResult)localObject).BSSID)) {
              break;
            }
            i += 1;
          }
        }
        Object localObject = paramList1;
        paramList1 = paramList2;
        paramList2 = (List<ScanResult>)localObject;
      }
      label152:
      int k = j + k;
      if ((i << 1 < k * 0.85D) || (i < 13)) {
        bool = true;
      }
      new StringBuilder("isDiffrent:c=").append(j).append(",k=").append(i).append(",f=").append(k).append(",r=0.85,s=").append(bool);
      return bool;
    }
    
    public static byte[] a(byte[] paramArrayOfByte)
    {
      Object localObject2 = null;
      Object localObject1 = localObject2;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
        localObject1 = localObject2;
        GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
        localObject1 = localObject2;
        localGZIPOutputStream.write(paramArrayOfByte);
        localObject1 = localObject2;
        localGZIPOutputStream.close();
        localObject1 = localObject2;
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        localObject1 = paramArrayOfByte;
        localByteArrayOutputStream.close();
        return paramArrayOfByte;
      }
      catch (Throwable paramArrayOfByte) {}
      return (byte[])localObject1;
    }
    
    public static <T> T b(T paramT, Object paramObject)
    {
      if (paramT == null) {
        throw new NullPointerException(String.valueOf(paramObject));
      }
      return paramT;
    }
    
    public static boolean b(Context paramContext)
    {
      int i = 1;
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localObject == null) {}
      while (i != 0)
      {
        return false;
        i = 0;
      }
      for (;;)
      {
        try
        {
          paramContext = ((ConnectivityManager)localObject).getNetworkInfo(0);
          localObject = ((ConnectivityManager)localObject).getNetworkInfo(1);
          if (localObject != null)
          {
            boolean bool2 = ((NetworkInfo)localObject).isConnected();
            bool1 = bool2;
            if (!bool2)
            {
              bool1 = bool2;
              if (paramContext != null) {
                bool1 = paramContext.isConnected();
              }
            }
            return bool1;
          }
        }
        catch (Exception paramContext)
        {
          return false;
        }
        boolean bool1 = false;
      }
    }
    
    public static boolean b(Object paramObject)
    {
      return paramObject != null;
    }
    
    public static boolean b(String paramString)
    {
      do
      {
        JSONObject localJSONObject;
        do
        {
          try
          {
            localJSONObject = new JSONObject(paramString);
            if (paramString.contains("latitude")) {
              return true;
            }
          }
          catch (Exception paramString)
          {
            return false;
          }
          paramString = localJSONObject.optJSONArray("cells");
        } while ((paramString != null) && (paramString.length() > 0));
        paramString = localJSONObject.optJSONArray("wifis");
      } while ((paramString != null) && (paramString.length() > 0));
      return false;
    }
    
    public static byte[] b(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte == null) {
        return null;
      }
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DeflaterOutputStream localDeflaterOutputStream = new DeflaterOutputStream(localByteArrayOutputStream);
      try
      {
        localDeflaterOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
        localDeflaterOutputStream.finish();
        localDeflaterOutputStream.flush();
        localDeflaterOutputStream.close();
        return localByteArrayOutputStream.toByteArray();
      }
      catch (Exception paramArrayOfByte) {}
      return null;
    }
    
    private static int c(Context paramContext)
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null) {}
      for (int i = 1; i != 0; i = 0) {
        return -1;
      }
      try
      {
        paramContext = paramContext.getActiveNetworkInfo();
        if (paramContext != null)
        {
          i = paramContext.getType();
          return i;
        }
      }
      catch (Exception paramContext) {}
      return -1;
    }
    
    public static String c(String paramString)
    {
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString.getBytes());
        localObject = ((MessageDigest)localObject).digest();
        StringBuilder localStringBuilder = new StringBuilder();
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          localStringBuilder.append(Integer.toHexString(localObject[i] & 0xFF)).append("");
          i += 1;
        }
        localObject = localStringBuilder.toString();
        return (String)localObject;
      }
      catch (Exception localException) {}
      return paramString;
    }
    
    @Nullable
    public static byte[] c(byte[] paramArrayOfByte)
    {
      int i = 0;
      if (paramArrayOfByte == null) {
        return null;
      }
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
      InflaterInputStream localInflaterInputStream = new InflaterInputStream(localByteArrayInputStream);
      paramArrayOfByte = new byte[0];
      byte[] arrayOfByte2 = new byte['Ѐ'];
      for (;;)
      {
        try
        {
          int j = localInflaterInputStream.read(arrayOfByte2);
          if (j > 0)
          {
            i += j;
            byte[] arrayOfByte1 = new byte[i];
            System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, paramArrayOfByte.length);
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramArrayOfByte.length, j);
            paramArrayOfByte = arrayOfByte1;
            if (j <= 0) {
              try
              {
                localByteArrayInputStream.close();
                localInflaterInputStream.close();
                return paramArrayOfByte;
              }
              catch (IOException paramArrayOfByte)
              {
                return null;
              }
            }
          }
        }
        catch (Exception paramArrayOfByte)
        {
          return null;
        }
      }
    }
  }
  
  final class b
    extends Handler
  {
    private b(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if (!b.this.a) {
        return;
      }
      sendEmptyMessageDelayed(0, 30000L);
      paramMessage = dt.a(b.a(b.this));
      b.a(b.this, paramMessage);
    }
  }
  
  static final class c
    implements Runnable
  {
    private cj a;
    private df b;
    
    public c(cj paramcj)
    {
      this.a = paramcj;
    }
    
    public final void a(df paramdf)
    {
      this.b = paramdf;
    }
    
    public final void run()
    {
      cj localcj = this.a;
      df localdf = this.b;
      if (localdf != null)
      {
        localdf.a(dt.b(localcj));
        localcj.c(localdf);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
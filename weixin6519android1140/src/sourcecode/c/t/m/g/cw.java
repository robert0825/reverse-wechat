package c.t.m.g;

import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.tencent.map.geolocation.TencentDistanceAnalysis;
import com.tencent.map.geolocation.TencentDistanceListener;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManagerOptions;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import com.tencent.tencentmap.lbssdk.service.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONException;

public final class cw
{
  public static SparseArray<String> a;
  private static final TencentLocationListener b = new TencentLocationListener()
  {
    public final void onLocationChanged(TencentLocation paramAnonymousTencentLocation, int paramAnonymousInt, String paramAnonymousString) {}
    
    public final void onStatusUpdate(String paramAnonymousString1, int paramAnonymousInt, String paramAnonymousString2) {}
  };
  public boolean A = false;
  public volatile long B = 0L;
  public volatile int C = 0;
  public double D = 0.0D;
  private int E = 0;
  private int F = 0;
  private int G = 0;
  private TencentLocation H;
  public TencentDistanceListener I;
  public long J;
  public final Object K = new Object();
  public final TencentLocationRequest L = TencentLocationRequest.create();
  public ds M;
  private double N;
  private double O;
  public ds P;
  public int Q = 404;
  public long R;
  public b S = b.d;
  public String T;
  public volatile boolean U = false;
  public int c = 1;
  private a d;
  private boolean e;
  private b f;
  private cy g;
  private boolean h;
  public cv i;
  public dc j;
  private ct k;
  private cq l;
  private cx m;
  public da n;
  private HandlerThread o;
  private volatile int p = 0;
  private db q;
  public cl r;
  private df s;
  public dj t;
  private dg u;
  public final cj v;
  public ck w;
  public TencentLocationListener x;
  public List<TencentLocationListener> y;
  public long z = 0L;
  
  static
  {
    SparseArray localSparseArray = new SparseArray();
    a = localSparseArray;
    localSparseArray.put(0, "OK");
    a.put(1, "ERROR_NETWORK");
    a.put(2, "ERROR_NO_CELL&WIFI");
    a.put(4, "DEFLECT_FAILED");
    a.put(404, "ERROR_SERVER_NOT_LOCATION");
    cg.a(b.a.a());
  }
  
  public cw(cj paramcj)
  {
    this.v = paramcj;
    if (TencentLocationManagerOptions.isLoadLibraryEnabled()) {}
    try
    {
      System.loadLibrary("tencentloc");
      this.w = this.v.h();
      String str = b.a.a(this.w.h);
      this.T = a(str);
      if (TextUtils.isEmpty(this.T))
      {
        new StringBuilder("requestLocationUpdates: illegal key [").append(str).append("]");
        this.p = 2;
        return;
      }
    }
    catch (Throwable paramcj)
    {
      this.p = 3;
      return;
    }
    this.v.a(this);
    this.r = cm.b();
    this.q = new db();
    this.y = new LinkedList();
    this.m = new cx(this.v);
    this.n = new da(this.v);
    this.k = ct.a(paramcj.a);
    if (Build.VERSION.SDK_INT >= 21) {
      this.l = new cq(this.v.a);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT >= 18)
    {
      bool = true;
      this.h = bool;
      if (!this.h) {
        break label399;
      }
      this.f = null;
      this.j = m();
      if (this.v.e()) {
        break label384;
      }
    }
    label384:
    for (paramcj = null;; paramcj = new cy(this.v))
    {
      this.g = paramcj;
      localcv = l();
      this.i = localcv;
      this.e = b.a.a(paramcj, new Object[] { localcv });
      if (!this.e) {
        break label473;
      }
      this.p = 1;
      return;
      bool = false;
      break;
    }
    label399:
    this.g = null;
    this.j = m();
    if (!this.v.e()) {}
    for (paramcj = localcv;; paramcj = new b(this.v))
    {
      this.f = paramcj;
      localcv = l();
      this.i = localcv;
      this.e = b.a.a(paramcj, new Object[] { localcv });
      break;
    }
    try
    {
      label473:
      cg.a(this.v.a, "txsdk", this.v.h().d());
      cg.a(this.T);
      cg.a().a(this.v.l());
      return;
    }
    catch (Throwable paramcj) {}
  }
  
  private static String a(String paramString)
  {
    int i1 = 1;
    if (paramString.contains(",")) {}
    try
    {
      paramString = paramString.split(",");
      if ((paramString == null) || (paramString.length <= 1) || (paramString[0] == null) || (paramString[1] == null) || (e.w(paramString[0], paramString[1]) <= 0)) {
        break label86;
      }
    }
    catch (UnsatisfiedLinkError paramString)
    {
      return null;
    }
    i1 = e.v(paramString);
    if (i1 >= 0) {
      return Integer.toString(i1);
    }
    return "";
    while (i1 != 0)
    {
      return paramString[0];
      label86:
      i1 = 0;
    }
    return "";
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    String str1 = null;
    switch (paramInt1)
    {
    }
    for (Object localObject3 = null;; localObject3 = ???)
    {
      synchronized (this.K)
      {
        for (;;)
        {
          if (this.x != null) {
            this.x.onStatusUpdate((String)localObject3, paramInt2, str1);
          }
          return;
          localObject3 = "gps";
          switch (paramInt2)
          {
          default: 
            str1 = "unknown";
            break;
          case 1: 
            str1 = "gps enabled";
            break;
          case 0: 
            str1 = "gps disabled";
            continue;
            localObject3 = "gps";
            switch (paramInt2)
            {
            default: 
              str1 = "unknown";
              break;
            case 3: 
              str1 = "gps available";
              break;
            case 4: 
              str1 = "gps unavailable";
            }
            break;
          }
        }
        ??? = "cell";
        if (paramInt2 == 1) {
          str1 = "cell enabled";
        }
        for (;;)
        {
          localObject3 = str1;
          if (!dt.a) {
            break label334;
          }
          str1 = "location permission denied";
          paramInt2 = 2;
          localObject3 = "cell";
          break;
          if (paramInt2 == 0) {
            str1 = "cell disabled";
          } else {
            str1 = "unknown";
          }
        }
        String str2 = "wifi";
        switch (paramInt2)
        {
        case 2: 
        case 3: 
        case 4: 
        default: 
          str1 = "unknown";
        case 0: 
        case 1: 
          for (;;)
          {
            localObject3 = str1;
            ??? = str2;
            if (paramInt2 == 5) {
              break label334;
            }
            localObject3 = str1;
            ??? = str2;
            if (!dy.a) {
              break label334;
            }
            str1 = "location permission denied";
            paramInt2 = 2;
            localObject3 = "wifi";
            break;
            str1 = "wifi disabled";
            continue;
            str1 = "wifi enabled";
          }
        }
        str1 = "location service switch is off";
      }
      label334:
      Object localObject2 = localObject3;
    }
  }
  
  private void a(int paramInt, long paramLong)
  {
    if (this.d != null)
    {
      this.d.removeMessages(paramInt);
      this.d.sendEmptyMessageDelayed(paramInt, paramLong);
    }
  }
  
  private void a(Looper paramLooper)
  {
    boolean bool2 = true;
    if (Looper.myLooper() == null) {
      Looper.prepare();
    }
    boolean bool3;
    boolean bool1;
    label66:
    Object localObject1;
    if (b.a.a(this.d))
    {
      this.d = new a(paramLooper);
      h();
      bool3 = this.L.getExtras().getBoolean("use_network", true);
      if (b.b != this.S) {
        break label309;
      }
      bool1 = true;
      paramLooper = this.d;
      localObject1 = this.n;
      if (!((da)localObject1).g)
      {
        ((da)localObject1).g = true;
        ((da)localObject1).h = bool1;
        ((da)localObject1).b.j().execute(new da.1((da)localObject1, paramLooper));
        ((da)localObject1).f = SystemClock.elapsedRealtime();
      }
      if (!this.h) {
        break label314;
      }
      if ((bool3) && (b.a.b(this.g))) {
        this.g.a(paramLooper, bool1);
      }
      label159:
      if ((bool3) && (b.a.b(this.j)))
      {
        this.j.a(this.w.m);
        this.j.a(paramLooper, bool1);
      }
      if ((b.a.b(this.i)) && (this.L.isAllowGPS()))
      {
        localObject1 = this.i;
        if (this.c != 1) {
          break label339;
        }
        label231:
        ((cv)localObject1).b(bool2);
        this.i.a(bool1);
      }
      if (!bool1) {
        break label397;
      }
      paramLooper = this.n;
      localObject1 = this.v.k();
    }
    label309:
    label314:
    label339:
    label397:
    do
    {
      try
      {
        bool1 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool1)
        {
          return;
          this.d.removeCallbacksAndMessages(null);
          if (this.d.getLooper() == paramLooper) {
            break;
          }
          this.d = new a(paramLooper);
          break;
          bool1 = false;
          break label66;
          if ((!bool3) || (!b.a.b(this.f))) {
            break label159;
          }
          this.f.a();
          break label159;
          bool2 = false;
          break label231;
        }
        Object localObject2 = b.a.a(((String)localObject1).getBytes("UTF-8"));
        e.o((byte[])localObject2, 2);
        localObject2 = new da.a(2, (byte[])localObject2, "http://ue.indoorloc.map.qq.com/", null);
        ((da.a)localObject2).b = ((String)localObject1);
        paramLooper.a((da.a)localObject2);
        return;
      }
      catch (Throwable paramLooper)
      {
        return;
      }
      if (!ch.a().d("collect_bles")) {
        this.l = null;
      }
      if (b.a.b(this.l)) {
        this.l.a();
      }
      this.m.a(paramLooper);
    } while ((!b.a.b(this.k)) || (!this.L.isAllowDirection()));
    this.k.a(paramLooper);
  }
  
  private void b(int paramInt)
  {
    if (this.d != null) {
      this.d.sendEmptyMessage(paramInt);
    }
  }
  
  private void h()
  {
    dt.a = false;
    if (b.a.b(this.m)) {
      this.m.a();
    }
    if (b.a.b(this.n))
    {
      da localda = this.n;
      if (localda.g)
      {
        localda.g = false;
        localda.a.clear();
        localda.a.offer(da.a.d);
        if (localda.f != 0L)
        {
          long l1 = SystemClock.elapsedRealtime();
          long l2 = localda.f;
          String.format(Locale.ENGLISH, "shutdown: duration=%ds, sent=%dB, recv=%dB, reqCount=%d", new Object[] { Long.valueOf((l1 - l2) / 1000L), Long.valueOf(localda.d), Long.valueOf(localda.e), Long.valueOf(localda.c) });
        }
        localda.c = 0L;
        localda.d = 0L;
        localda.e = 0L;
        localda.f = 0L;
      }
    }
    if (b.a.b(this.q)) {
      this.q.a();
    }
    if (b.a.b(this.j)) {
      this.j.a();
    }
    if (this.h) {
      if (b.a.b(this.g)) {
        this.g.a();
      }
    }
    for (;;)
    {
      if (b.a.b(this.i)) {
        this.i.b();
      }
      if ((b.a.b(this.k)) && (this.L.isAllowDirection())) {
        this.k.a();
      }
      if (b.a.b(this.l)) {
        this.l.b();
      }
      if (this.U)
      {
        cg.a().c();
        this.U = false;
      }
      return;
      if (b.a.b(this.f)) {
        this.f.b();
      }
    }
  }
  
  private void i()
  {
    this.C = 0;
    this.t = null;
    this.s = null;
    this.u = null;
    this.J = 0L;
    dh.a = 0;
    if (Build.VERSION.SDK_INT >= 12) {
      this.v.a("cell").a();
    }
    if (this.w != null)
    {
      this.w.q = "";
      this.w.p = 0L;
      this.w.o = 0L;
      this.w.n = 0L;
    }
  }
  
  @Nullable
  private cv l()
  {
    if (!this.v.g()) {
      return null;
    }
    return new cv(this.v);
  }
  
  @Nullable
  private dc m()
  {
    if (!this.v.f()) {
      return null;
    }
    return new dc(this.v);
  }
  
  public final int a(TencentDistanceListener paramTencentDistanceListener)
  {
    if (this.x == null) {
      return 1;
    }
    if (this.A) {
      return 2;
    }
    this.A = true;
    this.I = paramTencentDistanceListener;
    return 0;
  }
  
  public final int a(TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    if (System.currentTimeMillis() - this.z < 2000L)
    {
      if (paramTencentLocationListener != null) {
        this.y.add(paramTencentLocationListener);
      }
      return 0;
    }
    this.z = System.currentTimeMillis();
    if (paramTencentLocationListener != null) {
      this.y.add(paramTencentLocationListener);
    }
    if ((this.y != null) && (this.Q == 0) && (this.M != null) && (((this.M.getProvider().equals("gps")) && (System.currentTimeMillis() - this.M.getTime() <= 90000L)) || ((this.M.getProvider().equals("network")) && (System.currentTimeMillis() - this.M.getTime() <= 30000L))))
    {
      try
      {
        paramTencentLocationListener = this.y.iterator();
        while (paramTencentLocationListener.hasNext())
        {
          ((TencentLocationListener)paramTencentLocationListener.next()).onLocationChanged(this.M, this.Q, (String)a.get(this.Q));
          continue;
          this.z = 0L;
        }
      }
      catch (Throwable paramTencentLocationListener) {}
      for (;;)
      {
        return 0;
        this.y.clear();
      }
    }
    if (this.S == b.a)
    {
      b(3997);
      return 0;
    }
    this.S = b.c;
    return a(TencentLocationRequest.create().setInterval(0L), b, paramLooper);
  }
  
  public final int a(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    if (this.p != 0) {
      return this.p;
    }
    i();
    if (this.w != null) {
      this.w.n = System.currentTimeMillis();
    }
    this.Q = 404;
    this.M = null;
    synchronized (this.K)
    {
      this.x = paramTencentLocationListener;
      if ((this.w != null) && ("0123456789ABCDEF".equals(this.w.a()))) {
        this.v.a();
      }
      this.w.g = paramTencentLocationRequest.getQQ();
      TencentLocationRequest.copy(this.L, paramTencentLocationRequest);
      if (TextUtils.isEmpty(b.a.a(this.w.e))) {
        this.w.e = paramTencentLocationRequest.getPhoneNumber();
      }
      paramTencentLocationListener = this.w;
      long l1 = paramTencentLocationRequest.getInterval();
      paramTencentLocationListener.m = Math.max(ch.a().c("min_wifi_scan_interval"), l1);
      this.B = paramTencentLocationRequest.getInterval();
      this.S = b.a;
      if (this.o != null)
      {
        this.o.quit();
        this.o = null;
      }
      a(paramLooper);
      return 0;
    }
  }
  
  public final TencentLocation a()
  {
    if (this.Q == 0)
    {
      a(this.M);
      return this.M;
    }
    return null;
  }
  
  public final void a(int paramInt)
  {
    if (this.c == paramInt) {
      return;
    }
    this.c = paramInt;
  }
  
  public final void a(int paramInt, ds paramds)
  {
    int i2 = 0;
    if (paramds == null) {
      return;
    }
    if ((paramInt == 0) && (paramds.getLatitude() != 0.0D) && (paramds.getLongitude() != 0.0D)) {
      if ((this.c != 1) || (!du.a(paramds.getLatitude(), paramds.getLongitude()))) {
        break label751;
      }
    }
    label745:
    label751:
    for (int i1 = 1;; i1 = 0)
    {
      ds.a(paramds, i1);
      if (j()) {
        if ((this.Q == 0) || (paramInt != 0)) {
          break label745;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        this.Q = paramInt;
        this.M = paramds;
        if ((paramds.getAccuracy() < 5000.0F) && (paramds.getAccuracy() > 0.0F))
        {
          this.q.a(paramds);
          if (this.A) {
            this.H = paramds;
          }
        }
        this.N = paramds.getLatitude();
        this.O = paramds.getLongitude();
        if ((b.a.b(this.x)) && (this.L.getInterval() > 0L)) {
          a(11999, this.L.getInterval());
        }
        if (i1 != 0) {
          b(11998);
        }
        for (;;)
        {
          i1 = i2;
          if (this.Q != 0)
          {
            i1 = i2;
            if (paramInt == 0) {
              i1 = 1;
            }
          }
          i2 = i1;
          if (this.Q == 0)
          {
            i2 = i1;
            if (this.M != null)
            {
              i2 = i1;
              if (this.M.getProvider().equals("network"))
              {
                i2 = i1;
                if (paramInt == 0)
                {
                  i2 = i1;
                  if (paramds != null)
                  {
                    i2 = i1;
                    if (paramds.getProvider().equals("gps")) {
                      i2 = 1;
                    }
                  }
                }
              }
            }
          }
          i1 = i2;
          if (this.Q == 0)
          {
            i1 = i2;
            if (this.M != null)
            {
              i1 = i2;
              if (this.M.getProvider().equals("gps"))
              {
                i1 = i2;
                if (paramInt == 0)
                {
                  i1 = i2;
                  if (paramds != null)
                  {
                    i1 = i2;
                    if (paramds.getProvider().equals("network")) {
                      i1 = 1;
                    }
                  }
                }
              }
            }
          }
          this.Q = paramInt;
          this.M = paramds;
          if ((this.L.getInterval() == 0L) && (b.a.b(this.x))) {
            b(11998);
          }
          if ((i1 == 0) || (!b.a.b(this.x))) {
            break;
          }
          b(11998);
          return;
          if ((paramInt == 0) && (paramds.getLatitude() != 0.0D) && (paramds.getLongitude() != 0.0D) && (Math.abs(paramds.getLatitude() - this.N) >= 1.0E-8D) && (Math.abs(paramds.getLongitude() - this.O) >= 1.0E-8D))
          {
            if (!this.q.a(paramds, this.v, this.i.d()))
            {
              new StringBuilder("discard ").append(paramds);
              return;
            }
            this.N = paramds.getLatitude();
            this.O = paramds.getLongitude();
            if ((paramds.getAccuracy() < 5000.0F) && (paramds.getAccuracy() > 0.0F))
            {
              this.q.a(paramds);
              this.q.a(paramds);
              if (this.A) {
                if (this.H != null)
                {
                  double d1 = b.a.a(this.H.getLatitude(), this.H.getLongitude(), paramds.getLatitude(), paramds.getLongitude());
                  if (((paramds.getProvider().equalsIgnoreCase("network")) && (d1 > 10.0D)) || ((paramds.getProvider().equalsIgnoreCase("gps")) && (d1 > 3.0D)))
                  {
                    this.D = (d1 + this.D);
                    if (paramds.getProvider().equalsIgnoreCase("network")) {
                      this.F += 1;
                    }
                    for (;;)
                    {
                      this.G += 1;
                      this.H = paramds;
                      break;
                      this.E += 1;
                    }
                  }
                }
                else
                {
                  this.H = paramds;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(ds paramds)
  {
    if (paramds != null) {
      if ((this.k != null) && (this.L.isAllowDirection())) {
        paramds.getExtra().putDouble("direction", this.k.b());
      }
    }
    try
    {
      paramds.getExtra().putAll(this.L.getExtras());
      return;
    }
    catch (Exception paramds) {}
  }
  
  public final TencentDistanceAnalysis b()
  {
    this.I = null;
    this.D = 0.0D;
    this.A = false;
    this.H = null;
    dm localdm = new dm();
    localdm.a(b.a.a((this.E + 1) / (this.G + 1), 4) * 100.0D);
    localdm.a(this.E);
    localdm.b(this.F);
    this.E = 0;
    this.F = 0;
    this.G = 0;
    return localdm;
  }
  
  public final boolean c()
  {
    this.C = 1;
    return true;
  }
  
  public final boolean d()
  {
    if (this.C > 0)
    {
      if (b.a.b(this.j)) {
        this.j.a(this.w.m);
      }
      if (b.a.b(Long.valueOf(this.B))) {
        this.B = this.L.getInterval();
      }
      this.C = 0;
    }
    return true;
  }
  
  public final void e()
  {
    h();
    if (b.a.b(this.d)) {
      this.d.a();
    }
    synchronized (this.K)
    {
      this.x = null;
      if (b.a.b(this.r)) {
        this.r.a();
      }
      i();
      if ((ch.a().d("start_daemon")) && (this.S == b.a) && (dy.c(this.v).equalsIgnoreCase("{}")))
      {
        this.o = new HandlerThread("daemon_thread");
        this.o.start();
        this.S = b.b;
        a(this.o.getLooper());
        this.R = System.currentTimeMillis();
      }
      return;
    }
  }
  
  public final int f()
  {
    return this.c;
  }
  
  public final boolean j()
  {
    return this.Q == 404;
  }
  
  public final boolean k()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.i != null)
    {
      bool1 = bool2;
      if (this.i.d())
      {
        bool1 = bool2;
        if (this.i.c()) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final void onCellInfoEvent(df paramdf)
  {
    this.s = paramdf;
    if (this.j != null) {}
    for (int i1 = this.j.b();; i1 = 1)
    {
      if (i1 != 0) {
        this.t = null;
      }
      long l1 = Math.max(this.L.getInterval(), 20000L);
      if ((i1 == 1) || (this.J == -1L) || ((this.J > 0L) && (System.currentTimeMillis() - this.J > l1))) {
        b(3999);
      }
      new StringBuilder("cell change run prepare json,because status:").append(i1).append(",mLastWF:").append(this.J).append(",current:").append(System.currentTimeMillis());
      return;
    }
  }
  
  public final void onGpsInfoEvent(dg paramdg)
  {
    double d1 = 0.0D;
    int i1;
    int i2;
    ds localds;
    Location localLocation;
    Object localObject;
    double d2;
    if (paramdg.a != cs.a)
    {
      this.u = paramdg;
      cu.a().a(paramdg);
      i1 = this.c;
      i2 = this.L.getRequestLevel();
      localds = this.P;
      localLocation = new Location(paramdg.a);
      localObject = localLocation.getExtras();
      if (localObject == null) {
        break label291;
      }
      d2 = ((Bundle)localObject).getDouble("lat");
      d1 = ((Bundle)localObject).getDouble("lng");
    }
    for (;;)
    {
      if (b.a.a(i1))
      {
        localObject = new ds.a();
        ((ds.a)localObject).b = localds;
        ((ds.a)localObject).d = "gps";
        ((ds.a)localObject).c = i2;
        paramdg = ((ds.a)localObject).a(new Location(paramdg.a)).a();
        localLocation.setLatitude(d2);
        localLocation.setLongitude(d1);
        paramdg.a(localLocation);
        a(0, paramdg);
      }
      for (;;)
      {
        if (this.i != null) {
          this.i.c();
        }
        return;
        if (j()) {
          b(3999);
        }
        localObject = new ds.a();
        ((ds.a)localObject).b = localds;
        ((ds.a)localObject).d = "gps";
        ((ds.a)localObject).c = i2;
        paramdg = ((ds.a)localObject).a(new Location(paramdg.a)).a();
        localLocation.setLatitude(d2);
        localLocation.setLongitude(d1);
        paramdg.a(localLocation);
        a(0, paramdg);
        a(12004, 3);
      }
      label291:
      d2 = 0.0D;
    }
  }
  
  public final void onNetworkEvent(Integer paramInteger)
  {
    String str = b.a.a(this.v.a);
    switch (paramInteger.intValue())
    {
    case -1: 
    default: 
      return;
    case 0: 
      new StringBuilder("onNetworkEvent: ").append(str).append(" disconnected");
      return;
    }
    new StringBuilder("onNetworkEvent: ").append(str).append(" connected");
    a(7999, 1000L);
  }
  
  public final void onStatusEvent(Message paramMessage)
  {
    int i1 = paramMessage.what;
    a(paramMessage.arg1, paramMessage.arg2);
  }
  
  public final void onWifiInfoEvent(dj paramdj)
  {
    if ((this.t == null) || (this.C == 2) || (paramdj == dj.a) || (this.J == -1L) || (paramdj.a().size() < 3) || (!this.t.a(paramdj))) {
      b(3999);
    }
    this.t = paramdj;
  }
  
  final class a
    extends Handler
  {
    private int a;
    private long b = 0L;
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    
    a(Looper paramLooper)
    {
      super();
    }
    
    private void a(int paramInt)
    {
      if (cw.this.y != null) {
        try
        {
          if (cw.this.Q == 0)
          {
            Iterator localIterator1 = cw.this.y.iterator();
            while (localIterator1.hasNext())
            {
              ((TencentLocationListener)localIterator1.next()).onLocationChanged(cw.this.M, cw.this.Q, (String)cw.a.get(cw.this.Q));
              continue;
              cw.this.z = 0L;
            }
          }
        }
        catch (Throwable localThrowable) {}
      }
      for (;;)
      {
        if (cw.this.S == cw.b.c) {
          cw.this.e();
        }
        return;
        Iterator localIterator2 = cw.this.y.iterator();
        while (localIterator2.hasNext()) {
          ((TencentLocationListener)localIterator2.next()).onLocationChanged(ds.a, paramInt, (String)cw.a.get(paramInt));
        }
        cw.this.y.clear();
      }
    }
    
    private void b(int paramInt)
    {
      double d1 = 0.0D;
      Object localObject1 = cw.this.i.a();
      Location localLocation;
      Object localObject2;
      double d2;
      if ((localObject1 != cs.a) && (cw.this.J == 0L))
      {
        localLocation = new Location((Location)localObject1);
        localObject2 = localLocation.getExtras();
        if (localObject2 == null) {
          break label223;
        }
        d2 = ((Bundle)localObject2).getDouble("lat");
        d1 = ((Bundle)localObject2).getDouble("lng");
      }
      for (;;)
      {
        localObject2 = new ds.a();
        ((ds.a)localObject2).d = "network";
        localObject1 = ((ds.a)localObject2).a((Location)localObject1).a();
        if (cw.this.c == 1)
        {
          localLocation.setLatitude(d2);
          localLocation.setLongitude(d1);
          ((ds)localObject1).a(localLocation);
        }
        if (!cw.this.k()) {
          cw.this.a(0, (ds)localObject1);
        }
        a(0);
        return;
        if ((cw.this.Q == 0) && (cw.this.M != null) && (System.currentTimeMillis() - cw.this.M.getTime() < 120000L))
        {
          a(0);
          return;
        }
        cw.this.a(paramInt, ds.a);
        a(paramInt);
        return;
        label223:
        d2 = 0.0D;
      }
    }
    
    public final void a()
    {
      this.e = 0;
      removeCallbacksAndMessages(null);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject1;
      int j;
      long l1;
      synchronized (cw.this.K)
      {
        if ((cw.this.x == null) && (cw.this.S == cw.b.a)) {
          return;
        }
        localObject1 = cw.this.x;
        ??? = cw.this.L;
        j = ((TencentLocationRequest)???).getRequestLevel();
        l1 = cw.this.B;
      }
      for (;;)
      {
        int i;
        try
        {
          long l2;
          Object localObject3;
          Object localObject4;
          switch (paramMessage.what)
          {
          case 554: 
            paramMessage = paramMessage.getData();
            if (paramMessage != null)
            {
              paramMessage = paramMessage.getString("WIFIS");
              if (!TextUtils.isEmpty(paramMessage))
              {
                localObject1 = cw.this.n;
                try
                {
                  if (TextUtils.isEmpty(paramMessage)) {
                    continue;
                  }
                  ??? = b.a.a(paramMessage.getBytes("UTF-8"));
                  e.o((byte[])???, 2);
                  ??? = new da.a(3, (byte[])???, "http://ue.indoorloc.map.qq.com/?wl", null);
                  ((da.a)???).b = paramMessage;
                  ((da)localObject1).a((da.a)???);
                  return;
                }
                catch (Throwable paramMessage)
                {
                  return;
                }
                paramMessage = finally;
                throw paramMessage;
              }
            }
          case 11999: 
            if ((cw.this.M != null) && (((TencentLocationRequest)???).getInterval() > 0L) && (localObject1 != null))
            {
              cw.this.a(cw.this.M);
              ((TencentLocationListener)localObject1).onLocationChanged(cw.this.M, cw.this.Q, (String)cw.a.get(cw.this.Q));
              if ((cw.this.A) && (cw.this.I != null)) {
                cw.this.I.onDistanceChanged(cw.this.M, b.a.a(cw.this.D / 1000.0D, 2), cw.this.Q, (String)cw.a.get(cw.this.Q));
              }
            }
            if (l1 > 0L)
            {
              sendEmptyMessageDelayed(11999, l1);
              return;
            }
          case 11998: 
            if ((cw.this.M != null) && (localObject1 != null))
            {
              cw.this.a(cw.this.M);
              ((TencentLocationListener)localObject1).onLocationChanged(cw.this.M, cw.this.Q, (String)cw.a.get(cw.this.Q));
              if ((cw.this.A) && (cw.this.I != null))
              {
                cw.this.I.onDistanceChanged(cw.this.M, b.a.a(cw.this.D / 1000.0D, 2), cw.this.Q, (String)cw.a.get(cw.this.Q));
                return;
              }
            }
          case 7999: 
            if (!cw.this.j())
            {
              l1 = Math.max(cw.this.L.getInterval(), 4000L);
              if ((cw.this.J == 0L) || (System.currentTimeMillis() - cw.this.J < l1)) {}
            }
          case 3999: 
            removeMessages(3999);
            if (cw.this.S == cw.b.b)
            {
              l2 = ch.a().c("up_daemon_delay");
              l1 = l2;
              if (l2 < 120000L) {
                l1 = 120000L;
              }
              new StringBuilder("the daemonLocation,so we delay long time upload:").append(l1).append(",").append(System.currentTimeMillis()).append(",").append(cw.this.R);
              if (System.currentTimeMillis() - cw.this.R >= l1) {
                cw.this.R = System.currentTimeMillis();
              }
            }
            else
            {
              int k = cw.this.c;
              paramMessage = cw.o(cw.this);
              if (paramMessage == null)
              {
                b(2);
                return;
              }
              if ((paramMessage.b()) && (System.currentTimeMillis() - this.b > 60000L))
              {
                this.c = true;
                this.d = false;
                this.b = System.currentTimeMillis();
                localObject3 = cw.this.T;
                localObject4 = cw.this.v;
                boolean bool2 = this.c;
                boolean bool3 = this.d;
                if (cw.this.S != cw.b.b) {
                  break label1770;
                }
                bool1 = true;
                localObject3 = paramMessage.a(j, (String)localObject3, (cj)localObject4, bool2, bool3, bool1);
                if (b.a.b((String)localObject3)) {
                  break label1776;
                }
                i = 1;
                break label1763;
                if (i != 0)
                {
                  this.a += 1;
                  if (this.a < 2) {
                    continue;
                  }
                  b(2);
                  this.a = 0;
                }
              }
              else
              {
                this.c = false;
                continue;
              }
              this.a = 0;
              if ((cw.this.S == cw.b.a) && (TencentExtraKeys.isRequestRawData((TencentLocationRequest)???)))
              {
                paramMessage = new ds.a();
                paramMessage.b = null;
                paramMessage.c = j;
                paramMessage = paramMessage.a();
                TencentExtraKeys.setRawData(paramMessage, ((String)localObject3).getBytes());
                cw.this.a(paramMessage);
                if (localObject1 != null) {
                  ((TencentLocationListener)localObject1).onLocationChanged(paramMessage, 0, (String)cw.a.get(0));
                }
              }
              else if (TencentExtraKeys.MOCK_LOCATION_FILTER)
              {
                cw.this.n.a((String)localObject3, paramMessage, k);
                paramMessage = cw.this.r;
                System.currentTimeMillis();
                return;
              }
            }
          case 3997: 
            localObject1 = cw.o(cw.this);
            if (localObject1 != null)
            {
              paramMessage = ((dh)localObject1).a(j, cw.this.T, cw.this.v, false, false, false);
              if (b.a.b(paramMessage)) {
                break label1798;
              }
              i = 1;
              break label1781;
              b(2);
              return;
              cw.this.n.a(paramMessage, (dh)localObject1, cw.this.c);
              return;
            }
          case 4999: 
            if (cw.this.w.o == 0L)
            {
              l1 = System.currentTimeMillis();
              l2 = cw.this.w.n;
              cw.this.w.o = (l1 - l2);
            }
            removeMessages(4998);
            localObject1 = (Pair)paramMessage.obj;
            ??? = ((Pair)localObject1).first.toString();
            localObject3 = (da.a)((Pair)localObject1).second;
            localObject4 = (dh)((da.a)localObject3).a;
            String str = ((da.a)localObject3).b;
            if (!((dh)localObject4).b()) {
              break label1803;
            }
            localObject1 = "gps";
            try
            {
              ds.a locala = new ds.a();
              locala.a = ((String)???);
              locala.c = j;
              locala.d = ((String)localObject1);
              localObject1 = locala.a();
              ((ds)localObject1).getExtra().putString("resp_json", (String)???);
              if (((ds)localObject1).isMockGps() == 1) {
                this.d = true;
              }
              ds.a((ds)localObject1);
              TencentExtraKeys.setRawQuery((TencentLocation)localObject1, str);
              i = 0;
              if (((dh)localObject4).a() != null) {
                i = ((dh)localObject4).a().c;
              }
              ((ds)localObject1).getExtra().putInt("sat_num", i);
              ((ds)localObject1).getExtra().putLong("req_cost", paramMessage.arg1);
              ((ds)localObject1).getExtra().putLong("req_start", ((da.a)localObject3).c);
              cw.this.J = System.currentTimeMillis();
              if (TextUtils.isEmpty(((ds)localObject1).getIndoorBuildingId())) {
                break label1810;
              }
              bool1 = true;
              if ((bool1) && (cw.this.C == 1))
              {
                cw.this.j.b(0L);
                cw.this.j.a(4000L);
                if (cw.this.L.getInterval() > 4000L) {
                  cw.this.B = 4000L;
                }
                cw.this.C = 2;
                this.e = 0;
              }
              if (cw.this.C == 2)
              {
                if (!bool1) {
                  this.e += 1;
                }
                if (this.e >= 5)
                {
                  cw.this.j.a(cw.this.w.m);
                  new StringBuilder("indoor stop,").append(cw.this.L.getInterval());
                  cw.this.B = cw.this.L.getInterval();
                  cw.this.C = 1;
                  this.e = 0;
                }
              }
              if ((!cw.this.k()) || (bool1))
              {
                ds.a((ds)localObject1, bool1);
                cw.this.a(0, (ds)localObject1);
              }
              a(0);
              cw.this.P = ((ds)localObject1);
              if ((cw.this.S == cw.b.a) && (!cw.this.U))
              {
                cg.a().b();
                cw.this.U = true;
                return;
              }
            }
            catch (JSONException paramMessage)
            {
              b(404);
              return;
            }
          case 4998: 
            if (cw.this.w.o == 0L) {
              cw.this.w.o = -1L;
            }
            b(1);
            cw.this.J = -1L;
            return;
          case 555: 
            label890:
            cw.this.t = null;
            sendEmptyMessage(3999);
            return;
            i = 0;
            paramMessage = null;
            break label1781;
            return;
          }
          return;
        }
        catch (Throwable paramMessage)
        {
          return;
        }
        for (;;)
        {
          label1763:
          if (i == 0) {
            break label1779;
          }
          break label890;
          label1770:
          bool1 = false;
          break;
          label1776:
          i = 0;
        }
        label1779:
        continue;
        for (;;)
        {
          label1781:
          if ((localObject1 != null) && (i == 0)) {
            break label1801;
          }
          if (localObject1 == null) {
            break;
          }
          break;
          label1798:
          i = 0;
        }
        label1801:
        continue;
        label1803:
        localObject1 = "network";
        continue;
        label1810:
        boolean bool1 = false;
      }
    }
  }
  
  static enum b
  {
    static
    {
      b localb = a;
      localb = b;
      localb = c;
      localb = d;
    }
    
    private b() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
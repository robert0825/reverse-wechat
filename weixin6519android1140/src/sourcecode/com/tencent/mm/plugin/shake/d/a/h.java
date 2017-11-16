package com.tencent.mm.plugin.shake.d.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.ahy;
import com.tencent.mm.protocal.c.aid;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  extends l.b
  implements com.tencent.mm.ad.e
{
  public static int oOu;
  public float fJn;
  public float fJo;
  private a.a fJt;
  private com.tencent.mm.modelgeo.c gxh;
  private d oOp;
  public Collection<a> oOq;
  private int oOr;
  private int oOs;
  private int oOt;
  public int oyT;
  
  static
  {
    GMTrace.i(6603646435328L, 49201);
    oOu = 3;
    GMTrace.o(6603646435328L, 49201);
  }
  
  public h(l.a parama)
  {
    super(parama);
    GMTrace.i(6601364733952L, 49184);
    this.oOq = null;
    this.fJn = -85.0F;
    this.fJo = -1000.0F;
    this.oyT = 64536;
    this.oOr = 10001;
    this.oOs = 10002;
    this.oOt = 10003;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15394102312960L, 114695);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15394102312960L, 114695);
          return true;
        }
        h.this.fJn = paramAnonymousFloat2;
        h.this.fJo = paramAnonymousFloat1;
        h.this.oyT = ((int)paramAnonymousDouble2);
        GMTrace.o(15394102312960L, 114695);
        return false;
      }
    };
    GMTrace.o(6601364733952L, 49184);
  }
  
  public static void a(com.tencent.mm.plugin.shake.b.d paramd)
  {
    GMTrace.i(6602572693504L, 49193);
    if ((paramd != null) && (paramd.field_sex == oOu))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsV, Boolean.valueOf(true));
      long l = bg.Pu();
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsW, Long.valueOf(l));
    }
    try
    {
      paramd = new String(paramd.field_lvbuffer, "utf-8");
      if (paramd != null)
      {
        paramd = paramd.split(",");
        if (paramd.length == 4)
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsO, Long.valueOf(paramd[0]));
        }
      }
      GMTrace.o(6602572693504L, 49193);
      return;
    }
    catch (UnsupportedEncodingException paramd)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ShakeIbeaconService", paramd, "%s", new Object[] { "Unsupported" });
        paramd = null;
      }
    }
  }
  
  public static void b(com.tencent.mm.plugin.shake.b.d paramd)
  {
    GMTrace.i(6602706911232L, 49194);
    if (paramd != null) {}
    try
    {
      paramd = new String(paramd.field_lvbuffer, "utf-8");
      if (paramd != null)
      {
        Object localObject = paramd.split(",");
        if (localObject.length == 4)
        {
          paramd = localObject[1];
          String str = localObject[2];
          localObject = localObject[3];
          a locala = new a();
          locala.lOv = paramd;
          locala.major = bg.getInt(str, 0);
          locala.minor = bg.getInt((String)localObject, 0);
        }
      }
      GMTrace.o(6602706911232L, 49194);
      return;
    }
    catch (UnsupportedEncodingException paramd)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ShakeIbeaconService", paramd, "%s", new Object[] { "Unsupported" });
        paramd = null;
      }
    }
  }
  
  private void beW()
  {
    GMTrace.i(6602170040320L, 49190);
    this.gxh = com.tencent.mm.modelgeo.c.Ir();
    this.gxh.a(this.fJt, true);
    GMTrace.o(6602170040320L, 49190);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6602438475776L, 49192);
    w.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService]onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (d)paramk;
      if ((658 == paramk.getType()) && (paramString.action == 1))
      {
        paramString = (ahy)paramString.gMj.gtD.gtK;
        if (paramString.uxv.ucS == 0)
        {
          w.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]onSceneEnd :message:%s,tips:%s,result:%s", new Object[] { paramString.uxv.lPJ, paramString.uxv.nIo, Integer.valueOf(paramString.uxv.ucS) });
          paramString = paramString.uxv.lPJ;
        }
      }
    }
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        JSONArray localJSONArray = paramString.getJSONArray("msgs");
        paramk = paramString.getJSONObject("guide_switch");
        paramInt2 = paramk.getInt("channel_open_method");
        long l = paramk.getLong("channel_open_time");
        paramInt1 = paramk.getInt("shake_tab_display");
        int i = paramString.getJSONObject("gated_launch_option").getInt("tab_state");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vsP, Integer.valueOf(paramInt2));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vsQ, Long.valueOf(l));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vsR, Integer.valueOf(paramInt1));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vta, Integer.valueOf(i));
        w.i("MicroMsg.ShakeIbeaconService", "[shakezb]channel_open_method is " + paramInt2 + " ,channel_open_time is " + l + ", shake_tab_display is " + paramInt1);
        i = localJSONArray.length();
        paramString = null;
        com.tencent.mm.plugin.shake.b.e locale = m.bfk();
        locale.bfc();
        if (i > 0)
        {
          paramk = new ArrayList();
          paramInt1 = 0;
          paramString = paramk;
          if (paramInt1 < i)
          {
            paramString = new com.tencent.mm.plugin.shake.b.d();
            JSONObject localJSONObject = localJSONArray.getJSONObject(paramInt1);
            String str1 = localJSONObject.getString("url");
            String str2 = localJSONObject.getString("content");
            String str3 = localJSONObject.getString("title");
            String str4 = localJSONObject.getString("picurl");
            String str5 = localJSONObject.getString("shopid");
            Object localObject = localJSONObject.getJSONObject("beacon");
            String str6 = ((JSONObject)localObject).getString("uuid");
            String str7 = ((JSONObject)localObject).getString("major");
            localObject = ((JSONObject)localObject).getString("minor");
            int j = localJSONObject.getInt("guide_state");
            String str8 = localJSONObject.getString("wxa_username");
            String str9 = localJSONObject.getString("wxa_path");
            int k = localJSONObject.getInt("wxa_version_type");
            paramString.field_type = 11;
            paramString.field_username = str3;
            paramString.field_nickname = str3;
            paramString.field_signature = str2;
            paramString.field_province = str4;
            paramString.field_city = str1;
            if (j == 1) {
              paramString.field_sex = oOu;
            }
            paramString.field_lvbuffer = (String.valueOf(str5) + "," + String.valueOf(str6) + "," + String.valueOf(str7) + "," + String.valueOf(localObject)).getBytes("utf-8");
            paramString.field_insertBatch = 2;
            paramString.field_reserved3 = (str8 + "," + str9 + "," + k);
            paramk.add(paramString);
            locale.a(paramString, true);
            if ((paramString.field_sex != oOu) || (paramInt2 != 1)) {
              break label942;
            }
            a(paramString);
            break label942;
          }
        }
        this.oMx.d(paramString, 1L);
        GMTrace.o(6602438475776L, 49192);
        return;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb] parse error.%s", new Object[] { bg.nl(paramString.getMessage()) });
        this.oMx.d(null, 1L);
        GMTrace.o(6602438475776L, 49192);
        return;
      }
      if (paramString.uxv.ucS == this.oOr)
      {
        this.oMx.d(null, 6L);
        GMTrace.o(6602438475776L, 49192);
        return;
      }
      if (paramString.uxv.ucS == this.oOs)
      {
        this.oMx.d(null, 7L);
        GMTrace.o(6602438475776L, 49192);
        return;
      }
      if (paramString.uxv.ucS == this.oOt)
      {
        this.oMx.d(null, 8L);
        GMTrace.o(6602438475776L, 49192);
        return;
      }
      this.oMx.d(null, 1L);
      GMTrace.o(6602438475776L, 49192);
      return;
      this.oMx.d(null, 3L);
      GMTrace.o(6602438475776L, 49192);
      return;
      label942:
      paramInt1 += 1;
    }
  }
  
  public final void beX()
  {
    GMTrace.i(6602304258048L, 49191);
    super.beX();
    at.wS().b(658, this);
    GMTrace.o(6602304258048L, 49191);
  }
  
  public final void init()
  {
    GMTrace.i(6601498951680L, 49185);
    at.wS().a(658, this);
    beW();
    GMTrace.o(6601498951680L, 49185);
  }
  
  public final void pause()
  {
    GMTrace.i(6601901604864L, 49188);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    GMTrace.o(6601901604864L, 49188);
  }
  
  public final void reset()
  {
    GMTrace.i(6601633169408L, 49186);
    if (this.oOp != null) {
      at.wS().c(this.oOp);
    }
    GMTrace.o(6601633169408L, 49186);
  }
  
  public final void resume()
  {
    GMTrace.i(6602035822592L, 49189);
    if (this.gxh != null) {
      this.gxh.a(this.fJt, true);
    }
    GMTrace.o(6602035822592L, 49189);
  }
  
  public final void start()
  {
    GMTrace.i(6601767387136L, 49187);
    w.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:start");
    init();
    reset();
    if (this.gxh == null) {
      beW();
    }
    this.gxh.b(this.fJt, true);
    Object localObject;
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      localObject = (LocationManager)ab.getContext().getSystemService("location");
      if (localObject == null) {
        break label316;
      }
    }
    label316:
    for (boolean bool = ((LocationManager)localObject).isProviderEnabled("gps");; bool = true)
    {
      if (!bool)
      {
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6604988612608L, 49211);
            h.a(h.this).d(null, 8L);
            GMTrace.o(6604988612608L, 49211);
          }
        }, 1000L);
        GMTrace.o(6601767387136L, 49187);
        return;
      }
      localObject = BluetoothAdapter.getDefaultAdapter();
      if ((localObject != null) && (((BluetoothAdapter)localObject).getState() != 12))
      {
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6606196572160L, 49220);
            h.b(h.this).d(null, 9L);
            GMTrace.o(6606196572160L, 49220);
          }
        }, 1000L);
        GMTrace.o(6601767387136L, 49187);
        return;
      }
      if (localObject == null)
      {
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6605257048064L, 49213);
            h.c(h.this).d(null, 10L);
            GMTrace.o(6605257048064L, 49213);
          }
        }, 1000L);
        GMTrace.o(6601767387136L, 49187);
        return;
      }
      if (this.oOq != null) {}
      for (int i = this.oOq.size();; i = 0)
      {
        w.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:beaconCollection.size:%d", new Object[] { Integer.valueOf(i) });
        this.oOp = new d(this.oOq, this.fJn, this.fJo, this.oyT);
        at.wS().a(this.oOp, 0);
        GMTrace.o(6601767387136L, 49187);
        return;
      }
    }
  }
  
  public static final class a
  {
    public double gSX;
    public String lOv;
    public int major;
    public int minor;
    public String oOw;
    public double oOx;
    public int oOy;
    
    public a()
    {
      GMTrace.i(6604049088512L, 49204);
      this.gSX = 0.0D;
      this.lOv = null;
      this.major = 0;
      this.minor = 0;
      this.oOw = "";
      this.oOx = 0.0D;
      this.oOy = 0;
      GMTrace.o(6604049088512L, 49204);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
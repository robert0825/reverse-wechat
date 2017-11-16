package com.tencent.mm.modelcontrol;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class d
  implements aq
{
  private static final int gBa;
  private a gBb;
  private byte[] gBc;
  private com.tencent.mm.plugin.a.b gBd;
  private e[] gBe;
  private e[] gBf;
  private e[] gBg;
  private e[] gBh;
  private e[] gBi;
  
  static
  {
    GMTrace.i(4108941524992L, 30614);
    gBa = com.tencent.mm.plugin.a.c.nq("dscp");
    GMTrace.o(4108941524992L, 30614);
  }
  
  public d()
  {
    GMTrace.i(4105988734976L, 30592);
    this.gBc = null;
    this.gBb = new a();
    GMTrace.o(4105988734976L, 30592);
  }
  
  public static boolean GA()
  {
    GMTrace.i(4107599347712L, 30604);
    int j = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvc, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100136");
    if (localc.isValid()) {}
    for (int i = bg.getInt((String)localc.bSg().get("streamingDownload"), 0);; i = 0)
    {
      boolean bool2 = GC();
      boolean bool1;
      if ((j == 0) || (i == -1) || (!bool2)) {
        bool1 = false;
      }
      for (;;)
      {
        w.i("MicroMsg.SubCoreVideoControl", "check can c2c online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(j), Integer.valueOf(i) });
        GMTrace.o(4107599347712L, 30604);
        return bool1;
        if (j > 0) {
          bool1 = true;
        } else if (i > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
  }
  
  public static boolean GB()
  {
    GMTrace.i(4107733565440L, 30605);
    int j = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvc, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100153");
    if (localc.isValid()) {}
    for (int i = bg.getInt((String)localc.bSg().get("snsStreamDownload"), 0);; i = 0)
    {
      boolean bool2 = GC();
      boolean bool1;
      if ((j == 0) || (i == -1) || (!bool2)) {
        bool1 = false;
      }
      for (;;)
      {
        w.i("MicroMsg.SubCoreVideoControl", "check can sns online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(j), Integer.valueOf(i) });
        GMTrace.o(4107733565440L, 30605);
        return bool1;
        if (j > 0) {
          bool1 = true;
        } else if (i > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
  }
  
  public static boolean GC()
  {
    GMTrace.i(4107867783168L, 30606);
    long l = bg.Pw();
    int k = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvc, Integer.valueOf(-1))).intValue();
    int i = 1;
    String str = null;
    Object localObject1 = null;
    Object localObject2 = com.tencent.mm.y.c.c.Ct().er("100190");
    if (((com.tencent.mm.storage.c)localObject2).isValid())
    {
      localObject1 = ((com.tencent.mm.storage.c)localObject2).bSg();
      i = bg.getInt((String)((Map)localObject1).get("player"), 1);
      str = (String)((Map)localObject1).get("apilevel");
      localObject1 = (String)((Map)localObject1).get("devices");
    }
    boolean bool2 = true;
    int m = Build.VERSION.SDK_INT;
    localObject2 = Build.BRAND + Build.MODEL;
    boolean bool1 = bool2;
    String[] arrayOfString;
    int n;
    int j;
    if (!bg.nm(str))
    {
      arrayOfString = str.split(";");
      n = arrayOfString.length;
      j = 0;
      bool1 = bool2;
      if (j < n)
      {
        if (bg.getInt(arrayOfString[j], 0) != m) {
          break label377;
        }
        bool1 = false;
      }
    }
    bool2 = bool1;
    if (!bg.nm((String)localObject1))
    {
      arrayOfString = ((String)localObject1).split(";");
      n = arrayOfString.length;
      j = 0;
    }
    for (;;)
    {
      bool2 = bool1;
      if (j < n)
      {
        if (arrayOfString[j].equalsIgnoreCase((String)localObject2)) {
          bool2 = false;
        }
      }
      else
      {
        if (com.tencent.mm.compatible.util.d.eu(18)) {
          bool2 = false;
        }
        if (Build.BRAND.equalsIgnoreCase("meizu")) {
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vww, Boolean.valueOf(true));
        }
        if (k == 0) {
          bool2 = false;
        }
        if (i <= 0) {
          bool2 = false;
        }
        w.i("MicroMsg.SubCoreVideoControl", "check can use mmvideoplayer[%b] api[%d, %s] device[%s, %s] abTestFlag[%d] costTime[%d]", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(m), str, localObject2, localObject1, Integer.valueOf(i), Long.valueOf(bg.aI(l)) });
        GMTrace.o(4107867783168L, 30606);
        return bool2;
        label377:
        j += 1;
        break;
      }
      j += 1;
    }
  }
  
  public static boolean GD()
  {
    GMTrace.i(17764118953984L, 132353);
    String str = null;
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100253");
    if (((com.tencent.mm.storage.c)localObject).isValid()) {
      str = (String)((com.tencent.mm.storage.c)localObject).bSg().get("noCompleteRange");
    }
    localObject = str;
    if (bg.nm(str)) {
      localObject = "20:00-23:30";
    }
    com.tencent.mm.kernel.h.xw();
    int i = com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww(), 30);
    boolean bool = b.B((String)localObject, i);
    w.i("MicroMsg.SubCoreVideoControl", "check complete hevc needControl [%b] no complete range[%s] endHash[%d]", new Object[] { Boolean.valueOf(bool), localObject, Integer.valueOf(i) });
    if (!bool)
    {
      GMTrace.o(17764118953984L, 132353);
      return true;
    }
    GMTrace.o(17764118953984L, 132353);
    return false;
  }
  
  public static d Gv()
  {
    GMTrace.i(4108136218624L, 30608);
    d locald = (d)p.o(d.class);
    GMTrace.o(4108136218624L, 30608);
    return locald;
  }
  
  private static VideoTransPara Gz()
  {
    GMTrace.i(4107330912256L, 30602);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.width = 540;
    localVideoTransPara.height = 960;
    localVideoTransPara.fps = 30;
    localVideoTransPara.videoBitrate = 1600000;
    localVideoTransPara.gBl = 1;
    localVideoTransPara.gBk = 64000;
    localVideoTransPara.gBm = 2;
    localVideoTransPara.gBn = 1;
    GMTrace.o(4107330912256L, 30602);
    return localVideoTransPara;
  }
  
  public static int a(int paramInt, r paramr)
  {
    GMTrace.i(17446962462720L, 129990);
    switch (paramInt)
    {
    default: 
    case 0: 
      for (paramInt = 1;; paramInt = 1)
      {
        label38:
        w.i("MicroMsg.SubCoreVideoControl", "check c2c video format[%d]", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt != 2) {
          break;
        }
        g.ork.a(354L, 130L, 1L, false);
        label76:
        GMTrace.o(17446962462720L, 129990);
        return paramInt;
      }
    }
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vye, Integer.valueOf(-1))).intValue();
    paramInt = i;
    if (i == -1) {
      if (!com.tencent.mm.plugin.s.e.aOy()) {
        break label201;
      }
    }
    boolean bool2;
    label172:
    label201:
    for (paramInt = 1;; paramInt = 0)
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vye, Integer.valueOf(-1));
      w.d("MicroMsg.SubCoreVideoControl", "check device support hevc[%d]", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt > 0) {
        break label206;
      }
      bool2 = false;
      if (!bool2) {
        break label463;
      }
      o.Nh();
      paramr = s.mk(paramr.getFileName());
      if (com.tencent.mm.a.e.aZ(paramr)) {
        break label479;
      }
      paramInt = 2;
      break;
    }
    label206:
    String str = null;
    Object localObject1 = null;
    Object localObject2 = com.tencent.mm.y.c.c.Ct().er("100253");
    if (((com.tencent.mm.storage.c)localObject2).isValid())
    {
      localObject1 = ((com.tencent.mm.storage.c)localObject2).bSg();
      paramInt = bg.getInt((String)((Map)localObject1).get("openHevc"), 0);
      str = (String)((Map)localObject1).get("brands");
      localObject1 = (String)((Map)localObject1).get("devices");
    }
    for (;;)
    {
      localObject2 = Build.BRAND;
      Object localObject3;
      int j;
      if (!bg.nm(str))
      {
        localObject3 = str.split(";");
        j = localObject3.length;
        i = 0;
        label312:
        if (i < j) {
          if (!localObject3[i].equalsIgnoreCase((String)localObject2)) {}
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        localObject3 = Build.BRAND + Build.MODEL;
        bool2 = bool1;
        String[] arrayOfString;
        if (!bg.nm((String)localObject1))
        {
          arrayOfString = ((String)localObject1).split(";");
          j = arrayOfString.length;
          i = 0;
        }
        for (;;)
        {
          bool2 = bool1;
          if (i < j)
          {
            if (arrayOfString[i].equalsIgnoreCase((String)localObject3)) {
              bool2 = false;
            }
          }
          else
          {
            if (paramInt <= 0) {
              bool2 = false;
            }
            w.i("MicroMsg.SubCoreVideoControl", "check support hevc [%b] abtestFlag[%d] brands[%s, %s] device[%s, %s]", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(paramInt), localObject2, str, localObject3, localObject1 });
            break label172;
            label463:
            break;
            i += 1;
            break label312;
          }
          i += 1;
        }
        label479:
        if (!q.me(paramr)) {
          break;
        }
        paramInt = 2;
        break label38;
        g.ork.a(354L, 131L, 1L, false);
        break label76;
      }
      paramInt = 0;
    }
  }
  
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5, PInt paramPInt6)
  {
    GMTrace.i(4106391388160L, 30595);
    if ((bg.nm(paramString2)) || (bg.nm(paramString3)) || (bg.nm(paramString4)))
    {
      GMTrace.o(4106391388160L, 30595);
      return false;
    }
    try
    {
      int i;
      if (!bg.nm(paramString1))
      {
        arrayOfString = paramString1.split("~");
        paramPInt1.value = bg.getInt(arrayOfString[0], -1);
        paramPInt2.value = bg.getInt(arrayOfString[1], -1);
        if (paramPInt1.value >= 0)
        {
          i = paramPInt2.value;
          if (i >= 0) {}
        }
        else
        {
          GMTrace.o(4106391388160L, 30595);
          return false;
        }
      }
      else
      {
        paramPInt2.value = 0;
        paramPInt1.value = 0;
      }
      String[] arrayOfString = paramString2.split("x");
      paramPInt3.value = bg.getInt(arrayOfString[0], -1);
      paramPInt4.value = bg.getInt(arrayOfString[1], -1);
      if (paramPInt3.value >= 0)
      {
        i = paramPInt4.value;
        if (i >= 0) {}
      }
      else
      {
        GMTrace.o(4106391388160L, 30595);
        return false;
      }
      paramPInt5.value = bg.getInt(paramString3, -1);
      paramPInt6.value = bg.getInt(paramString4, -1);
      if (paramPInt5.value >= 0)
      {
        i = paramPInt6.value;
        if (i >= 0) {}
      }
      else
      {
        GMTrace.o(4106391388160L, 30595);
        return false;
      }
      paramPInt6.value *= 1000;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SubCoreVideoControl", "parse video para error." + localException.toString());
      }
    }
    w.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramPInt3.value), Integer.valueOf(paramPInt4.value), Integer.valueOf(paramPInt5.value), Integer.valueOf(paramPInt6.value) });
    GMTrace.o(4106391388160L, 30595);
    return true;
  }
  
  private static e c(JSONObject paramJSONObject)
  {
    GMTrace.i(4106257170432L, 30594);
    e locale = new e();
    for (;;)
    {
      int i;
      try
      {
        Object localObject1;
        int j;
        if (paramJSONObject.isNull("time"))
        {
          localObject1 = "";
          Object localObject3 = paramJSONObject.getString("abr");
          Object localObject4 = paramJSONObject.getString("intval");
          Object localObject5 = paramJSONObject.getString("prof");
          Object localObject6 = paramJSONObject.getString("preset");
          if (paramJSONObject.isNull("stepbr"))
          {
            localObject2 = "0";
            w.i("MicroMsg.SubCoreVideoControl", "busy time %s audio bitrate %s iframe %s profile %s preset %s stepbr %s", new Object[] { localObject1, localObject3, localObject4, localObject5, localObject6, localObject2 });
            locale.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6, (String)localObject2);
            localObject2 = paramJSONObject.getJSONArray("conf");
            localObject1 = new ArrayList();
            localObject3 = new PInt();
            localObject4 = new PInt();
            localObject5 = new PInt();
            localObject6 = new PInt();
            PInt localPInt1 = new PInt();
            PInt localPInt2 = new PInt();
            j = ((JSONArray)localObject2).length();
            i = 0;
            if (i >= j) {
              continue;
            }
            JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(i);
            if (localJSONObject.isNull("dura")) {
              break label546;
            }
            paramJSONObject = localJSONObject.getString("dura");
            if (!a(paramJSONObject, localJSONObject.getString("wh"), localJSONObject.getString("fps"), localJSONObject.getString("vbr"), (PInt)localObject3, (PInt)localObject4, (PInt)localObject5, (PInt)localObject6, localPInt1, localPInt2)) {
              break label539;
            }
            ((List)localObject1).add(new f(((PInt)localObject3).value, ((PInt)localObject4).value, ((PInt)localObject5).value, ((PInt)localObject6).value, localPInt1.value, localPInt2.value, localPInt2.value));
            break label539;
          }
        }
        else
        {
          localObject1 = paramJSONObject.getString("time");
          continue;
        }
        Object localObject2 = paramJSONObject.getString("stepbr");
        continue;
        Collections.sort((List)localObject1);
        if ((((List)localObject1).size() >= 2) && (!locale.gBo))
        {
          j = ((f)((List)localObject1).get(0)).gBw;
          i = 1;
          if (i < ((List)localObject1).size())
          {
            paramJSONObject = (f)((List)localObject1).get(i);
            paramJSONObject.gBv = j;
            j = paramJSONObject.gBw;
            i += 1;
            continue;
          }
        }
        locale.gBp = new f[((List)localObject1).size()];
        ((List)localObject1).toArray(locale.gBp);
        w.d("MicroMsg.SubCoreVideoControl", "parseJsonObject %s", new Object[] { locale });
        GMTrace.o(4106257170432L, 30594);
        return locale;
      }
      catch (Exception paramJSONObject)
      {
        w.e("MicroMsg.SubCoreVideoControl", "parseJsonObject error : " + paramJSONObject.toString());
        GMTrace.o(4106257170432L, 30594);
        return null;
      }
      label539:
      i += 1;
      continue;
      label546:
      paramJSONObject = "";
    }
  }
  
  private static VideoTransPara fV(int paramInt)
  {
    GMTrace.i(4107465129984L, 30603);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.gBl = 1;
    localVideoTransPara.gBk = 48000;
    localVideoTransPara.gBm = 2;
    localVideoTransPara.gBn = 1;
    if (paramInt <= 120)
    {
      localVideoTransPara.fps = 30;
      localVideoTransPara.width = 540;
      localVideoTransPara.height = 960;
    }
    for (localVideoTransPara.videoBitrate = 1200000;; localVideoTransPara.videoBitrate = 544000)
    {
      GMTrace.o(4107465129984L, 30603);
      return localVideoTransPara;
      localVideoTransPara.fps = 24;
      localVideoTransPara.width = 360;
      localVideoTransPara.height = 640;
    }
  }
  
  private e[] jE(String paramString)
  {
    int i = 0;
    GMTrace.i(4106122952704L, 30593);
    Object localObject2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue(paramString);
    if (bg.nm((String)localObject2))
    {
      w.i("MicroMsg.SubCoreVideoControl", "key %s config is null", new Object[] { paramString });
      GMTrace.o(4106122952704L, 30593);
      return null;
    }
    Object localObject1 = localObject2;
    if (!((String)localObject2).startsWith("[")) {
      localObject1 = "[" + (String)localObject2;
    }
    localObject2 = localObject1;
    if (!((String)localObject1).endsWith("]")) {
      localObject2 = (String)localObject1 + "]";
    }
    w.i("MicroMsg.SubCoreVideoControl", "%s=%s ", new Object[] { paramString, localObject2 });
    try
    {
      paramString = new JSONArray((String)localObject2);
      int j = paramString.length();
      w.d("MicroMsg.SubCoreVideoControl", "parse config root length %d", new Object[] { Integer.valueOf(j) });
      localObject1 = new e[j];
      while (i < j)
      {
        localObject1[i] = c(paramString.getJSONObject(i));
        i += 1;
      }
      GMTrace.o(4106122952704L, 30593);
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.SubCoreVideoControl", "parse Configs error : " + paramString.toString());
      GMTrace.o(4106122952704L, 30593);
      return null;
    }
    return (e[])localObject1;
  }
  
  public final VideoTransPara Gw()
  {
    GMTrace.i(4106794041344L, 30598);
    long l = bg.Pw();
    if (this.gBe == null) {
      this.gBe = jE("C2CRecordVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.gBe != null)
    {
      i = 0;
      if (i < this.gBe.length)
      {
        locale = this.gBe[i];
        if ((locale != null) && (locale.GE()))
        {
          w.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get c2c Record config.");
          localVideoTransPara = locale.GF();
        }
      }
    }
    for (boolean bool = locale.gBo;; bool = true)
    {
      if (localVideoTransPara == null)
      {
        localVideoTransPara = new VideoTransPara();
        localVideoTransPara.isDefault = true;
        localVideoTransPara.width = 540;
        localVideoTransPara.height = 960;
        localVideoTransPara.fps = 30;
        localVideoTransPara.videoBitrate = 1200000;
        localVideoTransPara.gBl = 1;
        localVideoTransPara.gBk = 64000;
        localVideoTransPara.gBm = 2;
        localVideoTransPara.gBn = 1;
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.gBl = 1;
        localVideoTransPara.duration = 10;
        if (!bool) {
          g.ork.a(422L, 11L, 1L, false);
        }
        for (;;)
        {
          i = bg.e((Integer)g.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 13, 18));
          g.ork.a(422L, i, 1L, false);
          w.i("MicroMsg.SubCoreVideoControl", "get c2c record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bg.aI(l)), localVideoTransPara, Integer.valueOf(i) });
          GMTrace.o(4106794041344L, 30598);
          return localVideoTransPara;
          i += 1;
          break;
          g.ork.a(422L, 12L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara Gx()
  {
    GMTrace.i(4106928259072L, 30599);
    long l = bg.Pw();
    if (this.gBf == null) {
      this.gBf = jE("SnsRecordVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.gBf != null)
    {
      i = 0;
      if (i < this.gBf.length)
      {
        locale = this.gBf[i];
        if ((locale != null) && (locale.GE()))
        {
          w.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
          localVideoTransPara = locale.GF();
        }
      }
    }
    for (boolean bool = locale.gBo;; bool = true)
    {
      if (localVideoTransPara == null) {
        localVideoTransPara = Gz();
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.gBl = 1;
        localVideoTransPara.duration = 10;
        localVideoTransPara.gBx = 200;
        if (!bool) {
          g.ork.a(422L, 31L, 1L, false);
        }
        for (;;)
        {
          i = bg.e((Integer)g.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 33, 38));
          g.ork.a(422L, i, 1L, false);
          w.i("MicroMsg.SubCoreVideoControl", "get sns record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bg.aI(l)), localVideoTransPara, Integer.valueOf(i) });
          GMTrace.o(4106928259072L, 30599);
          return localVideoTransPara;
          i += 1;
          break;
          g.ork.a(422L, 32L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara Gy()
  {
    GMTrace.i(4107062476800L, 30600);
    long l = bg.Pw();
    if (this.gBg == null) {
      this.gBg = jE("SnsAlbumVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.gBg != null)
    {
      i = 0;
      if (i < this.gBg.length)
      {
        locale = this.gBg[i];
        if ((locale != null) && (locale.GE()))
        {
          w.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns album config.");
          localVideoTransPara = locale.GF();
        }
      }
    }
    for (boolean bool = locale.gBo;; bool = true)
    {
      if (localVideoTransPara == null) {
        localVideoTransPara = Gz();
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.gBl = 1;
        localVideoTransPara.gBx = 200;
        if (!bool) {
          g.ork.a(422L, 21L, 1L, false);
        }
        for (;;)
        {
          i = bg.e((Integer)g.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 23, 28));
          g.ork.a(422L, i, 1L, false);
          w.i("MicroMsg.SubCoreVideoControl", "get sns album para cost %d. %s rpt %d ", new Object[] { Long.valueOf(bg.aI(l)), localVideoTransPara, Integer.valueOf(i) });
          GMTrace.o(4107062476800L, 30600);
          return localVideoTransPara;
          i += 1;
          break;
          g.ork.a(422L, 22L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara a(VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(4107196694528L, 30601);
    if (paramVideoTransPara.duration >= 300)
    {
      w.w("MicroMsg.SubCoreVideoControl", "this video duration is large than %s s", new Object[] { Integer.valueOf(300) });
      GMTrace.o(4107196694528L, 30601);
      return null;
    }
    long l = bg.Pw();
    VideoTransPara localVideoTransPara = fV(paramVideoTransPara.duration);
    int i = 1;
    Object localObject1 = com.tencent.mm.y.c.c.Ct().er("100157");
    if (((com.tencent.mm.storage.c)localObject1).isValid()) {
      i = bg.getInt((String)((com.tencent.mm.storage.c)localObject1).bSg().get("VideoEncodeStep"), 1);
    }
    w.i("MicroMsg.SubCoreVideoControl", "check c2c album encode step %d", new Object[] { Integer.valueOf(i) });
    label160:
    label167:
    boolean bool;
    if (i > 0)
    {
      i = 1;
      if (i == 0) {
        break label381;
      }
      if (this.gBi == null) {
        this.gBi = jE("C2CAlbumVideoStepConfig");
      }
      localObject1 = this.gBi;
      if (localObject1 == null) {
        break label423;
      }
      i = 0;
      if (i >= localObject1.length) {
        break label415;
      }
      Object localObject2 = localObject1[i];
      if ((localObject2 == null) || (!((e)localObject2).GE())) {
        break label408;
      }
      w.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
      i = a.a(((e)localObject2).gBp, paramVideoTransPara, localVideoTransPara);
      bool = ((e)localObject2).gBo;
      label220:
      if (i > 0) {
        break label445;
      }
      localObject1 = fV(paramVideoTransPara.duration);
      label233:
      if (bool) {
        break label458;
      }
      g.ork.a(422L, 1L, 1L, false);
    }
    for (;;)
    {
      int j = bg.e((Integer)g.a(((VideoTransPara)localObject1).videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 3, 8));
      g.ork.a(422L, j, 1L, false);
      w.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(j), Integer.valueOf(i), localObject1, paramVideoTransPara });
      GMTrace.o(4107196694528L, 30601);
      return (VideoTransPara)localObject1;
      i = 0;
      break;
      label381:
      if (this.gBh == null) {
        this.gBh = jE("C2CAlbumVideoConfig");
      }
      localObject1 = this.gBh;
      break label160;
      label408:
      i += 1;
      break label167;
      label415:
      bool = true;
      i = 0;
      break label220;
      label423:
      w.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
      i = a.a(null, paramVideoTransPara, localVideoTransPara);
      bool = true;
      break label220;
      label445:
      localVideoTransPara.isDefault = false;
      localObject1 = localVideoTransPara;
      break label233;
      label458:
      g.ork.a(422L, 2L, 1L, false);
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4108538871808L, 30611);
    GMTrace.o(4108538871808L, 30611);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4108673089536L, 30612);
    GMTrace.o(4108673089536L, 30612);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4108404654080L, 30610);
    GMTrace.o(4108404654080L, 30610);
  }
  
  public final byte[] getWeixinMeta()
  {
    GMTrace.i(4106525605888L, 30596);
    if (bg.bq(this.gBc)) {}
    try
    {
      Object localObject = "{\"WXVer\":" + com.tencent.mm.protocal.d.tJC + "}";
      this.gBc = ((String)localObject).getBytes("UTF-8");
      w.i("MicroMsg.SubCoreVideoControl", "get weixin video meta %s", new Object[] { localObject });
      localObject = this.gBc;
      GMTrace.o(4106525605888L, 30596);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SubCoreVideoControl", "get weixin meta error %s ", new Object[] { localException.toString() });
      }
    }
  }
  
  /* Error */
  public final boolean jF(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 720
    //   3: sipush 30597
    //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 723	com/tencent/mm/modelcontrol/d:gBd	Lcom/tencent/mm/plugin/a/b;
    //   13: ifnonnull +14 -> 27
    //   16: aload_0
    //   17: new 725	com/tencent/mm/plugin/a/b
    //   20: dup
    //   21: invokespecial 726	com/tencent/mm/plugin/a/b:<init>	()V
    //   24: putfield 723	com/tencent/mm/modelcontrol/d:gBd	Lcom/tencent/mm/plugin/a/b;
    //   27: aload_0
    //   28: getfield 723	com/tencent/mm/modelcontrol/d:gBd	Lcom/tencent/mm/plugin/a/b;
    //   31: astore 7
    //   33: aload 7
    //   35: ldc2_w 727
    //   38: putfield 732	com/tencent/mm/plugin/a/b:hmQ	J
    //   41: aload 7
    //   43: ldc2_w 727
    //   46: putfield 735	com/tencent/mm/plugin/a/b:hmS	J
    //   49: aload 7
    //   51: aconst_null
    //   52: putfield 739	com/tencent/mm/plugin/a/b:hmT	Lcom/tencent/mm/plugin/a/a;
    //   55: invokestatic 164	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   58: lstore_2
    //   59: aload_0
    //   60: getfield 723	com/tencent/mm/modelcontrol/d:gBd	Lcom/tencent/mm/plugin/a/b;
    //   63: aload_1
    //   64: invokevirtual 743	com/tencent/mm/plugin/a/b:no	(Ljava/lang/String;)J
    //   67: lstore 4
    //   69: lload 4
    //   71: lconst_0
    //   72: lcmp
    //   73: ifgt +14 -> 87
    //   76: ldc2_w 720
    //   79: sipush 30597
    //   82: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   85: iconst_0
    //   86: ireturn
    //   87: aconst_null
    //   88: astore 12
    //   90: aconst_null
    //   91: astore 13
    //   93: new 745	java/io/RandomAccessFile
    //   96: dup
    //   97: new 747	java/io/File
    //   100: dup
    //   101: aload_1
    //   102: invokespecial 748	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: ldc_w 750
    //   108: invokespecial 753	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   111: astore 9
    //   113: aload 9
    //   115: astore 7
    //   117: aload 9
    //   119: lload 4
    //   121: invokevirtual 757	java/io/RandomAccessFile:seek	(J)V
    //   124: aload 9
    //   126: astore 7
    //   128: bipush 8
    //   130: newarray <illegal type>
    //   132: astore 14
    //   134: aload 9
    //   136: astore 7
    //   138: aload 9
    //   140: aload 14
    //   142: getstatic 762	com/tencent/mm/plugin/a/a:hmG	I
    //   145: invokestatic 765	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   148: astore 8
    //   150: aconst_null
    //   151: astore 7
    //   153: aload 7
    //   155: astore 10
    //   157: aload 8
    //   159: ifnull +65 -> 224
    //   162: aload 9
    //   164: astore 7
    //   166: aload 9
    //   168: aload 14
    //   170: getstatic 40	com/tencent/mm/modelcontrol/d:gBa	I
    //   173: invokestatic 765	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   176: astore 11
    //   178: aload 11
    //   180: astore 10
    //   182: aload 11
    //   184: ifnonnull +40 -> 224
    //   187: aload 9
    //   189: astore 7
    //   191: aload 9
    //   193: aload 8
    //   195: invokevirtual 768	com/tencent/mm/plugin/a/a:PB	()J
    //   198: invokevirtual 757	java/io/RandomAccessFile:seek	(J)V
    //   201: aload 9
    //   203: astore 7
    //   205: aload 9
    //   207: aload 14
    //   209: getstatic 762	com/tencent/mm/plugin/a/a:hmG	I
    //   212: invokestatic 765	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   215: astore 8
    //   217: aload 11
    //   219: astore 7
    //   221: goto -68 -> 153
    //   224: aload 13
    //   226: astore 8
    //   228: aload 10
    //   230: ifnull +74 -> 304
    //   233: aload 9
    //   235: astore 7
    //   237: aload 10
    //   239: invokevirtual 771	com/tencent/mm/plugin/a/a:getSize	()J
    //   242: l2i
    //   243: bipush 8
    //   245: isub
    //   246: newarray <illegal type>
    //   248: astore 11
    //   250: aload 9
    //   252: astore 7
    //   254: aload 9
    //   256: aload 10
    //   258: getfield 774	com/tencent/mm/plugin/a/a:hmP	J
    //   261: ldc2_w 775
    //   264: ladd
    //   265: invokevirtual 757	java/io/RandomAccessFile:seek	(J)V
    //   268: aload 13
    //   270: astore 8
    //   272: aload 9
    //   274: astore 7
    //   276: aload 9
    //   278: aload 11
    //   280: invokevirtual 780	java/io/RandomAccessFile:read	([B)I
    //   283: ifle +21 -> 304
    //   286: aload 9
    //   288: astore 7
    //   290: new 126	java/lang/String
    //   293: dup
    //   294: aload 11
    //   296: ldc_w 706
    //   299: invokespecial 783	java/lang/String:<init>	([BLjava/lang/String;)V
    //   302: astore 8
    //   304: aload 9
    //   306: invokevirtual 786	java/io/RandomAccessFile:close	()V
    //   309: aload 8
    //   311: astore 7
    //   313: ldc -119
    //   315: ldc_w 788
    //   318: iconst_4
    //   319: anewarray 4	java/lang/Object
    //   322: dup
    //   323: iconst_0
    //   324: aload 7
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: lload 4
    //   331: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   334: aastore
    //   335: dup
    //   336: iconst_2
    //   337: lload_2
    //   338: invokestatic 231	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   341: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   344: aastore
    //   345: dup
    //   346: iconst_3
    //   347: aload_1
    //   348: aastore
    //   349: invokestatic 149	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   352: aload 7
    //   354: invokestatic 201	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   357: ifne +104 -> 461
    //   360: aload 7
    //   362: ldc_w 790
    //   365: invokevirtual 794	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   368: istore 6
    //   370: ldc2_w 720
    //   373: sipush 30597
    //   376: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   379: iload 6
    //   381: ireturn
    //   382: astore 10
    //   384: aconst_null
    //   385: astore 8
    //   387: aload 8
    //   389: astore 7
    //   391: ldc -119
    //   393: ldc_w 796
    //   396: iconst_2
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: aload_1
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: aload 10
    //   408: invokevirtual 404	java/lang/Exception:toString	()Ljava/lang/String;
    //   411: aastore
    //   412: invokestatic 716	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   415: aload 12
    //   417: astore 7
    //   419: aload 8
    //   421: ifnull -108 -> 313
    //   424: aload 8
    //   426: invokevirtual 786	java/io/RandomAccessFile:close	()V
    //   429: aload 12
    //   431: astore 7
    //   433: goto -120 -> 313
    //   436: astore 7
    //   438: aload 12
    //   440: astore 7
    //   442: goto -129 -> 313
    //   445: astore_1
    //   446: aconst_null
    //   447: astore 7
    //   449: aload 7
    //   451: ifnull +8 -> 459
    //   454: aload 7
    //   456: invokevirtual 786	java/io/RandomAccessFile:close	()V
    //   459: aload_1
    //   460: athrow
    //   461: ldc2_w 720
    //   464: sipush 30597
    //   467: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   470: iconst_0
    //   471: ireturn
    //   472: astore 7
    //   474: aload 8
    //   476: astore 7
    //   478: goto -165 -> 313
    //   481: astore 7
    //   483: goto -24 -> 459
    //   486: astore_1
    //   487: goto -38 -> 449
    //   490: astore 10
    //   492: aload 9
    //   494: astore 8
    //   496: goto -109 -> 387
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	499	0	this	d
    //   0	499	1	paramString	String
    //   58	280	2	l1	long
    //   67	263	4	l2	long
    //   368	12	6	bool	boolean
    //   31	401	7	localObject1	Object
    //   436	1	7	localIOException1	java.io.IOException
    //   440	15	7	localObject2	Object
    //   472	1	7	localIOException2	java.io.IOException
    //   476	1	7	localObject3	Object
    //   481	1	7	localIOException3	java.io.IOException
    //   148	347	8	localObject4	Object
    //   111	382	9	localRandomAccessFile	java.io.RandomAccessFile
    //   155	102	10	localObject5	Object
    //   382	25	10	localException1	Exception
    //   490	1	10	localException2	Exception
    //   176	119	11	localObject6	Object
    //   88	351	12	localObject7	Object
    //   91	178	13	localObject8	Object
    //   132	76	14	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   93	113	382	java/lang/Exception
    //   424	429	436	java/io/IOException
    //   93	113	445	finally
    //   304	309	472	java/io/IOException
    //   454	459	481	java/io/IOException
    //   117	124	486	finally
    //   128	134	486	finally
    //   138	150	486	finally
    //   166	178	486	finally
    //   191	201	486	finally
    //   205	217	486	finally
    //   237	250	486	finally
    //   254	268	486	finally
    //   276	286	486	finally
    //   290	304	486	finally
    //   391	415	486	finally
    //   117	124	490	java/lang/Exception
    //   128	134	490	java/lang/Exception
    //   138	150	490	java/lang/Exception
    //   166	178	490	java/lang/Exception
    //   191	201	490	java/lang/Exception
    //   205	217	490	java/lang/Exception
    //   237	250	490	java/lang/Exception
    //   254	268	490	java/lang/Exception
    //   276	286	490	java/lang/Exception
    //   290	304	490	java/lang/Exception
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4108807307264L, 30613);
    this.gBe = null;
    this.gBi = null;
    this.gBh = null;
    this.gBf = null;
    this.gBg = null;
    GMTrace.o(4108807307264L, 30613);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4108270436352L, 30609);
    GMTrace.o(4108270436352L, 30609);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.ext.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.mm.pluginsdk.j.a.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class c
{
  private static com.tencent.mm.sdk.b.c htd;
  private static HashSet<String> kNP;
  private static HashSet<String> kNQ;
  private static ArrayList<a> kNR;
  private static HashMap<String, e.a> kNS;
  
  static
  {
    GMTrace.i(20567658856448L, 153241);
    kNP = new HashSet();
    kNQ = new HashSet();
    kNR = new ArrayList();
    htd = new com.tencent.mm.sdk.b.c() {};
    kNS = new HashMap();
    GMTrace.o(20567658856448L, 153241);
  }
  
  public static void a(String paramString, e.a parama)
  {
    GMTrace.i(20566853550080L, 153235);
    kNS.put(paramString, parama);
    GMTrace.o(20566853550080L, 153235);
  }
  
  private static String avA()
  {
    GMTrace.i(20565914025984L, 153228);
    if (ExtControlProviderOpenApi.kMC) {}
    for (String str = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getAbsolutePath() + File.separator + "extqbar";; str = ab.getContext().getFilesDir().getParent() + File.separator + "extqbar")
    {
      File localFile = new File(str);
      if (!localFile.exists())
      {
        w.i("MicroMsg.ExtQbarDataManager", "hy: face dir not exist. mk dir");
        localFile.mkdirs();
      }
      str = str + File.separator + "ext_qbar_config.csv";
      GMTrace.o(20565914025984L, 153228);
      return str;
    }
  }
  
  public static void avB()
  {
    GMTrace.i(20566182461440L, 153230);
    if (!e.aZ(avA()))
    {
      w.w("MicroMsg.ExtQbarDataManager", "hy: not found csv file");
      com.tencent.mm.kernel.h.wS().a(new m(46), 0);
      GMTrace.o(20566182461440L, 153230);
      return;
    }
    for (;;)
    {
      Object localObject2;
      String[] arrayOfString;
      try
      {
        Object localObject1 = e.be(avA());
        w.i("MicroMsg.ExtQbarDataManager", "hy: found qrcode config");
        w.v("MicroMsg.ExtQbarDataManager", "hy: qrcode config is %s", new Object[] { localObject1 });
        if (bg.nm((String)localObject1)) {
          w.w("MicroMsg.ExtQbarDataManager", "hy: no preset black/white config");
        }
        localObject1 = new BufferedReader(new StringReader((String)localObject1));
        long l = bg.Pw();
        try
        {
          localObject2 = ((BufferedReader)localObject1).readLine();
          if (localObject2 != null)
          {
            w.d("MicroMsg.ExtQbarDataManager", "hy: retrieving line");
            arrayOfString = ((String)localObject2).split(",");
            if (arrayOfString.length >= 3) {
              continue;
            }
            w.w("MicroMsg.ExtQbarDataManager", "hy: line %s not qualified length!", new Object[] { localObject2 });
          }
          localObject2 = new a();
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.ExtQbarDataManager", localException, "hy: exception when parse config!", new Object[0]);
          w.i("MicroMsg.ExtQbarDataManager", "hy: qrcode config retrieved using %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
          GMTrace.o(20566182461440L, 153230);
          return;
        }
        ((a)localObject2).url = arrayOfString[2].toUpperCase();
        if (!"white".equalsIgnoreCase(arrayOfString[0])) {
          break label389;
        }
        ((a)localObject2).kNG = b.b.kNM;
        if ("prefix".equalsIgnoreCase(arrayOfString[1]))
        {
          ((a)localObject2).kNF = b.a.kNH;
          i = 1;
          if (i == 0) {
            continue;
          }
          kNR.add(localObject2);
          continue;
        }
        if (!"subdomain".equalsIgnoreCase(arrayOfString[1])) {
          break label339;
        }
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.ExtQbarDataManager", localIOException, "hy: read config file failed!", new Object[0]);
        GMTrace.o(20566182461440L, 153230);
        return;
      }
      ((a)localObject2).kNF = b.a.kNI;
      int i = 1;
      continue;
      label339:
      if ("domain".equalsIgnoreCase(arrayOfString[1]))
      {
        ((a)localObject2).kNF = b.a.kNJ;
        i = 1;
      }
      else
      {
        w.w("MicroMsg.ExtQbarDataManager", "hy: [white] 2nd not qualified! %s", new Object[] { arrayOfString[1] });
        i = 0;
        continue;
        label389:
        if ("black".equalsIgnoreCase(arrayOfString[0]))
        {
          ((a)localObject2).kNG = b.b.kNL;
          if ("prefix".equalsIgnoreCase(arrayOfString[1]))
          {
            ((a)localObject2).kNF = b.a.kNH;
            i = 1;
          }
          else if ("subdomain".equalsIgnoreCase(arrayOfString[1]))
          {
            ((a)localObject2).kNF = b.a.kNI;
            i = 1;
          }
          else if ("domain".equalsIgnoreCase(arrayOfString[1]))
          {
            ((a)localObject2).kNF = b.a.kNJ;
            i = 1;
          }
          else
          {
            w.w("MicroMsg.ExtQbarDataManager", "hy: [black] 2nd not qualified! %s", new Object[] { arrayOfString[1] });
            i = 0;
          }
        }
        else
        {
          w.w("MicroMsg.ExtQbarDataManager", "hy: 1st not qualified! %s", new Object[] { arrayOfString[0] });
          i = 0;
        }
      }
    }
  }
  
  public static void avC()
  {
    GMTrace.i(20566316679168L, 153231);
    avB();
    com.tencent.mm.sdk.b.a.vgX.b(htd);
    GMTrace.o(20566316679168L, 153231);
  }
  
  public static void avD()
  {
    GMTrace.i(20566450896896L, 153232);
    com.tencent.mm.sdk.b.a.vgX.c(htd);
    GMTrace.o(20566450896896L, 153232);
  }
  
  public static void clearCache()
  {
    GMTrace.i(20567121985536L, 153237);
    kNS.clear();
    GMTrace.o(20567121985536L, 153237);
  }
  
  public static void xn(String paramString)
  {
    GMTrace.i(20566048243712L, 153229);
    e.o(paramString, avA());
    GMTrace.o(20566048243712L, 153229);
  }
  
  public static void xo(String paramString)
  {
    GMTrace.i(20566585114624L, 153233);
    kNP.add(paramString);
    GMTrace.o(20566585114624L, 153233);
  }
  
  public static void xp(String paramString)
  {
    GMTrace.i(20566719332352L, 153234);
    kNQ.add(paramString);
    GMTrace.o(20566719332352L, 153234);
  }
  
  public static e.a xq(String paramString)
  {
    GMTrace.i(20566987767808L, 153236);
    paramString = (e.a)kNS.get(paramString);
    GMTrace.o(20566987767808L, 153236);
    return paramString;
  }
  
  public static boolean xr(String paramString)
  {
    GMTrace.i(20567256203264L, 153238);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInWhitelist");
      GMTrace.o(20567256203264L, 153238);
      return false;
    }
    if (kNP.contains(paramString))
    {
      w.i("MicroMsg.ExtQbarDataManager", "hy: %s already in whitelist", new Object[] { paramString });
      GMTrace.o(20567256203264L, 153238);
      return true;
    }
    GMTrace.o(20567256203264L, 153238);
    return false;
  }
  
  public static boolean xs(String paramString)
  {
    GMTrace.i(20567390420992L, 153239);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInBlacklist");
      GMTrace.o(20567390420992L, 153239);
      return false;
    }
    if (kNQ.contains(paramString))
    {
      w.i("MicroMsg.ExtQbarDataManager", "hy: %s already in blacklist", new Object[] { paramString });
      GMTrace.o(20567390420992L, 153239);
      return true;
    }
    GMTrace.o(20567390420992L, 153239);
    return false;
  }
  
  public static b.b xt(String paramString)
  {
    GMTrace.i(20567524638720L, 153240);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ExtQbarDataManager", "hy: url is null when get config");
      paramString = b.b.kNN;
      GMTrace.o(20567524638720L, 153240);
      return paramString;
    }
    Iterator localIterator = kNR.iterator();
    Object localObject;
    label203:
    b.b localb;
    String[] arrayOfString;
    int j;
    int i;
    int k;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala.kNF == b.a.kNH)
        {
          if (paramString.startsWith(locala.url))
          {
            w.i("MicroMsg.ExtQbarDataManager", "hy: match prefix: %s", new Object[] { locala.url });
            paramString = locala.kNG;
            GMTrace.o(20567524638720L, 153240);
            return paramString;
          }
        }
        else
        {
          try
          {
            localObject = new URL(paramString).getHost();
            w.d("MicroMsg.ExtQbarDataManager", "hy: host is %s", new Object[] { localObject });
            if (!bg.E(new String[0])) {
              break label203;
            }
            w.w("MicroMsg.ExtQbarDataManager", "hy: no valid host");
          }
          catch (MalformedURLException localMalformedURLException)
          {
            w.printErrStackTrace("MicroMsg.ExtQbarDataManager", localMalformedURLException, "hy: error in url convert: %s", new Object[] { paramString });
          }
          continue;
          if (localMalformedURLException.kNF == b.a.kNJ)
          {
            if (localMalformedURLException.url.equals(localObject))
            {
              w.i("MicroMsg.ExtQbarDataManager", "hy: match domain: %s", new Object[] { localMalformedURLException.kNF });
              localb = localMalformedURLException.kNG;
              GMTrace.o(20567524638720L, 153240);
              return localb;
            }
          }
          else if (localb.kNF == b.a.kNI)
          {
            arrayOfString = localb.url.split("\\.");
            localObject = ((String)localObject).split("\\.");
            if ((arrayOfString.length <= 0) || (localObject.length <= 0) || (arrayOfString.length > localObject.length)) {
              continue;
            }
            j = arrayOfString.length;
            i = localObject.length;
            j -= 1;
            i -= 1;
            k = 1;
          }
        }
      }
    }
    for (;;)
    {
      if ((j >= 0) && (i >= 0))
      {
        if (!arrayOfString[j].equals(localObject[i])) {
          k = 0;
        }
      }
      else
      {
        if (k == 0) {
          break;
        }
        w.i("MicroMsg.ExtQbarDataManager", "hy: match %s subdomain: %s", new Object[] { paramString, localb.url });
        localb = localb.kNG;
        GMTrace.o(20567524638720L, 153240);
        return localb;
        w.e("MicroMsg.ExtQbarDataManager", "hy: damn it impossible!");
        break;
        paramString = b.b.kNN;
        GMTrace.o(20567524638720L, 153240);
        return paramString;
      }
      j -= 1;
      i -= 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
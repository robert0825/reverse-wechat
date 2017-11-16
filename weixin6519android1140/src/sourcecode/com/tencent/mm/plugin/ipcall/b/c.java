package com.tencent.mm.plugin.ipcall.b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.voip.b.d;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.protocal.c.aur;
import com.tencent.mm.protocal.c.boe;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class c
{
  private static int AS(String paramString)
  {
    GMTrace.i(11735863918592L, 87439);
    try
    {
      byte[] arrayOfByte = InetAddress.getByName(paramString).getAddress();
      if (arrayOfByte != null)
      {
        int j = 0;
        int k;
        for (int i = 0; j < arrayOfByte.length; i = k & 0xFF | i << 8)
        {
          k = arrayOfByte[j];
          j += 1;
        }
        w.d("MicroMsg.IPCallUtil", "ipAddressStrToInt, ip: %s, result: %d", new Object[] { paramString, Integer.valueOf(i) });
        GMTrace.o(11735863918592L, 87439);
        return i;
      }
    }
    catch (UnknownHostException paramString)
    {
      w.printErrStackTrace("MicroMsg.IPCallUtil", paramString, "", new Object[0]);
      GMTrace.o(11735863918592L, 87439);
    }
    return 0;
  }
  
  public static String AT(String paramString)
  {
    GMTrace.i(11736132354048L, 87441);
    paramString = paramString.replace("-", "").replace(" ", "").replace("(", "").replace(")", "").trim();
    GMTrace.o(11736132354048L, 87441);
    return paramString;
  }
  
  public static bof Y(LinkedList<aur> paramLinkedList)
  {
    GMTrace.i(11735729700864L, 87438);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      GMTrace.o(11735729700864L, 87438);
      return null;
    }
    bof localbof = new bof();
    localbof.uYd = paramLinkedList.size();
    localbof.uYe = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      aur localaur = (aur)paramLinkedList.next();
      boe localboe = new boe();
      localboe.uTR = AS(localaur.uBe);
      localboe.uKd = localaur.uKd;
      localbof.uYe.add(localboe);
    }
    GMTrace.o(11735729700864L, 87438);
    return localbof;
  }
  
  public static int aJF()
  {
    GMTrace.i(11735998136320L, 87440);
    Context localContext = ab.getContext();
    if (am.is2G(localContext))
    {
      GMTrace.o(11735998136320L, 87440);
      return 1;
    }
    if (am.is3G(localContext))
    {
      GMTrace.o(11735998136320L, 87440);
      return 3;
    }
    if (am.is4G(localContext))
    {
      GMTrace.o(11735998136320L, 87440);
      return 5;
    }
    if (am.isWifi(localContext))
    {
      GMTrace.o(11735998136320L, 87440);
      return 4;
    }
    GMTrace.o(11735998136320L, 87440);
    return 0;
  }
  
  public static String aJG()
  {
    GMTrace.i(11737340313600L, 87450);
    String str = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryCode", "");
    if (!bg.nm(str))
    {
      str = str.replace("+", "");
      GMTrace.o(11737340313600L, 87450);
      return str;
    }
    str = a.aJD();
    GMTrace.o(11737340313600L, 87450);
    return str;
  }
  
  public static boolean aJH()
  {
    GMTrace.i(19564515557376L, 145767);
    if (g.ut().getInt("WCOClosePurchaseEntranceSwitch", 0) != 0)
    {
      GMTrace.o(19564515557376L, 145767);
      return true;
    }
    GMTrace.o(19564515557376L, 145767);
    return false;
  }
  
  public static afn aJI()
  {
    GMTrace.i(11737474531328L, 87451);
    at.AR();
    Object localObject = com.tencent.mm.y.c.xh().get(w.a.vtj, null);
    if (localObject != null)
    {
      afn localafn = new afn();
      localObject = bg.St(localObject.toString());
      try
      {
        localafn.aD((byte[])localObject);
        w.i("MicroMsg.IPCallUtil", "[royle]parse success,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,Balance:%s,PVWording:%s,PackageMsg:%s", new Object[] { localafn.uve, localafn.mmS, localafn.eBt, localafn.lPj, localafn.uvf, localafn.uvg, localafn.uvh, localafn.uvi, localafn.uvp });
        GMTrace.o(11737474531328L, 87451);
        return localafn;
      }
      catch (IOException localIOException)
      {
        w.i("MicroMsg.IPCallUtil", "[royle]parse exception:%s", new Object[] { localIOException.getMessage() });
      }
    }
    GMTrace.o(11737474531328L, 87451);
    return null;
  }
  
  public static String am(Context paramContext, String paramString)
  {
    int j = 0;
    GMTrace.i(11736535007232L, 87444);
    String[] arrayOfString = paramContext.getResources().getStringArray(R.c.aMy);
    paramContext = new ArrayList();
    paramContext.add("");
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramContext.add(arrayOfString[i]);
      i += 1;
    }
    try
    {
      i = bg.getInt(paramString, 0);
      if (i >= paramContext.size())
      {
        GMTrace.o(11736535007232L, 87444);
        return "";
      }
      paramContext = (String)paramContext.get(i);
      GMTrace.o(11736535007232L, 87444);
      return paramContext;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public static void c(MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(11737206095872L, 87449);
    ((ClipboardManager)paramMMActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, paramString));
    GMTrace.o(11737206095872L, 87449);
  }
  
  public static String cH(long paramLong)
  {
    int j = 1;
    GMTrace.i(11736669224960L, 87445);
    Object localObject = ab.getContext();
    if (cI(paramLong) == 0L) {}
    for (int i = 1; i != 0; i = 0)
    {
      localObject = new SimpleDateFormat("HH:mm", Locale.US).format(new Date(paramLong));
      GMTrace.o(11736669224960L, 87445);
      return (String)localObject;
    }
    if (cI(paramLong) == -1L) {}
    for (i = j; i != 0; i = 0)
    {
      localObject = ((Context)localObject).getString(R.l.dEd);
      GMTrace.o(11736669224960L, 87445);
      return (String)localObject;
    }
    localObject = new SimpleDateFormat("MM/dd", Locale.US).format(new Date(paramLong));
    GMTrace.o(11736669224960L, 87445);
    return (String)localObject;
  }
  
  private static long cI(long paramLong)
  {
    GMTrace.i(11736803442688L, 87446);
    Calendar localCalendar = Calendar.getInstance();
    long l1 = localCalendar.getTimeInMillis();
    localCalendar.add(6, 1);
    l1 = localCalendar.getTimeInMillis() - l1;
    long l2 = Calendar.getInstance().getTimeInMillis();
    paramLong /= l1;
    l1 = l2 / l1;
    GMTrace.o(11736803442688L, 87446);
    return paramLong - l1;
  }
  
  public static String cJ(long paramLong)
  {
    GMTrace.i(11736937660416L, 87447);
    Object localObject = ab.getContext();
    if (paramLong <= 60.0D)
    {
      localObject = ((Context)localObject).getString(R.l.dEi, new Object[] { String.valueOf(paramLong) });
      GMTrace.o(11736937660416L, 87447);
      return (String)localObject;
    }
    double d = paramLong / 60.0D;
    int j = (int)(paramLong / 60.0D);
    int i = j;
    if (d - j > 0.0D) {
      i = j + 1;
    }
    localObject = ((Context)localObject).getString(R.l.dEh, new Object[] { String.valueOf(i) });
    GMTrace.o(11736937660416L, 87447);
    return (String)localObject;
  }
  
  public static boolean cJ(Context paramContext)
  {
    GMTrace.i(11737071878144L, 87448);
    int i;
    if (d.bvN()) {
      i = R.l.dDd;
    }
    for (;;)
    {
      if (i == 0)
      {
        GMTrace.o(11737071878144L, 87448);
        return true;
        if (d.bvO())
        {
          i = R.l.dDc;
        }
        else if (com.tencent.mm.as.a.JK())
        {
          i = R.l.dDb;
        }
        else if (com.tencent.mm.p.a.vq())
        {
          i = R.l.dCY;
        }
        else
        {
          if ((p.a.tlV != null) && (p.a.tlV.bsm())) {}
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label128;
            }
            i = R.l.dDb;
            break;
          }
        }
      }
      else
      {
        h.h(paramContext, i, R.l.cUG);
        GMTrace.o(11737071878144L, 87448);
        return false;
        label128:
        i = 0;
      }
    }
  }
  
  public static CharSequence f(Context paramContext, long paramLong)
  {
    GMTrace.i(11736400789504L, 87443);
    paramContext = DateFormat.format(paramContext.getString(R.l.dwR), paramLong);
    GMTrace.o(11736400789504L, 87443);
    return paramContext;
  }
  
  public static String pE(int paramInt)
  {
    GMTrace.i(11736266571776L, 87442);
    Object localObject = ab.getContext();
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 5: 
    default: 
      localObject = ((Context)localObject).getString(R.l.dEW);
      GMTrace.o(11736266571776L, 87442);
      return (String)localObject;
    case 1: 
      localObject = ((Context)localObject).getString(R.l.dEW);
      GMTrace.o(11736266571776L, 87442);
      return (String)localObject;
    case 2: 
      localObject = ((Context)localObject).getString(R.l.dEW);
      GMTrace.o(11736266571776L, 87442);
      return (String)localObject;
    case 6: 
      localObject = ((Context)localObject).getString(R.l.dES);
      GMTrace.o(11736266571776L, 87442);
      return (String)localObject;
    }
    localObject = ((Context)localObject).getString(R.l.dET);
    GMTrace.o(11736266571776L, 87442);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
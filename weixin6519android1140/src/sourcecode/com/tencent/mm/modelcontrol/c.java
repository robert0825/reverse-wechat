package com.tencent.mm.modelcontrol;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class c
  implements aq
{
  public c()
  {
    GMTrace.i(4109075742720L, 30615);
    GMTrace.o(4109075742720L, 30615);
  }
  
  public static c Gs()
  {
    try
    {
      GMTrace.i(4109209960448L, 30616);
      c localc = (c)p.o(c.class);
      GMTrace.o(4109209960448L, 30616);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean Gt()
  {
    GMTrace.i(4109478395904L, 30618);
    Object localObject = ((a)h.h(a.class)).ut().getValue("C2CImgNotAutoDownloadTimeRange");
    w.i("MicroMsg.BusyTimeControlLogic", "C2CImgNotAutoDownloadTimeRange value: " + (String)localObject);
    if (b.jD((String)localObject))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C image.");
      GMTrace.o(4109478395904L, 30618);
      return false;
    }
    int i = bg.getInt(((a)h.h(a.class)).ut().getValue("ChatImgAutoDownload"), 1);
    if (i == 3)
    {
      w.i("MicroMsg.SubCoreAutoDownload", "settings is not auto download C2C image. ChatImgAutoDownload : " + i);
      GMTrace.o(4109478395904L, 30618);
      return false;
    }
    localObject = ab.getContext();
    if ((i == 2) && (am.isWifi((Context)localObject)))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
      GMTrace.o(4109478395904L, 30618);
      return true;
    }
    if ((i == 1) && (am.isWifi((Context)localObject)))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
      GMTrace.o(4109478395904L, 30618);
      return true;
    }
    long l2 = bg.getInt(((a)h.h(a.class)).ut().getValue("ChatImgAutoDownloadMax"), 0);
    long l1 = bg.a((Long)h.xy().xh().get(w.a.vqP, null), 0L);
    long l3 = bg.Sz((String)DateFormat.format("M", System.currentTimeMillis()));
    long l4 = bg.a((Long)h.xy().xh().get(w.a.vqQ, null), 0L);
    w.d("MicroMsg.SubCoreAutoDownload", "currentmonth " + l3 + " month " + l4 + " maxcount " + l2 + " current " + l1 + " downloadMode: " + i);
    if (l3 != l4)
    {
      w.i("MicroMsg.SubCoreAutoDownload", "update month %d ", new Object[] { Long.valueOf(l3) });
      h.xy().xh().a(w.a.vqP, Long.valueOf(0L));
      h.xy().xh().a(w.a.vqQ, Long.valueOf(l3));
      l1 = 0L;
    }
    for (;;)
    {
      if ((l1 > l2) && (l2 > 0L))
      {
        w.i("MicroMsg.SubCoreAutoDownload", "this month had auto download " + l1 + " C2C image, can not auto download.");
        GMTrace.o(4109478395904L, 30618);
        return false;
      }
      if ((i == 1) && ((am.isWifi((Context)localObject)) || (am.is3G((Context)localObject)) || (am.is4G((Context)localObject))))
      {
        w.i("MicroMsg.SubCoreAutoDownload", "it is wifi or 3,4G now, auto download C2C image.");
        GMTrace.o(4109478395904L, 30618);
        return true;
      }
      w.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C image.");
      GMTrace.o(4109478395904L, 30618);
      return false;
    }
  }
  
  public static boolean Gu()
  {
    GMTrace.i(16420599496704L, 122343);
    String str = ((a)h.h(a.class)).ut().getValue("SnsImgPreLoadingAroundTimeLimit");
    w.i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: " + str);
    if (b.jD(str))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
      GMTrace.o(16420599496704L, 122343);
      return false;
    }
    w.i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
    GMTrace.o(16420599496704L, 122343);
    return true;
  }
  
  public static boolean a(PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(4109881049088L, 30621);
    paramPInt1.value = 0;
    int i = bg.getInt(((a)h.h(a.class)).ut().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      w.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
      GMTrace.o(4109881049088L, 30621);
      return false;
    }
    boolean bool = am.isWifi(ab.getContext());
    if ((i == 2) && (!bool))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
      GMTrace.o(4109881049088L, 30621);
      return false;
    }
    if (am.is2G(ab.getContext()))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
      GMTrace.o(4109881049088L, 30621);
      return false;
    }
    paramPInt2 = ((a)h.h(a.class)).ut().getValue("SnsAdSightNotAutoDownloadTimeRange");
    w.i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: " + paramPInt2);
    if (b.jD(paramPInt2))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
      if (i == 2) {}
      for (i = 2;; i = 1)
      {
        paramPInt1.value = i;
        GMTrace.o(4109881049088L, 30621);
        return false;
      }
    }
    w.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
    GMTrace.o(4109881049088L, 30621);
    return true;
  }
  
  public static boolean a(PInt paramPInt1, PInt paramPInt2, PInt paramPInt3)
  {
    GMTrace.i(4109746831360L, 30620);
    paramPInt1.value = 0;
    int i = bg.getInt(((a)h.h(a.class)).ut().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      w.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video");
      GMTrace.o(4109746831360L, 30620);
      return false;
    }
    boolean bool = am.isWifi(ab.getContext());
    if ((i == 2) && (!bool))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video.");
      GMTrace.o(4109746831360L, 30620);
      return false;
    }
    if (am.is2G(ab.getContext()))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video.");
      GMTrace.o(4109746831360L, 30620);
      return false;
    }
    paramPInt2 = ((a)h.h(a.class)).ut().getValue("SnsSightNoAutoDownload");
    if (!bg.nm(paramPInt2)) {
      try
      {
        w.i("MicroMsg.SubCoreAutoDownload", "dynamicConfigValSeq " + paramPInt2);
        long l1 = bg.getLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), 0L) - ((int)b.Gr() - 8) * 60L / 1000L;
        String[] arrayOfString = paramPInt2.split(",");
        long l2 = bg.getLong(arrayOfString[0], 0L);
        if ((l1 <= bg.getLong(arrayOfString[1], 0L)) && (l1 >= l2))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "config settings can not auto download SNS short video");
          paramPInt3.value = 1;
          GMTrace.o(4109746831360L, 30620);
          return false;
        }
      }
      catch (Exception paramPInt3)
      {
        w.e("MicroMsg.SubCoreAutoDownload", "paser error %s msg: %s", new Object[] { paramPInt2, paramPInt3.getMessage() });
      }
    }
    paramPInt2 = ((a)h.h(a.class)).ut().getValue("SnsSightNotAutoDownloadTimeRange");
    w.i("MicroMsg.BusyTimeControlLogic", "SnsSightNotAutoDownloadTimeRange value: " + paramPInt2);
    if (b.jD(paramPInt2))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download(but need check again) SNS short video");
      if (i == 2) {}
      for (i = 2;; i = 1)
      {
        paramPInt1.value = i;
        GMTrace.o(4109746831360L, 30620);
        return false;
      }
    }
    w.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download.");
    GMTrace.o(4109746831360L, 30620);
    return true;
  }
  
  public static boolean l(au paramau)
  {
    GMTrace.i(4109344178176L, 30617);
    if (paramau == null)
    {
      w.w("MicroMsg.SubCoreAutoDownload", "this message is null, can not auto download.");
      GMTrace.o(4109344178176L, 30617);
      return false;
    }
    if (!paramau.bTC())
    {
      w.w("MicroMsg.SubCoreAutoDownload", "this message is not image, please tell cash.");
      GMTrace.o(4109344178176L, 30617);
      return false;
    }
    if (!m(paramau))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download C2C image.");
      GMTrace.o(4109344178176L, 30617);
      return false;
    }
    boolean bool = Gt();
    GMTrace.o(4109344178176L, 30617);
    return bool;
  }
  
  public static boolean m(au paramau)
  {
    GMTrace.i(4110015266816L, 30622);
    if (paramau == null)
    {
      w.w("MicroMsg.SubCoreAutoDownload", "this message is null.");
      GMTrace.o(4110015266816L, 30622);
      return false;
    }
    paramau = bc.gT(paramau.fwv);
    if (paramau == null)
    {
      w.i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
      GMTrace.o(4110015266816L, 30622);
      return true;
    }
    paramau = paramau.goa;
    if (bg.nm(paramau))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
      GMTrace.o(4110015266816L, 30622);
      return true;
    }
    if (b.jD(paramau))
    {
      w.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : " + paramau);
      GMTrace.o(4110015266816L, 30622);
      return false;
    }
    w.i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: " + paramau);
    GMTrace.o(4110015266816L, 30622);
    return true;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4110417920000L, 30625);
    GMTrace.o(4110417920000L, 30625);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4110552137728L, 30626);
    GMTrace.o(4110552137728L, 30626);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4110283702272L, 30624);
    GMTrace.o(4110283702272L, 30624);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4110686355456L, 30627);
    GMTrace.o(4110686355456L, 30627);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4110149484544L, 30623);
    GMTrace.o(4110149484544L, 30623);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
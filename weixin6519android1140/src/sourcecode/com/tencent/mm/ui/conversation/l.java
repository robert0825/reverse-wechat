package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import java.util.Map;

public final class l
{
  public static i wYU;
  
  static
  {
    GMTrace.i(3428726079488L, 25546);
    wYU = null;
    GMTrace.o(3428726079488L, 25546);
  }
  
  public static void chn()
  {
    GMTrace.i(3428189208576L, 25542);
    if (wYU != null)
    {
      wYU.dismiss();
      wYU = null;
    }
    GMTrace.o(3428189208576L, 25542);
  }
  
  public static void fy(final Context paramContext)
  {
    GMTrace.i(3427786555392L, 25539);
    if (!bg.bRb())
    {
      GMTrace.o(3427786555392L, 25539);
      return;
    }
    Object localObject = com.tencent.mm.k.g.ut().getValue("NewShowRating");
    if (bg.nm((String)localObject))
    {
      GMTrace.o(3427786555392L, 25539);
      return;
    }
    Map localMap = bh.q((String)localObject, "ShowRatingNode");
    int m;
    label114:
    int n;
    if ((localMap == null) || (localMap.get(".ShowRatingNode.MinVer") == null))
    {
      localObject = "0";
      m = Integer.decode((String)localObject).intValue();
      if ((localMap != null) && (localMap.get(".ShowRatingNode.MaxVer") != null)) {
        break label197;
      }
      localObject = "0";
      n = Integer.decode((String)localObject).intValue();
      if ((localMap != null) && (localMap.get(".ShowRatingNode.WaitDays") != null)) {
        break label214;
      }
    }
    int k;
    label197:
    label214:
    for (localObject = "0";; localObject = (String)localMap.get(".ShowRatingNode.WaitDays"))
    {
      k = Integer.decode((String)localObject).intValue();
      if ((m <= com.tencent.mm.protocal.d.tJC) && (com.tencent.mm.protocal.d.tJC <= n)) {
        break label231;
      }
      GMTrace.o(3427786555392L, 25539);
      return;
      localObject = (String)localMap.get(".ShowRatingNode.MinVer");
      break;
      localObject = (String)localMap.get(".ShowRatingNode.MaxVer");
      break label114;
    }
    label231:
    localObject = paramContext.getSharedPreferences("show_rating_preferences", 0);
    int j = ((SharedPreferences)localObject).getInt("show_rating_flag", 0);
    int i1 = ((SharedPreferences)localObject).getInt("show_rating_version", 0);
    long l1 = ((SharedPreferences)localObject).getLong("show_rating_timestamp", 0L);
    boolean bool = ((SharedPreferences)localObject).getBoolean("show_rating_again", false);
    long l2;
    if (k == 0)
    {
      i = 7;
      l2 = i * 86400000L;
      if ((i1 == 0) || (m > i1) || (i1 > n)) {
        break label634;
      }
    }
    label634:
    for (int i = 0;; i = 1)
    {
      if (i != 0)
      {
        ((SharedPreferences)localObject).edit().putInt("show_rating_version", com.tencent.mm.protocal.d.tJC).commit();
        ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 0).commit();
        j = 0;
        l1 = System.currentTimeMillis();
        ((SharedPreferences)localObject).edit().putLong("show_rating_timestamp", l1).commit();
        ((SharedPreferences)localObject).edit().putBoolean("show_rating_again", false).commit();
        ((SharedPreferences)localObject).edit().putInt("show_rating_wait_days", k).commit();
        ((SharedPreferences)localObject).edit().putInt("show_rating_first_second_time", (int)(System.currentTimeMillis() / 1000L)).commit();
        w.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), Integer.valueOf(i1), Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l2) });
      }
      if ((m > com.tencent.mm.protocal.d.tJC) || (com.tencent.mm.protocal.d.tJC > n) || (j != 0) || (l1 == 0L) || (System.currentTimeMillis() < l1 + l2)) {
        break label639;
      }
      w.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show enjoy app dialog.");
      wYU = h.a(paramContext, false, paramContext.getString(R.l.ecT), "", paramContext.getString(R.l.ecM), paramContext.getString(R.l.ecL), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3427115466752L, 25534);
          this.wYV.edit().putInt("show_rating_flag", 1).commit();
          if (paramAnonymousDialogInterface != null) {
            paramAnonymousDialogInterface.dismiss();
          }
          l.wYU = null;
          l.m(paramContext, true);
          w.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog from enjoy app dialog.");
          GMTrace.o(3427115466752L, 25534);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3376515383296L, 25157);
          this.wYV.edit().putInt("show_rating_flag", 2).commit();
          if (paramAnonymousDialogInterface != null) {
            paramAnonymousDialogInterface.dismiss();
          }
          l.wYU = null;
          l.fz(paramContext);
          w.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show feedback dialog.");
          GMTrace.o(3376515383296L, 25157);
        }
      });
      GMTrace.o(3427786555392L, 25539);
      return;
      i = k;
      break;
    }
    label639:
    if ((bool) && (l1 != 0L) && (System.currentTimeMillis() >= l1 + l2 + 345600000L))
    {
      w.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog again.");
      m(paramContext, false);
      ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 3).commit();
      GMTrace.o(3427786555392L, 25539);
      return;
    }
    if (j == 1)
    {
      m(paramContext, true);
      GMTrace.o(3427786555392L, 25539);
      return;
    }
    if (j == 2)
    {
      fz(paramContext);
      GMTrace.o(3427786555392L, 25539);
      return;
    }
    if (j == 3) {
      m(paramContext, false);
    }
    GMTrace.o(3427786555392L, 25539);
  }
  
  public static void fz(final Context paramContext)
  {
    GMTrace.i(3428054990848L, 25541);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    final int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    final int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    wYU = h.a(paramContext, false, paramContext.getString(R.l.ecW), "", paramContext.getString(R.l.ecV), paramContext.getString(R.l.ecU), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3405237977088L, 25371);
        this.wYV.edit().putInt("show_rating_flag", 4).commit();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.dismiss();
        }
        com.tencent.mm.pluginsdk.d.a(paramContext, (int)System.currentTimeMillis(), new byte[0], "weixin://dl/feedback");
        l.wYU = null;
        com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(2), Integer.valueOf(j), Integer.valueOf(i) });
        GMTrace.o(3405237977088L, 25371);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3420001927168L, 25481);
        this.wYV.edit().putInt("show_rating_flag", 4).commit();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.dismiss();
        }
        l.wYU = null;
        com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(i) });
        GMTrace.o(3420001927168L, 25481);
      }
    });
    GMTrace.o(3428054990848L, 25541);
  }
  
  public static void m(final Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(3427920773120L, 25540);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    final boolean bool = localSharedPreferences.getBoolean("show_rating_again", false);
    final int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    final int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    String str1;
    String str2;
    Object localObject2;
    if (paramBoolean)
    {
      str1 = paramContext.getString(R.l.ecS);
      localObject1 = paramContext.getString(R.l.ecR);
      str2 = paramContext.getString(R.l.ecQ);
      localObject2 = localObject1;
    }
    for (Object localObject1 = str2;; localObject1 = paramContext.getString(R.l.ecN))
    {
      wYU = h.a(paramContext, false, str1, "", (String)localObject2, (String)localObject1, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3437181796352L, 25609);
          this.wYV.edit().putInt("show_rating_flag", 4).commit();
          String str = "market://details?id=" + ab.getPackageName();
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse(str));
          paramContext.startActivity(localIntent);
          w.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]start market intent");
          if (paramAnonymousDialogInterface != null) {
            paramAnonymousDialogInterface.dismiss();
          }
          this.wYV.edit().putBoolean("show_rating_again", false).commit();
          l.wYU = null;
          if (bool)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(5), Integer.valueOf(j), Integer.valueOf(i) });
            GMTrace.o(3437181796352L, 25609);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(4), Integer.valueOf(j), Integer.valueOf(i) });
          GMTrace.o(3437181796352L, 25609);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3436913360896L, 25607);
          this.wYV.edit().putInt("show_rating_flag", 4).commit();
          if (bool)
          {
            this.wYV.edit().putBoolean("show_rating_again", false).commit();
            com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(3), Integer.valueOf(j), Integer.valueOf(i) });
          }
          for (;;)
          {
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            l.wYU = null;
            GMTrace.o(3436913360896L, 25607);
            return;
            w.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]need to show rating dialog again.");
            this.wYV.edit().putBoolean("show_rating_again", true).commit();
            com.tencent.mm.plugin.report.service.g.ork.i(11216, new Object[] { Integer.valueOf(6), Integer.valueOf(j), Integer.valueOf(i) });
          }
        }
      });
      GMTrace.o(3427920773120L, 25540);
      return;
      str1 = paramContext.getString(R.l.ecP);
      localObject2 = paramContext.getString(R.l.ecO);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
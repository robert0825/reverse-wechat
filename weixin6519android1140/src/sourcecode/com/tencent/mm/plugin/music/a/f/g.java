package com.tencent.mm.plugin.music.a.f;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private static HashMap<Integer, Boolean> nse;
  private static HashMap<Integer, Long> nsf;
  
  static
  {
    GMTrace.i(18969796804608L, 141336);
    nse = new HashMap();
    nsf = new HashMap();
    nse.put(Integer.valueOf(0), Boolean.valueOf(false));
    nse.put(Integer.valueOf(1), Boolean.valueOf(false));
    nse.put(Integer.valueOf(4), Boolean.valueOf(false));
    nse.put(Integer.valueOf(5), Boolean.valueOf(false));
    nse.put(Integer.valueOf(6), Boolean.valueOf(false));
    nse.put(Integer.valueOf(7), Boolean.valueOf(false));
    nse.put(Integer.valueOf(8), Boolean.valueOf(false));
    nse.put(Integer.valueOf(9), Boolean.valueOf(false));
    nsf.put(Integer.valueOf(0), Long.valueOf(0L));
    nsf.put(Integer.valueOf(1), Long.valueOf(0L));
    nsf.put(Integer.valueOf(4), Long.valueOf(0L));
    nsf.put(Integer.valueOf(5), Long.valueOf(0L));
    nsf.put(Integer.valueOf(6), Long.valueOf(0L));
    nsf.put(Integer.valueOf(7), Long.valueOf(0L));
    nsf.put(Integer.valueOf(8), Long.valueOf(0L));
    nsf.put(Integer.valueOf(9), Long.valueOf(0L));
    GMTrace.o(18969796804608L, 141336);
  }
  
  private static boolean cB(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    GMTrace.i(18969662586880L, 141335);
    if ((paramInt1 == 0) && ((paramInt2 & 0x1) > 0)) {
      w.i("MicroMsg.MusicPlayerSwitcher", "support CHATTING_UI");
    }
    for (;;)
    {
      GMTrace.o(18969662586880L, 141335);
      return bool;
      if ((paramInt1 == 1) && ((paramInt2 & 0x2) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support SNS_TIMELINE_UI");
      }
      else if ((paramInt1 == 4) && ((paramInt2 & 0x4) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support SHAKE_MUSIC_UI");
      }
      else if ((paramInt1 == 5) && ((paramInt2 & 0x8) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support PRODUCT_UI");
      }
      else if ((paramInt1 == 6) && ((paramInt2 & 0x10) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support FAVORITE_UI");
      }
      else if ((paramInt1 == 7) && ((paramInt2 & 0x20) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support WEBVIEW_UI");
      }
      else if ((paramInt1 == 8) && ((paramInt2 & 0x40) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support SNS_USER_TIMELINE_UI");
      }
      else if ((paramInt1 == 9) && ((paramInt2 & 0x80) > 0))
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "support SEARCH_TIMELINE_UI");
      }
      else
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "QQMusicPlayer not support this scene %d", new Object[] { Integer.valueOf(paramInt1) });
        bool = false;
      }
    }
  }
  
  public static boolean rA(int paramInt)
  {
    GMTrace.i(18969394151424L, 141333);
    long l = System.currentTimeMillis();
    boolean bool;
    if (l - ((Long)nsf.get(Integer.valueOf(paramInt))).longValue() < 10000L)
    {
      bool = ((Boolean)nse.get(Integer.valueOf(paramInt))).booleanValue();
      GMTrace.o(18969394151424L, 141333);
      return bool;
    }
    nsf.put(Integer.valueOf(paramInt), Long.valueOf(l));
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100283");
    if (!localc.isValid())
    {
      w.e("MicroMsg.MusicPlayerSwitcher", "supportQQMusicPlayer item.isValid is false");
      bool = rB(paramInt);
      GMTrace.o(18969394151424L, 141333);
      return bool;
    }
    Object localObject = localc.bSg();
    if (localObject == null)
    {
      w.e("MicroMsg.MusicPlayerSwitcher", "supportQQMusicPlayer args == null");
      bool = rB(paramInt);
      GMTrace.o(18969394151424L, 141333);
      return bool;
    }
    if (!((Map)localObject).containsKey("support_player_flag"))
    {
      w.e("MicroMsg.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the support_player_flag key");
      bool = rB(paramInt);
      GMTrace.o(18969394151424L, 141333);
      return bool;
    }
    if (TextUtils.isEmpty((CharSequence)((Map)localObject).get("support_player_flag")))
    {
      w.e("MicroMsg.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the the value is empty");
      bool = rB(paramInt);
      GMTrace.o(18969394151424L, 141333);
      return bool;
    }
    localObject = (String)((Map)localObject).get("support_player_flag");
    try
    {
      i = Integer.valueOf((String)localObject, 16).intValue();
      w.i("MicroMsg.MusicPlayerSwitcher", "supportQQMusicPlayer contain support_player_flag:%s", new Object[] { localObject });
      at.AR();
      l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vxh, Long.valueOf(0L))).longValue();
      if (l == 0L)
      {
        w.i("MicroMsg.MusicPlayerSwitcher", "sequence is 0");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxh, Long.valueOf(localc.field_sequence));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxg, Integer.valueOf(i));
        bool = cB(paramInt, i);
        nse.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
        GMTrace.o(18969394151424L, 141333);
        return bool;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MusicPlayerSwitcher", localNumberFormatException, "supportQQMusicPlayer", new Object[0]);
        int i = 0;
        continue;
        if (l == localc.field_sequence)
        {
          w.i("MicroMsg.MusicPlayerSwitcher", "sequence is equal, check flag from local switch flag");
          at.AR();
          bool = cB(paramInt, ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxg, Integer.valueOf(i))).intValue());
        }
        else
        {
          w.i("MicroMsg.MusicPlayerSwitcher", "sequence is diff, update local data");
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxh, Long.valueOf(localc.field_sequence));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxg, Integer.valueOf(i));
          bool = cB(paramInt, i);
        }
      }
    }
  }
  
  private static boolean rB(int paramInt)
  {
    GMTrace.i(18969528369152L, 141334);
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxg, Integer.valueOf(0))).intValue();
    boolean bool = cB(paramInt, i);
    w.i("MicroMsg.MusicPlayerSwitcher", "checkLocalSupportPlayerFlag support_player_flag:%s", new Object[] { Integer.toHexString(i) });
    nse.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
    GMTrace.o(18969528369152L, 141334);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
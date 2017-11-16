package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ou;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public List<WeakReference<a>> jwK;
  private String oNb;
  
  public f()
  {
    GMTrace.i(6518149742592L, 48564);
    this.jwK = new ArrayList();
    this.oNb = "";
    this.oNb = com.tencent.mm.plugin.shake.c.c.a.bfE();
    GMTrace.o(6518149742592L, 48564);
  }
  
  private void aic()
  {
    GMTrace.i(6518686613504L, 48568);
    if (this.jwK == null)
    {
      GMTrace.o(6518686613504L, 48568);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).bfs();
        }
      }
      i += 1;
    }
    GMTrace.o(6518686613504L, 48568);
  }
  
  private static void bfr()
  {
    GMTrace.i(6518418178048L, 48566);
    ou localou = new ou();
    com.tencent.mm.sdk.b.a.vgX.m(localou);
    GMTrace.o(6518418178048L, 48566);
  }
  
  private static boolean uE(String paramString)
  {
    GMTrace.i(6518552395776L, 48567);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(6518552395776L, 48567);
    return bool;
  }
  
  public final void e(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(6518283960320L, 48565);
    w.i("MicroMsg.ShakeCardMsgMgr", "msg_id is " + paramLong);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is empty");
      GMTrace.o(6518283960320L, 48565);
      return;
    }
    if (paramInt == 0)
    {
      w.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_ENTRANCE");
      localObject = bh.q(paramString, "sysmsg");
      if (localObject == null)
      {
        paramString = null;
        if (paramString != null) {
          break label508;
        }
        w.e("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg == null");
        bfr();
      }
    }
    label155:
    label197:
    label255:
    label319:
    label410:
    label440:
    label448:
    label478:
    label508:
    while (paramInt != 1) {
      for (;;)
      {
        com.tencent.mm.plugin.shake.c.c.a.bfe();
        GMTrace.o(6518283960320L, 48565);
        return;
        paramString = new b();
        String str = (String)((Map)localObject).get(".sysmsg.begintime");
        if ((!TextUtils.isEmpty(str)) && (uE(str)))
        {
          paramString.oNc = Integer.valueOf(str).intValue();
          str = (String)((Map)localObject).get(".sysmsg.endtime");
          if ((TextUtils.isEmpty(str)) || (!uE(str))) {
            break label410;
          }
          paramString.oNd = Integer.valueOf(str).intValue();
          paramString.oNe = ((String)((Map)localObject).get(".sysmsg.entrancename"));
          str = (String)((Map)localObject).get(".sysmsg.activitytype");
          if ((TextUtils.isEmpty(str)) || (!uE(str))) {
            break label440;
          }
          paramString.oNf = Integer.valueOf(str).intValue();
          w.i("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml activitytype is " + str);
          str = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmin");
          if ((TextUtils.isEmpty(str)) || (!uE(str))) {
            break label448;
          }
          paramString.oNg = Integer.valueOf(str).intValue();
          paramString.oNi = ((String)((Map)localObject).get(".sysmsg.shakecardentrancetip"));
          localObject = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmax");
          if ((TextUtils.isEmpty((CharSequence)localObject)) || (!uE((String)localObject))) {
            break label478;
          }
        }
        for (paramString.oNh = Integer.valueOf((String)localObject).intValue();; paramString.oNh = 0)
        {
          break;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml begintime is " + str);
          paramString.oNc = 0;
          break label155;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml endtime is " + str);
          paramString.oNd = 0;
          break label197;
          paramString.oNf = 1;
          break label255;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmin is " + str);
          paramString.oNg = 0;
          break label319;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmax is " + (String)localObject);
        }
        w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg");
        if (!com.tencent.mm.plugin.shake.c.c.a.bff()) {
          w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg isShakeCardEntranceOpen is false");
        }
        w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg begintime:" + paramString.oNc + "  endtime:" + paramString.oNd + "  flowlevelmin:" + paramString.oNg + "  flowlevelmax:" + paramString.oNh + " entrancename:" + paramString.oNe + " activitytype:" + paramString.oNf);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpK, Integer.valueOf(paramString.oNc));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpL, Integer.valueOf(paramString.oNd));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpM, paramString.oNe);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpQ, Integer.valueOf(paramString.oNf));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpN, Integer.valueOf(paramString.oNg));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpO, Integer.valueOf(paramString.oNh));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpP, paramString.oNi);
      }
    }
    w.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_RED_DOT");
    Object localObject = bh.q(paramString, "sysmsg");
    if (localObject == null)
    {
      paramString = null;
      label780:
      if (paramString != null) {
        break label860;
      }
      w.e("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg == null");
    }
    for (;;)
    {
      bfr();
      break;
      paramString = new d();
      paramString.oNj = ((String)((Map)localObject).get(".sysmsg.reddotid"));
      paramString.oNk = ((String)((Map)localObject).get(".sysmsg.reddotdesc"));
      paramString.oNl = ((String)((Map)localObject).get(".sysmsg.reddottext"));
      break label780;
      label860:
      w.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg reddotid is " + paramString.oNj);
      w.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg pre reddotid is " + this.oNb);
      if (TextUtils.isEmpty(paramString.oNj))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "msg.reddotid is empty");
      }
      else if (TextUtils.isEmpty(this.oNb))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId is empty, msg.reddotid is not empty");
        com.tencent.mm.s.c.vK().l(262154, true);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpR, paramString.oNj);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpS, paramString.oNk);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpT, paramString.oNl);
        aic();
      }
      else if (!this.oNb.equals(paramString.oNj))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId and msg.reddotid is not empty, but no equals");
        com.tencent.mm.s.c.vK().l(262154, true);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpR, paramString.oNj);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpS, paramString.oNk);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpT, paramString.oNl);
        aic();
      }
      else if (this.oNb.equals(paramString.oNj))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId equals msg.reddotid");
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bfs();
  }
  
  public static final class b
    extends f.c
  {
    protected int oNc;
    protected int oNd;
    protected String oNe;
    protected int oNf;
    protected int oNg;
    protected int oNh;
    protected String oNi;
    
    public b()
    {
      GMTrace.i(6523786887168L, 48606);
      this.oNc = 0;
      this.oNd = 0;
      this.oNe = "";
      this.oNf = 0;
      this.oNg = 0;
      this.oNh = 7;
      this.oNi = "";
      GMTrace.o(6523786887168L, 48606);
    }
  }
  
  public static class c
  {
    public c()
    {
      GMTrace.i(6523384233984L, 48603);
      GMTrace.o(6523384233984L, 48603);
    }
  }
  
  public static final class d
    extends f.c
  {
    protected String oNj;
    protected String oNk;
    protected String oNl;
    
    public d()
    {
      GMTrace.i(6519491919872L, 48574);
      GMTrace.o(6519491919872L, 48574);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.g.a.hp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;

public final class g
  extends l
  implements m.b
{
  public g(Context paramContext)
  {
    super(paramContext, new q(paramContext));
    GMTrace.i(6723905519616L, 50097);
    paramContext = new hp();
    a.vgX.m(paramContext);
    GMTrace.o(6723905519616L, 50097);
  }
  
  public static void Ty()
  {
    GMTrace.i(6724039737344L, 50098);
    at.AR();
    com.tencent.mm.y.c.yM().Cg("feedsapp");
    at.AR();
    com.tencent.mm.y.c.yP().TN("feedsapp");
    GMTrace.o(6724039737344L, 50098);
  }
  
  protected final int QI()
  {
    GMTrace.i(6724576608256L, 50102);
    int i = R.o.eow;
    GMTrace.o(6724576608256L, 50102);
    return i;
  }
  
  protected final boolean aXJ()
  {
    GMTrace.i(6724442390528L, 50101);
    if ((com.tencent.mm.y.q.zP() & 0x8000) == 0)
    {
      GMTrace.o(6724442390528L, 50101);
      return true;
    }
    GMTrace.o(6724442390528L, 50101);
    return false;
  }
  
  protected final void clear()
  {
    GMTrace.i(6724173955072L, 50099);
    Ty();
    GMTrace.o(6724173955072L, 50099);
  }
  
  protected final void gB(boolean paramBoolean)
  {
    GMTrace.i(6724308172800L, 50100);
    Context localContext = this.context;
    if (paramBoolean) {}
    for (String str = localContext.getString(R.l.dZZ);; str = localContext.getString(R.l.eag))
    {
      localContext.getString(R.l.cUG);
      new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(6753970290688L, 50321);
          int i = com.tencent.mm.y.q.zP();
          if (this.jqL) {
            i &= 0xFFFF7FFF;
          }
          for (;;)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
            at.AR();
            com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              g.Ty();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            if (this.jqN != null) {
              this.jqN.dismiss();
            }
            GMTrace.o(6753970290688L, 50321);
            return true;
            i |= 0x8000;
          }
        }
      }, false).z(1500L, 1500L);
      GMTrace.o(6724308172800L, 50100);
      return;
    }
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6724710825984L, 50103);
    if ("contact_info_plugin_view".equals(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("sns_timeline_NeedFirstLoadint", true);
      com.tencent.mm.bj.d.b(this.context, "sns", ".ui.En_424b8e16", paramString);
      GMTrace.o(6724710825984L, 50103);
      return true;
    }
    Intent localIntent;
    if ("contact_info_plugin_outsize".equals(paramString))
    {
      localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 4L);
      com.tencent.mm.bj.d.b(this.context, "sns", ".ui.SnsBlackDetailUI", localIntent);
    }
    if ("contact_info_plugin_black".equals(paramString))
    {
      localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 5L);
      com.tencent.mm.bj.d.b(this.context, "sns", ".ui.SnsTagDetailUI", localIntent);
    }
    if (paramString.equals("contact_info_plugin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.ead), "", this.context.getString(R.l.cUF), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6778666352640L, 50505);
          g.this.gB(false);
          GMTrace.o(6778666352640L, 50505);
        }
      }, null);
      GMTrace.o(6724710825984L, 50103);
      return true;
    }
    boolean bool = super.tF(paramString);
    GMTrace.o(6724710825984L, 50103);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
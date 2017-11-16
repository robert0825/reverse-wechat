package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.a.qo;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class l
  implements View.OnClickListener
{
  private Context context;
  
  public l(Context paramContext)
  {
    GMTrace.i(996835065856L, 7427);
    this.context = paramContext;
    GMTrace.o(996835065856L, 7427);
  }
  
  public final void onClick(View paramView)
  {
    int j = 1;
    GMTrace.i(996969283584L, 7428);
    Object localObject = paramView.getTag();
    if ((localObject instanceof b))
    {
      localObject = (b)localObject;
      int i;
      if ((localObject == null) || (paramView == null))
      {
        w.w("MicroMsg.SourceClickListener", "localAppRedirectHandle: but info or v is null");
        i = 0;
      }
      for (;;)
      {
        if (i == 0)
        {
          paramView = p.f(this.context, ((b)localObject).appId, ((b)localObject).eRB);
          localObject = new qo();
          ((qo)localObject).eVv.eVw = paramView;
          ((qo)localObject).eVv.context = this.context;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        }
        GMTrace.o(996969283584L, 7428);
        return;
        if ("wx7fa037cc7dfabad5".equals(((b)localObject).appId))
        {
          com.tencent.mm.plugin.sport.b.d.nU(33);
          at.AR();
          if (com.tencent.mm.l.a.eE(c.yK().TE("gh_43f2581f6fd6").field_type))
          {
            paramView = new Intent();
            paramView.putExtra("Chat_User", "gh_43f2581f6fd6");
            paramView.putExtra("finish_direct", true);
            com.tencent.mm.bj.d.a(this.context, ".ui.chatting.En_5b8fbb1e", paramView);
            i = j;
          }
          else
          {
            paramView = new Intent();
            paramView.putExtra("Contact_User", "gh_43f2581f6fd6");
            com.tencent.mm.bj.d.b(this.context, "profile", ".ui.ContactInfoUI", paramView);
            i = j;
          }
        }
        else if ("wx485a97c844086dc9".equals(((b)localObject).appId))
        {
          paramView = new Intent();
          paramView.putExtra("shake_music", true);
          com.tencent.mm.bj.d.b(this.context, "shake", ".ui.ShakeReportUI", paramView);
          i = j;
        }
        else if ("wxfbc915ff7c30e335".equals(((b)localObject).appId))
        {
          i = j;
          if (!com.tencent.mm.ap.b.Jv())
          {
            paramView = new Intent();
            paramView.putExtra("BaseScanUI_select_scan_mode", 1);
            i = j;
            if (!com.tencent.mm.p.a.aQ(this.context))
            {
              i = j;
              if (!com.tencent.mm.p.a.aP(this.context))
              {
                com.tencent.mm.bj.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
                i = j;
              }
            }
          }
        }
        else if ("wx482a4001c37e2b74".equals(((b)localObject).appId))
        {
          i = j;
          if (!com.tencent.mm.ap.b.Jv())
          {
            paramView = new Intent();
            paramView.putExtra("BaseScanUI_select_scan_mode", 2);
            i = j;
            if (!com.tencent.mm.p.a.aQ(this.context))
            {
              i = j;
              if (!com.tencent.mm.p.a.aP(this.context))
              {
                com.tencent.mm.bj.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
                i = j;
              }
            }
          }
        }
        else if ("wx751a1acca5688ba3".equals(((b)localObject).appId))
        {
          i = j;
          if (!com.tencent.mm.ap.b.Jv())
          {
            paramView = new Intent();
            paramView.putExtra("BaseScanUI_select_scan_mode", 5);
            i = j;
            if (!com.tencent.mm.p.a.aQ(this.context))
            {
              i = j;
              if (!com.tencent.mm.p.a.aP(this.context))
              {
                com.tencent.mm.bj.d.b(this.context, "scanner", ".ui.BaseScanUI", paramView);
                i = j;
              }
            }
          }
        }
        else
        {
          if (!"wxaf060266bfa9a35c".equals(((b)localObject).appId)) {
            break;
          }
          paramView = new Intent();
          paramView.putExtra("shake_tv", true);
          com.tencent.mm.bj.d.b(this.context, "shake", ".ui.ShakeReportUI", paramView);
          i = j;
        }
      }
    }
    if ((localObject instanceof a))
    {
      paramView = (a)localObject;
      localObject = new gk();
      ((gk)localObject).eJy.actionCode = 2;
      ((gk)localObject).eJy.scene = paramView.scene;
      ((gk)localObject).eJy.extMsg = ("chatting_src=" + paramView.scene);
      ((gk)localObject).eJy.appId = paramView.appId;
      ((gk)localObject).eJy.context = this.context;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = new nb();
      ((nb)localObject).eSc.context = this.context;
      ((nb)localObject).eSc.scene = paramView.scene;
      ((nb)localObject).eSc.eSd = paramView.appId;
      ((nb)localObject).eSc.packageName = paramView.esM;
      ((nb)localObject).eSc.msgType = paramView.tAY;
      ((nb)localObject).eSc.eMI = paramView.eRY;
      ((nb)localObject).eSc.eSe = 5;
      ((nb)localObject).eSc.mediaTagName = paramView.tAZ;
      ((nb)localObject).eSc.eSf = paramView.eSf;
      ((nb)localObject).eSc.eSg = "";
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    GMTrace.o(996969283584L, 7428);
  }
  
  public static final class a
  {
    public String appId;
    public String eRB;
    public String eRY;
    public long eSf;
    public String esM;
    public int scene;
    public int tAY;
    public String tAZ;
    
    public a()
    {
      GMTrace.i(1029047320576L, 7667);
      GMTrace.o(1029047320576L, 7667);
    }
  }
  
  public static final class b
  {
    public String appId;
    public String eRB;
    
    public b()
    {
      GMTrace.i(984352817152L, 7334);
      GMTrace.o(984352817152L, 7334);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
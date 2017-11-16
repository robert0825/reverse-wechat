package com.tencent.mm.ui.chatting.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.t;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.chatting.a.b.a;
import com.tencent.mm.ui.chatting.a.b.e;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends b
{
  private int iGe;
  private com.tencent.mm.ao.a.a.c wvN;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17890686271488L, 133296);
    this.iGe = -1;
    paramContext = new c.a();
    paramContext.gKR = R.k.cJu;
    paramContext.aP(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50)).gKA = true;
    this.wvN = paramContext.Jn();
    GMTrace.o(17890686271488L, 133296);
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(17891760013312L, 133304);
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(17891760013312L, 133304);
      return null;
      paramString = g.aP(paramString, true);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.field_packageName;
      }
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(17891760013312L, 133304);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.AppBrandHistoryListPresenter", paramContext, "", new Object[0]);
      GMTrace.o(17891760013312L, 133304);
    }
    return null;
  }
  
  public final String Qb()
  {
    GMTrace.i(17890954706944L, 133298);
    GMTrace.o(17890954706944L, 133298);
    return "";
  }
  
  public final void a(b.a parama, int paramInt)
  {
    GMTrace.i(17891491577856L, 133302);
    parama = (b)parama;
    a locala = (a)CV(paramInt);
    if (bg.nm(locala.desc)) {
      parama.hqI.setVisibility(8);
    }
    for (;;)
    {
      n.Jd().a(locala.imagePath, parama.hqG, this.wvN);
      GMTrace.o(17891491577856L, 133302);
      return;
      parama.hqI.setVisibility(0);
      parama.hqI.setText(bg.aq(locala.desc, ""));
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(17891625795584L, 133303);
    boolean bool3 = s.eb(this.iGc);
    w.i("MicroMsg.AppBrandHistoryListPresenter", "username: %s , appid %s ,pkgType : %s", new Object[] { parama.eRj.gkR, parama.gkS, Integer.valueOf(parama.eRj.gkY) });
    Object localObject2 = this.iGc;
    Object localObject3 = parama.username;
    Bundle localBundle = new Bundle();
    localBundle.putInt("stat_scene", 9);
    localBundle.putString("stat_msg_id", "msg_" + Long.toString(parama.eSf));
    localBundle.putString("stat_chat_talker_username", (String)localObject2);
    localBundle.putString("stat_send_msg_user", (String)localObject3);
    boolean bool1;
    switch (parama.eRj.gkT)
    {
    default: 
      bool1 = true;
    }
    Object localObject1;
    for (;;)
    {
      boolean bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (parama.eRj.type == 36)
        {
          ((com.tencent.mm.plugin.appbrand.k.c)h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(this.mContext, this.iGc, parama.username, true, parama.eRj);
          bool2 = false;
        }
      }
      w.i("MicroMsg.AppBrandHistoryListPresenter", "goDefaultClickAction %b", new Object[] { Boolean.valueOf(bool2) });
      if (bool2) {
        break;
      }
      GMTrace.o(17891625795584L, 133303);
      return;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_username", parama.eRj.gkR);
      if (bool3)
      {
        ((Intent)localObject1).putExtra("key_from_scene", 1);
        ((Intent)localObject1).putExtra("key_scene_note", (String)localObject2 + ":" + (String)localObject3);
      }
      for (;;)
      {
        ((Intent)localObject1).putExtra("_stat_obj", localBundle);
        localObject2 = new WxaExposedParams.a();
        ((WxaExposedParams.a)localObject2).appId = parama.gkS;
        ((WxaExposedParams.a)localObject2).eDj = 6;
        ((WxaExposedParams.a)localObject2).hKB = parama.eRj.gkY;
        ((WxaExposedParams.a)localObject2).hKC = parama.eRj.gkV;
        ((Intent)localObject1).putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject2).UI());
        d.b(this.mContext, "appbrand", ".ui.AppBrandProfileUI", (Intent)localObject1);
        bool1 = false;
        break;
        ((Intent)localObject1).putExtra("key_from_scene", 2);
        ((Intent)localObject1).putExtra("key_scene_note", (String)localObject2);
      }
      com.tencent.mm.modelappbrand.a.a((String)localObject2, (String)localObject3, bool3, parama.eRj, localBundle);
      bool1 = false;
      continue;
      com.tencent.mm.modelappbrand.a.b((String)localObject2, (String)localObject3, bool3, parama.eRj, localBundle);
      bool1 = false;
    }
    if ((parama.eRj.url != null) && (!parama.eRj.url.equals("")))
    {
      localObject2 = parama.eRj.url;
      if (!bool3) {
        break label986;
      }
      localObject1 = "groupmessage";
      localObject1 = p.s((String)localObject2, (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("webpageTitle", parama.eRj.title);
      localObject3 = getPackageInfo(this.mContext, parama.eRj.appId);
      if (localObject3 != null) {
        break label994;
      }
      localObject1 = null;
      label610:
      ((Intent)localObject2).putExtra("version_name", (String)localObject1);
      if (localObject3 != null) {
        break label1004;
      }
    }
    label986:
    label994:
    label1004:
    for (int i = 0;; i = ((PackageInfo)localObject3).versionCode)
    {
      ((Intent)localObject2).putExtra("version_code", i);
      ((Intent)localObject2).putExtra("shortUrl", parama.eRj.url);
      if (!bg.nm(parama.eRj.eTo))
      {
        ((Intent)localObject2).putExtra("srcUsername", parama.eRj.eTo);
        ((Intent)localObject2).putExtra("srcDisplayname", parama.eRj.eTp);
      }
      ((Intent)localObject2).putExtra("msg_id", parama.eDr);
      ((Intent)localObject2).putExtra("KPublisherId", "msg_" + Long.toString(parama.eSf));
      ((Intent)localObject2).putExtra("KAppId", parama.eRj.appId);
      ((Intent)localObject2).putExtra("geta8key_username", this.iGc);
      ((Intent)localObject2).putExtra("pre_username", parama.username);
      ((Intent)localObject2).putExtra("from_scence", 2);
      ((Intent)localObject2).putExtra("prePublishId", "msg_" + Long.toString(parama.eSf));
      ((Intent)localObject2).putExtra("preUsername", parama.username);
      ((Intent)localObject2).putExtra("preChatName", this.iGc);
      ((Intent)localObject2).putExtra("preChatTYPE", 2);
      ((Intent)localObject2).putExtra("preMsgIndex", 0);
      ((Intent)localObject2).putExtra("share_report_pre_msg_url", parama.eRj.url);
      ((Intent)localObject2).putExtra("share_report_pre_msg_title", parama.eRj.title);
      ((Intent)localObject2).putExtra("share_report_pre_msg_desc", parama.eRj.description);
      ((Intent)localObject2).putExtra("share_report_pre_msg_icon_url", parama.eRj.thumburl);
      ((Intent)localObject2).putExtra("share_report_pre_msg_appid", parama.eRj.appId);
      ((Intent)localObject2).putExtra("share_report_from_scene", 2);
      d.b(this.mContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(17891625795584L, 133303);
      return;
      localObject1 = "singlemessage";
      break;
      localObject1 = ((PackageInfo)localObject3).versionName;
      break label610;
    }
  }
  
  public final void ceZ()
  {
    GMTrace.i(17890820489216L, 133297);
    w.i("MicroMsg.AppBrandHistoryListPresenter", "[loadData] isFirst:%s", new Object[] { Boolean.valueOf(true) });
    this.wOy.cfd();
    com.tencent.mm.plugin.appbrand.n.a.a(this.iGc, new com.tencent.mm.plugin.appbrand.n.a.a()
    {
      public final void s(LinkedList<com.tencent.mm.plugin.appbrand.n.b> paramAnonymousLinkedList)
      {
        GMTrace.i(19164546727936L, 142787);
        if (!bg.cc(paramAnonymousLinkedList))
        {
          paramAnonymousLinkedList = paramAnonymousLinkedList.iterator();
          while (paramAnonymousLinkedList.hasNext())
          {
            Object localObject = (com.tencent.mm.plugin.appbrand.n.b)paramAnonymousLinkedList.next();
            localObject = new a.a(a.this, ((com.tencent.mm.plugin.appbrand.n.b)localObject).timestamp, ((com.tencent.mm.plugin.appbrand.n.b)localObject).type, ((com.tencent.mm.plugin.appbrand.n.b)localObject).title, ((com.tencent.mm.plugin.appbrand.n.b)localObject).eDr, ((com.tencent.mm.plugin.appbrand.n.b)localObject).username, ((com.tencent.mm.plugin.appbrand.n.b)localObject).eCQ, ((com.tencent.mm.plugin.appbrand.n.b)localObject).aDo, ((com.tencent.mm.plugin.appbrand.n.b)localObject).iGn, ((com.tencent.mm.plugin.appbrand.n.b)localObject).gkS, ((com.tencent.mm.plugin.appbrand.n.b)localObject).eRj, ((com.tencent.mm.plugin.appbrand.n.b)localObject).eSf, ((com.tencent.mm.plugin.appbrand.n.b)localObject).desc, ((com.tencent.mm.plugin.appbrand.n.b)localObject).imagePath);
            a.this.iFZ.add(localObject);
          }
        }
        a.this.wOB = a.this.iFZ;
        if (a.this.wOy != null) {
          a.this.wOy.v(this.wOu, a.this.iFZ.size());
        }
        GMTrace.o(19164546727936L, 142787);
      }
    });
    GMTrace.o(17890820489216L, 133297);
  }
  
  public final b.e cfa()
  {
    GMTrace.i(17891223142400L, 133300);
    b.e local2 = new b.e()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(17889880965120L, 133290);
        w.i("MicroMsg.AppBrandHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        a.this.a((a.a)paramAnonymousb);
        GMTrace.o(17889880965120L, 133290);
      }
      
      public final void a(View paramAnonymousView, int paramAnonymousInt, final com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(17890015182848L, 133291);
        w.i("MicroMsg.AppBrandHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        new l(paramAnonymousView.getContext()).b(paramAnonymousView, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
          {
            GMTrace.i(17892028448768L, 133306);
            GMTrace.o(17892028448768L, 133306);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(17890283618304L, 133293);
            at.AR();
            au localau = com.tencent.mm.y.c.yM().cM(paramAnonymousb.eDr);
            a.this.d(paramAnonymous2MenuItem.getItemId(), localau);
            GMTrace.o(17890283618304L, 133293);
          }
        });
        GMTrace.o(17890015182848L, 133291);
      }
    };
    GMTrace.o(17891223142400L, 133300);
    return local2;
  }
  
  public final String cfc()
  {
    GMTrace.i(17891088924672L, 133299);
    GMTrace.o(17891088924672L, 133299);
    return "";
  }
  
  public final int getType()
  {
    GMTrace.i(20395054858240L, 151955);
    GMTrace.o(20395054858240L, 151955);
    return 33;
  }
  
  public final RecyclerView.t m(ViewGroup paramViewGroup)
  {
    GMTrace.i(17891357360128L, 133301);
    paramViewGroup = new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cpo, paramViewGroup, false));
    GMTrace.o(17891357360128L, 133301);
    return paramViewGroup;
  }
  
  final class a
    extends com.tencent.mm.ui.chatting.a.b.b
  {
    public String desc;
    public f.a eRj;
    public long eSf;
    public String gkS;
    public String imagePath;
    
    public a(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, f.a parama, long paramLong3, String paramString7, String paramString8)
    {
      super(paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
      GMTrace.i(19164412510208L, 142786);
      this.gkS = paramString6;
      this.eRj = parama;
      this.eSf = paramLong3;
      this.desc = paramString7;
      this.imagePath = paramString8;
      GMTrace.o(19164412510208L, 142786);
    }
    
    public final boolean Wn(String paramString)
    {
      GMTrace.i(17889075658752L, 133284);
      GMTrace.o(17889075658752L, 133284);
      return false;
    }
    
    public final int getType()
    {
      GMTrace.i(17889209876480L, 133285);
      GMTrace.o(17889209876480L, 133285);
      return 33;
    }
  }
  
  final class b
    extends b.a
  {
    TextView hqI;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(17889612529664L, 133288);
      this.hqI = ((TextView)paramView.findViewById(R.h.byL));
      GMTrace.o(17889612529664L, 133288);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
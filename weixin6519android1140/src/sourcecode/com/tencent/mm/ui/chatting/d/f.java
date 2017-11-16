package com.tencent.mm.ui.chatting.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView.t;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.chatting.a.b.a;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.a.b.e;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import com.tencent.mm.y.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public final class f
  extends b
{
  public int iGe;
  private int lyd;
  public int wOJ;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14939104215040L, 111305);
    this.iGe = -1;
    this.wOJ = 0;
    this.lyd = 0;
    GMTrace.o(14939104215040L, 111305);
  }
  
  protected static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(14939775303680L, 111310);
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(14939775303680L, 111310);
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
      GMTrace.o(14939775303680L, 111310);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.MusicHistoryListPresenter", paramContext, "", new Object[0]);
      GMTrace.o(14939775303680L, 111310);
    }
    return null;
  }
  
  public final String Qb()
  {
    GMTrace.i(14939372650496L, 111307);
    String str = this.mContext.getString(R.l.cRz);
    GMTrace.o(14939372650496L, 111307);
    return str;
  }
  
  public final void a(b.a parama, int paramInt)
  {
    GMTrace.i(16450798485504L, 122568);
    b localb = (b)parama;
    a locala = (a)CV(paramInt);
    localb.jRw.setText(u.d(this.mContext, locala.timestamp));
    Bitmap localBitmap = n.IZ().a(locala.imagePath, com.tencent.mm.br.a.getDensity(this.mContext), false);
    if (localBitmap != null)
    {
      parama = localBitmap;
      if (!localBitmap.isRecycled()) {}
    }
    else
    {
      localBitmap = g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(this.mContext));
      if (localBitmap != null)
      {
        parama = localBitmap;
        if (!localBitmap.isRecycled()) {}
      }
      else
      {
        localb.iub.setImageResource(R.k.cJr);
      }
    }
    for (;;)
    {
      localb.ljO.setText(bg.aq(locala.aEe, ""));
      b.d(localb.ljO, this.wOz.wIc);
      GMTrace.o(16450798485504L, 122568);
      return;
      localb.iub.setImageBitmap(parama);
    }
  }
  
  protected final void a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, long paramLong1, long paramLong2, au paramau)
  {
    GMTrace.i(14939641085952L, 111309);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      w.e("MicroMsg.MusicHistoryListPresenter", "url, lowUrl both are empty");
      GMTrace.o(14939641085952L, 111309);
      return;
    }
    String str;
    if (am.isMobile(this.mContext))
    {
      str = paramString1;
      if (paramString2 != null)
      {
        if (paramString2.length() > 0) {
          break label315;
        }
        str = paramString1;
      }
    }
    for (;;)
    {
      paramString1 = new Intent();
      paramString1.putExtra("msg_id", paramLong1);
      paramString1.putExtra("rawUrl", str);
      paramString1.putExtra("version_name", paramString3);
      paramString1.putExtra("version_code", paramInt);
      paramString1.putExtra("usePlugin", true);
      paramString1.putExtra("geta8key_username", this.iGc);
      paramString1.putExtra("KPublisherId", "msg_" + Long.toString(paramLong2));
      paramString1.putExtra("KAppId", paramString4);
      paramString2 = b(paramau, s.eb(this.iGc));
      paramString1.putExtra("pre_username", paramString2);
      paramString1.putExtra("prePublishId", "msg_" + Long.toString(paramLong2));
      if (paramau != null) {
        paramString1.putExtra("preUsername", paramString2);
      }
      paramString1.putExtra("preChatName", this.iGc);
      paramString1.putExtra("preChatTYPE", t.H(paramString2, this.iGc));
      paramString1.putExtra("preMsgIndex", 0);
      d.b(this.mContext, "webview", ".ui.tools.WebViewUI", paramString1);
      GMTrace.o(14939641085952L, 111309);
      return;
      if (paramString1 != null)
      {
        str = paramString1;
        if (paramString1.length() > 0) {}
      }
      else
      {
        label315:
        str = paramString2;
      }
    }
  }
  
  public final void ceZ()
  {
    GMTrace.i(14939238432768L, 111306);
    this.wOy.cfd();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14940849045504L, 111318);
        LinkedList localLinkedList = new LinkedList();
        at.AR();
        Cursor localCursor = com.tencent.mm.y.c.yM().bl(f.this.iGc, f.this.iGe);
        if (localCursor == null)
        {
          w.e("MicroMsg.MusicHistoryListPresenter", "[loadData] cursor is null!");
          GMTrace.o(14940849045504L, 111318);
          return;
        }
        q localq;
        long l1;
        if (s.eb(f.this.iGc))
        {
          at.AR();
          localq = com.tencent.mm.y.c.yT().gC(f.this.iGc);
          l1 = 0L;
        }
        for (;;)
        {
          try
          {
            if (localCursor.moveToNext())
            {
              au localau = new au();
              localau.b(localCursor);
              Object localObject1 = localau.field_content;
              if (localObject1 == null) {
                continue;
              }
              com.tencent.mm.x.f.a locala = com.tencent.mm.x.f.a.eS((String)localObject1);
              if (3 != locala.type) {
                break label570;
              }
              i = 1;
              if (i == 0) {
                continue;
              }
              localObject1 = new Date(localau.field_createTime);
              long l2 = com.tencent.mm.ui.gridviewheaders.a.chJ().a((Date)localObject1);
              if (l1 != l2)
              {
                localLinkedList.add(new b.c(localau.field_createTime));
                localObject1 = f.this;
                ((f)localObject1).wOJ += 1;
              }
              localObject1 = f.b(localau, s.eb(f.this.iGc));
              x localx1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject1);
              Object localObject3 = "";
              if (localq != null) {
                localObject3 = localq.fs((String)localObject1);
              }
              i = com.tencent.mm.pluginsdk.model.c.Oh(locala.giw);
              localObject1 = com.tencent.mm.plugin.favorite.c.getAppName(f.this.mContext, locala.eTo);
              at.AR();
              x localx2 = com.tencent.mm.y.c.yK().TE(locala.eTo);
              if ((localx2 == null) || (!localx2.field_username.equals(locala.eTo)))
              {
                ak.a.gmX.a(locala.eTo, "", null);
                localObject3 = new f.a(f.this, localau.field_createTime, locala.type, locala.title, localau.field_msgId, localx1.field_username, localx1.vj(), localx1.field_conRemark, (String)localObject3);
                if (bg.nm((String)localObject1))
                {
                  localObject1 = locala.description;
                  ((f.a)localObject3).aEe = ((String)localObject1);
                  ((f.a)localObject3).appId = locala.appId;
                  ((f.a)localObject3).imagePath = localau.field_imgPath;
                  ((f.a)localObject3).iconRes = i;
                  localLinkedList.add(localObject3);
                  l1 = l2;
                }
              }
              else
              {
                localObject1 = localx2.vk();
                continue;
              }
              continue;
            }
            localCursor.close();
            f.this.iFZ.addAll(localLinkedList);
            f.this.wOB = f.this.iFZ;
            localLinkedList.clear();
            com.tencent.mm.sdk.platformtools.af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14950110068736L, 111387);
                if (f.this.wOy != null) {
                  f.this.wOy.v(f.1.this.wOu, f.this.iFZ.size());
                }
                GMTrace.o(14950110068736L, 111387);
              }
            });
            GMTrace.o(14940849045504L, 111318);
            return;
          }
          finally
          {
            localCursor.close();
          }
          localq = null;
          break;
          label570:
          int i = 0;
        }
      }
    });
    GMTrace.o(14939238432768L, 111306);
  }
  
  public final b.e cfa()
  {
    GMTrace.i(16450530050048L, 122566);
    b.e local2 = new b.e()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16457375154176L, 122617);
        at.AR();
        au localau = com.tencent.mm.y.c.yM().cM(paramAnonymousb.eDr);
        com.tencent.mm.x.f.a locala = com.tencent.mm.x.f.a.eS(localau.field_content);
        String str1 = p.s(locala.url, "message");
        String str2 = p.s(locala.giu, "message");
        PackageInfo localPackageInfo = f.getPackageInfo(f.this.mContext, locala.appId);
        f localf = f.this;
        if (localPackageInfo == null)
        {
          paramAnonymousb = null;
          if (localPackageInfo != null) {
            break label138;
          }
        }
        label138:
        for (paramAnonymousInt = 0;; paramAnonymousInt = localPackageInfo.versionCode)
        {
          localf.a(str1, str2, paramAnonymousb, paramAnonymousInt, locala.appId, localau.field_msgId, localau.field_msgSvrId, localau);
          GMTrace.o(16457375154176L, 122617);
          return;
          paramAnonymousb = localPackageInfo.versionName;
          break;
        }
      }
      
      public final void a(View paramAnonymousView, int paramAnonymousInt, final com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16457509371904L, 122618);
        w.i("MicroMsg.MusicHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        new l(paramAnonymousView.getContext()).b(paramAnonymousView, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
          {
            GMTrace.i(14949036326912L, 111379);
            paramAnonymous2ContextMenu.add(0, 0, 0, paramAnonymous2View.getContext().getString(R.l.dSm));
            paramAnonymous2ContextMenu.add(0, 1, 0, paramAnonymous2View.getContext().getString(R.l.dfl));
            paramAnonymous2ContextMenu.add(0, 2, 0, paramAnonymous2View.getContext().getString(R.l.dgd));
            GMTrace.o(14949036326912L, 111379);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(14948096802816L, 111372);
            at.AR();
            paramAnonymous2MenuItem = com.tencent.mm.y.c.yM().cM(paramAnonymousb.eDr);
            f.this.d(paramAnonymous2Int, paramAnonymous2MenuItem);
            GMTrace.o(14948096802816L, 111372);
          }
        });
        GMTrace.o(16457509371904L, 122618);
      }
    };
    GMTrace.o(16450530050048L, 122566);
    return local2;
  }
  
  public final String cfc()
  {
    GMTrace.i(16450395832320L, 122565);
    String str = this.mContext.getString(R.l.cRz);
    GMTrace.o(16450395832320L, 122565);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(20394920640512L, 151954);
    GMTrace.o(20394920640512L, 151954);
    return 3;
  }
  
  public final RecyclerView.t m(ViewGroup paramViewGroup)
  {
    GMTrace.i(16450664267776L, 122567);
    paramViewGroup = new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cHk, paramViewGroup, false));
    GMTrace.o(16450664267776L, 122567);
    return paramViewGroup;
  }
  
  final class a
    extends com.tencent.mm.ui.chatting.a.b.b
  {
    public String aEe;
    public String appId;
    public int iconRes;
    public String imagePath;
    
    public a(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      super(paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
      GMTrace.i(16454690799616L, 122597);
      GMTrace.o(16454690799616L, 122597);
    }
    
    public final boolean Wn(String paramString)
    {
      GMTrace.i(16454825017344L, 122598);
      if (paramString != null)
      {
        paramString = paramString.toLowerCase();
        if (!Wo(paramString))
        {
          if ((!bg.nm(this.aEe)) && (fo(paramString, this.aEe.toLowerCase())))
          {
            GMTrace.o(16454825017344L, 122598);
            return true;
          }
        }
        else if ((!bg.nm(this.aEe)) && (this.aEe.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16454825017344L, 122598);
          return true;
        }
        boolean bool = super.Wn(paramString);
        GMTrace.o(16454825017344L, 122598);
        return bool;
      }
      GMTrace.o(16454825017344L, 122598);
      return false;
    }
    
    public final int getType()
    {
      GMTrace.i(16454959235072L, 122599);
      GMTrace.o(16454959235072L, 122599);
      return 3;
    }
  }
  
  final class b
    extends b.a
  {
    TextView hqI;
    ImageView iub;
    TextView ljO;
    ImageView lkb;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(16451335356416L, 122572);
      this.iub = ((ImageView)paramView.findViewById(R.h.byW));
      this.hqI = ((TextView)paramView.findViewById(R.h.byI));
      this.hqI.setVisibility(8);
      this.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      this.lkb = ((ImageView)paramView.findViewById(R.h.byY));
      this.lkb.setImageResource(R.g.aYf);
      this.lkb.setVisibility(0);
      GMTrace.o(16451335356416L, 122572);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
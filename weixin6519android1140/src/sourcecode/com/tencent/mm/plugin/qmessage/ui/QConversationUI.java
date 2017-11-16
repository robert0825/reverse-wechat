package com.tencent.mm.plugin.qmessage.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.aay;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class QConversationUI
  extends MMActivity
  implements e
{
  private TextView jqc;
  private p.d jqg;
  private boolean jqh;
  private x kse;
  private boolean mTV;
  private ListView nRE;
  private c nRF;
  private com.tencent.mm.plugin.qmessage.a.c nRG;
  private boolean nRH;
  private String nRI;
  private String nRJ;
  private boolean nRK;
  private String nRL;
  
  public QConversationUI()
  {
    GMTrace.i(8944537829376L, 66642);
    this.mTV = false;
    this.nRH = false;
    this.nRK = false;
    this.jqh = false;
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(8950846062592L, 66689);
        QConversationUI.a(QConversationUI.this, QConversationUI.j(QConversationUI.this));
        GMTrace.o(8950846062592L, 66689);
      }
    };
    GMTrace.o(8944537829376L, 66642);
  }
  
  private static void aYn()
  {
    GMTrace.i(8945208918016L, 66647);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().qq(2);
    if ((localObject != null) && (((ce)localObject).field_msgId > 0L))
    {
      w.d("MicroMsg.QConversationUI", "resetUnread: lastReadTime = " + ((ce)localObject).field_createTime);
      at.AR();
      com.tencent.mm.y.c.xh().set(12295, Long.valueOf(((ce)localObject).field_createTime));
    }
    at.AR();
    localObject = com.tencent.mm.y.c.yP().TO("qmessage");
    if ((localObject == null) || (bg.nl(((aj)localObject).field_username).length() <= 0))
    {
      w.e("MicroMsg.QConversationUI", "resetUnread: can not find QMessage");
      GMTrace.o(8945208918016L, 66647);
      return;
    }
    ((ae)localObject).dz(0);
    at.AR();
    if (com.tencent.mm.y.c.yP().a((ae)localObject, ((aj)localObject).field_username) == -1) {
      w.e("MicroMsg.QConversationUI", "reset qmessage unread failed");
    }
    GMTrace.o(8945208918016L, 66647);
  }
  
  private void aYo()
  {
    GMTrace.i(8945745788928L, 66651);
    this.vKB.bXE();
    if (!bg.nm(this.nRI))
    {
      this.nRH = true;
      a(0, R.l.cQh, R.k.bUH, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8943464087552L, 66634);
          if (!bg.nm(QConversationUI.f(QConversationUI.this))) {
            QConversationUI.a(QConversationUI.this, QConversationUI.f(QConversationUI.this), QConversationUI.g(QConversationUI.this));
          }
          GMTrace.o(8943464087552L, 66634);
          return true;
        }
      });
    }
    a(2, R.l.cQi, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8948832796672L, 66674);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("Contact_User", QConversationUI.a(QConversationUI.this).field_username);
        paramAnonymousMenuItem.putExtra("Chat_Readonly", true);
        com.tencent.mm.plugin.qmessage.a.hnH.d(paramAnonymousMenuItem, QConversationUI.this.vKB.vKW);
        GMTrace.o(8948832796672L, 66674);
        return true;
      }
    });
    GMTrace.o(8945745788928L, 66651);
  }
  
  private static String as(Context paramContext, String paramString)
  {
    GMTrace.i(8945611571200L, 66650);
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext == null) {
        break label107;
      }
      paramContext = paramContext.activityInfo.name;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QConversationUI", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
    GMTrace.o(8945611571200L, 66650);
    return paramContext;
  }
  
  private void goBack()
  {
    GMTrace.i(8946014224384L, 66653);
    if (this.mTV)
    {
      finish();
      GMTrace.o(8946014224384L, 66653);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    com.tencent.mm.plugin.qmessage.a.hnH.s(localIntent, this);
    overridePendingTransition(R.a.aLj, R.a.aLD);
    GMTrace.o(8946014224384L, 66653);
  }
  
  protected final void MP()
  {
    GMTrace.i(8945477353472L, 66649);
    this.mTV = getIntent().getBooleanExtra("finish_direct", false);
    w.d("MicroMsg.QConversationUI", "isFromSearch  " + this.mTV);
    at.AR();
    this.kse = com.tencent.mm.y.c.yK().TE("qmessage");
    if ((this.kse != null) && ((int)this.kse.fTq > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("can not find qmessage", bool);
      this.nRE = ((ListView)findViewById(R.h.chU));
      this.jqc = ((TextView)findViewById(R.h.bwF));
      this.jqc.setText(R.l.dpL);
      this.nRF = new c(this, new o.a()
      {
        public final void QC()
        {
          GMTrace.i(8949101232128L, 66676);
          QConversationUI localQConversationUI = QConversationUI.this;
          String str = QConversationUI.a(QConversationUI.this).vj();
          int i = com.tencent.mm.y.t.gu(s.gmy);
          if (i <= 0) {
            localQConversationUI.sq(str);
          }
          for (;;)
          {
            QConversationUI.a(QConversationUI.this, QConversationUI.b(QConversationUI.this).getCount());
            GMTrace.o(8949101232128L, 66676);
            return;
            localQConversationUI.sq(str + "(" + i + ")");
          }
        }
        
        public final void QD()
        {
          GMTrace.i(8949235449856L, 66677);
          GMTrace.o(8949235449856L, 66677);
        }
      });
      this.nRF.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(8943732523008L, 66636);
          int i = QConversationUI.c(QConversationUI.this).getPositionForView(paramAnonymousView);
          GMTrace.o(8943732523008L, 66636);
          return i;
        }
      });
      this.nRF.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(8956080553984L, 66728);
          QConversationUI.c(QConversationUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(8956080553984L, 66728);
        }
      });
      this.nRF.a(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(8956617424896L, 66732);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.QConversationUI", "onItemDel object null");
            GMTrace.o(8956617424896L, 66732);
            return;
          }
          QConversationUI.a(QConversationUI.this, paramAnonymousObject.toString());
          GMTrace.o(8956617424896L, 66732);
        }
      });
      this.nRE.setAdapter(this.nRF);
      this.nRE.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8951382933504L, 66693);
          paramAnonymousAdapterView = (ae)QConversationUI.b(QConversationUI.this).getItem(paramAnonymousInt);
          paramAnonymousView = new Intent();
          paramAnonymousView.addFlags(67108864);
          paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.field_username);
          paramAnonymousView.putExtra("key_need_send_video", false);
          com.tencent.mm.plugin.qmessage.a.hnH.e(paramAnonymousView, QConversationUI.this.vKB.vKW);
          GMTrace.o(8951382933504L, 66693);
        }
      });
      final h localh = new h(this);
      this.nRE.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8949772320768L, 66681);
          if (paramAnonymousInt < QConversationUI.c(QConversationUI.this).getHeaderViewsCount())
          {
            w.w("MicroMsg.QConversationUI", "on header view long click, ignore");
            GMTrace.o(8949772320768L, 66681);
            return true;
          }
          localh.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, QConversationUI.this, QConversationUI.d(QConversationUI.this), 0, 0);
          GMTrace.o(8949772320768L, 66681);
          return true;
        }
      });
      com.tencent.mm.plugin.qmessage.a.nRj.da(1010);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8944403611648L, 66641);
          QConversationUI.e(QConversationUI.this);
          GMTrace.o(8944403611648L, 66641);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8948564361216L, 66672);
          BackwardSupportUtil.c.a(QConversationUI.c(QConversationUI.this));
          GMTrace.o(8948564361216L, 66672);
        }
      };
      at.AR();
      this.nRI = ((String)com.tencent.mm.y.c.xh().get(77, ""));
      at.AR();
      this.nRJ = ((String)com.tencent.mm.y.c.xh().get(78, ""));
      if (this.nRG == null)
      {
        this.nRG = new com.tencent.mm.plugin.qmessage.a.c();
        at.wS().a(this.nRG.getType(), this);
      }
      at.wS().a(this.nRG, 0);
      aYo();
      com.tencent.mm.plugin.qmessage.a.nRj.da(1010);
      GMTrace.o(8945477353472L, 66649);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    Object localObject2 = null;
    GMTrace.i(8946282659840L, 66655);
    w.d("MicroMsg.QConversationUI", "on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    }
    do
    {
      GMTrace.o(8946282659840L, 66655);
      return;
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    Object localObject3 = (com.tencent.mm.plugin.qmessage.a.c)paramk;
    if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp != null)
    {
      paramString = (aay)((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp.gtD.gtK;
      if (paramString == null) {}
    }
    for (paramString = paramString.urv;; paramString = null)
    {
      if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp != null)
      {
        paramk = (aay)((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp.gtD.gtK;
        if (paramk == null) {}
      }
      for (paramk = paramk.tVH;; paramk = null)
      {
        Object localObject1 = localObject2;
        if (((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp != null)
        {
          localObject3 = (aay)((com.tencent.mm.plugin.qmessage.a.c)localObject3).gYp.gtD.gtK;
          localObject1 = localObject2;
          if (localObject3 != null) {
            localObject1 = ((aay)localObject3).urw;
          }
        }
        if (!bg.nm((String)localObject1))
        {
          this.nRI = ((String)localObject1);
          at.AR();
          com.tencent.mm.y.c.xh().set(77, localObject1);
        }
        this.nRJ = paramk;
        at.AR();
        com.tencent.mm.y.c.xh().set(78, paramk);
        if (!this.nRH) {
          aYo();
        }
        w.d("MicroMsg.QConversationUI", "diaplayName: %s, url: %s, qqScheme: %s", new Object[] { paramString, paramk, localObject1 });
        break;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8944806264832L, 66644);
    int i = R.i.cGY;
    GMTrace.o(8944806264832L, 66644);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8944672047104L, 66643);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(8944672047104L, 66643);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(8946148442112L, 66654);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (ae)this.nRF.getItem(paramView.position);
    at.AR();
    paramContextMenu.setHeaderTitle(com.tencent.mm.y.c.yK().TE(paramView.field_username).vk());
    paramContextMenu.add(0, 0, 0, R.l.dHT);
    this.nRL = paramView.field_username;
    GMTrace.o(8946148442112L, 66654);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8944940482560L, 66645);
    this.nRF.aJe();
    if (this.nRG != null)
    {
      at.wS().c(this.nRG);
      at.wS().b(this.nRG.getType(), this);
      this.nRG = null;
    }
    super.onDestroy();
    GMTrace.o(8944940482560L, 66645);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8945880006656L, 66652);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(8945880006656L, 66652);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8945880006656L, 66652);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(8945343135744L, 66648);
    w.v("MicroMsg.QConversationUI", "on pause");
    at.AR();
    com.tencent.mm.y.c.yP().b(this.nRF);
    aYn();
    this.nRF.onPause();
    super.onPause();
    GMTrace.o(8945343135744L, 66648);
  }
  
  public void onResume()
  {
    GMTrace.i(8945074700288L, 66646);
    super.onResume();
    aYn();
    at.AR();
    com.tencent.mm.y.c.yP().a(this.nRF);
    this.nRF.a(null, null);
    GMTrace.o(8945074700288L, 66646);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qmessage\ui\QConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
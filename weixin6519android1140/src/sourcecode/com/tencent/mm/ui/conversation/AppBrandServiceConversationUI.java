package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.o;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.ServiceNotifySettingsUI;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.a;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@android.support.a.a
public final class AppBrandServiceConversationUI
  extends BaseConversationUI
{
  private View hqF;
  
  public AppBrandServiceConversationUI()
  {
    GMTrace.i(3414499000320L, 25440);
    GMTrace.o(3414499000320L, 25440);
  }
  
  protected final En_5b8fbb1e.a cgN()
  {
    GMTrace.i(3414901653504L, 25443);
    AppBrandServiceChattingUI.a locala = new AppBrandServiceChattingUI.a();
    GMTrace.o(3414901653504L, 25443);
    return locala;
  }
  
  public final void finish()
  {
    GMTrace.i(3414767435776L, 25442);
    super.finish();
    GMTrace.o(3414767435776L, 25442);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3414633218048L, 25441);
    super.onCreate(paramBundle);
    this.hqF = v.fb(this).inflate(R.i.cqo, null);
    setContentView(this.hqF);
    this.wVK = new AppBrandServiceConversationFmUI();
    aR().aV().a(R.h.bNx, this.wVK).commit();
    e.a(this, this.hqF);
    GMTrace.o(3414633218048L, 25441);
  }
  
  @android.support.a.a
  public static class AppBrandServiceConversationFmUI
    extends BaseConversationUI.b
    implements p.d
  {
    public String eDs;
    public int fromScene;
    private r hsU;
    String hyD;
    public String iEr;
    public com.tencent.mm.ui.tools.l jGV;
    TextView jqc;
    public boolean jqh;
    public ae wQZ;
    public ListView wVr;
    public d wVs;
    private String wVt;
    private com.tencent.mm.ui.d.a wrt;
    
    public AppBrandServiceConversationFmUI()
    {
      GMTrace.i(3452079964160L, 25720);
      this.eDs = "";
      this.hsU = null;
      this.jqh = false;
      GMTrace.o(3452079964160L, 25720);
    }
    
    private void cgO()
    {
      GMTrace.i(20357473894400L, 151675);
      if ((this.wVs == null) || (this.wVs.getCount() == 0))
      {
        GMTrace.o(20357473894400L, 151675);
        return;
      }
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "batchSyncForWxaContact, size:%d", new Object[] { Integer.valueOf(this.wVs.getCount()) });
      if ((this.wVs instanceof a))
      {
        List localList = ((a)this.wVs).hpI;
        if ((localList != null) && (localList.size() > 0)) {
          ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).S(localList);
        }
      }
      GMTrace.o(20357473894400L, 151675);
    }
    
    private void cgP()
    {
      GMTrace.i(3453019488256L, 25727);
      if (this.wVs == null)
      {
        w.d("MicroMsg.AppBrandServiceConversationFmUI", "adapter is null!");
        GMTrace.o(3453019488256L, 25727);
        return;
      }
      at.AR();
      Object localObject1 = com.tencent.mm.y.c.yP().TO("appbrandcustomerservicemsg");
      if ((localObject1 != null) && (!bg.nm(((aj)localObject1).field_username))) {}
      for (int j = ((aj)localObject1).field_unReadCount;; j = 0)
      {
        localObject1 = (ae)this.wVs.getItem(0);
        Object localObject2;
        if ((localObject1 != null) && (!bg.nm(((aj)localObject1).field_username)))
        {
          localObject2 = bg.nl(((aj)localObject1).field_content);
          localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(((aj)localObject1).field_username);
          if (localObject1 == null)
          {
            localObject1 = null;
            this.hyD = ((String)localObject1);
          }
        }
        for (localObject1 = localObject2;; localObject1 = "")
        {
          int k;
          label165:
          int m;
          if (j > 0)
          {
            int n = this.wVs.getCount();
            k = 0;
            int i = 0;
            m = i;
            if (k >= n) {
              break label229;
            }
            localObject2 = (ae)this.wVs.getItem(k);
            m = ((aj)localObject2).field_unReadCount;
            if (((aj)localObject2).field_unReadMuteCount + m <= 0) {
              break label359;
            }
            i += 1;
          }
          label229:
          label359:
          for (;;)
          {
            k += 1;
            break label165;
            localObject1 = ((WxaAttributes)localObject1).field_appId;
            break;
            m = 0;
            w.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), sceneId : %s, unReadCount %d, unReadAppCount %d, lastPushAppId %s, lastPushMsg %s", new Object[] { Integer.valueOf(13797), this.iEr, Integer.valueOf(j), Integer.valueOf(m), this.hyD, localObject1 });
            g.ork.i(13797, new Object[] { this.iEr, Integer.valueOf(j), Integer.valueOf(m), this.hyD, Long.valueOf(bg.Pu()), Integer.valueOf(0), localObject1 });
            GMTrace.o(3453019488256L, 25727);
            return;
          }
        }
      }
    }
    
    public final void WC(String paramString)
    {
      GMTrace.i(3453287923712L, 25729);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.AppBrandServiceConversationFmUI", "Delete Conversation and messages fail because username is null or nil.");
        GMTrace.o(3453287923712L, 25729);
        return;
      }
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "async del msg talker:%s", new Object[] { paramString });
      at.AR();
      final Object localObject = com.tencent.mm.y.c.yM().BZ(paramString);
      ox localox = new ox();
      localox.ufy = new azq().Rq(bg.nl(paramString));
      localox.tQd = ((ce)localObject).field_msgSvrId;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(8, localox));
      this.jqh = false;
      localObject = bWQ();
      getString(R.l.cUG);
      localObject = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(3451945746432L, 25719);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.jqh = true;
          GMTrace.o(3451945746432L, 25719);
        }
      });
      w.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), eventId : %s, appId %s, sceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(5), this.hyD, this.iEr });
      g.ork.i(13798, new Object[] { Integer.valueOf(5), this.hyD, Integer.valueOf(0), this.iEr, Long.valueOf(bg.Pu()) });
      bc.a(paramString, new bc.a()
      {
        public final void Bk()
        {
          GMTrace.i(3425504854016L, 25522);
          if (localObject != null) {
            localObject.dismiss();
          }
          GMTrace.o(3425504854016L, 25522);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(3425370636288L, 25521);
          boolean bool = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.jqh;
          GMTrace.o(3425370636288L, 25521);
          return bool;
        }
      });
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramString);
      GMTrace.o(3453287923712L, 25729);
    }
    
    public final void c(MenuItem paramMenuItem, int paramInt)
    {
      GMTrace.i(3453422141440L, 25730);
      at.AR();
      x localx = com.tencent.mm.y.c.yK().TE(this.eDs);
      if ((localx == null) || ((int)localx.fTq == 0))
      {
        w.e("MicroMsg.AppBrandServiceConversationFmUI", "changed biz stick status failed, contact is null, talker = " + this.eDs);
        GMTrace.o(3453422141440L, 25730);
        return;
      }
      switch (paramMenuItem.getItemId())
      {
      }
      for (;;)
      {
        GMTrace.o(3453422141440L, 25730);
        return;
        this.wrt.username = this.eDs;
        this.wrt.scene = this.fromScene;
        this.wrt.vXk = this.iEr;
        this.wrt.vXl = true;
        this.wrt.show(3);
        GMTrace.o(3453422141440L, 25730);
        return;
        this.wrt.username = this.eDs;
        this.wrt.scene = this.fromScene;
        this.wrt.vXk = this.iEr;
        this.wrt.vXl = true;
        this.wrt.show(4);
        GMTrace.o(3453422141440L, 25730);
        return;
        WC(this.eDs);
      }
    }
    
    protected final int getLayoutId()
    {
      GMTrace.i(3452348399616L, 25722);
      int i = R.i.cGY;
      GMTrace.o(3452348399616L, 25722);
      return i;
    }
    
    public final String getUserName()
    {
      GMTrace.i(3452482617344L, 25723);
      String str = this.wVt;
      GMTrace.o(3452482617344L, 25723);
      return str;
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      GMTrace.i(3452214181888L, 25721);
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "onActivityCreated");
      super.onActivityCreated(paramBundle);
      this.wVt = getStringExtra("Contact_User");
      if (TextUtils.isEmpty(this.wVt)) {
        this.wVt = "appbrandcustomerservicemsg";
      }
      this.fromScene = getIntExtra("app_brand_conversation_from_scene", 1);
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "fromScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
      at.AR();
      paramBundle = new BigInteger(Integer.toBinaryString(com.tencent.mm.y.c.ww()), 2).toString();
      this.iEr = (System.currentTimeMillis() + paramBundle);
      sq(getString(R.l.cRQ));
      this.wVr = ((ListView)findViewById(R.h.chU));
      this.jqc = ((TextView)findViewById(R.h.bwF));
      this.jqc.setText(R.l.cRS);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3380541915136L, 25187);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.finish();
          GMTrace.o(3380541915136L, 25187);
          return true;
        }
      });
      this.wrt = new com.tencent.mm.ui.d.a(bWQ());
      this.wVs = new a(bWQ(), this.wVt, new o.a()
      {
        public final void QC()
        {
          GMTrace.i(3429934039040L, 25555);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI localAppBrandServiceConversationFmUI = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this;
          if (AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVs.getCount() <= 0)
          {
            localAppBrandServiceConversationFmUI.jqc.setVisibility(0);
            localAppBrandServiceConversationFmUI.wVr.setVisibility(8);
            GMTrace.o(3429934039040L, 25555);
            return;
          }
          localAppBrandServiceConversationFmUI.jqc.setVisibility(8);
          localAppBrandServiceConversationFmUI.wVr.setVisibility(0);
          GMTrace.o(3429934039040L, 25555);
        }
        
        public final void QD()
        {
          GMTrace.i(3430068256768L, 25556);
          GMTrace.o(3430068256768L, 25556);
        }
      });
      this.wVs.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(3375038988288L, 25146);
          int i = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVr.getPositionForView(paramAnonymousView);
          GMTrace.o(3375038988288L, 25146);
          return i;
        }
      });
      this.wVs.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(3373965246464L, 25138);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVr.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(3373965246464L, 25138);
        }
      });
      this.wVr.setAdapter(this.wVs);
      this.jGV = new com.tencent.mm.ui.tools.l(bWQ());
      this.wVr.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(3397453348864L, 25313);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wQZ = ((ae)AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVs.getItem(paramAnonymousInt));
          paramAnonymousView = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wQZ;
          if (paramAnonymousView == null)
          {
            w.e("MicroMsg.AppBrandServiceConversationFmUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVs.getCount()) });
            AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVs.notifyDataSetChanged();
            GMTrace.o(3397453348864L, 25313);
            return;
          }
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.eDs = paramAnonymousView.field_username;
          paramAnonymousAdapterView = new Bundle();
          paramAnonymousAdapterView.putBoolean("finish_direct", false);
          paramAnonymousAdapterView.putBoolean("key_need_send_video", false);
          paramAnonymousAdapterView.putString("key_scene_id", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.iEr);
          paramAnonymousAdapterView.putInt("app_brand_chatting_from_scene", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.fromScene);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVW.a(paramAnonymousView.field_username, paramAnonymousAdapterView, true);
          paramAnonymousAdapterView = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this;
          paramAnonymousView = paramAnonymousView.field_username;
          paramAnonymousInt = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.fromScene;
          at.AR();
          ae localae = com.tencent.mm.y.c.yP().TO(paramAnonymousView);
          if (localae == null)
          {
            w.e("MicroMsg.AppBrandServiceConversationFmUI", "cvs:%s is null, error", new Object[] { paramAnonymousView });
            GMTrace.o(3397453348864L, 25313);
            return;
          }
          int i = localae.field_unReadCount;
          paramAnonymousView = bg.nl(paramAnonymousAdapterView.iEr);
          w.d("MicroMsg.AppBrandServiceConversationFmUI", "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", new Object[] { Integer.valueOf(13799), paramAnonymousAdapterView.hyD, Integer.valueOf(paramAnonymousInt), Integer.valueOf(i), paramAnonymousView });
          g.ork.i(13799, new Object[] { paramAnonymousAdapterView.hyD, Integer.valueOf(paramAnonymousInt), Integer.valueOf(i), paramAnonymousView, Long.valueOf(bg.Pu()) });
          GMTrace.o(3397453348864L, 25313);
        }
      });
      this.wVr.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(3377723342848L, 25166);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wQZ = ((ae)AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVs.getItem(paramAnonymousInt));
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.eDs = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wQZ.field_username;
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.jGV.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this, AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this);
          GMTrace.o(3377723342848L, 25166);
          return true;
        }
      });
      this.wVs.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(3382689398784L, 25203);
          int i = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVr.getPositionForView(paramAnonymousView);
          GMTrace.o(3382689398784L, 25203);
          return i;
        }
      });
      this.wVs.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(3381078786048L, 25191);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.wVr.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(3381078786048L, 25191);
        }
      });
      this.wVs.a(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(3462548946944L, 25798);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.AppBrandServiceConversationFmUI", "onItemDel object null");
            GMTrace.o(3462548946944L, 25798);
            return;
          }
          paramAnonymousObject = paramAnonymousObject.toString();
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.WC((String)paramAnonymousObject);
          GMTrace.o(3462548946944L, 25798);
        }
      });
      a(1, R.k.cJw, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3372488851456L, 25127);
          paramAnonymousMenuItem = new Intent(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.vKB.vKW, ServiceNotifySettingsUI.class);
          paramAnonymousMenuItem.putExtra("mode", 1);
          paramAnonymousMenuItem.putExtra("scene_id", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.iEr);
          AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(3372488851456L, 25127);
          return true;
        }
      });
      at.AR();
      com.tencent.mm.y.c.yP().a(this.wVs);
      paramBundle = new o();
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      cgP();
      cgO();
      GMTrace.o(3452214181888L, 25721);
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(3453153705984L, 25728);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if ((this.eDs != null) && (!this.eDs.isEmpty())) {
        this.eDs = "";
      }
      if (paramInt2 != -1)
      {
        GMTrace.o(3453153705984L, 25728);
        return;
      }
      GMTrace.o(3453153705984L, 25728);
    }
    
    public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(3453556359168L, 25731);
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenuInfo = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(this.eDs);
      int i;
      if ((paramContextMenuInfo != null) && ((paramContextMenuInfo.field_appOpt & 0x2) > 0))
      {
        i = 1;
        if (i == 0) {
          break label108;
        }
        paramContextMenu.add(paramView.position, 1, 0, R.l.cRV);
      }
      for (;;)
      {
        paramContextMenu.add(paramView.position, 3, 0, R.l.dmE);
        GMTrace.o(3453556359168L, 25731);
        return;
        i = 0;
        break;
        label108:
        paramContextMenu.add(paramView.position, 2, 0, R.l.cRW);
      }
    }
    
    public final void onDestroy()
    {
      GMTrace.i(3452616835072L, 25724);
      if (at.AU())
      {
        at.AR();
        com.tencent.mm.y.c.yP().b(this.wVs);
      }
      cgO();
      if (this.wVs != null) {
        this.wVs.onDestroy();
      }
      super.onDestroy();
      GMTrace.o(3452616835072L, 25724);
    }
    
    public final void onPause()
    {
      GMTrace.i(3452885270528L, 25726);
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "on pause");
      at.AR();
      com.tencent.mm.y.c.yP().TQ(this.wVt);
      if (this.wVs != null) {
        this.wVs.onPause();
      }
      super.onPause();
      GMTrace.o(3452885270528L, 25726);
    }
    
    public final void onResume()
    {
      GMTrace.i(3452751052800L, 25725);
      w.i("MicroMsg.AppBrandServiceConversationFmUI", "on resume");
      if (this.wVs != null) {
        this.wVs.onResume();
      }
      super.onResume();
      GMTrace.o(3452751052800L, 25725);
    }
    
    private static final class a
      extends d
    {
      List<String> hpI;
      private Paint jrC;
      private String username;
      private HashMap<String, Boolean> wVv;
      private HashMap<String, String> wVw;
      private com.tencent.mm.sdk.b.c<kv> wrp;
      
      a(Context paramContext, String paramString, o.a parama)
      {
        super(parama);
        GMTrace.i(3379736608768L, 25181);
        this.jrC = new Paint();
        this.username = paramString;
        this.wVv = new HashMap();
        this.wVw = new HashMap();
        this.hpI = new ArrayList();
        this.wrp = new com.tencent.mm.sdk.b.c() {};
        com.tencent.mm.sdk.b.a.vgX.b(this.wrp);
        GMTrace.o(3379736608768L, 25181);
      }
      
      public final void QF()
      {
        GMTrace.i(3379870826496L, 25182);
        at.AR();
        setCursor(com.tencent.mm.y.c.yP().c(s.gmB, this.iVA, this.username));
        if (this.vKu != null) {
          this.vKu.QC();
        }
        super.notifyDataSetChanged();
        GMTrace.o(3379870826496L, 25182);
      }
      
      protected final void a(String paramString, d.g paramg)
      {
        GMTrace.i(3380005044224L, 25183);
        Object localObject1 = (Boolean)this.wVv.get(paramString);
        boolean bool;
        if (localObject1 == null)
        {
          Object localObject2 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(paramString);
          if ((localObject2 != null) && ((((WxaAttributes)localObject2).field_appOpt & 0x2) > 0))
          {
            bool = true;
            this.wVv.put(paramString, localObject1);
            label72:
            if (!bool) {
              break label615;
            }
            paramg.woW.setVisibility(0);
            paramg.woW.setImageResource(R.k.cLc);
            label95:
            localObject2 = (String)this.wVw.get(paramString);
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject2 = com.tencent.mm.ui.d.b.Vw(com.tencent.mm.ui.d.b.Vv(paramString));
              localObject1 = localObject2;
              if (!TextUtils.isEmpty((CharSequence)localObject2))
              {
                this.wVw.put(paramString, localObject2);
                localObject1 = localObject2;
              }
            }
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              break label704;
            }
            paramg.wXc.setVisibility(0);
            localObject1 = this.context.getString(R.l.cSj, new Object[] { localObject1 });
            paramg.wXc.setText((CharSequence)localObject1);
            if (this.context.getResources().getDisplayMetrics() == null) {
              break label740;
            }
          }
        }
        label270:
        label338:
        label345:
        label490:
        label615:
        label660:
        label668:
        label692:
        label704:
        label740:
        for (int i = this.context.getResources().getDisplayMetrics().widthPixels;; i = 0)
        {
          int k;
          int j;
          float f1;
          float f2;
          if (com.tencent.mm.br.a.ed(this.context))
          {
            k = this.context.getResources().getDimensionPixelOffset(R.f.aQz);
            j = this.context.getResources().getDimensionPixelOffset(R.f.aPK);
            int m = this.context.getResources().getDimensionPixelOffset(R.f.aQq);
            int n = this.context.getResources().getDimensionPixelOffset(R.f.aQE);
            localObject1 = (d.d)this.woP.get(paramString);
            if ((localObject1 == null) || (((d.d)localObject1).nickName == null)) {
              break label660;
            }
            localObject1 = ((d.d)localObject1).nickName.toString();
            if (localObject1 != null) {
              break label668;
            }
            f1 = 0.0F;
            f2 = 48.0F + f1;
            int i1 = this.context.getResources().getDimensionPixelOffset(R.f.aPL);
            int i2 = this.context.getResources().getDimensionPixelOffset(R.f.aQu);
            w.i("MicroMsg.ConversationAdapter", "screenWidth:%d, avatarLayoutWidth:%d, timeTVWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
            f1 = 0.0F;
            if (i > 0) {
              f1 = i - k - m - n - j;
            }
            if ((f2 > f1) || (f2 >= f1) || (f1 <= 0.0F)) {
              break label692;
            }
            f1 = Math.min(f2 / f1, (f1 - i1 - i2 - 48.0F) / f1);
            f2 = 1.0F - f1;
            localObject1 = (LinearLayout.LayoutParams)paramg.woT.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = 0;
            ((LinearLayout.LayoutParams)localObject1).weight = f1;
            paramg.woT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            localObject1 = (LinearLayout.LayoutParams)paramg.wXc.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = 0;
            ((LinearLayout.LayoutParams)localObject1).weight = f2;
            paramg.wXc.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
          for (;;)
          {
            a.b.n(paramg.hqG, paramString);
            if (!this.hpI.contains(paramString)) {
              this.hpI.add(paramString);
            }
            GMTrace.o(3380005044224L, 25183);
            return;
            bool = false;
            break;
            bool = ((Boolean)localObject1).booleanValue();
            break label72;
            paramg.woW.setVisibility(8);
            break label95;
            k = this.context.getResources().getDimensionPixelOffset(R.f.aQA);
            j = this.context.getResources().getDimensionPixelOffset(R.f.aPL);
            break label270;
            localObject1 = "";
            break label338;
            this.jrC.setTextSize(this.woM);
            f1 = this.jrC.measureText((String)localObject1);
            break label345;
            f2 = 0.4F;
            f1 = 0.6F;
            break label490;
            localObject1 = (LinearLayout.LayoutParams)paramg.woT.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = -1;
            ((LinearLayout.LayoutParams)localObject1).weight = 0.0F;
            paramg.woT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
      
      public final void detach()
      {
        GMTrace.i(3380139261952L, 25184);
        this.wVv = null;
        com.tencent.mm.sdk.b.a.vgX.c(this.wrp);
        GMTrace.o(3380139261952L, 25184);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\AppBrandServiceConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
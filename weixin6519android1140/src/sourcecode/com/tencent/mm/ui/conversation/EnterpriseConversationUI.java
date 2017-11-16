package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.b;
import com.tencent.mm.af.c.a;
import com.tencent.mm.af.c.a.a;
import com.tencent.mm.af.f;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.bizchat.BizChatConversationUI;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.i;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.LinkedList;

public class EnterpriseConversationUI
  extends BaseConversationUI
{
  private View hqF;
  
  public EnterpriseConversationUI()
  {
    GMTrace.i(3406445936640L, 25380);
    GMTrace.o(3406445936640L, 25380);
  }
  
  public void finish()
  {
    GMTrace.i(3406714372096L, 25382);
    if ((this.wVK != null) && ((this.wVK instanceof a))) {
      ((a)this.wVK).gXn = (System.currentTimeMillis() / 1000L);
    }
    super.finish();
    GMTrace.o(3406714372096L, 25382);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3406580154368L, 25381);
    super.onCreate(paramBundle);
    this.hqF = v.fb(this).inflate(R.i.cqo, null);
    setContentView(this.hqF);
    this.wVK = new a();
    aR().aV().a(R.h.bNx, this.wVK).commit();
    com.tencent.mm.pluginsdk.e.a(this, this.hqF);
    GMTrace.o(3406580154368L, 25381);
  }
  
  public static final class a
    extends BaseConversationUI.b
    implements com.tencent.mm.ad.e, m.b
  {
    private long fKc;
    public int fromScene;
    long gXn;
    public String gvB;
    public r hsU;
    public long iVj;
    public com.tencent.mm.ui.tools.l jGV;
    TextView jqc;
    public boolean jqh;
    public String juK;
    public p.d mTX;
    public ListView wVZ;
    private String wWa;
    public com.tencent.mm.ui.tools.m wYe;
    public h wYf;
    String wYg;
    private com.tencent.mm.sdk.platformtools.ae wYh;
    public int wYi;
    public String wYj;
    private LinearLayout woZ;
    public int wpc;
    private c.a wpf;
    
    public a()
    {
      GMTrace.i(3457582891008L, 25761);
      this.woZ = null;
      this.wYg = null;
      this.juK = "";
      this.wpc = 0;
      this.jqh = false;
      this.fKc = 0L;
      this.gXn = 0L;
      this.wYi = -2;
      this.iVj = 0L;
      this.wYj = null;
      this.wpf = new c.a()
      {
        public final void a(c.a.a paramAnonymousa)
        {
          GMTrace.i(3376246947840L, 25155);
          if ((paramAnonymousa != null) && (!bg.nm(paramAnonymousa.gvB)) && (paramAnonymousa.gvB.equals(EnterpriseConversationUI.a.this.gvB)))
          {
            int i = EnterpriseConversationUI.a.this.wpc;
            EnterpriseConversationUI.a.this.wpc = com.tencent.mm.ui.g.be(EnterpriseConversationUI.a.this.vKB.vKW, EnterpriseConversationUI.a.this.gvB);
            if (EnterpriseConversationUI.a.this.wpc != i) {
              EnterpriseConversationUI.a.this.cbq();
            }
          }
          GMTrace.o(3376246947840L, 25155);
        }
      };
      GMTrace.o(3457582891008L, 25761);
    }
    
    public static void WF(String paramString)
    {
      GMTrace.i(16020899102720L, 119365);
      at.AR();
      if (com.tencent.mm.y.c.yK().TE(paramString) == null)
      {
        w.e("MicroMsg.EnterpriseConversationUI", "changed biz stick status failed, contact is null, talker = " + paramString);
        GMTrace.o(16020899102720L, 119365);
        return;
      }
      at.AR();
      if (com.tencent.mm.y.c.yP().TV(paramString))
      {
        s.o(paramString, true);
        GMTrace.o(16020899102720L, 119365);
        return;
      }
      i.eY(paramString);
      GMTrace.o(16020899102720L, 119365);
    }
    
    public final void WC(String paramString)
    {
      GMTrace.i(16021033320448L, 119366);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.EnterpriseConversationUI", "Delete Conversation and messages fail because username is null or nil.");
        GMTrace.o(16021033320448L, 119366);
        return;
      }
      at.AR();
      Object localObject = com.tencent.mm.y.c.yM().BZ(paramString);
      ox localox = new ox();
      localox.ufy = new azq().Rq(bg.nl(paramString));
      localox.tQd = ((ce)localObject).field_msgSvrId;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(8, localox));
      this.jqh = false;
      localObject = bWQ();
      getString(R.l.cUG);
      bc.a(paramString, new bc.a()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(3420807233536L, 25487);
          EnterpriseConversationUI.a.this.jqh = true;
          GMTrace.o(3420807233536L, 25487);
        }
      }
      {
        public final void Bk()
        {
          GMTrace.i(3404969541632L, 25369);
          if (this.jOb != null) {
            this.jOb.dismiss();
          }
          GMTrace.o(3404969541632L, 25369);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(3404835323904L, 25368);
          boolean bool = EnterpriseConversationUI.a.this.jqh;
          GMTrace.o(3404835323904L, 25368);
          return bool;
        }
      });
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramString);
      paramString = com.tencent.mm.af.x.FG().iC(paramString);
      at.AR();
      com.tencent.mm.y.c.yO().Tj(paramString.field_enterpriseFather);
      GMTrace.o(16021033320448L, 119366);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(3458790850560L, 25770);
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.dismiss();
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(3458790850560L, 25770);
        return;
      }
      if (paramk.getType() == 1394)
      {
        paramString = ((com.tencent.mm.plugin.profile.a.c)paramk).aXA();
        Object localObject = ((com.tencent.mm.plugin.profile.a.c)paramk).aXz();
        if ((localObject == null) || (((bia)localObject).tWa == null) || (((bia)localObject).tWa.ret != 0))
        {
          if ((localObject != null) && (((bia)localObject).tWa != null))
          {
            w.w("MicroMsg.EnterpriseConversationUI", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(((bia)localObject).tWa.ret) });
            GMTrace.o(3458790850560L, 25770);
            return;
          }
          w.w("MicroMsg.EnterpriseConversationUI", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramk.getType()) });
          GMTrace.o(3458790850560L, 25770);
          return;
        }
        if (!paramString.uTG)
        {
          GMTrace.o(3458790850560L, 25770);
          return;
        }
        paramk = f.iK(paramString.tVU);
        paramk.field_brandFlag |= 0x1;
        localObject = new aol();
        ((aol)localObject).gCL = paramk.field_brandFlag;
        ((aol)localObject).jhi = paramString.tVU;
        at.AR();
        com.tencent.mm.y.c.yJ().b(new e.a(47, (com.tencent.mm.bm.a)localObject));
        com.tencent.mm.af.x.FG().c(paramk, new String[0]);
        at.AR();
        com.tencent.mm.y.c.yP().TN(paramk.field_username);
        at.AR();
        if (com.tencent.mm.y.c.yP().TY(paramk.field_enterpriseFather) <= 0)
        {
          at.AR();
          com.tencent.mm.y.c.yP().TN(paramk.field_enterpriseFather);
          GMTrace.o(3458790850560L, 25770);
          return;
        }
        at.AR();
        com.tencent.mm.y.c.yO().Tj(paramk.field_enterpriseFather);
      }
      GMTrace.o(3458790850560L, 25770);
    }
    
    public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
    {
      GMTrace.i(3459059286016L, 25772);
      GMTrace.o(3459059286016L, 25772);
    }
    
    public final void a(com.tencent.mm.af.d paramd, int paramInt1, int paramInt2)
    {
      GMTrace.i(17878875111424L, 133208);
      b localb = com.tencent.mm.af.x.FN().iq(this.gvB);
      long l1;
      long l2;
      if (localb != null)
      {
        l1 = localb.field_wwCorpId;
        if (localb == null) {
          break label191;
        }
        l2 = localb.field_wwUserVid;
        label45:
        if (paramInt2 <= 0) {
          break label197;
        }
        paramInt2 = 1;
        label51:
        if (paramd != null) {
          break label202;
        }
      }
      label191:
      label197:
      label202:
      for (long l3 = 0L;; l3 = paramd.EK())
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14507, new Object[] { Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l2), Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
        w.d("MicroMsg.EnterpriseConversationUI", "enter biz enterprise sub barnd report: %s,%s,%s,%s,%s,%s", new Object[] { Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l2), Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
        GMTrace.o(17878875111424L, 133208);
        return;
        l1 = 0L;
        break;
        l2 = 0L;
        break label45;
        paramInt2 = 2;
        break label51;
      }
    }
    
    public final void cbq()
    {
      GMTrace.i(3458656632832L, 25769);
      this.wpc = com.tencent.mm.ui.g.be(this.vKB.vKW, this.gvB);
      Object localObject;
      int i;
      if ((this.wpc == 2) && (this.woZ == null))
      {
        this.woZ = ((LinearLayout)findViewById(R.h.bottom_bar));
        localObject = this.woZ.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aPO);
        this.woZ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = v.fb(this.vKB.vKW).inflate(R.i.cvt, this.woZ, false);
        float f = com.tencent.mm.br.a.dZ(this.vKB.vKW);
        ImageView localImageView = (ImageView)((View)localObject).findViewById(R.h.bGr);
        i = localImageView.getLayoutParams().height;
        localImageView.getLayoutParams().height = ((int)(i * f));
        localImageView.getLayoutParams().width = ((int)(f * i));
        localImageView.requestLayout();
        ((TextView)((View)localObject).findViewById(R.h.chT)).setText(R.l.dqr);
        this.woZ.addView((View)localObject);
        ((View)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(3377454907392L, 25164);
            com.tencent.mm.ui.g.m(EnterpriseConversationUI.a.this.vKB.vKW, EnterpriseConversationUI.a.this.gvB, 3);
            GMTrace.o(3377454907392L, 25164);
          }
        });
        com.tencent.mm.ui.g.l(this.vKB.vKW, this.gvB, 3);
        com.tencent.mm.ui.g.bf(this.vKB.vKW, this.gvB);
      }
      if (this.woZ != null)
      {
        if (this.wpc == 2)
        {
          this.woZ.setVisibility(0);
          localObject = com.tencent.mm.af.x.FN().iq(this.gvB);
          int j;
          label304:
          long l1;
          if (localObject != null)
          {
            i = ((b)localObject).field_qyUin;
            if (localObject == null) {
              break label460;
            }
            j = ((b)localObject).field_userUin;
            if (localObject == null) {
              break label465;
            }
            l1 = ((b)localObject).field_wwCorpId;
            label316:
            if (localObject == null) {
              break label471;
            }
          }
          label460:
          label465:
          label471:
          for (long l2 = ((b)localObject).field_wwUserVid;; l2 = 0L)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13656, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(6), Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2) });
            w.d("MicroMsg.EnterpriseConversationUI", "expose wework btn on session list  report: %s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(6), Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2) });
            GMTrace.o(3458656632832L, 25769);
            return;
            i = 0;
            break;
            j = 0;
            break label304;
            l1 = 0L;
            break label316;
          }
        }
        this.woZ.setVisibility(8);
      }
      GMTrace.o(3458656632832L, 25769);
    }
    
    protected final int getLayoutId()
    {
      GMTrace.i(3457851326464L, 25763);
      int i = R.i.cvs;
      GMTrace.o(3457851326464L, 25763);
      return i;
    }
    
    public final String getUserName()
    {
      GMTrace.i(3457985544192L, 25764);
      String str = this.gvB;
      GMTrace.o(3457985544192L, 25764);
      return str;
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      GMTrace.i(3457717108736L, 25762);
      super.onActivityCreated(paramBundle);
      this.gvB = bWQ().getIntent().getStringExtra("enterprise_biz_name");
      this.wWa = bWQ().getIntent().getStringExtra("enterprise_biz_display_name");
      this.fromScene = bWQ().getIntent().getIntExtra("enterprise_from_scene", 5);
      sq(this.wWa);
      this.wVZ = ((ListView)findViewById(R.h.chU));
      this.jqc = ((TextView)findViewById(R.h.bwF));
      this.jqc.setText(R.l.dqb);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3408727638016L, 25397);
          EnterpriseConversationUI.a.this.finish();
          GMTrace.o(3408727638016L, 25397);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3381615656960L, 25195);
          a.b.a(EnterpriseConversationUI.a.this.wVZ);
          GMTrace.o(3381615656960L, 25195);
        }
      };
      if (f.iK(this.gvB) != null)
      {
        if (this.gvB != null)
        {
          com.tencent.mm.af.x.FN();
          com.tencent.mm.af.c.a(this.gvB, null);
          w.e("MicroMsg.EnterpriseConversationUI", "update father attr from svr bizName:%s", new Object[] { this.gvB });
          cbq();
          a(1, R.l.eey, R.k.cIS, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(3374502117376L, 25142);
              paramAnonymousMenuItem = new Intent();
              paramAnonymousMenuItem.putExtra("enterprise_biz_name", EnterpriseConversationUI.a.this.gvB);
              paramAnonymousMenuItem.addFlags(67108864);
              com.tencent.mm.bj.d.b(EnterpriseConversationUI.a.this.vKB.vKW, "brandservice", ".ui.EnterpriseBizSearchUI", paramAnonymousMenuItem);
              GMTrace.o(3374502117376L, 25142);
              return true;
            }
          });
          a(2, R.l.cQl, R.k.cIG, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(3377991778304L, 25168);
              if (EnterpriseConversationUI.a.this.wYe != null)
              {
                EnterpriseConversationUI.a.this.wYe.dismiss();
                EnterpriseConversationUI.a.this.wYe = null;
              }
              EnterpriseConversationUI.a.this.wYe = new com.tencent.mm.ui.tools.m(EnterpriseConversationUI.a.this.vKB.vKW);
              EnterpriseConversationUI.a.this.wYe.qik = new p.c()
              {
                public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
                {
                  GMTrace.i(3449798262784L, 25703);
                  if (EnterpriseConversationUI.a.this.wpc == 1)
                  {
                    paramAnonymous2n.Z(2, R.l.dqs, R.k.cIL);
                    com.tencent.mm.ui.g.l(EnterpriseConversationUI.a.this.vKB.vKW, EnterpriseConversationUI.a.this.gvB, 5);
                  }
                  paramAnonymous2n.Z(3, R.l.dkG, R.k.cNO);
                  paramAnonymous2n.Z(4, R.l.dqa, R.k.cIK);
                  paramAnonymous2n.Z(5, R.l.cQm, R.k.cIU);
                  GMTrace.o(3449798262784L, 25703);
                }
              };
              EnterpriseConversationUI.a.this.wYe.qil = new p.d()
              {
                public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
                {
                  GMTrace.i(3389534502912L, 25254);
                  paramAnonymous2Int = 0;
                  switch (paramAnonymous2MenuItem.getItemId())
                  {
                  }
                  for (;;)
                  {
                    com.tencent.mm.ui.g.cQ(EnterpriseConversationUI.a.this.gvB, paramAnonymous2Int);
                    GMTrace.o(3389534502912L, 25254);
                    return;
                    com.tencent.mm.ui.g.m(EnterpriseConversationUI.a.this.vKB.vKW, EnterpriseConversationUI.a.this.gvB, 5);
                    continue;
                    paramAnonymous2MenuItem = new Intent(EnterpriseConversationUI.a.this.bWQ(), SelectConversationUI.class);
                    paramAnonymous2MenuItem.putExtra("Select_Talker_Name", EnterpriseConversationUI.a.this.gvB);
                    paramAnonymous2MenuItem.putExtra("Select_block_List", EnterpriseConversationUI.a.this.gvB);
                    paramAnonymous2MenuItem.putExtra("Select_Send_Card", true);
                    paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                    EnterpriseConversationUI.a.this.startActivityForResult(paramAnonymous2MenuItem, 1);
                    paramAnonymous2Int = 3;
                    continue;
                    paramAnonymous2Int = 4;
                    paramAnonymous2MenuItem = new Intent();
                    paramAnonymous2MenuItem.putExtra("enterprise_biz_name", EnterpriseConversationUI.a.this.gvB);
                    paramAnonymous2MenuItem.putExtra("enterprise_scene", 2);
                    com.tencent.mm.bj.d.b(EnterpriseConversationUI.a.this.bWQ(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", paramAnonymous2MenuItem);
                    continue;
                    paramAnonymous2MenuItem = new Intent();
                    paramAnonymous2MenuItem.putExtra("Contact_User", EnterpriseConversationUI.a.this.gvB);
                    com.tencent.mm.bj.d.b(EnterpriseConversationUI.a.this.bWQ(), "profile", ".ui.ContactInfoUI", paramAnonymous2MenuItem);
                    paramAnonymous2Int = 5;
                  }
                }
              };
              EnterpriseConversationUI.a.this.wYe.dK();
              com.tencent.mm.ui.g.cQ(EnterpriseConversationUI.a.this.gvB, 1);
              GMTrace.o(3377991778304L, 25168);
              return false;
            }
          });
          this.wYf = new h(bWQ(), this.gvB, new o.a()
          {
            public final void QC()
            {
              GMTrace.i(3424431112192L, 25514);
              EnterpriseConversationUI.a locala = EnterpriseConversationUI.a.this;
              if (EnterpriseConversationUI.a.this.wYf.getCount() <= 0)
              {
                locala.jqc.setVisibility(0);
                locala.wVZ.setVisibility(8);
                GMTrace.o(3424431112192L, 25514);
                return;
              }
              locala.jqc.setVisibility(8);
              locala.wVZ.setVisibility(0);
              GMTrace.o(3424431112192L, 25514);
            }
            
            public final void QD()
            {
              GMTrace.i(3424565329920L, 25515);
              GMTrace.o(3424565329920L, 25515);
            }
          });
          this.wYf.a(new MMSlideDelView.c()
          {
            public final int cf(View paramAnonymousView)
            {
              GMTrace.i(3407385460736L, 25387);
              int i = EnterpriseConversationUI.a.this.wVZ.getPositionForView(paramAnonymousView);
              GMTrace.o(3407385460736L, 25387);
              return i;
            }
          });
          this.wYf.a(new MMSlideDelView.f()
          {
            public final void t(View paramAnonymousView, int paramAnonymousInt)
            {
              GMTrace.i(3396111171584L, 25303);
              EnterpriseConversationUI.a.this.wVZ.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
              GMTrace.o(3396111171584L, 25303);
            }
          });
          this.wYf.a(new MMSlideDelView.e()
          {
            public final void aV(Object paramAnonymousObject)
            {
              GMTrace.i(3382420963328L, 25201);
              if (paramAnonymousObject == null)
              {
                w.e("MicroMsg.EnterpriseConversationUI", "onItemDel object null");
                GMTrace.o(3382420963328L, 25201);
                return;
              }
              paramAnonymousObject = paramAnonymousObject.toString();
              EnterpriseConversationUI.a.this.WC((String)paramAnonymousObject);
              GMTrace.o(3382420963328L, 25201);
            }
          });
          this.wVZ.setAdapter(this.wYf);
          this.wVZ.setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(3455972278272L, 25749);
              com.tencent.mm.storage.ae localae = (com.tencent.mm.storage.ae)EnterpriseConversationUI.a.this.wYf.getItem(paramAnonymousInt);
              if (localae == null)
              {
                w.e("MicroMsg.EnterpriseConversationUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(EnterpriseConversationUI.a.this.wYf.getCount()) });
                EnterpriseConversationUI.a.this.wYf.notifyDataSetChanged();
                GMTrace.o(3455972278272L, 25749);
                return;
              }
              if (f.dL(localae.field_username))
              {
                paramAnonymousAdapterView = new Intent(EnterpriseConversationUI.a.this.bWQ(), BizChatConversationUI.class);
                paramAnonymousAdapterView.putExtra("Contact_User", localae.field_username);
                paramAnonymousAdapterView.putExtra("biz_chat_from_scene", 7);
                paramAnonymousAdapterView.addFlags(67108864);
                EnterpriseConversationUI.a.this.startActivity(paramAnonymousAdapterView);
                GMTrace.o(3455972278272L, 25749);
                return;
              }
              if (f.iQ(localae.field_username))
              {
                com.tencent.mm.af.d locald = f.iK(localae.field_username);
                if (locald == null) {}
                for (paramAnonymousAdapterView = null;; paramAnonymousAdapterView = locald.EJ())
                {
                  paramAnonymousView = paramAnonymousAdapterView;
                  if (paramAnonymousAdapterView == null) {
                    paramAnonymousView = "";
                  }
                  paramAnonymousAdapterView = new Intent();
                  paramAnonymousAdapterView.putExtra("rawUrl", paramAnonymousView);
                  paramAnonymousAdapterView.putExtra("useJs", true);
                  paramAnonymousAdapterView.putExtra("srcUsername", localae.field_username);
                  paramAnonymousAdapterView.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                  paramAnonymousAdapterView.addFlags(67108864);
                  com.tencent.mm.bj.d.b(EnterpriseConversationUI.a.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousAdapterView);
                  EnterpriseConversationUI.a.this.a(locald, 2, localae.field_unReadCount);
                  GMTrace.o(3455972278272L, 25749);
                  return;
                }
              }
              EnterpriseConversationUI.a.this.wVW.a(localae.field_username, null, true);
              EnterpriseConversationUI.a.this.a(f.iK(localae.field_username), 1, localae.field_unReadCount);
              GMTrace.o(3455972278272L, 25749);
            }
          });
          this.jGV = new com.tencent.mm.ui.tools.l(bWQ());
          this.mTX = new p.d()
          {
            public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
            {
              GMTrace.i(3396648042496L, 25307);
              switch (paramAnonymousMenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(3396648042496L, 25307);
                return;
                EnterpriseConversationUI.a.this.WC(EnterpriseConversationUI.a.this.juK);
                GMTrace.o(3396648042496L, 25307);
                return;
                paramAnonymousMenuItem = EnterpriseConversationUI.a.this;
                String str = EnterpriseConversationUI.a.this.juK;
                ActionBarActivity localActionBarActivity = paramAnonymousMenuItem.vKB.vKW;
                com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dpX), "", localActionBarActivity.getString(R.l.dpW), localActionBarActivity.getString(R.l.cSk), new EnterpriseConversationUI.a.5(paramAnonymousMenuItem, str, localActionBarActivity), null);
                GMTrace.o(3396648042496L, 25307);
                return;
                EnterpriseConversationUI.a.WF(EnterpriseConversationUI.a.this.juK);
              }
            }
          };
          this.wVZ.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
          {
            public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(3450335133696L, 25707);
              paramAnonymousAdapterView = (com.tencent.mm.storage.ae)EnterpriseConversationUI.a.this.wYf.getItem(paramAnonymousInt);
              EnterpriseConversationUI.a.this.juK = paramAnonymousAdapterView.field_username;
              EnterpriseConversationUI.a.this.jGV.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, EnterpriseConversationUI.a.this, EnterpriseConversationUI.a.this.mTX);
              GMTrace.o(3450335133696L, 25707);
              return true;
            }
          });
        }
      }
      else
      {
        this.fKc = (System.currentTimeMillis() / 1000L);
        at.AR();
        paramBundle = com.tencent.mm.y.c.yP().TO(this.gvB);
        if (paramBundle != null)
        {
          this.wYi = paramBundle.field_unReadCount;
          if ((this.wYi == 0) && (paramBundle.field_unReadMuteCount > 0)) {
            this.wYi = -1;
          }
          this.iVj = (paramBundle.field_conversationTime / 1000L);
          if (paramBundle.field_isSend != 1) {
            break label552;
          }
          paramBundle = null;
          label445:
          this.wYj = paramBundle;
        }
        com.tencent.mm.af.x.FN().a(this.wpf, bWQ().getMainLooper());
        at.AR();
        com.tencent.mm.y.c.yP().a(this);
        at.AR();
        com.tencent.mm.y.c.yK().a(this);
        if (this.wYf != null)
        {
          if (this.wYh != null) {
            break label560;
          }
          this.wYh = new com.tencent.mm.sdk.platformtools.ae()
          {
            public final void handleMessage(Message paramAnonymousMessage)
            {
              GMTrace.i(3450603569152L, 25709);
              int i1;
              LinkedList localLinkedList;
              int i;
              int k;
              int j;
              int m;
              Object localObject1;
              Object localObject2;
              int n;
              if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (EnterpriseConversationUI.a.this.bWQ() != null) && (!EnterpriseConversationUI.a.this.bWQ().isFinishing()))
              {
                i1 = EnterpriseConversationUI.a.this.wYf.getCount();
                paramAnonymousMessage = new LinkedList();
                localLinkedList = new LinkedList();
                i = 0;
                k = 0;
                j = 0;
                m = 0;
                if (m < i1)
                {
                  localObject1 = (com.tencent.mm.storage.ae)EnterpriseConversationUI.a.this.wYf.getItem(m);
                  if (localObject1 == null) {
                    break label977;
                  }
                  localObject2 = ((com.tencent.mm.g.b.aj)localObject1).field_username;
                  if (localObject2 == null) {
                    break label977;
                  }
                  if ((!s.fC((String)localObject2)) || (!f.iR((String)localObject2)))
                  {
                    w.d("MicroMsg.EnterpriseConversationUI", "checkEnterpriseChildConv delete conv %s", new Object[] { localObject2 });
                    paramAnonymousMessage.add(localObject2);
                    n = j;
                    j = k;
                    k = i;
                    i = n;
                  }
                }
              }
              for (;;)
              {
                n = m + 1;
                m = k;
                k = j;
                j = i;
                i = m;
                m = n;
                break;
                Object localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject2);
                boolean bool = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TV((String)localObject2);
                if ((localObject3 != null) && ((((af)localObject3).field_type & 0x800) != 0))
                {
                  n = 1;
                  label264:
                  if ((n == 0) || (bool)) {
                    break label350;
                  }
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TT((String)localObject2);
                }
                for (;;)
                {
                  if (f.iQ((String)localObject2)) {
                    localLinkedList.add(localObject2);
                  }
                  if (((com.tencent.mm.g.b.aj)localObject1).field_unReadCount <= 0) {
                    break label977;
                  }
                  if (!s.gr((String)localObject2)) {
                    break label384;
                  }
                  n = i + 1;
                  i = j;
                  j = k;
                  k = n;
                  break;
                  n = 0;
                  break label264;
                  label350:
                  if ((n == 0) && (bool)) {
                    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TU((String)localObject2);
                  }
                }
                label384:
                n = k + 1;
                j = ((com.tencent.mm.g.b.aj)localObject1).field_unReadCount + j;
                k = i;
                i = j;
                j = n;
                continue;
                localObject1 = com.tencent.mm.af.x.FN().iq(EnterpriseConversationUI.a.this.gvB);
                long l1;
                label448:
                long l2;
                if (localObject1 != null)
                {
                  m = ((b)localObject1).field_qyUin;
                  if (localObject1 == null) {
                    break label946;
                  }
                  l1 = ((b)localObject1).field_wwCorpId;
                  if (localObject1 == null) {
                    break label952;
                  }
                  l2 = ((b)localObject1).field_wwUserVid;
                  label460:
                  n = 0;
                  if (!bg.nm(EnterpriseConversationUI.a.this.wYj)) {
                    n = com.tencent.mm.af.x.FN().is(EnterpriseConversationUI.a.this.wYj);
                  }
                  com.tencent.mm.plugin.report.service.g.ork.i(12892, new Object[] { EnterpriseConversationUI.a.this.gvB, Integer.valueOf(EnterpriseConversationUI.a.this.fromScene), Integer.valueOf(i1), "", Integer.valueOf(EnterpriseConversationUI.a.this.wYi), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), Long.valueOf(EnterpriseConversationUI.a.this.iVj), Integer.valueOf(n), Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2) });
                  w.d("MicroMsg.EnterpriseConversationUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { EnterpriseConversationUI.a.this.gvB, Integer.valueOf(EnterpriseConversationUI.a.this.fromScene), Integer.valueOf(i1), "", Integer.valueOf(EnterpriseConversationUI.a.this.wYi), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), Long.valueOf(EnterpriseConversationUI.a.this.iVj), Integer.valueOf(n), Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2) });
                  if (paramAnonymousMessage.size() > 0)
                  {
                    at.AR();
                    com.tencent.mm.y.c.yP().aw(paramAnonymousMessage);
                    EnterpriseConversationUI.a.this.wYf.QF();
                  }
                  if (com.tencent.mm.af.x.FQ().ip(EnterpriseConversationUI.a.this.gvB))
                  {
                    com.tencent.mm.af.x.FN();
                    com.tencent.mm.af.c.a(EnterpriseConversationUI.a.this.gvB, null);
                  }
                  localObject2 = com.tencent.mm.af.x.FQ();
                  localObject3 = EnterpriseConversationUI.a.this;
                  if (((EnterpriseConversationUI.a)localObject3).wYg == null)
                  {
                    com.tencent.mm.af.x.FG();
                    localObject1 = com.tencent.mm.af.e.iG(((EnterpriseConversationUI.a)localObject3).gvB);
                    paramAnonymousMessage = (Message)localObject1;
                    if (bg.nm((String)localObject1)) {
                      paramAnonymousMessage = "";
                    }
                    ((EnterpriseConversationUI.a)localObject3).wYg = paramAnonymousMessage;
                  }
                  if (!bg.nm(((EnterpriseConversationUI.a)localObject3).wYg)) {
                    break label958;
                  }
                }
                label946:
                label952:
                label958:
                for (paramAnonymousMessage = null;; paramAnonymousMessage = ((EnterpriseConversationUI.a)localObject3).wYg)
                {
                  ((com.tencent.mm.af.a)localObject2).ip(paramAnonymousMessage);
                  if (localLinkedList.size() <= 0) {
                    break label967;
                  }
                  i = 0;
                  while (i < localLinkedList.size())
                  {
                    com.tencent.mm.af.x.FQ().ip((String)localLinkedList.get(i));
                    i += 1;
                  }
                  m = 0;
                  break;
                  l1 = 0L;
                  break label448;
                  l2 = 0L;
                  break label460;
                }
                label967:
                GMTrace.o(3450603569152L, 25709);
                return;
                label977:
                n = i;
                i = j;
                j = k;
                k = n;
              }
            }
          };
        }
      }
      for (;;)
      {
        this.wYh.sendEmptyMessageDelayed(1, 500L);
        GMTrace.o(3457717108736L, 25762);
        return;
        w.e("MicroMsg.EnterpriseConversationUI", "bizName is null!!!");
        break;
        label552:
        paramBundle = paramBundle.field_digestUser;
        break label445;
        label560:
        this.wYh.removeMessages(1);
      }
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(3458522415104L, 25768);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      switch (paramInt1)
      {
      default: 
        GMTrace.o(3458522415104L, 25768);
        return;
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str1 = paramIntent.getStringExtra("be_send_card_name");
        String str2 = paramIntent.getStringExtra("received_card_name");
        boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.messenger.a.d.aOe().l(str1, str2, bool);
        com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramIntent, str2);
        com.tencent.mm.ui.snackbar.a.e(bWQ(), this.vKB.vKW.getString(R.l.dwg));
        GMTrace.o(3458522415104L, 25768);
        return;
      }
      GMTrace.o(3458522415104L, 25768);
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(3458925068288L, 25771);
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      at.AR();
      com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(this.juK);
      if (localx == null)
      {
        w.e("MicroMsg.EnterpriseConversationUI", "onCreateContextMenu, contact is null, talker = " + this.juK);
        GMTrace.o(3458925068288L, 25771);
        return;
      }
      String str = localx.vk();
      paramView = str;
      if (str.toLowerCase().endsWith("@chatroom"))
      {
        paramView = str;
        if (bg.nm(localx.field_nickname)) {
          paramView = getString(R.l.dhh);
        }
      }
      paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(bWQ(), paramView));
      if (localx.vf()) {
        paramContextMenu.add(paramContextMenuInfo.position, 3, 0, R.l.dHQ);
      }
      for (;;)
      {
        paramContextMenu.add(paramContextMenuInfo.position, 2, 1, R.l.dqf);
        paramContextMenu.add(paramContextMenuInfo.position, 1, 2, R.l.dHT);
        GMTrace.o(3458925068288L, 25771);
        return;
        paramContextMenu.add(paramContextMenuInfo.position, 3, 0, R.l.dql);
      }
    }
    
    public final void onDestroy()
    {
      GMTrace.i(3458119761920L, 25765);
      com.tencent.mm.af.x.FN().a(this.wpf);
      if (at.AU())
      {
        at.AR();
        com.tencent.mm.y.c.yP().b(this);
        at.AR();
        com.tencent.mm.y.c.yK().b(this);
      }
      if (this.wYf != null)
      {
        localObject = this.wYf;
        ((h)localObject).wWL.stopTimer();
        if (((h)localObject).woP != null)
        {
          ((h)localObject).woP.clear();
          ((h)localObject).woP = null;
        }
        ((h)localObject).aJe();
        ((o)localObject).vKu = null;
        at.AR();
        com.tencent.mm.y.c.yP().b((m.b)localObject);
      }
      at.wS().b(1394, this);
      if ((this.fKc <= 0L) || (this.gXn <= 0L))
      {
        super.onDestroy();
        GMTrace.o(3458119761920L, 25765);
        return;
      }
      long l = this.gXn - this.fKc;
      Object localObject = com.tencent.mm.af.x.FN().iq(this.gvB);
      int i;
      if (localObject != null)
      {
        i = ((b)localObject).field_qyUin;
        label194:
        if (localObject == null) {
          break label314;
        }
      }
      label314:
      for (int j = ((b)localObject).field_userUin;; j = 0)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(1), Long.valueOf(l) });
        w.d("MicroMsg.EnterpriseConversationUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(1), Long.valueOf(l) });
        break;
        i = 0;
        break label194;
      }
    }
    
    public final void onPause()
    {
      GMTrace.i(3458388197376L, 25767);
      w.v("MicroMsg.EnterpriseConversationUI", "on pause");
      at.AR();
      com.tencent.mm.y.c.yP().TQ(this.gvB);
      if (this.wYf != null) {
        this.wYf.onPause();
      }
      super.onPause();
      GMTrace.o(3458388197376L, 25767);
    }
    
    public final void onResume()
    {
      GMTrace.i(3458253979648L, 25766);
      w.v("MicroMsg.EnterpriseConversationUI", "on resume");
      if (this.wYf != null) {
        this.wYf.onResume();
      }
      super.onResume();
      if (!s.fC(this.gvB)) {
        finish();
      }
      GMTrace.o(3458253979648L, 25766);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\EnterpriseConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
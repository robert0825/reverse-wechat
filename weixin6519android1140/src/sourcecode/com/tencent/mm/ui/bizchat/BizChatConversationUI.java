package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.b.a;
import com.tencent.mm.af.a.b.a.b;
import com.tencent.mm.af.a.d.a;
import com.tencent.mm.af.a.d.a.b;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.c.a;
import com.tencent.mm.af.c.a.a;
import com.tencent.mm.af.f;
import com.tencent.mm.protocal.c.gy;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.conversation.BaseConversationUI;
import com.tencent.mm.ui.conversation.BaseConversationUI.b;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class BizChatConversationUI
  extends BaseConversationUI
{
  private View hqF;
  
  public BizChatConversationUI()
  {
    GMTrace.i(2970372538368L, 22131);
    GMTrace.o(2970372538368L, 22131);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(2970640973824L, 22133);
    super.onConfigurationChanged(paramConfiguration);
    com.tencent.mm.pluginsdk.e.a(this, this.hqF);
    GMTrace.o(2970640973824L, 22133);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2970506756096L, 22132);
    super.onCreate(paramBundle);
    this.hqF = v.fb(this).inflate(R.i.cqo, null);
    setContentView(this.hqF);
    this.wVK = new a();
    aR().aV().a(R.h.bNx, this.wVK).commit();
    com.tencent.mm.pluginsdk.e.a(this, this.hqF);
    GMTrace.o(2970506756096L, 22132);
  }
  
  public static final class a
    extends BaseConversationUI.b
    implements com.tencent.mm.af.n, m.b
  {
    public String gwy;
    public com.tencent.mm.ui.base.r hsU;
    public TextView jqc;
    public ListView jqd;
    public p.d jqg;
    public boolean jqh;
    public int juH;
    public int juI;
    public long juT;
    public String juZ;
    public com.tencent.mm.ui.tools.m juw;
    public boolean vHX;
    private LinearLayout woZ;
    public b wpa;
    j wpb;
    public int wpc;
    private b.a wpd;
    private d.a wpe;
    private c.a wpf;
    
    public a()
    {
      GMTrace.i(3005537583104L, 22393);
      this.jqh = false;
      this.wpc = 0;
      this.juH = 0;
      this.juI = 0;
      this.wpd = new b.a()
      {
        public final void a(b.a.b paramAnonymousb)
        {
          GMTrace.i(14672950460416L, 109322);
          if ((paramAnonymousb != null) && (paramAnonymousb.gxZ != null) && (BizChatConversationUI.a.this.juZ.equals(paramAnonymousb.gxZ.field_brandUserName)))
          {
            w.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChatConv change");
            BizChatConversationUI.a.this.wpa.eV(paramAnonymousb.gxY);
            if (BizChatConversationUI.a.this.vHX) {
              BizChatConversationUI.a.this.wpa.QF();
            }
          }
          GMTrace.o(14672950460416L, 109322);
        }
      };
      this.wpe = new d.a()
      {
        public final void a(d.a.b paramAnonymousb)
        {
          GMTrace.i(14671205629952L, 109309);
          if ((paramAnonymousb != null) && (paramAnonymousb.gyj != null) && (BizChatConversationUI.a.this.juZ.equals(paramAnonymousb.gyj.field_brandUserName)))
          {
            w.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChat change");
            BizChatConversationUI.a.this.wpa.eV(paramAnonymousb.gxY);
            if (BizChatConversationUI.a.this.vHX) {
              BizChatConversationUI.a.this.wpa.QF();
            }
          }
          GMTrace.o(14671205629952L, 109309);
        }
      };
      this.wpf = new c.a()
      {
        public final void a(c.a.a paramAnonymousa)
        {
          GMTrace.i(14671742500864L, 109313);
          String str = BizChatConversationUI.a.this.cbs();
          if ((paramAnonymousa != null) && (!bg.nm(paramAnonymousa.gvB)) && (paramAnonymousa.gvB.equals(str)))
          {
            int i = BizChatConversationUI.a.this.wpc;
            BizChatConversationUI.a.this.wpc = com.tencent.mm.ui.g.be(BizChatConversationUI.a.this.vKB.vKW, str);
            if (BizChatConversationUI.a.this.wpc != i) {
              BizChatConversationUI.a.this.cbq();
            }
          }
          GMTrace.o(14671742500864L, 109313);
        }
      };
      GMTrace.o(3005537583104L, 22393);
    }
    
    public final void a(int paramInt, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(3006745542656L, 22402);
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if (paramk.getType() == 1355)
      {
        paramk = ((com.tencent.mm.af.a.n)paramk).Ga();
        paramk = com.tencent.mm.af.x.FI().jd(paramk.ufl.umW.tVO);
        if (paramk == null)
        {
          Toast.makeText(ab.getContext(), getString(R.l.dSD), 0).show();
          GMTrace.o(3006745542656L, 22402);
          return;
        }
        eW(paramk.field_bizChatLocalId);
      }
      GMTrace.o(3006745542656L, 22402);
    }
    
    public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
    {
      GMTrace.i(3007416631296L, 22407);
      GMTrace.o(3007416631296L, 22407);
    }
    
    public final void ay(LinkedList<String> paramLinkedList)
    {
      GMTrace.i(16020228014080L, 119360);
      if (paramLinkedList.size() == 0)
      {
        w.i("MicroMsg.BizChatConversationFmUI", "userIdList is empty");
        GMTrace.o(16020228014080L, 119360);
        return;
      }
      SharedPreferences localSharedPreferences = Vc(ab.bPU());
      if (!localSharedPreferences.getBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + this.juZ, true))
      {
        GMTrace.o(16020228014080L, 119360);
        return;
      }
      w.i("MicroMsg.BizChatConversationFmUI", "updateData");
      long l2 = System.currentTimeMillis();
      com.tencent.mm.sdk.e.e locale = com.tencent.mm.af.x.FK().fTZ;
      long l1 = 0L;
      if ((locale instanceof com.tencent.mm.bu.g)) {
        l1 = ((com.tencent.mm.bu.g)locale).cE(Thread.currentThread().getId());
      }
      Iterator localIterator = paramLinkedList.iterator();
      label228:
      while (localIterator.hasNext())
      {
        paramLinkedList = (String)localIterator.next();
        com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().jd(paramLinkedList);
        if ((localc != null) && (!localc.FU()))
        {
          paramLinkedList = com.tencent.mm.af.x.FK().bl(paramLinkedList);
          if (paramLinkedList != null) {}
          for (paramLinkedList = paramLinkedList.field_userName;; paramLinkedList = null)
          {
            if ((paramLinkedList == null) || (paramLinkedList.equals(localc.field_chatName))) {
              break label228;
            }
            localc.field_chatName = paramLinkedList;
            com.tencent.mm.af.x.FI().b(localc);
            break;
          }
        }
      }
      if ((locale instanceof com.tencent.mm.bu.g))
      {
        at.AR();
        com.tencent.mm.y.c.yH().aL(l1);
      }
      localSharedPreferences.edit().putBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + this.juZ, false).commit();
      w.d("MicroMsg.BizChatConversationFmUI", "updateData use time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      GMTrace.o(16020228014080L, 119360);
    }
    
    public final void cbq()
    {
      GMTrace.i(3006879760384L, 22403);
      String str = cbs();
      this.wpc = com.tencent.mm.ui.g.be(this.vKB.vKW, str);
      if ((this.wpc == 2) && (this.woZ == null))
      {
        this.woZ = ((LinearLayout)findViewById(R.h.bottom_bar));
        Object localObject = this.woZ.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aPO);
        this.woZ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = v.fb(this.vKB.vKW).inflate(R.i.cvt, this.woZ, false);
        float f = com.tencent.mm.br.a.dZ(this.vKB.vKW);
        ImageView localImageView = (ImageView)((View)localObject).findViewById(R.h.bGr);
        int i = localImageView.getLayoutParams().height;
        localImageView.getLayoutParams().height = ((int)(i * f));
        localImageView.getLayoutParams().width = ((int)(f * i));
        localImageView.requestLayout();
        ((TextView)((View)localObject).findViewById(R.h.chT)).setText(R.l.dqn);
        this.woZ.addView((View)localObject);
        ((View)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(3002047922176L, 22367);
            com.tencent.mm.ui.g.m(BizChatConversationUI.a.this.vKB.vKW, BizChatConversationUI.a.this.juZ, 4);
            GMTrace.o(3002047922176L, 22367);
          }
        });
        com.tencent.mm.ui.g.l(this.vKB.vKW, this.juZ, 4);
        com.tencent.mm.ui.g.bf(this.vKB.vKW, str);
      }
      if (this.woZ != null)
      {
        if (this.wpc == 2)
        {
          this.woZ.setVisibility(0);
          GMTrace.o(3006879760384L, 22403);
          return;
        }
        this.woZ.setVisibility(8);
      }
      GMTrace.o(3006879760384L, 22403);
    }
    
    final void cbr()
    {
      boolean bool = false;
      GMTrace.i(3007013978112L, 22404);
      Object localObject = com.tencent.mm.af.x.FK().bm(this.juZ);
      this.wpb = com.tencent.mm.af.x.FK().bl((String)localObject);
      String str = this.juZ;
      if (this.wpb == null) {
        bool = true;
      }
      w.i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { str, localObject, Boolean.valueOf(bool) });
      if ((bg.nm((String)localObject)) || (this.wpb == null) || (this.wpb.FV()) || (bg.nm(this.wpb.field_addMemberUrl)))
      {
        com.tencent.mm.af.x.FM();
        com.tencent.mm.af.a.h.a(this.juZ, this);
        localObject = bWQ();
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(14672010936320L, 109315);
            BizChatConversationUI.a.this.finish();
            GMTrace.o(14672010936320L, 109315);
          }
        });
      }
      GMTrace.o(3007013978112L, 22404);
    }
    
    public final String cbs()
    {
      GMTrace.i(3007148195840L, 22405);
      if (bg.nm(this.gwy)) {
        this.gwy = com.tencent.mm.af.x.FG().iC(this.juZ).EN();
      }
      String str = this.gwy;
      GMTrace.o(3007148195840L, 22405);
      return str;
    }
    
    public final void eW(long paramLong)
    {
      GMTrace.i(3007282413568L, 22406);
      Bundle localBundle = new Bundle();
      localBundle.putLong("key_biz_chat_id", paramLong);
      localBundle.putBoolean("finish_direct", false);
      localBundle.putBoolean("key_need_send_video", false);
      localBundle.putBoolean("key_is_biz_chat", true);
      this.wVW.a(this.juZ, localBundle, true);
      GMTrace.o(3007282413568L, 22406);
    }
    
    protected final int getLayoutId()
    {
      GMTrace.i(3005806018560L, 22395);
      int i = R.i.cvs;
      GMTrace.o(3005806018560L, 22395);
      return i;
    }
    
    public final String getUserName()
    {
      GMTrace.i(3005940236288L, 22396);
      if (bg.nm(this.gwy))
      {
        str = this.juZ;
        GMTrace.o(3005940236288L, 22396);
        return str;
      }
      String str = this.gwy;
      GMTrace.o(3005940236288L, 22396);
      return str;
    }
    
    public final void onActivityCreated(final Bundle paramBundle)
    {
      GMTrace.i(3005671800832L, 22394);
      super.onActivityCreated(paramBundle);
      this.juZ = bWQ().getIntent().getStringExtra("Contact_User");
      w.i("MicroMsg.BizChatConversationFmUI", "[regitListener]");
      com.tencent.mm.af.x.FJ().a(this.wpd, bWQ().getMainLooper());
      com.tencent.mm.af.x.FI().a(this.wpe, bWQ().getMainLooper());
      com.tencent.mm.af.x.FN().a(this.wpf, bWQ().getMainLooper());
      at.AR();
      com.tencent.mm.y.c.yP().a(this);
      this.jqc = ((TextView)findViewById(R.h.bwF));
      this.jqc.setText(R.l.dHW);
      this.jqd = ((ListView)findViewById(R.h.chU));
      cbq();
      this.wpa = new b(bWQ(), new o.a()
      {
        public final void QC()
        {
          GMTrace.i(14670131888128L, 109301);
          BizChatConversationUI.a.this.sq(com.tencent.mm.y.r.fs(BizChatConversationUI.a.this.juZ));
          if (BizChatConversationUI.a.this.wpa.getCount() <= 0)
          {
            BizChatConversationUI.a.this.jqc.setVisibility(0);
            BizChatConversationUI.a.this.jqd.setVisibility(8);
            GMTrace.o(14670131888128L, 109301);
            return;
          }
          BizChatConversationUI.a.this.jqc.setVisibility(8);
          if (BizChatConversationUI.a.this.jqd != null) {
            BizChatConversationUI.a.this.jqd.setVisibility(0);
          }
          GMTrace.o(14670131888128L, 109301);
        }
        
        public final void QD()
        {
          GMTrace.i(14670266105856L, 109302);
          GMTrace.o(14670266105856L, 109302);
        }
      }, this.juZ);
      this.wpa.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(14672816242688L, 109321);
          int i = BizChatConversationUI.a.this.jqd.getPositionForView(paramAnonymousView);
          GMTrace.o(14672816242688L, 109321);
          return i;
        }
      });
      this.wpa.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(14672413589504L, 109318);
          BizChatConversationUI.a.this.jqd.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(14672413589504L, 109318);
        }
      });
      this.wpa.a(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(14671876718592L, 109314);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.BizChatConversationFmUI", "onItemDel object null");
            GMTrace.o(14671876718592L, 109314);
            return;
          }
          GMTrace.o(14671876718592L, 109314);
        }
      });
      this.jqd.setAdapter(this.wpa);
      this.jqg = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(2991713157120L, 22290);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(2991713157120L, 22290);
            return;
            paramAnonymousMenuItem = BizChatConversationUI.a.this;
            long l = BizChatConversationUI.a.this.juT;
            w.i("MicroMsg.BizChatConversationFmUI", "deleteChatroom");
            com.tencent.mm.af.x.FI().t(l);
            paramAnonymousMenuItem.jqh = false;
            FragmentActivity localFragmentActivity = paramAnonymousMenuItem.bWQ();
            paramAnonymousMenuItem.getString(R.l.cUG);
            paramAnonymousMenuItem.hsU = com.tencent.mm.ui.base.h.a(localFragmentActivity, paramAnonymousMenuItem.getString(R.l.cUV), true, new BizChatConversationUI.a.7(paramAnonymousMenuItem));
            i.a(paramAnonymousMenuItem.juZ, l, new BizChatConversationUI.a.8(paramAnonymousMenuItem, l));
            GMTrace.o(2991713157120L, 22290);
            return;
            paramAnonymousMenuItem = com.tencent.mm.af.x.FJ().ab(BizChatConversationUI.a.this.juT);
            paramAnonymousMenuItem.field_unReadCount = 1;
            paramAnonymousMenuItem.field_atCount = 0;
            com.tencent.mm.af.x.FJ().b(paramAnonymousMenuItem);
            com.tencent.mm.modelstat.b.gWv.D(paramAnonymousMenuItem.field_brandUserName, true);
            GMTrace.o(2991713157120L, 22290);
            return;
            com.tencent.mm.af.x.FJ().ad(BizChatConversationUI.a.this.juT);
            paramAnonymousMenuItem = com.tencent.mm.af.x.FJ().ab(BizChatConversationUI.a.this.juT);
            com.tencent.mm.modelstat.b.gWv.D(paramAnonymousMenuItem.field_brandUserName, false);
            GMTrace.o(2991713157120L, 22290);
            return;
            paramAnonymousMenuItem = com.tencent.mm.af.x.FJ().ab(BizChatConversationUI.a.this.juT);
            if (com.tencent.mm.af.x.FJ().ae(BizChatConversationUI.a.this.juT))
            {
              com.tencent.mm.af.x.FJ().ag(BizChatConversationUI.a.this.juT);
              com.tencent.mm.modelstat.b.gWv.c(true, paramAnonymousMenuItem.field_brandUserName, false);
              GMTrace.o(2991713157120L, 22290);
              return;
            }
            com.tencent.mm.af.x.FJ().af(BizChatConversationUI.a.this.juT);
            com.tencent.mm.modelstat.b.gWv.c(true, paramAnonymousMenuItem.field_brandUserName, true);
          }
        }
      };
      paramBundle = new com.tencent.mm.ui.widget.h(bWQ());
      this.jqd.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(14676037468160L, 109345);
          if (paramAnonymousMotionEvent.getAction() == 0)
          {
            BizChatConversationUI.a.this.juH = ((int)paramAnonymousMotionEvent.getRawX());
            BizChatConversationUI.a.this.juI = ((int)paramAnonymousMotionEvent.getRawY());
          }
          GMTrace.o(14676037468160L, 109345);
          return false;
        }
      });
      this.jqd.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(14670534541312L, 109304);
          paramBundle.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BizChatConversationUI.a.this, BizChatConversationUI.a.this.jqg, BizChatConversationUI.a.this.juH, BizChatConversationUI.a.this.juI);
          GMTrace.o(14670534541312L, 109304);
          return true;
        }
      });
      this.jqd.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(14670668759040L, 109305);
          paramAnonymousAdapterView = (com.tencent.mm.af.a.a)BizChatConversationUI.a.this.wpa.getItem(paramAnonymousInt);
          BizChatConversationUI.a.this.eW(paramAnonymousAdapterView.field_bizChatId);
          GMTrace.o(14670668759040L, 109305);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2962722127872L, 22074);
          BizChatConversationUI.a.this.finish();
          GMTrace.o(2962722127872L, 22074);
          return true;
        }
      });
      a(1, R.l.eey, R.k.cIS, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2969969885184L, 22128);
          w.v("MicroMsg.BizChatConversationFmUI", "search btn was clicked.");
          paramAnonymousMenuItem = new Intent(BizChatConversationUI.a.this.vKB.vKW, BizChatSearchUI.class);
          paramAnonymousMenuItem.putExtra("enterprise_biz_name", BizChatConversationUI.a.this.juZ);
          paramAnonymousMenuItem.putExtra("biz_chat_search_scene", 1);
          paramAnonymousMenuItem.putExtra("biz_chat_search_text", "");
          paramAnonymousMenuItem.addFlags(67108864);
          BizChatConversationUI.a.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(2969969885184L, 22128);
          return true;
        }
      });
      a(2, R.l.cQl, R.k.cIG, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(14669997670400L, 109300);
          if (BizChatConversationUI.a.this.juw != null)
          {
            BizChatConversationUI.a.this.juw.dismiss();
            BizChatConversationUI.a.this.juw = null;
          }
          BizChatConversationUI.a.this.juw = new com.tencent.mm.ui.tools.m(BizChatConversationUI.a.this.vKB.vKW);
          BizChatConversationUI.a.this.juw.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(14672279371776L, 109317);
              if (BizChatConversationUI.a.this.wpc == 1)
              {
                paramAnonymous2n.Z(2, R.l.dqs, R.k.cIL);
                com.tencent.mm.ui.g.l(BizChatConversationUI.a.this.vKB.vKW, BizChatConversationUI.a.this.juZ, 6);
              }
              paramAnonymous2n.Z(1, R.l.daL, R.k.cIH);
              paramAnonymous2n.Z(4, R.l.daK, R.k.cIJ);
              paramAnonymous2n.Z(3, R.l.cQm, R.k.cIU);
              GMTrace.o(14672279371776L, 109317);
            }
          };
          BizChatConversationUI.a.this.juw.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(14672682024960L, 109320);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(14672682024960L, 109320);
                return;
                paramAnonymous2MenuItem = BizChatConversationUI.a.this;
                Object localObject = com.tencent.mm.af.x.FK().bm(paramAnonymous2MenuItem.juZ);
                paramAnonymous2MenuItem.wpb = com.tencent.mm.af.x.FK().bl((String)localObject);
                if ((paramAnonymous2MenuItem.wpb == null) || (bg.nm(paramAnonymous2MenuItem.wpb.field_addMemberUrl)))
                {
                  Toast.makeText(paramAnonymous2MenuItem.bWQ(), paramAnonymous2MenuItem.getString(R.l.daM), 0).show();
                  paramAnonymous2MenuItem.cbr();
                  GMTrace.o(14672682024960L, 109320);
                  return;
                }
                localObject = new Intent();
                ((Intent)localObject).putExtra("rawUrl", paramAnonymous2MenuItem.wpb.field_addMemberUrl);
                w.i("MicroMsg.BizChatConversationFmUI", "KRawUrl :%s", new Object[] { paramAnonymous2MenuItem.wpb.field_addMemberUrl });
                ((Intent)localObject).putExtra("useJs", true);
                ((Intent)localObject).addFlags(67108864);
                com.tencent.mm.bj.d.b(paramAnonymous2MenuItem.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject, 1);
                GMTrace.o(14672682024960L, 109320);
                return;
                com.tencent.mm.ui.g.m(BizChatConversationUI.a.this.vKB.vKW, BizChatConversationUI.a.this.juZ, 6);
                GMTrace.o(14672682024960L, 109320);
                return;
                if (bg.nm(BizChatConversationUI.a.this.gwy))
                {
                  paramAnonymous2MenuItem = com.tencent.mm.af.x.FG().iC(BizChatConversationUI.a.this.juZ);
                  BizChatConversationUI.a.this.gwy = paramAnonymous2MenuItem.EN();
                }
                if ((!bg.nm(BizChatConversationUI.a.this.gwy)) && (com.tencent.mm.af.x.FQ().ip(BizChatConversationUI.a.this.gwy)))
                {
                  com.tencent.mm.af.x.FN();
                  com.tencent.mm.af.c.a(BizChatConversationUI.a.this.gwy, null);
                }
                paramAnonymous2MenuItem = new Intent();
                paramAnonymous2MenuItem.putExtra("Contact_User", BizChatConversationUI.a.this.juZ);
                com.tencent.mm.bj.d.b(BizChatConversationUI.a.this.bWQ(), "profile", ".ui.ContactInfoUI", paramAnonymous2MenuItem);
                GMTrace.o(14672682024960L, 109320);
                return;
                if (!bg.nm(BizChatConversationUI.a.this.juZ))
                {
                  paramAnonymous2MenuItem = new Intent(BizChatConversationUI.a.this.vKB.vKW, BizChatFavUI.class);
                  paramAnonymous2MenuItem.putExtra("Contact_User", BizChatConversationUI.a.this.juZ);
                  paramAnonymous2MenuItem.addFlags(67108864);
                  BizChatConversationUI.a.this.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(14672682024960L, 109320);
                  return;
                }
                w.e("MicroMsg.BizChatConversationFmUI", "brandUserName null");
              }
            }
          };
          BizChatConversationUI.a.this.juw.dK();
          GMTrace.o(14669997670400L, 109300);
          return false;
        }
      });
      cbr();
      at.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14676171685888L, 109346);
          w.i("MicroMsg.BizChatConversationFmUI", "updateChatInfoFromSvr");
          LinkedList localLinkedList1 = new LinkedList();
          LinkedList localLinkedList2 = new LinkedList();
          Cursor localCursor = com.tencent.mm.af.x.FJ().jb(BizChatConversationUI.a.this.juZ);
          if (localCursor.moveToFirst()) {
            while (!localCursor.isAfterLast())
            {
              Object localObject = new com.tencent.mm.af.a.a();
              ((com.tencent.mm.af.a.a)localObject).b(localCursor);
              localCursor.moveToNext();
              localObject = com.tencent.mm.af.x.FI().t(((com.tencent.mm.af.a.a)localObject).field_bizChatId);
              if (((com.tencent.mm.af.a.c)localObject).FV()) {
                if (((com.tencent.mm.af.a.c)localObject).FU()) {
                  localLinkedList2.add(((com.tencent.mm.af.a.c)localObject).field_bizChatServId);
                } else {
                  localLinkedList1.add(((com.tencent.mm.af.a.c)localObject).field_bizChatServId);
                }
              }
            }
          }
          localCursor.close();
          if (localLinkedList2.size() > 0) {
            com.tencent.mm.af.x.FM().a(localLinkedList2, BizChatConversationUI.a.this.juZ);
          }
          BizChatConversationUI.a.this.ay(localLinkedList1);
          if (localLinkedList1.size() > 0) {
            com.tencent.mm.af.x.FM().b(localLinkedList1, BizChatConversationUI.a.this.juZ);
          }
          GMTrace.o(14676171685888L, 109346);
        }
      }, 300L);
      paramBundle = cbs();
      if (paramBundle != null)
      {
        com.tencent.mm.af.x.FN();
        com.tencent.mm.af.c.a(paramBundle, null);
        w.e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", new Object[] { paramBundle });
      }
      for (;;)
      {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            GMTrace.i(2990370979840L, 22280);
            Object localObject = com.tencent.mm.af.x.FG().iC(BizChatConversationUI.a.this.juZ);
            BizChatConversationUI.a.this.gwy = ((com.tencent.mm.af.d)localObject).EN();
            int m = BizChatConversationUI.a.this.bWQ().getIntent().getIntExtra("biz_chat_from_scene", 7);
            int i = -1;
            if (BizChatConversationUI.a.this.wpa != null) {
              i = BizChatConversationUI.a.this.wpa.getCount();
            }
            localObject = com.tencent.mm.af.x.FN().iq(BizChatConversationUI.a.this.gwy);
            int j;
            int k;
            label115:
            int n;
            long l1;
            if (localObject != null)
            {
              j = ((com.tencent.mm.af.b)localObject).field_qyUin;
              if (localObject == null) {
                break label348;
              }
              k = ((com.tencent.mm.af.b)localObject).field_userUin;
              n = com.tencent.mm.af.x.FN().is(BizChatConversationUI.a.this.juZ);
              if (localObject == null) {
                break label353;
              }
              l1 = ((com.tencent.mm.af.b)localObject).field_wwCorpId;
              label142:
              if (localObject == null) {
                break label359;
              }
            }
            label348:
            label353:
            label359:
            for (long l2 = ((com.tencent.mm.af.b)localObject).field_wwUserVid;; l2 = 0L)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(12648, new Object[] { BizChatConversationUI.a.this.gwy, BizChatConversationUI.a.this.juZ, Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2) });
              w.d("MicroMsg.BizChatConversationFmUI", "bizchat report belong:%s,brandUserName:%s,fromScene:%s,itemCount:%s,fatherUin:%d,childUin:%d,userUin:%d,wwCorpId:%l,wwUserVidL%l", new Object[] { BizChatConversationUI.a.this.gwy, BizChatConversationUI.a.this.juZ, Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2) });
              GMTrace.o(2990370979840L, 22280);
              return false;
              j = 0;
              break;
              k = 0;
              break label115;
              l1 = 0L;
              break label142;
            }
          }
        });
        paramBundle = bWQ().getIntent();
        if (com.tencent.mm.sdk.platformtools.s.a(paramBundle, "biz_chat_need_to_jump_to_chatting_ui", false))
        {
          long l = paramBundle.getLongExtra("biz_chat_chat_id", -1L);
          if (l != -1L) {
            eW(l);
          }
        }
        GMTrace.o(3005671800832L, 22394);
        return;
        w.e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
      }
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
    {
      GMTrace.i(3006611324928L, 22401);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if (paramInt2 != -1)
      {
        GMTrace.o(3006611324928L, 22401);
        return;
      }
      switch (paramInt1)
      {
      default: 
        GMTrace.o(3006611324928L, 22401);
        return;
      }
      paramIntent = paramIntent.getBundleExtra("result_data");
      Object localObject;
      us localus;
      if (paramIntent != null)
      {
        w.i("MicroMsg.BizChatConversationFmUI", "bundle != null");
        localObject = paramIntent.getString("enterprise_members");
        localus = new us();
        com.tencent.mm.af.a.c localc = new com.tencent.mm.af.a.c();
        if (this.wpb != null)
        {
          paramIntent = this.wpb.field_addMemberUrl;
          localc.field_addMemberUrl = paramIntent;
          localc.field_brandUserName = this.juZ;
          if (!com.tencent.mm.af.a.e.a(localc, (String)localObject, null, localus)) {
            break label272;
          }
          if (localc.field_bizChatLocalId == -1L) {
            break label212;
          }
          eW(localc.field_bizChatLocalId);
          paramInt1 = 1;
        }
      }
      for (;;)
      {
        if (paramInt1 == 0)
        {
          Toast.makeText(bWQ(), getString(R.l.dSD), 0).show();
          GMTrace.o(3006611324928L, 22401);
          return;
          paramIntent = null;
          break;
          label212:
          com.tencent.mm.af.x.FM();
          paramIntent = com.tencent.mm.af.a.h.a(this.juZ, localus, this);
          localObject = bWQ();
          getString(R.l.cUG);
          this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(3010637856768L, 22431);
              com.tencent.mm.af.x.FM();
              com.tencent.mm.af.a.h.f(paramIntent);
              GMTrace.o(3010637856768L, 22431);
            }
          });
          paramInt1 = 1;
          continue;
          label272:
          paramInt1 = 0;
          continue;
        }
        GMTrace.o(3006611324928L, 22401);
        return;
        paramInt1 = 0;
      }
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(3006477107200L, 22400);
      paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenuInfo = (com.tencent.mm.af.a.a)this.wpa.getItem(paramView.position);
      this.juT = paramContextMenuInfo.field_bizChatId;
      if (paramContextMenuInfo.field_unReadCount <= 0)
      {
        paramContextMenu.add(paramView.position, 1, 0, R.l.dHP);
        com.tencent.mm.af.x.FJ();
        if (!com.tencent.mm.af.a.b.c(paramContextMenuInfo)) {
          break label132;
        }
        paramContextMenu.add(paramView.position, 3, 1, R.l.dHQ);
      }
      for (;;)
      {
        paramContextMenu.add(paramView.position, 0, 2, R.l.dHT);
        GMTrace.o(3006477107200L, 22400);
        return;
        paramContextMenu.add(paramView.position, 2, 0, R.l.dHN);
        break;
        label132:
        paramContextMenu.add(paramView.position, 3, 1, R.l.dHO);
      }
    }
    
    public final void onDestroy()
    {
      GMTrace.i(3006074454016L, 22397);
      w.i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
      com.tencent.mm.af.x.FJ().a(this.wpd);
      com.tencent.mm.af.x.FI().a(this.wpe);
      com.tencent.mm.af.x.FN().a(this.wpf);
      if (at.AU())
      {
        at.AR();
        com.tencent.mm.y.c.yP().b(this);
      }
      this.wpa.aJe();
      b localb = this.wpa;
      if (localb.woP != null)
      {
        localb.woP.clear();
        localb.woP = null;
      }
      super.onDestroy();
      GMTrace.o(3006074454016L, 22397);
    }
    
    public final void onPause()
    {
      GMTrace.i(3006342889472L, 22399);
      w.i("MicroMsg.BizChatConversationFmUI", "on pause");
      at.AR();
      com.tencent.mm.y.c.yP().TQ(this.juZ);
      com.tencent.mm.af.a.b localb = com.tencent.mm.af.x.FJ();
      String str = this.juZ;
      if (bg.nm(str)) {
        w.e("MicroMsg.BizConversationStorage", "brandUserName is null");
      }
      for (;;)
      {
        if (this.wpa != null) {
          this.wpa.onPause();
        }
        this.vHX = false;
        at.getNotification().dv("");
        super.onPause();
        GMTrace.o(3006342889472L, 22399);
        return;
        str = "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'";
        w.d("MicroMsg.BizConversationStorage", "resetNewUnreadCount :%s,sql:%s", new Object[] { Boolean.valueOf(localb.fTZ.eZ("BizChatConversation", str)), str });
      }
    }
    
    public final void onResume()
    {
      GMTrace.i(3006208671744L, 22398);
      super.onResume();
      at.AR();
      com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(this.juZ);
      if ((localx == null) || (!com.tencent.mm.l.a.eE(localx.field_type)))
      {
        finish();
        GMTrace.o(3006208671744L, 22398);
        return;
      }
      com.tencent.mm.af.d locald = f.iK(this.juZ);
      if ((locald == null) || (locald.field_enterpriseFather == null) || (!com.tencent.mm.y.s.fC(locald.field_enterpriseFather)))
      {
        finish();
        GMTrace.o(3006208671744L, 22398);
        return;
      }
      if (localx.vc()) {
        Ba(0);
      }
      for (;;)
      {
        this.vHX = true;
        this.wpa.a(null, null);
        at.getNotification().dv(this.juZ);
        GMTrace.o(3006208671744L, 22398);
        return;
        Ba(8);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
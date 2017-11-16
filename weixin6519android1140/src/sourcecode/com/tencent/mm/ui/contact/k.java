package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.g;
import com.tencent.mm.g.a.fl;
import com.tencent.mm.g.a.fl.b;
import com.tencent.mm.modelsimple.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public final class k
  extends RelativeLayout
{
  public static Boolean wSc;
  private Context context;
  private boolean isVisible;
  private View kJj;
  private View wSd;
  private final aj wSe;
  j.a wSf;
  boolean wSg;
  
  static
  {
    GMTrace.i(1715705217024L, 12783);
    wSc = Boolean.valueOf(true);
    GMTrace.o(1715705217024L, 12783);
  }
  
  public k(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1714363039744L, 12773);
    this.context = null;
    this.kJj = null;
    this.wSd = null;
    this.isVisible = true;
    this.wSe = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1788451225600L, 13325);
        w.d("MicroMsg.FMessageContactView", "refresh timer expired, update");
        k.cgv();
        k.a(k.this);
        GMTrace.o(1788451225600L, 13325);
        return false;
      }
    }, true);
    this.wSf = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(1812073545728L, 13501);
        w.d("MicroMsg.FMessageContactView", "onNotifyChange, fmsg change");
        if (!k.b(k.this).bQn()) {
          k.b(k.this).stopTimer();
        }
        paramAnonymousString = k.b(k.this);
        if (k.c(k.this)) {}
        for (long l = 500L;; l = 1000L)
        {
          paramAnonymousString.z(l, l);
          GMTrace.o(1812073545728L, 13501);
          return;
        }
      }
    };
    this.wSg = false;
    this.context = paramContext;
    com.tencent.mm.bc.l.ML().c(this.wSf);
    cgt();
    init();
    GMTrace.o(1714363039744L, 12773);
  }
  
  private static void cgt()
  {
    GMTrace.i(1714765692928L, 12776);
    int i = com.tencent.mm.bc.l.ML().Mz();
    w.v("MicroMsg.FMessageContactView", "updateAddressTabUnread, newCount update to = %d", new Object[] { Integer.valueOf(i) });
    if (i > 0)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(i));
    }
    GMTrace.o(1714765692928L, 12776);
  }
  
  public static void cgu()
  {
    GMTrace.i(1714899910656L, 12777);
    at.AR();
    if (com.tencent.mm.y.c.yF())
    {
      at.AR();
      if (com.tencent.mm.y.c.xh().getInt(143618, 0) > 0) {
        ah.I("fmessage", 2);
      }
    }
    at.AR();
    com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
    GMTrace.o(1714899910656L, 12777);
  }
  
  private void init()
  {
    GMTrace.i(1714497257472L, 12774);
    Object localObject2 = com.tencent.mm.bc.l.ML();
    w.v("MicroMsg.FMessageConversationStorage", "getNewLimit, limit = %d", new Object[] { Integer.valueOf(4) });
    Object localObject1 = new ArrayList();
    Object localObject3 = "select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4";
    localObject2 = ((com.tencent.mm.bc.c)localObject2).fTZ.a((String)localObject3, null, 2);
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new com.tencent.mm.bc.b();
      ((com.tencent.mm.bc.b)localObject3).b((Cursor)localObject2);
      if (!bg.nm(((com.tencent.mm.bc.b)localObject3).field_talker)) {
        ((List)localObject1).add(localObject3);
      }
    }
    ((Cursor)localObject2).close();
    int i = ((List)localObject1).size();
    w.d("MicroMsg.FMessageContactView", "init new fconv size = %d (max is 4)", new Object[] { Integer.valueOf(i) });
    removeAllViews();
    if (i <= 0) {
      if (this.context == null)
      {
        w.w("MicroMsg.FMessageContactView", "initNoNew failed. context is null.");
        localObject1 = this.kJj.findViewById(R.h.bAu);
        if (localObject1 != null) {
          if (!this.isVisible) {
            break label1345;
          }
        }
      }
    }
    label494:
    label585:
    label737:
    label742:
    label971:
    label1033:
    label1345:
    for (i = 0;; i = 8)
    {
      ((View)localObject1).setVisibility(i);
      this.wSd.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1837843349504L, 13693);
          if ((k.d(k.this) instanceof MMActivity)) {
            ((MMActivity)k.d(k.this)).aLo();
          }
          GMTrace.o(1837843349504L, 13693);
          return false;
        }
      });
      i = com.tencent.mm.bc.l.ML().Mz();
      w.d("MicroMsg.FMessageContactView", "init totalNewSize = %d", new Object[] { Integer.valueOf(i) });
      localObject1 = (TextView)this.kJj.findViewById(R.h.bAB);
      ((TextView)localObject1).setBackgroundResource(s.fH(this.context));
      if (i > 0) {
        break label1351;
      }
      ((TextView)localObject1).setVisibility(8);
      wSc = Boolean.valueOf(false);
      GMTrace.o(1714497257472L, 12774);
      return;
      this.kJj = View.inflate(this.context, R.i.cxi, this);
      this.wSd = this.kJj.findViewById(R.h.bAD);
      localObject1 = this.wSd.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = ((int)(com.tencent.mm.br.a.W(this.context, R.f.aPH) * com.tencent.mm.br.a.ec(this.context)));
      this.wSd.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.kJj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1745904205824L, 13008);
          w.d("MicroMsg.FMessageContactView", "initNoNew, goto FMessageConversationUI");
          com.tencent.mm.bj.d.b(k.d(k.this), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
          GMTrace.o(1745904205824L, 13008);
        }
      });
      localObject1 = (MaskLayout)this.kJj.findViewById(R.h.bAp);
      n.Dh();
      localObject2 = com.tencent.mm.ac.d.hZ("fmessage");
      ((ImageView)((MaskLayout)localObject1).view).setImageBitmap((Bitmap)localObject2);
      break;
      if (i == 1)
      {
        localObject2 = (com.tencent.mm.bc.b)((List)localObject1).get(0);
        if (this.context == null)
        {
          w.w("MicroMsg.FMessageContactView", "initSingleNew failed. context is null.");
          break;
        }
        Object localObject4;
        Context localContext;
        boolean bool;
        if (com.tencent.mm.br.a.ed(this.context))
        {
          this.kJj = View.inflate(this.context, R.i.cxl, this);
          ((TextView)this.kJj.findViewById(R.h.bAI)).setText(h.a(this.context, ((com.tencent.mm.bc.b)localObject2).field_displayName));
          localObject3 = (TextView)this.kJj.findViewById(R.h.bAH);
          localObject4 = com.tencent.mm.bc.l.MK().lO(((com.tencent.mm.bc.b)localObject2).field_talker);
          localContext = this.context;
          i = ((f)localObject4).field_type;
          int j = ((com.tencent.mm.bc.b)localObject2).field_addScene;
          localObject1 = ((f)localObject4).field_msgContent;
          if (((f)localObject4).MC()) {
            break label737;
          }
          bool = true;
          w.d("MicroMsg.FMessageProvider", "setDigest, fmsgType = %d, fmsgScene = %d, fmsgContent = %s, isSend = %b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject1, Boolean.valueOf(bool) });
          if (i != 0) {
            break label971;
          }
          if (localObject1 != null) {
            break label742;
          }
          w.e("MicroMsg.FMessageProvider", "setDigest fail, fmsgContent is null");
          localObject1 = null;
          if (!com.tencent.mm.platformtools.t.nm((String)localObject1)) {
            break label1033;
          }
          ((TextView)localObject3).setVisibility(8);
        }
        for (;;)
        {
          this.wSd = this.kJj.findViewById(R.h.bAu);
          this.kJj.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(1740267061248L, 12966);
              w.d("MicroMsg.FMessageContactView", "initSingleNew, not goto ContactInfoUI, goto FMessageConversationUI");
              at.AR();
              com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
              com.tencent.mm.bj.d.b(k.d(k.this), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
              GMTrace.o(1740267061248L, 12966);
            }
          });
          a.b.a((ImageView)((MaskLayout)this.kJj.findViewById(R.h.bAp)).view, ((com.tencent.mm.bc.b)localObject2).field_talker);
          break;
          this.kJj = View.inflate(this.context, R.i.cxk, this);
          break label494;
          bool = false;
          break label585;
          localObject1 = au.a.Uh((String)localObject1);
          switch (((au.a)localObject1).scene)
          {
          default: 
            localObject1 = localContext.getString(R.l.dfs);
            break;
          case 4: 
            localObject1 = localContext.getString(R.l.dfn);
            break;
          case 10: 
          case 11: 
            localObject4 = new fl();
            ((fl)localObject4).eHP.eHM = ((au.a)localObject1).vBs;
            ((fl)localObject4).eHP.eHN = ((au.a)localObject1).vBt;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
            localObject1 = localContext.getString(R.l.dfq, new Object[] { bg.aq(((fl)localObject4).eHQ.eHR, "") });
            break;
          case 31: 
            localObject1 = localContext.getString(R.l.dfz);
            break;
          case 32: 
            localObject1 = localContext.getString(R.l.dft);
            break;
          case 58: 
          case 59: 
          case 60: 
            localObject1 = localContext.getString(R.l.dfo);
            break;
            if (bool) {
              break;
            }
            localObject1 = au.d.Uk((String)localObject1);
            if ((((au.d)localObject1).content != null) && (!((au.d)localObject1).content.trim().equals("")))
            {
              localObject1 = ((au.d)localObject1).content;
              break;
            }
            localObject1 = localContext.getString(R.l.dwk);
            break;
            ((TextView)localObject3).setText((CharSequence)localObject1);
          }
        }
      }
      if (this.context == null)
      {
        w.w("MicroMsg.FMessageContactView", "initMultiNew failed. context is null.");
        break;
      }
      this.kJj = View.inflate(this.context, R.i.cxj, this);
      i = ((List)localObject1).size();
      w.d("MicroMsg.FMessageContactView", "initMultiNew, newList size = %d", new Object[] { Integer.valueOf(i) });
      localObject2 = (com.tencent.mm.bc.b)((List)localObject1).get(0);
      localObject3 = (MaskLayout)this.kJj.findViewById(R.h.bAp);
      a.b.a((ImageView)((MaskLayout)localObject3).view, ((com.tencent.mm.bc.b)localObject2).field_talker);
      ((MaskLayout)localObject3).setVisibility(0);
      localObject2 = (com.tencent.mm.bc.b)((List)localObject1).get(1);
      localObject3 = (MaskLayout)this.kJj.findViewById(R.h.bAq);
      a.b.a((ImageView)((MaskLayout)localObject3).view, ((com.tencent.mm.bc.b)localObject2).field_talker);
      ((MaskLayout)localObject3).setVisibility(0);
      if (i > 2)
      {
        localObject2 = (com.tencent.mm.bc.b)((List)localObject1).get(2);
        localObject3 = (MaskLayout)this.kJj.findViewById(R.h.bAr);
        a.b.a((ImageView)((MaskLayout)localObject3).view, ((com.tencent.mm.bc.b)localObject2).field_talker);
        ((MaskLayout)localObject3).setVisibility(0);
      }
      if (i > 3)
      {
        localObject1 = (com.tencent.mm.bc.b)((List)localObject1).get(3);
        localObject2 = (MaskLayout)this.kJj.findViewById(R.h.bAs);
        a.b.a((ImageView)((MaskLayout)localObject2).view, ((com.tencent.mm.bc.b)localObject1).field_talker);
        ((MaskLayout)localObject2).setVisibility(0);
      }
      this.wSd = this.kJj.findViewById(R.h.bAu);
      this.wSd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1777176936448L, 13241);
          w.d("MicroMsg.FMessageContactView", "initMultiNew, goto FMessageConversationUI");
          at.AR();
          com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
          com.tencent.mm.bj.d.b(k.d(k.this), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
          GMTrace.o(1777176936448L, 13241);
        }
      });
      break;
    }
    label1351:
    ((TextView)localObject1).setVisibility(0);
    wSc = Boolean.valueOf(true);
    if (i > 99)
    {
      ((TextView)localObject1).setText(getContext().getString(R.l.efe));
      GMTrace.o(1714497257472L, 12774);
      return;
    }
    ((TextView)localObject1).setText(String.valueOf(i));
    GMTrace.o(1714497257472L, 12774);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
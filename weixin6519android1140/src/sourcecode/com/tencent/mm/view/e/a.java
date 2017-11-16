package com.tencent.mm.view.e;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v4.view.ViewPager.e;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a.b;
import com.tencent.mm.bq.a.c;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.plugin.m.a.i;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.ui.base.MMRadioGroupView.c;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.view.SmileyPanelScrollView;
import com.tencent.mm.view.SmileyPanelScrollView.b;
import com.tencent.mm.view.SmileyPanelViewPager;
import com.tencent.mm.view.SmileyPanelViewPager.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class a
  implements ViewPager.e, View.OnClickListener, MMRadioGroupView.c, SmileyPanelScrollView.b, SmileyPanelViewPager.a
{
  private final String TAG;
  public Context iPn;
  public final j.a kjR;
  public final com.tencent.mm.sdk.b.c kjS;
  private ae mHandler;
  public View mView;
  public Context sN;
  private final int xBO;
  private final int xBP;
  private final int xBQ;
  private final int xBR;
  public SmileyPanelViewPager xBS;
  private com.tencent.mm.view.a.d xBT;
  public SmileyPanelScrollView xBU;
  public HorizontalListViewV2 xBV;
  public com.tencent.mm.view.a.e xBW;
  public View xBX;
  public ImageView xBY;
  public ImageView xBZ;
  private ImageButton xCa;
  public ImageButton xCb;
  public TextView xCc;
  public a xCd;
  public int xCe;
  private boolean xCf;
  public boolean xCg;
  public String xCh;
  public final j.a xCi;
  public AdapterView.OnItemClickListener xCj;
  public com.tencent.mm.view.f.a xzl;
  
  public a(Context paramContext, com.tencent.mm.view.f.a parama, a parama1)
  {
    GMTrace.i(20124203483136L, 149937);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelManager";
    this.xBO = 100;
    this.xBP = 1102;
    this.xBQ = 1103;
    this.xBR = 100;
    this.xCe = -1;
    this.xCf = false;
    this.xCg = true;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        boolean bool = true;
        GMTrace.i(20123800829952L, 149934);
        switch (paramAnonymousMessage.what)
        {
        default: 
        case 1102: 
          do
          {
            GMTrace.o(20123800829952L, 149934);
            return;
            a.this.cle();
            a.this.xCg = true;
          } while ((a.this.xCh == null) || (a.this.xBS == null));
          int j = a.this.xzl.xCz;
          if (j >= 0)
          {
            i = j;
            if (j <= a.this.xzl.Xq(a.this.xCh).cld()) {}
          }
          else
          {
            i = a.this.xzl.Xq(a.this.xCh).cld() - 1;
          }
          a.this.xCe = (i + a.this.xzl.Xq(a.this.xCh).iPp);
          a.this.xBS.Y(a.this.xCe);
          a.this.xCh = null;
          GMTrace.o(20123800829952L, 149934);
          return;
        }
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "update selection");
        a locala = a.this;
        int i = paramAnonymousMessage.arg1;
        if (paramAnonymousMessage.arg2 == 1) {}
        for (;;)
        {
          locala.c(i, bool, false);
          break;
          bool = false;
        }
      }
    };
    this.xCi = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(20122727088128L, 149926);
        if ((!TextUtils.isEmpty(paramAnonymousString)) && ((paramAnonymousString.equals("event_update_group")) || (paramAnonymousString.equalsIgnoreCase("productID"))))
        {
          w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "modify emoji group .");
          a.this.clk();
        }
        GMTrace.o(20122727088128L, 149926);
      }
    };
    this.kjR = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(20122995523584L, 149928);
        if (paramAnonymousString == null)
        {
          GMTrace.o(20122995523584L, 149928);
          return;
        }
        if (paramAnonymousString.equalsIgnoreCase("delete_emoji_info_notify"))
        {
          a.this.clk();
          GMTrace.o(20122995523584L, 149928);
          return;
        }
        paramAnonymousString = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramAnonymousString);
        if ((paramAnonymousString != null) && (paramAnonymousString.field_catalog == EmojiInfo.vCu))
        {
          ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqI();
          a.this.clk();
        }
        GMTrace.o(20122995523584L, 149928);
      }
    };
    this.kjS = new com.tencent.mm.sdk.b.c() {};
    this.xCj = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20122190217216L, 149922);
        paramAnonymousAdapterView = a.this.xBW.EE(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "info is null. ignore click action.");
          GMTrace.o(20122190217216L, 149922);
          return;
        }
        if (paramAnonymousAdapterView.field_productID.equalsIgnoreCase("TAG_STORE_MANEGER_TAB"))
        {
          com.tencent.mm.bj.d.b(a.this.sN, "emoji", ".ui.EmojiMineUI", new Intent());
          GMTrace.o(20122190217216L, 149922);
          return;
        }
        a.this.c(a.this.xzl.EK(a.this.xCe), false, true);
        paramAnonymousView = a.this.xzl.Xq(paramAnonymousAdapterView.field_productID);
        a.this.xCe = paramAnonymousView.iPp;
        if (paramAnonymousView.xBN > paramAnonymousView.cld() - 1) {}
        for (paramAnonymousInt = paramAnonymousView.cld() - 1;; paramAnonymousInt = paramAnonymousView.xBN)
        {
          if (a.this.xBS != null) {
            a.this.xBS.c(a.this.xCe + paramAnonymousInt, false);
          }
          a.this.t(paramAnonymousView.cld(), paramAnonymousInt, true);
          a.this.xzl.xCz = paramAnonymousInt;
          a.this.xzl.Xp(paramAnonymousAdapterView.field_productID);
          if (paramAnonymousAdapterView.equals(String.valueOf(EmojiGroupInfo.vCm))) {
            com.tencent.mm.plugin.report.service.g.ork.i(11594, new Object[] { Integer.valueOf(0) });
          }
          GMTrace.o(20122190217216L, 149922);
          return;
        }
      }
    };
    this.sN = ab.getContext();
    this.iPn = paramContext;
    this.xzl = parama;
    this.xCd = parama1;
    w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager add listener.");
    ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().i(this.xCi);
    ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().g(this.kjR);
    com.tencent.mm.sdk.b.a.vgX.b(this.kjS);
    GMTrace.o(20124203483136L, 149937);
  }
  
  private void EH(int paramInt)
  {
    GMTrace.i(20126350966784L, 149953);
    int i = this.xzl.xCl;
    int j = this.xBV.getWidth();
    int k = this.xBV.getFirstVisiblePosition();
    if (paramInt > this.xBV.getLastVisiblePosition()) {
      this.xBV.BG(i * (paramInt + 1) - j);
    }
    for (;;)
    {
      c(paramInt, true, true);
      GMTrace.o(20126350966784L, 149953);
      return;
      if (paramInt < k) {
        this.xBV.BG(i * paramInt);
      }
    }
  }
  
  private void a(EmojiGroupInfo paramEmojiGroupInfo, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(20124874571776L, 149942);
    com.tencent.mm.view.f.a locala1 = this.xzl;
    if (locala1.xCM == null) {
      locala1.xCM = new ArrayList();
    }
    int j = locala1.xCM.size();
    com.tencent.mm.view.c.a locala;
    if (j <= 0)
    {
      locala = null;
      j = bg.a((Integer)locala1.xCN.get(paramEmojiGroupInfo.field_productID), 0);
      if (locala != null) {
        break label135;
      }
    }
    for (;;)
    {
      paramEmojiGroupInfo = new com.tencent.mm.view.c.a(paramEmojiGroupInfo, i, j, locala1, this, paramBoolean);
      locala1.xCM.add(paramEmojiGroupInfo);
      GMTrace.o(20124874571776L, 149942);
      return;
      locala = (com.tencent.mm.view.c.a)locala1.xCM.get(j - 1);
      break;
      label135:
      i = locala.iPp + locala.cld();
    }
  }
  
  private ImageButton cli()
  {
    GMTrace.i(20125143007232L, 149944);
    if (this.xCa == null)
    {
      this.xCa = new ImageButton(this.iPn, null, a.i.kwI);
      this.xCa.setMaxHeight(this.xzl.xCm);
      this.xCa.setMinimumHeight(this.xzl.xCm);
      this.xCa.setMaxWidth(this.xzl.xCl);
      this.xCa.setMinimumWidth(this.xzl.xCl);
      this.xCa.setScaleType(ImageView.ScaleType.CENTER);
      this.xCa.setPadding(this.xzl.xCo, this.xzl.xCo, this.xzl.xCo, this.xzl.xCo);
      this.xCa.setClickable(false);
      this.xCa.setVisibility(8);
    }
    ImageButton localImageButton = this.xCa;
    GMTrace.o(20125143007232L, 149944);
    return localImageButton;
  }
  
  public final void Cb(int paramInt)
  {
    GMTrace.i(20126753619968L, 149956);
    if (paramInt > 0)
    {
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab size changed ,so adjusting tab site.");
      EH(this.xzl.clt());
    }
    GMTrace.o(20126753619968L, 149956);
  }
  
  public final void EC(int paramInt)
  {
    GMTrace.i(20125679878144L, 149948);
    if (this.xBS != null)
    {
      int i = this.xBS.xI;
      paramInt = this.xzl.EJ(i).iPp + paramInt;
      if (paramInt != i)
      {
        Math.abs(paramInt - i);
        this.xBS.Y(paramInt);
      }
      this.xCe = paramInt;
    }
    GMTrace.o(20125679878144L, 149948);
  }
  
  /* Error */
  public final void ED(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 364
    //   5: ldc_w 366
    //   8: invokestatic 94	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 141	com/tencent/mm/view/e/a:xzl	Lcom/tencent/mm/view/f/a;
    //   15: invokevirtual 370	com/tencent/mm/view/f/a:clw	()Z
    //   18: ifeq +68 -> 86
    //   21: aload_0
    //   22: getfield 141	com/tencent/mm/view/e/a:xzl	Lcom/tencent/mm/view/f/a;
    //   25: getfield 373	com/tencent/mm/view/f/a:xCK	Z
    //   28: ifne +18 -> 46
    //   31: aload_0
    //   32: getfield 141	com/tencent/mm/view/e/a:xzl	Lcom/tencent/mm/view/f/a;
    //   35: astore_2
    //   36: aload_2
    //   37: iconst_1
    //   38: putfield 373	com/tencent/mm/view/f/a:xCK	Z
    //   41: aload_2
    //   42: iconst_0
    //   43: putfield 376	com/tencent/mm/view/f/a:xCL	Z
    //   46: ldc 96
    //   48: ldc_w 378
    //   51: invokestatic 150	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: iload_1
    //   55: ifle +19 -> 74
    //   58: aload_0
    //   59: getfield 380	com/tencent/mm/view/e/a:mView	Landroid/view/View;
    //   62: new 18	com/tencent/mm/view/e/a$2
    //   65: dup
    //   66: aload_0
    //   67: invokespecial 381	com/tencent/mm/view/e/a$2:<init>	(Lcom/tencent/mm/view/e/a;)V
    //   70: invokevirtual 387	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   73: pop
    //   74: ldc2_w 364
    //   77: ldc_w 366
    //   80: invokestatic 183	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: aload_0
    //   84: monitorexit
    //   85: return
    //   86: aload_0
    //   87: getfield 141	com/tencent/mm/view/e/a:xzl	Lcom/tencent/mm/view/f/a;
    //   90: getfield 376	com/tencent/mm/view/f/a:xCL	Z
    //   93: ifne -47 -> 46
    //   96: aload_0
    //   97: getfield 141	com/tencent/mm/view/e/a:xzl	Lcom/tencent/mm/view/f/a;
    //   100: astore_2
    //   101: aload_2
    //   102: iconst_1
    //   103: putfield 376	com/tencent/mm/view/f/a:xCL	Z
    //   106: aload_2
    //   107: iconst_0
    //   108: putfield 373	com/tencent/mm/view/f/a:xCK	Z
    //   111: goto -65 -> 46
    //   114: astore_2
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_2
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	a
    //   0	119	1	paramInt	int
    //   35	72	2	locala	com.tencent.mm.view.f.a
    //   114	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	46	114	finally
    //   46	54	114	finally
    //   58	74	114	finally
    //   74	83	114	finally
    //   86	111	114	finally
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(20126216749056L, 149952);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "cpan onPageSelected :%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.xzl == null)
    {
      GMTrace.o(20126216749056L, 149952);
      return;
    }
    if (!this.xzl.xCP)
    {
      GMTrace.o(20126216749056L, 149952);
      return;
    }
    com.tencent.mm.view.c.a locala = this.xzl.EJ(paramInt);
    int i;
    int j;
    int k;
    if (locala.klt.equals("TAG_STORE_TAB"))
    {
      this.xBY.setSelected(true);
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "show TAB: viewId: %d, tabProductId: %s", new Object[] { Integer.valueOf(this.xBY.getId()), "TAG_STORE_TAB" });
      this.xzl.Xp("TAG_STORE_TAB");
      com.tencent.mm.plugin.report.service.g.ork.i(11594, new Object[] { Integer.valueOf(5) });
      com.tencent.mm.s.c.vK().aF(262147, 266244);
      com.tencent.mm.s.c.vK().aF(262149, 266244);
      clh();
      i = paramInt - locala.iPp;
      j = locala.cld();
      k = locala.iPp;
      if (this.xCf) {
        break label353;
      }
    }
    label353:
    for (boolean bool = true;; bool = false)
    {
      t(j, paramInt - k, bool);
      this.xzl.xCz = i;
      this.xzl.Xp(locala.klt);
      locala.xBN = i;
      com.tencent.mm.view.f.a locala1 = this.xzl;
      String str = locala.klt;
      i = locala.xBN;
      locala1.xCN.put(str, Integer.valueOf(i));
      EH(this.xzl.EK(paramInt));
      c(this.xzl.EK(paramInt) - 1, false, true);
      c(this.xzl.EK(paramInt) + 1, false, true);
      GMTrace.o(20126216749056L, 149952);
      return;
      this.xBY.setSelected(false);
      break;
    }
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(20125814095872L, 149949);
    SmileyPanelScrollView localSmileyPanelScrollView;
    if (this.xBU != null)
    {
      localSmileyPanelScrollView = this.xBU;
      if (paramInt != 0) {
        break label92;
      }
      localSmileyPanelScrollView.xzF = localSmileyPanelScrollView.xzs;
      localSmileyPanelScrollView.xzE = localSmileyPanelScrollView.xzs;
      localSmileyPanelScrollView.xzG = 0.0F;
      localSmileyPanelScrollView.invalidate();
      if (localSmileyPanelScrollView.xzH) {
        localSmileyPanelScrollView.xzH = false;
      }
    }
    for (;;)
    {
      if ((paramInt == 0) || (paramInt == 1)) {
        this.xCe = this.xBS.xI;
      }
      GMTrace.o(20125814095872L, 149949);
      return;
      label92:
      if (paramInt == 1)
      {
        localSmileyPanelScrollView.xzF = localSmileyPanelScrollView.xzs;
        localSmileyPanelScrollView.xzE = localSmileyPanelScrollView.xzs;
        localSmileyPanelScrollView.xzG = 0.0F;
      }
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(20125948313600L, 149950);
    if ((this.xBU != null) && (paramFloat != 0.0F))
    {
      if (this.xCe == -1) {
        this.xCe = this.xBS.xI;
      }
      paramInt2 = this.xCe;
      if (paramInt1 == this.xCe) {
        paramInt2 = this.xCe + 1;
      }
      Object localObject = this.xzl.EJ(paramInt2);
      com.tencent.mm.view.c.a locala = this.xzl.EJ(paramInt1);
      if (localObject == locala)
      {
        localObject = this.xBU;
        paramInt1 -= locala.iPp;
        ((SmileyPanelScrollView)localObject).xzG = paramFloat;
        if (((SmileyPanelScrollView)localObject).xzF != paramInt1) {
          ((SmileyPanelScrollView)localObject).xzF = paramInt1;
        }
        ((SmileyPanelScrollView)localObject).invalidate();
        this.xCf = true;
        GMTrace.o(20125948313600L, 149950);
        return;
      }
      this.xCf = false;
    }
    GMTrace.o(20125948313600L, 149950);
  }
  
  public final void c(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    GMTrace.i(20126082531328L, 149951);
    Object localObject;
    if (this.xBV != null)
    {
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab index:%d selected:%b listView child count:%d", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1), Integer.valueOf(this.xBV.getChildCount()) });
      this.xBV.setSelection(paramInt);
      localObject = this.xBV.getSelectedView();
      if (localObject != null)
      {
        ((View)localObject).setSelected(paramBoolean1);
        GMTrace.o(20126082531328L, 149951);
        return;
      }
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "list item view is null. refreshable:%b", new Object[] { Boolean.valueOf(paramBoolean2) });
      if (paramBoolean2)
      {
        localObject = new Message();
        ((Message)localObject).what = 1103;
        ((Message)localObject).arg1 = paramInt;
        if (!paramBoolean1) {
          break label178;
        }
      }
    }
    label178:
    for (paramInt = i;; paramInt = 0)
    {
      ((Message)localObject).arg2 = paramInt;
      this.mHandler.sendMessageDelayed((Message)localObject, 100L);
      GMTrace.o(20126082531328L, 149951);
      return;
    }
  }
  
  public final void cle()
  {
    long l1;
    long l2;
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      try
      {
        GMTrace.i(20124337700864L, 149938);
        if ((this.mView == null) || (!this.xzl.xCP))
        {
          w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "not view can't deal");
          GMTrace.o(20124337700864L, 149938);
          return;
        }
        l1 = System.currentTimeMillis();
        this.xzl.xCE = false;
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initSmileyData");
        l2 = System.currentTimeMillis();
        com.tencent.mm.view.f.a locala = this.xzl;
        if (locala.xCM == null) {
          break;
        }
        localObject3 = locala.xCM.iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        localObject4 = (com.tencent.mm.view.c.a)((Iterator)localObject3).next();
        if (localObject4 != null) {
          w.v("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "removeAllGridViewListener listener: %s", new Object[] { ((com.tencent.mm.view.c.a)localObject4).klt });
        } else {
          w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "removeAllGridViewListener already release: ..");
        }
      }
      finally {}
    }
    if (((com.tencent.mm.view.f.a)localObject1).xCM != null) {
      ((com.tencent.mm.view.f.a)localObject1).xCM.clear();
    }
    Object localObject2;
    if (((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqF() <= 2)
    {
      com.tencent.mm.bq.a.bOv();
      localObject2 = com.tencent.mm.bq.a.veh;
      if (!a.b.Ae(208912)) {
        break label891;
      }
    }
    for (;;)
    {
      localObject3 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqG();
      com.tencent.mm.bq.a.bOv();
      localObject2 = com.tencent.mm.bq.a.vei;
      int j;
      int k;
      int m;
      if (((f)h.xv().wZ()).eR(""))
      {
        j = com.tencent.mm.k.g.ut().getInt("EmotionRecommandCount", 3);
        k = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqH();
        m = j - k;
        w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "recommend count :%d need recommend count:%d download count:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(k) });
        localObject2 = new ArrayList();
        if (!this.xzl.xCB)
        {
          ((ArrayList)localObject2).add(com.tencent.mm.view.f.a.clq());
          a(com.tencent.mm.view.f.a.clq(), true);
        }
        if (this.xzl.xCA) {
          break label630;
        }
        if (i != 0)
        {
          ((ArrayList)localObject2).add(com.tencent.mm.view.f.a.clr());
          a(com.tencent.mm.view.f.a.clr(), true);
        }
        if (localObject3 != null)
        {
          localObject3 = ((ArrayList)localObject3).iterator();
          k = 0;
        }
      }
      else
      {
        for (;;)
        {
          if (!((Iterator)localObject3).hasNext()) {
            break label574;
          }
          localObject4 = (EmojiGroupInfo)((Iterator)localObject3).next();
          if ((localObject4 != null) && (!bg.nm(((EmojiGroupInfo)localObject4).field_productID)))
          {
            if (((EmojiGroupInfo)localObject4).field_recommand == 1)
            {
              if ((k >= m) || (k >= j)) {
                continue;
              }
              k += 1;
              a((EmojiGroupInfo)localObject4, com.tencent.mm.view.f.a.d((EmojiGroupInfo)localObject4));
              ((ArrayList)localObject2).add(localObject4);
              continue;
              j = ((a.c)localObject2).getInt("EmotionRecommandCount", 3);
              break;
            }
            if ((!((EmojiGroupInfo)localObject4).field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.vCm))) && (!((EmojiGroupInfo)localObject4).field_productID.equalsIgnoreCase("TAG_DEFAULT_TAB")))
            {
              a((EmojiGroupInfo)localObject4, com.tencent.mm.view.f.a.d((EmojiGroupInfo)localObject4));
              ((ArrayList)localObject2).add(localObject4);
            }
          }
        }
      }
      label574:
      if (i == 0)
      {
        ((ArrayList)localObject2).add(com.tencent.mm.view.f.a.clr());
        a(com.tencent.mm.view.f.a.clr(), true);
      }
      if (!this.xzl.xCB)
      {
        localObject3 = new EmojiGroupInfo();
        ((EmojiGroupInfo)localObject3).field_productID = "TAG_STORE_MANEGER_TAB";
        ((ArrayList)localObject2).add(localObject3);
      }
      label630:
      localObject3 = this.xBW;
      ((com.tencent.mm.view.a.e)localObject3).mData.clear();
      ((com.tencent.mm.view.a.e)localObject3).mData.addAll((Collection)localObject2);
      ((com.tencent.mm.view.a.e)localObject3).notifyDataSetChanged();
      clh();
      this.xzl.clv();
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "end initTabsGroup use time :%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "- deal View");
      if (this.xBS == null) {
        w.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initPanelVP failed");
      }
      for (;;)
      {
        clf();
        this.xzl.xCE = true;
        this.xzl.xCH = true;
        if (!this.xzl.xCF)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(406L, 6L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(406L, 8L, System.currentTimeMillis() - l1, false);
        }
        GMTrace.o(20124337700864L, 149938);
        break;
        if (this.xBT == null)
        {
          clg();
          this.xBT = new com.tencent.mm.view.a.d(this.xzl, this.iPn);
          this.xzl.clu();
          this.xBS.a(this.xBT);
          this.xBS.DU(1);
        }
        else
        {
          this.xBT.xAm = true;
          this.xBT.ckK();
          this.xBT.notifyDataSetChanged();
          this.xBT.xAm = false;
        }
      }
      int i = 1;
      continue;
      label891:
      i = 0;
    }
  }
  
  public final void clf()
  {
    GMTrace.i(20124471918592L, 149939);
    com.tencent.mm.view.c.a locala2 = this.xzl.clu();
    com.tencent.mm.view.c.a locala1 = locala2;
    if (locala2 == null)
    {
      this.xzl.Xp("TAG_DEFAULT_TAB");
      locala1 = this.xzl.clu();
    }
    clj();
    if ((locala1 != null) && (this.xBS != null))
    {
      int j = this.xzl.xCz;
      int i;
      if (j >= 0)
      {
        i = j;
        if (j <= locala1.cld() - 1) {}
      }
      else
      {
        i = locala1.cld() - 1;
      }
      this.xCe = (locala1.iPp + i);
      this.xBS.Y(this.xCe);
      if (!locala1.klt.equals("TAG_STORE_TAB")) {
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "init set currentItem not default qq. ");
      }
      t(locala1.cld(), i + 0, false);
    }
    GMTrace.o(20124471918592L, 149939);
  }
  
  public final void clg()
  {
    GMTrace.i(20124740354048L, 149941);
    if (this.xBT != null)
    {
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "clearViewPagerCache");
      this.xBT.mCount = 0;
    }
    GMTrace.o(20124740354048L, 149941);
  }
  
  public final void clh()
  {
    GMTrace.i(20125008789504L, 149943);
    if (this.xBY == null)
    {
      GMTrace.o(20125008789504L, 149943);
      return;
    }
    if ((com.tencent.mm.view.f.a.clm()) && (!this.xzl.xCy.equalsIgnoreCase("TAG_STORE_TAB"))) {
      this.xBZ.setVisibility(0);
    }
    for (;;)
    {
      this.xBY.setContentDescription(this.sN.getString(a.h.kwG));
      GMTrace.o(20125008789504L, 149943);
      return;
      this.xBZ.setVisibility(8);
    }
  }
  
  public final void clj()
  {
    GMTrace.i(20126485184512L, 149954);
    if (!this.xzl.xCF)
    {
      GMTrace.o(20126485184512L, 149954);
      return;
    }
    if (this.xzl.xCy.equals("TAG_DEFAULT_TAB")) {}
    for (int i = 1; i != 0; i = 0)
    {
      if ((this.xCd != null) && (this.xCd.ckG() != null)) {
        this.xCd.ckG().fQ(true);
      }
      if (!this.xzl.cls()) {
        break label224;
      }
      this.xzl.xCG = false;
      cli().setVisibility(0);
      if ((this.xCc != null) && (this.xCc.getVisibility() != 0))
      {
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(this.xCc.getWidth(), 0.0F, 0.0F, 0.0F);
        localTranslateAnimation.setDuration(250L);
        this.xCc.startAnimation(localTranslateAnimation);
        this.xCc.setVisibility(0);
      }
      GMTrace.o(20126485184512L, 149954);
      return;
    }
    if ((this.xCd != null) && (this.xCd.ckG() != null)) {
      this.xCd.ckG().fQ(false);
    }
    mQ(true);
    label224:
    GMTrace.o(20126485184512L, 149954);
  }
  
  public final void clk()
  {
    GMTrace.i(20126887837696L, 149957);
    this.xCg = false;
    this.mHandler.removeMessages(1102);
    this.mHandler.sendEmptyMessageDelayed(1102, 100L);
    GMTrace.o(20126887837696L, 149957);
  }
  
  public final View findViewById(int paramInt)
  {
    GMTrace.i(20125411442688L, 149946);
    View localView = this.mView.findViewById(paramInt);
    GMTrace.o(20125411442688L, 149946);
    return localView;
  }
  
  public final void mQ(boolean paramBoolean)
  {
    GMTrace.i(20125545660416L, 149947);
    cli().setVisibility(8);
    if (this.xCc == null)
    {
      GMTrace.o(20125545660416L, 149947);
      return;
    }
    if (this.xCc.getVisibility() == 0)
    {
      if (paramBoolean)
      {
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.xCc.getWidth(), 0.0F, 0.0F);
        localTranslateAnimation.setDuration(250L);
        this.xCc.startAnimation(localTranslateAnimation);
      }
      this.xCc.setVisibility(8);
    }
    GMTrace.o(20125545660416L, 149947);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(20125277224960L, 149945);
    if (paramView == this.xBY)
    {
      paramView = new Intent();
      paramView.putExtra("preceding_scence", 13);
      paramView.putExtra("download_entrance_scene", 17);
      paramView.putExtra("check_clickflag", false);
      if (com.tencent.mm.view.f.a.cll())
      {
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "called emoji store must refresh by net");
        paramView.putExtra("emoji_stroe_must_refresh_by_net", true);
      }
      if (!bg.nm(this.xzl.tzq)) {
        paramView.putExtra("to_talker_name", this.xzl.tzq);
      }
      com.tencent.mm.bj.d.b(this.sN, "emoji", ".ui.v2.EmojiStoreV2UI", paramView);
      com.tencent.mm.plugin.report.service.g.ork.i(11594, new Object[] { Integer.valueOf(2) });
      GMTrace.o(20125277224960L, 149945);
      return;
    }
    if (paramView == this.xCc)
    {
      if ((this.xCd != null) && (this.xCd.ckG() != null)) {
        this.xCd.ckG().aMV();
      }
      GMTrace.o(20125277224960L, 149945);
      return;
    }
    if ((paramView == this.xCb) && (this.xCd.ckH() != null)) {
      this.xCd.ckH().aOc();
    }
    GMTrace.o(20125277224960L, 149945);
  }
  
  public final void t(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(20124606136320L, 149940);
    if (paramInt1 <= 1)
    {
      this.xBU.setVisibility(4);
      GMTrace.o(20124606136320L, 149940);
      return;
    }
    this.xBU.setVisibility(0);
    SmileyPanelScrollView localSmileyPanelScrollView = this.xBU;
    w.d("MicroMsg.SmileyPanelScrollView", "setDot dotCount:%d selectDot:%d force:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
    localSmileyPanelScrollView.xzr = paramInt1;
    if (paramInt2 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      localSmileyPanelScrollView.xzs = paramInt1;
      if ((localSmileyPanelScrollView.xzF == -1) || (paramBoolean)) {
        localSmileyPanelScrollView.xzF = localSmileyPanelScrollView.xzs;
      }
      if ((localSmileyPanelScrollView.xzE == -1) || (paramBoolean))
      {
        localSmileyPanelScrollView.xzE = localSmileyPanelScrollView.xzs;
        localSmileyPanelScrollView.xzG = 0.0F;
      }
      localSmileyPanelScrollView.invalidate();
      GMTrace.o(20124606136320L, 149940);
      return;
      paramInt1 = paramInt2;
      if (paramInt2 > localSmileyPanelScrollView.xzr) {
        paramInt1 = localSmileyPanelScrollView.xzr;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract ChatFooterPanel.a ckG();
    
    public abstract j ckH();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
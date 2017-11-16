package com.tencent.mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.SmileyPanel;
import com.tencent.mm.bq.a.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.f;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.protocal.c.beg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.view.e.a.3;
import com.tencent.mm.view.e.a.a;
import com.tencent.mm.view.f.a.1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class SmileyPanelImpl
  extends SmileyPanel
  implements a.a
{
  private final String TAG;
  private boolean iNp;
  private com.tencent.mm.view.e.a xzk;
  private com.tencent.mm.view.f.a xzl;
  
  public SmileyPanelImpl(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(20115613548544L, 149873);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanel";
    this.iNp = false;
    init();
    GMTrace.o(20115613548544L, 149873);
  }
  
  public SmileyPanelImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20115747766272L, 149874);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanel";
    this.iNp = false;
    init();
    GMTrace.o(20115747766272L, 149874);
  }
  
  private void init()
  {
    GMTrace.i(20115881984000L, 149875);
    this.xzl = new com.tencent.mm.view.f.a();
    this.xzk = new com.tencent.mm.view.e.a(getContext(), this.xzl, this);
    GMTrace.o(20115881984000L, 149875);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(20116418854912L, 149879);
    super.a(paramf);
    GMTrace.o(20116418854912L, 149879);
  }
  
  public final void aq(boolean paramBoolean)
  {
    GMTrace.i(20116553072640L, 149880);
    com.tencent.mm.view.e.a locala = this.xzk;
    if (locala.xCc != null) {
      locala.xCc.setEnabled(paramBoolean);
    }
    GMTrace.o(20116553072640L, 149880);
  }
  
  public final void ar(boolean paramBoolean)
  {
    GMTrace.i(20117492596736L, 149887);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSendButton:B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.xzk.mQ(paramBoolean);
    this.xzl.xCG = true;
    GMTrace.o(20117492596736L, 149887);
  }
  
  public final void bo(String paramString)
  {
    GMTrace.i(20118297903104L, 149893);
    this.xzl.tzq = paramString;
    GMTrace.o(20118297903104L, 149893);
  }
  
  public final void bp(String paramString)
  {
    GMTrace.i(20118432120832L, 149894);
    com.tencent.mm.view.f.a locala = this.xzl;
    locala.Xp(paramString);
    locala.clo();
    if (locala.xCO == null) {
      locala.xCO = new a.1(locala);
    }
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "add succeed send listener");
    com.tencent.mm.sdk.b.a.vgX.b(locala.xCO);
    GMTrace.o(20118432120832L, 149894);
  }
  
  public final void cT(int paramInt)
  {
    GMTrace.i(20117895249920L, 149890);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setPortHeightPx: %d", new Object[] { Integer.valueOf(paramInt) });
    this.xzl.QU = 0;
    com.tencent.mm.view.f.a locala1 = this.xzl;
    if (locala1.xCw != paramInt)
    {
      locala1.xCL = false;
      locala1.xCK = false;
    }
    locala1.xCw = paramInt;
    this.xzl.clo();
    locala1 = this.xzl;
    int i = this.xzl.xCm;
    com.tencent.mm.view.f.a locala2 = this.xzl;
    locala1.EI(paramInt - i - (locala2.xzw - locala2.xCu));
    this.xzl.iPK = 0;
    GMTrace.o(20117895249920L, 149890);
  }
  
  public final void cU(int paramInt)
  {
    GMTrace.i(20118968991744L, 149898);
    if (this.xzl != null) {
      this.xzl.gRb = paramInt;
    }
    GMTrace.o(20118968991744L, 149898);
  }
  
  public final ChatFooterPanel.a ckG()
  {
    GMTrace.i(20117626814464L, 149888);
    ChatFooterPanel.a locala = this.tta;
    GMTrace.o(20117626814464L, 149888);
    return locala;
  }
  
  public final j ckH()
  {
    GMTrace.i(20117761032192L, 149889);
    j localj = (j)this.ttb;
    GMTrace.o(20117761032192L, 149889);
    return localj;
  }
  
  public final void d(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20117358379008L, 149886);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.xzl.xCC = paramBoolean1;
    this.xzl.xCD = paramBoolean2;
    GMTrace.o(20117358379008L, 149886);
  }
  
  public final void destroy()
  {
    GMTrace.i(20116284637184L, 149878);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDestroy");
    this.tta = null;
    Object localObject1;
    if (this.xzk != null)
    {
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "ui clear");
      localObject1 = this.xzk;
      ((com.tencent.mm.view.e.a)localObject1).clg();
      ((com.tencent.mm.view.e.a)localObject1).iPn = null;
      if (((com.tencent.mm.view.e.a)localObject1).xBS != null) {
        ((com.tencent.mm.view.e.a)localObject1).xBS.a(null);
      }
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager destroy remove listener.");
      ((c)h.j(c.class)).getProvider().h(((com.tencent.mm.view.e.a)localObject1).xCi);
      ((c)h.j(c.class)).getProvider().f(((com.tencent.mm.view.e.a)localObject1).kjR);
      com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.view.e.a)localObject1).kjS);
      this.xzk = null;
    }
    if (this.xzl != null)
    {
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "stg clear");
      this.xzl.onPause();
      localObject1 = this.xzl;
      ((com.tencent.mm.view.f.a)localObject1).clo();
      long l = System.currentTimeMillis();
      Object localObject2 = new bef();
      Object localObject3;
      if ((((com.tencent.mm.view.f.a)localObject1).xCN != null) && (!((com.tencent.mm.view.f.a)localObject1).xCN.isEmpty()))
      {
        localObject3 = ((com.tencent.mm.view.f.a)localObject1).xCN.keySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          String str = (String)((Iterator)localObject3).next();
          beg localbeg = new beg();
          localbeg.tRS = str;
          localbeg.tTI = ((Integer)((com.tencent.mm.view.f.a)localObject1).xCN.get(str)).intValue();
          ((bef)localObject2).uPV.add(localbeg);
        }
        ((c)h.j(c.class)).getProvider().a((bef)localObject2);
      }
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "save Smiley TabMap use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      localObject2 = ((com.tencent.mm.view.f.a)localObject1).xCM.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.tencent.mm.view.c.a)((Iterator)localObject2).next();
        if (localObject3 != null)
        {
          ((com.tencent.mm.view.c.a)localObject3).xzl = null;
          ((com.tencent.mm.view.c.a)localObject3).xBJ = null;
        }
      }
      ((com.tencent.mm.view.f.a)localObject1).clx();
    }
    ((c)h.j(c.class)).getProvider().onDestroy();
    GMTrace.o(20116284637184L, 149878);
  }
  
  public final void oH()
  {
    GMTrace.i(20116687290368L, 149881);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "dealOrientationChange");
    this.xzk.xzl.QU = 0;
    GMTrace.o(20116687290368L, 149881);
  }
  
  public final void oI()
  {
    GMTrace.i(20116821508096L, 149882);
    this.tta = null;
    GMTrace.o(20116821508096L, 149882);
  }
  
  public final void oJ()
  {
    GMTrace.i(20117089943552L, 149884);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideCustomBtn");
    this.xzl.xCA = true;
    GMTrace.o(20117089943552L, 149884);
  }
  
  public final void oK()
  {
    GMTrace.i(20117224161280L, 149885);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "[hideDefaultBtn]");
    this.xzl.xCB = true;
    GMTrace.o(20117224161280L, 149885);
  }
  
  public final void oL()
  {
    GMTrace.i(20118834774016L, 149897);
    Object localObject;
    if (this.xzk != null)
    {
      localObject = this.xzk;
      if ((((com.tencent.mm.view.e.a)localObject).xBS != null) && (((com.tencent.mm.view.e.a)localObject).xzl != null)) {
        break label66;
      }
    }
    for (;;)
    {
      if (this.xzl != null)
      {
        com.tencent.mm.bq.a.bOv();
        localObject = com.tencent.mm.bq.a.veh;
        a.b.Rr("TAG_DEFAULT_TAB");
      }
      GMTrace.o(20118834774016L, 149897);
      return;
      label66:
      if (!((com.tencent.mm.view.e.a)localObject).xCg)
      {
        ((com.tencent.mm.view.e.a)localObject).xCh = "TAG_DEFAULT_TAB";
      }
      else
      {
        ((com.tencent.mm.view.e.a)localObject).xCh = null;
        ((com.tencent.mm.view.e.a)localObject).xBS.post(new a.3((com.tencent.mm.view.e.a)localObject, "TAG_DEFAULT_TAB"));
      }
    }
  }
  
  public final void oM()
  {
    GMTrace.i(20118700556288L, 149896);
    this.xzl.xCI = true;
    GMTrace.o(20118700556288L, 149896);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(20118566338560L, 149895);
    if (this.iNp)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(20118566338560L, 149895);
  }
  
  public final void onPause()
  {
    GMTrace.i(20116150419456L, 149877);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
    this.xzl.onPause();
    GMTrace.o(20116150419456L, 149877);
  }
  
  public final void onResume()
  {
    GMTrace.i(20116016201728L, 149876);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
    Object localObject = this.xzl;
    ((com.tencent.mm.view.f.a)localObject).xCF = true;
    ((com.tencent.mm.view.f.a)localObject).cly();
    ((com.tencent.mm.view.f.a)localObject).clp();
    localObject = this.xzk;
    ((com.tencent.mm.view.e.a)localObject).clh();
    ((com.tencent.mm.view.e.a)localObject).clj();
    GMTrace.o(20116016201728L, 149876);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20118029467648L, 149891);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(20118029467648L, 149891);
  }
  
  public final void refresh()
  {
    GMTrace.i(20116955725824L, 149883);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "reflesh");
    try
    {
      if (this.xzl != null)
      {
        com.tencent.mm.view.e.a locala = this.xzk;
        if (locala != null) {}
      }
      else
      {
        GMTrace.o(20116955725824L, 149883);
        return;
      }
      this.xzk.clk();
      GMTrace.o(20116955725824L, 149883);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.emoji.SmileyPanel.SmileyPanel", localException, "", new Object[0]);
      GMTrace.o(20116955725824L, 149883);
    }
  }
  
  public void setVisibility(int paramInt)
  {
    int i = 0;
    GMTrace.i(20118163685376L, 149892);
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.iNp = false;
      if (this.xzk != null)
      {
        com.tencent.mm.view.e.a locala = this.xzk;
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initView begin");
        Object localObject;
        if (this != null)
        {
          if ((locala.mView != null) && (getChildCount() > 0))
          {
            w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "already load view --- pass");
            locala.clf();
            GMTrace.o(20118163685376L, 149892);
            return;
          }
          if (locala.xzl == null)
          {
            w.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "mPanelStg is null");
            GMTrace.o(20118163685376L, 149892);
            return;
          }
          locala.xzl.xCP = false;
          if (locala.mView != null) {
            break label516;
          }
          locala.mView = View.inflate(locala.sN, a.f.kwu, null);
          locala.xBS = ((SmileyPanelViewPager)locala.findViewById(a.e.cfq));
          locala.xBS.xzl = locala.xzl;
          locala.xBS.xzM = locala;
          locala.xBS.b(locala);
          locala.xBS.DU(3);
          locala.xzl.iPK = locala.xBS.getWidth();
          locala.xBU = ((SmileyPanelScrollView)locala.findViewById(a.e.cfp));
          locala.xBU.xzm = locala;
          locala.xBU.xzn = locala.xzl;
          locala.xBV = ((HorizontalListViewV2)locala.findViewById(a.e.kwi));
          locala.xBW = new com.tencent.mm.view.a.e(locala.iPn, locala.xzl);
          locala.xBV.setAdapter(locala.xBW);
          locala.xBV.setOnItemClickListener(locala.xCj);
          locala.xCc = ((TextView)locala.findViewById(a.e.ccc));
          locala.xBY = ((ImageView)locala.findViewById(a.e.kwg));
          locala.xBY.setOnClickListener(locala);
          locala.xBX = locala.findViewById(a.e.kwf);
          locala.xBZ = ((ImageView)locala.findViewById(a.e.kwh));
          locala.xCc.setOnClickListener(locala);
          localObject = locala.xCc;
          if (!locala.xzl.cls()) {
            break label546;
          }
          paramInt = 0;
          label381:
          ((TextView)localObject).setVisibility(paramInt);
          addView(locala.mView, new LinearLayout.LayoutParams(-1, -1));
          locala.xzl.xCP = true;
          localObject = locala.xBX;
          if ((!locala.xzl.xCA) && (!locala.xzl.xCB)) {
            break label552;
          }
          paramInt = 8;
          label441:
          ((View)localObject).setVisibility(paramInt);
          locala.xCb = ((ImageButton)locala.findViewById(a.e.kwe));
          locala.xCb.setOnClickListener(locala);
          localObject = locala.xCb;
          if ((!locala.xzl.xCB) || (locala.xzl.gRb != ChatFooterPanel.ttf)) {
            break label557;
          }
        }
        label516:
        label546:
        label552:
        label557:
        for (paramInt = i;; paramInt = 8)
        {
          ((ImageButton)localObject).setVisibility(paramInt);
          GMTrace.o(20118163685376L, 149892);
          return;
          if (locala.mView.getParent() == null) {
            break;
          }
          ((ViewGroup)locala.mView.getParent()).removeView(locala.mView);
          break;
          paramInt = 8;
          break label381;
          paramInt = 0;
          break label441;
        }
      }
      w.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley Panel Manager is null.");
      GMTrace.o(20118163685376L, 149892);
      return;
    }
    if (this.xzl != null)
    {
      this.xzl.clx();
      GMTrace.o(20118163685376L, 149892);
      return;
    }
    w.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley PanelStg Manager is null.");
    GMTrace.o(20118163685376L, 149892);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\SmileyPanelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
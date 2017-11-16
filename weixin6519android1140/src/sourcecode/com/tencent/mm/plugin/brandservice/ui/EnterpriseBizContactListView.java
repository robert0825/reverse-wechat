package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.f;
import com.tencent.mm.af.m.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.p;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EnterpriseBizContactListView
  extends BaseSortView
{
  boolean juC;
  private ListView juD;
  int juE;
  b juF;
  private a juG;
  private int juH;
  private int juI;
  String juv;
  
  public EnterpriseBizContactListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10862509162496L, 80932);
    this.juE = -1;
    this.juH = 0;
    this.juI = 0;
    GMTrace.o(10862509162496L, 80932);
  }
  
  public static void release()
  {
    GMTrace.i(10862911815680L, 80935);
    com.tencent.mm.af.x.FO().FA();
    GMTrace.o(10862911815680L, 80935);
  }
  
  public final boolean a(String paramString, com.tencent.mm.ui.base.sortview.d paramd)
  {
    GMTrace.i(20419079831552L, 152134);
    if ((!bg.nm(paramString)) && (paramd != null))
    {
      Object localObject = (b)paramd.data;
      if (localObject == null)
      {
        GMTrace.o(20419079831552L, 152134);
        return false;
      }
      paramd = ((b)localObject).iBi.vk();
      String str = ((b)localObject).iBi.qR();
      localObject = ((b)localObject).iBi.qS();
      paramString = paramString.toUpperCase();
      if (((!bg.nm(paramd)) && (paramd.toUpperCase().indexOf(paramString) != -1)) || ((!bg.nm(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bg.nm((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        GMTrace.o(20419079831552L, 152134);
        return true;
      }
    }
    GMTrace.o(20419079831552L, 152134);
    return false;
  }
  
  public final void aip()
  {
    GMTrace.i(10862777597952L, 80934);
    this.WC = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10866267258880L, 80960);
        paramAnonymousAdapterView = paramAnonymousView.getTag();
        if ((paramAnonymousAdapterView == null) || (!(paramAnonymousAdapterView instanceof EnterpriseBizContactListView.c)))
        {
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        EnterpriseBizContactListView.c localc = (EnterpriseBizContactListView.c)paramAnonymousAdapterView;
        if (bg.nm(localc.username))
        {
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        boolean bool1 = f.iQ(localc.username);
        boolean bool2 = f.dL(localc.username);
        com.tencent.mm.af.d locald = f.iK(localc.username);
        if (locald == null) {}
        for (paramAnonymousAdapterView = null;; paramAnonymousAdapterView = locald.EJ())
        {
          paramAnonymousView = paramAnonymousAdapterView;
          if (paramAnonymousAdapterView == null) {
            paramAnonymousView = "";
          }
          if (!bool1) {
            break;
          }
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("rawUrl", paramAnonymousView);
          paramAnonymousAdapterView.putExtra("useJs", true);
          paramAnonymousAdapterView.putExtra("srcUsername", localc.username);
          paramAnonymousAdapterView.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          paramAnonymousAdapterView.addFlags(67108864);
          com.tencent.mm.bj.d.b(EnterpriseBizContactListView.this.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousAdapterView);
          EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, locald, 2);
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        if (bool2)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("Contact_User", localc.username);
          paramAnonymousAdapterView.addFlags(67108864);
          paramAnonymousAdapterView.putExtra("biz_chat_from_scene", 3);
          com.tencent.mm.bj.d.a(EnterpriseBizContactListView.this.getContext(), ".ui.bizchat.BizChatConversationUI", paramAnonymousAdapterView);
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        paramAnonymousAdapterView = new Intent();
        paramAnonymousAdapterView.addFlags(67108864);
        paramAnonymousAdapterView.putExtra("finish_direct", true);
        paramAnonymousAdapterView.putExtra("Chat_User", localc.username);
        paramAnonymousAdapterView.putExtra("chat_from_scene", 2);
        paramAnonymousView = EnterpriseBizContactListView.this.getContext();
        w.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
        com.tencent.mm.plugin.brandservice.a.hnH.e(paramAnonymousAdapterView, paramAnonymousView);
        EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, locald, 1);
        GMTrace.o(10866267258880L, 80960);
      }
    };
    if (this.mMode == 0) {
      this.wlu = new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(10891634409472L, 81149);
          if (EnterpriseBizContactListView.a(EnterpriseBizContactListView.this) == null) {
            EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, new EnterpriseBizContactListView.a(EnterpriseBizContactListView.this));
          }
          EnterpriseBizContactListView.a locala = EnterpriseBizContactListView.a(EnterpriseBizContactListView.this);
          int i = EnterpriseBizContactListView.b(EnterpriseBizContactListView.this);
          int j = EnterpriseBizContactListView.c(EnterpriseBizContactListView.this);
          if (locala.juL == null)
          {
            localObject = (EnterpriseBizContactListView)locala.juM.get();
            if (localObject == null)
            {
              GMTrace.o(10891634409472L, 81149);
              return false;
            }
            locala.juL = new com.tencent.mm.ui.widget.h(((EnterpriseBizContactListView)localObject).getContext());
          }
          Object localObject = paramAnonymousView.getTag();
          if ((localObject == null) || (!(localObject instanceof EnterpriseBizContactListView.c)))
          {
            GMTrace.o(10891634409472L, 81149);
            return false;
          }
          locala.juK = ((EnterpriseBizContactListView.c)localObject).username;
          if ((bg.nm(locala.juK)) || (f.dL(locala.juK)))
          {
            GMTrace.o(10891634409472L, 81149);
            return false;
          }
          locala.juL.xqF = paramAnonymousView;
          locala.juL.a(paramAnonymousAdapterView, paramAnonymousInt, paramAnonymousLong, new EnterpriseBizContactListView.a.1(locala, paramAnonymousInt), new EnterpriseBizContactListView.a.2(locala), i, j);
          GMTrace.o(10891634409472L, 81149);
          return true;
        }
      };
    }
    GMTrace.o(10862777597952L, 80934);
  }
  
  public final VerticalScrollBar aiq()
  {
    GMTrace.i(10863314468864L, 80938);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(R.h.ceR);
    GMTrace.o(10863314468864L, 80938);
    return localVerticalScrollBar;
  }
  
  public final View air()
  {
    GMTrace.i(10863582904320L, 80940);
    TextView localTextView = (TextView)findViewById(R.h.bRg);
    localTextView.setText(R.l.dqg);
    GMTrace.o(10863582904320L, 80940);
    return localTextView;
  }
  
  public final c.a ais()
  {
    GMTrace.i(20419214049280L, 152135);
    c.a local3 = new c.a()
    {
      public final View a(com.tencent.mm.ui.base.sortview.d paramAnonymousd, View paramAnonymousView, int paramAnonymousInt, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(20419348267008L, 152136);
        long l = bg.Pw();
        Context localContext = EnterpriseBizContactListView.this.getContext();
        EnterpriseBizContactListView.c localc;
        if (paramAnonymousView == null)
        {
          paramAnonymousView = LayoutInflater.from(localContext).inflate(R.i.cvk, null);
          localc = new EnterpriseBizContactListView.c();
          localc.jtq = ((TextView)paramAnonymousView.findViewById(R.h.blV));
          localc.hqF = paramAnonymousView.findViewById(R.h.brR);
          localc.hqG = ((ImageView)paramAnonymousView.findViewById(R.h.bee));
          localc.juQ = ((ImageView)paramAnonymousView.findViewById(R.h.bQJ));
          localc.jpV = ((TextView)paramAnonymousView.findViewById(R.h.biv));
          localc.juR = paramAnonymousView.findViewById(R.h.cbU);
          paramAnonymousView.setTag(localc);
        }
        b localb;
        for (;;)
        {
          localb = (b)paramAnonymousd.data;
          if (localb != null) {
            break;
          }
          w.e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
          GMTrace.o(20419348267008L, 152136);
          return paramAnonymousView;
          localc = (EnterpriseBizContactListView.c)paramAnonymousView.getTag();
        }
        paramAnonymousInt = 0;
        if (localb.jsU.EH()) {
          paramAnonymousInt = 1;
        }
        if ((EnterpriseBizContactListView.this.wlw) && (paramAnonymousBoolean1)) {
          if (paramAnonymousd.wlE.equals("!2"))
          {
            localc.jtq.setText(EnterpriseBizContactListView.this.getContext().getString(R.l.dql));
            localc.jtq.setVisibility(0);
            if (paramAnonymousInt == 0) {
              break label530;
            }
            localc.username = localb.userName;
            localc.hqG.setImageResource(R.k.cMc);
            paramAnonymousd = EnterpriseBizContactListView.this.getResources().getString(R.l.dpT);
            EnterpriseBizContactListView.a(localc.jpV, localContext, paramAnonymousd, (int)localc.jpV.getTextSize());
            label312:
            w.v("MicroMsg.BrandService.EnterpriseBizContactListView", "bizinfo status%d", new Object[] { Integer.valueOf(localb.jsU.field_status) });
            paramAnonymousd = localc.juQ;
            if (localb.jsU.field_status != 1) {
              break label611;
            }
            paramAnonymousInt = 0;
            label357:
            paramAnonymousd.setVisibility(paramAnonymousInt);
            if ((EnterpriseBizContactListView.this.mMode != 0) || (!paramAnonymousBoolean2)) {
              break label617;
            }
            localc.juR.setBackgroundResource(R.g.aVP);
            label388:
            if (!EnterpriseBizContactListView.this.wlx) {
              break label631;
            }
            localc.hqF.setPadding(localc.hqF.getPaddingLeft(), localc.hqF.getPaddingTop(), (int)EnterpriseBizContactListView.this.getContext().getResources().getDimension(R.f.aPu), localc.hqF.getPaddingBottom());
          }
        }
        for (;;)
        {
          w.v("MicroMsg.BrandService.EnterpriseBizContactListView", "get view use %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
          GMTrace.o(20419348267008L, 152136);
          return paramAnonymousView;
          if (!paramAnonymousd.wlE.equals("!1"))
          {
            localc.jtq.setText(paramAnonymousd.wlE);
            localc.jtq.setVisibility(0);
            break;
          }
          localc.jtq.setVisibility(8);
          break;
          label530:
          localc.username = localb.userName;
          localc.iconUrl = localb.jsU.field_brandIconURL;
          localc.hqG.setTag(localb.userName);
          a.b.a(localc.hqG, localc.username);
          paramAnonymousd = localb.iBi.vk();
          EnterpriseBizContactListView.a(localc.jpV, localContext, paramAnonymousd, (int)localc.jpV.getTextSize());
          break label312;
          label611:
          paramAnonymousInt = 8;
          break label357;
          label617:
          localc.juR.setBackgroundResource(R.g.aXC);
          break label388;
          label631:
          localc.hqF.setPadding(localc.hqF.getPaddingLeft(), localc.hqF.getPaddingTop(), (int)EnterpriseBizContactListView.this.getContext().getResources().getDimension(R.f.aQE), localc.hqF.getPaddingBottom());
        }
      }
    };
    GMTrace.o(20419214049280L, 152135);
    return local3;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16256048562176L, 121117);
    if (paramMotionEvent.getAction() == 0)
    {
      this.juH = ((int)paramMotionEvent.getRawX());
      this.juI = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(16256048562176L, 121117);
    return bool;
  }
  
  public final ListView getListView()
  {
    GMTrace.i(10863448686592L, 80939);
    this.juD = ((ListView)findViewById(R.h.bKn));
    ListView localListView = this.juD;
    GMTrace.o(10863448686592L, 80939);
    return localListView;
  }
  
  public final View inflate()
  {
    GMTrace.i(10863180251136L, 80937);
    View localView = View.inflate(getContext(), R.i.cvn, this);
    GMTrace.o(10863180251136L, 80937);
    return localView;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10863851339776L, 80942);
    if (this.juF != null) {
      this.juF.aio();
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      GMTrace.o(10863851339776L, 80942);
      return true;
    }
    GMTrace.o(10863851339776L, 80942);
    return false;
  }
  
  public final void refresh()
  {
    GMTrace.i(10862643380224L, 80933);
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.af.x.FG();
    Cursor localCursor = com.tencent.mm.af.e.v(this.juv, this.juC);
    while (localCursor.moveToNext())
    {
      b localb = new b();
      Object localObject;
      if (localCursor != null)
      {
        localObject = new com.tencent.mm.storage.x();
        ((com.tencent.mm.storage.x)localObject).b(localCursor);
        com.tencent.mm.af.d locald = new com.tencent.mm.af.d();
        locald.b(localCursor);
        localb.userName = ((af)localObject).field_username;
        localb.iBi = ((com.tencent.mm.storage.x)localObject);
        localb.jsU = locald;
      }
      if (localb.iBi != null)
      {
        localObject = new com.tencent.mm.ui.base.sortview.d();
        ((com.tencent.mm.ui.base.sortview.d)localObject).data = localb;
        if (localb.jsU.EH()) {
          ((com.tencent.mm.ui.base.sortview.d)localObject).wlE = "!1";
        }
        for (;;)
        {
          localArrayList.add(localObject);
          break;
          if (localb.iBi.vf())
          {
            ((com.tencent.mm.ui.base.sortview.d)localObject).wlE = "!2";
          }
          else
          {
            int j = localb.iBi.ux();
            int i = j;
            if (j >= 97)
            {
              i = j;
              if (j <= 122) {
                i = j - 32;
              }
            }
            if ((i >= 65) && (i <= 90)) {
              ((com.tencent.mm.ui.base.sortview.d)localObject).wlE = ((char)i);
            } else {
              ((com.tencent.mm.ui.base.sortview.d)localObject).wlE = "#";
            }
          }
        }
      }
    }
    localCursor.close();
    this.juE = localArrayList.size();
    Collections.sort(localArrayList, new d());
    cA(localArrayList);
    super.refresh();
    GMTrace.o(10862643380224L, 80933);
  }
  
  private static final class a
    implements com.tencent.mm.ad.e
  {
    public r hsU;
    public String juK;
    com.tencent.mm.ui.widget.h juL;
    WeakReference<EnterpriseBizContactListView> juM;
    
    public a(EnterpriseBizContactListView paramEnterpriseBizContactListView)
    {
      GMTrace.i(10861972291584L, 80928);
      this.juM = new WeakReference(paramEnterpriseBizContactListView);
      GMTrace.o(10861972291584L, 80928);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(10862240727040L, 80930);
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.dismiss();
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(10862240727040L, 80930);
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
            w.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(((bia)localObject).tWa.ret) });
            GMTrace.o(10862240727040L, 80930);
            return;
          }
          w.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramk.getType()) });
          GMTrace.o(10862240727040L, 80930);
          return;
        }
        if (!paramString.uTG)
        {
          GMTrace.o(10862240727040L, 80930);
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
        }
        for (;;)
        {
          paramString = (EnterpriseBizContactListView)this.juM.get();
          if (paramString != null) {
            break;
          }
          GMTrace.o(10862240727040L, 80930);
          return;
          at.AR();
          com.tencent.mm.y.c.yO().Tj(paramk.field_enterpriseFather);
        }
        paramString.refresh();
      }
      GMTrace.o(10862240727040L, 80930);
    }
    
    protected final void finalize()
    {
      GMTrace.i(10862106509312L, 80929);
      at.wS().b(1394, this);
      super.finalize();
      GMTrace.o(10862106509312L, 80929);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean aio();
  }
  
  public static final class c
  {
    public View hqF;
    ImageView hqG;
    String iconUrl;
    TextView jpV;
    public TextView jtq;
    ImageView juQ;
    View juR;
    String username;
    
    public c()
    {
      GMTrace.i(10888010530816L, 81122);
      GMTrace.o(10888010530816L, 81122);
    }
  }
  
  private final class d
    implements Comparator<com.tencent.mm.ui.base.sortview.d>
  {
    public d()
    {
      GMTrace.i(10909753802752L, 81284);
      GMTrace.o(10909753802752L, 81284);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\EnterpriseBizContactListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
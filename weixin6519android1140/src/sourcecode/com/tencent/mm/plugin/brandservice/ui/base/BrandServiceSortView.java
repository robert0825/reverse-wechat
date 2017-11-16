package com.tencent.mm.plugin.brandservice.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
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
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.f;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.brandservice.a.d.a;
import com.tencent.mm.plugin.brandservice.a.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.BaseSortView.a;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BrandServiceSortView
  extends BaseSortView
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener, d.a, BaseSortView.a
{
  private boolean NQ;
  private String iAx;
  private int juH;
  private int juI;
  private com.tencent.mm.ui.widget.h juL;
  public boolean juq;
  private boolean jvA;
  private ListView jvB;
  public a jvC;
  private String jvD;
  private View jvE;
  private TextView jvF;
  private p.d jvG;
  private HashMap<String, SpannableString> jvx;
  private com.tencent.mm.plugin.brandservice.a.d jvy;
  private int jvz;
  
  public BrandServiceSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10900492779520L, 81215);
    this.jvx = new HashMap();
    this.jvy = new com.tencent.mm.plugin.brandservice.a.d();
    this.jvz = 251658241;
    this.juH = 0;
    this.juI = 0;
    this.jvG = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(10905458835456L, 81252);
        if (bg.nm(BrandServiceSortView.d(BrandServiceSortView.this)))
        {
          w.i("MicroMsg.BrandServiceSortView", "username is null or nil.");
          GMTrace.o(10905458835456L, 81252);
          return;
        }
        if (paramAnonymousMenuItem.getItemId() == 0)
        {
          w.i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", new Object[] { Integer.valueOf(paramAnonymousInt) });
          at.AR();
          com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(BrandServiceSortView.d(BrandServiceSortView.this));
          com.tencent.mm.af.d locald = f.iK(BrandServiceSortView.d(BrandServiceSortView.this));
          BrandServiceSortView.a(BrandServiceSortView.this, locald, BrandServiceSortView.this.getContext(), localx, paramAnonymousMenuItem.getGroupId());
        }
        GMTrace.o(10905458835456L, 81252);
      }
    };
    this.jvA = false;
    L(false);
    refresh();
    paramContext = this.jvy;
    if ((this != null) && (!paramContext.jsW.contains(this)))
    {
      w.i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
      paramContext.jsW.add(this);
    }
    this.juL = new com.tencent.mm.ui.widget.h(getContext());
    this.wly = this;
    this.WC = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10894050328576L, 81167);
        paramAnonymousAdapterView = paramAnonymousView.getTag();
        if ((paramAnonymousAdapterView == null) || (!(paramAnonymousAdapterView instanceof BrandServiceSortView.b)))
        {
          w.w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
          GMTrace.o(10894050328576L, 81167);
          return;
        }
        paramAnonymousView = (BrandServiceSortView.b)paramAnonymousAdapterView;
        if (bg.nm(paramAnonymousView.username))
        {
          w.w("MicroMsg.BrandServiceSortView", "username is null or nil.");
          GMTrace.o(10894050328576L, 81167);
          return;
        }
        com.tencent.mm.az.g.kJ(paramAnonymousView.username);
        u.k(BrandServiceSortView.a(BrandServiceSortView.this), 12, 4, paramAnonymousInt - 1);
        if (BrandServiceSortView.b(BrandServiceSortView.this))
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("Select_Contact", paramAnonymousView.username);
          paramAnonymousAdapterView.putExtra("Select_Conv_User", paramAnonymousView.username);
          if ((BrandServiceSortView.this.getContext() instanceof Activity))
          {
            paramAnonymousView = (Activity)BrandServiceSortView.this.getContext();
            paramAnonymousView.setResult(-1, paramAnonymousAdapterView);
            paramAnonymousView.finish();
            GMTrace.o(10894050328576L, 81167);
            return;
          }
        }
        paramAnonymousView = paramAnonymousView.username;
        paramAnonymousAdapterView = BrandServiceSortView.this.getContext();
        w.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
        paramAnonymousView = new Intent().putExtra("Chat_User", paramAnonymousView);
        paramAnonymousView.putExtra("finish_direct", true);
        paramAnonymousView.putExtra("img_gallery_enter_from_chatting_ui", true);
        a.hnH.e(paramAnonymousView, paramAnonymousAdapterView);
        GMTrace.o(10894050328576L, 81167);
      }
    };
    this.wlu = this;
    GMTrace.o(10900492779520L, 81215);
  }
  
  public final void L(boolean paramBoolean)
  {
    GMTrace.i(10902237609984L, 81228);
    this.NQ = paramBoolean;
    o(this.jvF, paramBoolean);
    GMTrace.o(10902237609984L, 81228);
  }
  
  public final void Y(List<com.tencent.mm.ui.base.sortview.d> paramList)
  {
    GMTrace.i(10902103392256L, 81227);
    if ((this.jvF != null) && (paramList != null)) {
      this.jvF.setText(getContext().getString(R.l.dbz, new Object[] { Integer.valueOf(paramList.size()) }));
    }
    GMTrace.o(10902103392256L, 81227);
  }
  
  public final boolean a(String paramString, com.tencent.mm.ui.base.sortview.d paramd)
  {
    GMTrace.i(20420287791104L, 152143);
    if ((!bg.nm(paramString)) && (paramd != null))
    {
      this.jvD = paramString;
      paramd = (b)paramd.data;
      if ((paramd == null) || (paramd.iBi == null))
      {
        w.w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
        GMTrace.o(20420287791104L, 152143);
        return false;
      }
      Object localObject = paramd.iBi;
      paramd = ((com.tencent.mm.storage.x)localObject).vk();
      String str = ((com.tencent.mm.storage.x)localObject).qR();
      localObject = ((com.tencent.mm.storage.x)localObject).qS();
      paramString = paramString.toUpperCase();
      if (((!bg.nm(paramd)) && (paramd.toUpperCase().indexOf(paramString) != -1)) || ((!bg.nm(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bg.nm((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        GMTrace.o(20420287791104L, 152143);
        return true;
      }
    }
    GMTrace.o(20420287791104L, 152143);
    return false;
  }
  
  public final void aic()
  {
    GMTrace.i(10901700739072L, 81224);
    refresh();
    GMTrace.o(10901700739072L, 81224);
  }
  
  public final VerticalScrollBar aiq()
  {
    GMTrace.i(10901163868160L, 81220);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(R.h.ceR);
    GMTrace.o(10901163868160L, 81220);
    return localVerticalScrollBar;
  }
  
  public final View air()
  {
    GMTrace.i(10901432303616L, 81222);
    View localView = findViewById(R.h.bRg);
    GMTrace.o(10901432303616L, 81222);
    return localView;
  }
  
  public final c.a ais()
  {
    GMTrace.i(20420422008832L, 152144);
    c.a local2 = new c.a()
    {
      public final View a(com.tencent.mm.ui.base.sortview.d paramAnonymousd, View paramAnonymousView, int paramAnonymousInt, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(20420153573376L, 152142);
        long l = bg.Pw();
        Context localContext = BrandServiceSortView.this.getContext();
        BrandServiceSortView.b localb;
        if (paramAnonymousView == null)
        {
          paramAnonymousView = LayoutInflater.from(localContext).inflate(R.i.cqA, null);
          localb = new BrandServiceSortView.b();
          localb.jtq = ((TextView)paramAnonymousView.findViewById(R.h.blV));
          localb.hqF = paramAnonymousView.findViewById(R.h.brR);
          localb.hqG = ((ImageView)paramAnonymousView.findViewById(R.h.bee));
          localb.juQ = ((ImageView)paramAnonymousView.findViewById(R.h.bQJ));
          localb.jpV = ((TextView)paramAnonymousView.findViewById(R.h.biv));
          localb.juR = paramAnonymousView.findViewById(R.h.cbU);
          paramAnonymousView.setTag(localb);
        }
        b localb1;
        for (;;)
        {
          localb1 = (b)paramAnonymousd.data;
          if (localb1 != null) {
            break;
          }
          w.e("MicroMsg.BrandServiceSortView", "should not be empty");
          GMTrace.o(20420153573376L, 152142);
          return paramAnonymousView;
          localb = (BrandServiceSortView.b)paramAnonymousView.getTag();
        }
        if ((BrandServiceSortView.this.wlw) && (paramAnonymousBoolean1))
        {
          localb.jtq.setText(paramAnonymousd.wlE);
          localb.jtq.setVisibility(0);
          localb.username = localb1.userName;
          localb.iconUrl = localb1.jsU.field_brandIconURL;
          localb.hqG.setTag(localb1.userName);
          localb.aiz();
          paramAnonymousd = localb1.iBi.vk();
          BrandServiceSortView.a(BrandServiceSortView.this, localb.jpV, localContext, paramAnonymousd, (int)localb.jpV.getTextSize());
          w.v("MicroMsg.BrandServiceSortView", "bizinfo status%d", new Object[] { Integer.valueOf(localb1.jsU.field_status) });
          paramAnonymousd = localb.juQ;
          if ((!BrandServiceSortView.c(BrandServiceSortView.this)) || (localb1.jsU.field_status != 1)) {
            break label482;
          }
          paramAnonymousInt = 0;
          label346:
          paramAnonymousd.setVisibility(paramAnonymousInt);
          if ((BrandServiceSortView.this.mMode != 0) || (!paramAnonymousBoolean2)) {
            break label488;
          }
          localb.juR.setBackgroundResource(R.g.aVP);
          label377:
          if (!BrandServiceSortView.this.wlx) {
            break label502;
          }
          localb.hqF.setPadding(localb.hqF.getPaddingLeft(), localb.hqF.getPaddingTop(), (int)BrandServiceSortView.this.getContext().getResources().getDimension(R.f.aPu), localb.hqF.getPaddingBottom());
        }
        for (;;)
        {
          w.v("MicroMsg.BrandServiceSortView", "get view use %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
          GMTrace.o(20420153573376L, 152142);
          return paramAnonymousView;
          localb.jtq.setVisibility(8);
          break;
          label482:
          paramAnonymousInt = 8;
          break label346;
          label488:
          localb.juR.setBackgroundResource(R.g.aXC);
          break label377;
          label502:
          localb.hqF.setPadding(localb.hqF.getPaddingLeft(), localb.hqF.getPaddingTop(), (int)BrandServiceSortView.this.getContext().getResources().getDimension(R.f.aQE), localb.hqF.getPaddingBottom());
        }
      }
    };
    GMTrace.o(20420422008832L, 152144);
    return local2;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15571538149376L, 116017);
    if (paramMotionEvent.getAction() == 0)
    {
      this.juH = ((int)paramMotionEvent.getRawX());
      this.juI = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(15571538149376L, 116017);
    return bool;
  }
  
  public final ListView getListView()
  {
    GMTrace.i(10901298085888L, 81221);
    this.jvB = ((ListView)findViewById(R.h.bKn));
    if (this.jvE == null)
    {
      this.jvE = inflate(getContext(), R.i.cue, null);
      if ((this.jvB != null) && (this.jvE != null))
      {
        this.jvF = ((TextView)this.jvE.findViewById(R.h.bse));
        this.jvB.addFooterView(this.jvE, null, false);
      }
    }
    ListView localListView = this.jvB;
    GMTrace.o(10901298085888L, 81221);
    return localListView;
  }
  
  public final View inflate()
  {
    GMTrace.i(10901029650432L, 81219);
    View localView = View.inflate(getContext(), R.i.cqB, this);
    GMTrace.o(10901029650432L, 81219);
    return localView;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(10901969174528L, 81226);
    if (paramContextMenuInfo == null)
    {
      w.i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    w.i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (com.tencent.mm.ui.base.sortview.d)((AdapterView)paramView).getItemAtPosition(paramContextMenuInfo.position);
    if ((paramView == null) || (paramView.data == null))
    {
      w.i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", new Object[] { paramView });
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    paramView = ((b)paramView.data).iBi;
    if (paramView == null)
    {
      w.e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    this.iAx = paramView.field_username;
    String str = paramView.vk();
    paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), str));
    paramView = f.iK(paramView.field_username);
    if ((paramView != null) && (!paramView.EE())) {
      paramContextMenu.add(paramContextMenuInfo.position, 0, 0, R.l.dHM);
    }
    GMTrace.o(10901969174528L, 81226);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10902371827712L, 81229);
    if (this.jvC != null) {
      this.jvC.aio();
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      GMTrace.o(10902371827712L, 81229);
      return true;
    }
    GMTrace.o(10902371827712L, 81229);
    return false;
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(10901834956800L, 81225);
    this.juL.xqF = paramView;
    this.juL.a(paramAdapterView, paramInt, paramLong, this, this.jvG, this.juH, this.juI);
    GMTrace.o(10901834956800L, 81225);
    return true;
  }
  
  public final void refresh()
  {
    GMTrace.i(10900626997248L, 81216);
    this.jvy.init();
    Object localObject = this.jvy;
    ArrayList localArrayList;
    int i;
    label67:
    com.tencent.mm.ui.base.sortview.d locald;
    int j;
    switch (this.jvz)
    {
    default: 
      localObject = ((com.tencent.mm.plugin.brandservice.a.d)localObject).jsZ;
      if (localObject == null) {
        break label244;
      }
      localArrayList = new ArrayList();
      i = 0;
      if (i >= ((List)localObject).size()) {
        break label220;
      }
      b localb = (b)((List)localObject).get(i);
      if ((localb != null) && (localb.iBi != null))
      {
        locald = new com.tencent.mm.ui.base.sortview.d();
        locald.data = localb;
        int k = localb.iBi.field_showHead;
        j = k;
        if (k >= 97)
        {
          j = k;
          if (k <= 122) {
            j = k - 32;
          }
        }
        if ((j < 65) || (j > 90)) {
          break label209;
        }
      }
      break;
    }
    label209:
    for (locald.wlE = ((char)j);; locald.wlE = "#")
    {
      localArrayList.add(locald);
      i += 1;
      break label67;
      localObject = ((com.tencent.mm.plugin.brandservice.a.d)localObject).jsY;
      break;
    }
    label220:
    label244:
    for (localObject = localArrayList;; localObject = null)
    {
      cA((List)localObject);
      super.refresh();
      GMTrace.o(10900626997248L, 81216);
      return;
    }
  }
  
  public final void release()
  {
    GMTrace.i(10900761214976L, 81217);
    if (at.AU()) {
      com.tencent.mm.af.x.FO().FA();
    }
    Object localObject1 = this.jvy;
    if (this == null)
    {
      w.w("MicroMsg.BrandService.BrandServiceMgr", "removeListener:onChange is null");
      ((com.tencent.mm.plugin.brandservice.a.d)localObject1).jsW.remove(null);
    }
    Object localObject2 = this.jvy;
    at.wS().b(387, (com.tencent.mm.ad.e)localObject2);
    if (((com.tencent.mm.plugin.brandservice.a.d)localObject2).jsX)
    {
      localObject1 = new ArrayList(((com.tencent.mm.plugin.brandservice.a.d)localObject2).jsY.size() + ((com.tencent.mm.plugin.brandservice.a.d)localObject2).jsZ.size());
      Iterator localIterator = ((com.tencent.mm.plugin.brandservice.a.d)localObject2).jsY.iterator();
      while (localIterator.hasNext()) {
        ((List)localObject1).add((b)localIterator.next());
      }
      localObject2 = ((com.tencent.mm.plugin.brandservice.a.d)localObject2).jsZ.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((List)localObject1).add((b)((Iterator)localObject2).next());
      }
      at.wS().a(new k((List)localObject1), 0);
    }
    GMTrace.o(10900761214976L, 81217);
  }
  
  public static abstract interface a
  {
    public abstract boolean aio();
  }
  
  public static final class b
    implements m.a.a
  {
    static Bitmap jvJ;
    public View hqF;
    ImageView hqG;
    String iconUrl;
    TextView jpV;
    public TextView jtq;
    ImageView juQ;
    View juR;
    String username;
    
    static
    {
      GMTrace.i(10893781893120L, 81165);
      jvJ = null;
      GMTrace.o(10893781893120L, 81165);
    }
    
    public b()
    {
      GMTrace.i(10893379239936L, 81162);
      com.tencent.mm.af.x.FO().a(this);
      GMTrace.o(10893379239936L, 81162);
    }
    
    public final void aiz()
    {
      GMTrace.i(10893513457664L, 81163);
      if (this.hqG == null)
      {
        GMTrace.o(10893513457664L, 81163);
        return;
      }
      Bitmap localBitmap = com.tencent.mm.af.m.d(this.username, this.iconUrl, 0);
      if (localBitmap != null)
      {
        if ((bg.nm(this.username)) || (this.hqG.getTag() == null))
        {
          w.e("MicroMsg.BrandServiceSortView", "error in refreshAvatar, %s", new Object[] { this.username });
          GMTrace.o(10893513457664L, 81163);
          return;
        }
        if (this.username.equals(this.hqG.getTag()))
        {
          this.hqG.setImageBitmap(localBitmap);
          GMTrace.o(10893513457664L, 81163);
        }
      }
      else
      {
        this.hqG.setImageResource(R.g.aUD);
      }
      GMTrace.o(10893513457664L, 81163);
    }
    
    public final void ja(String paramString)
    {
      GMTrace.i(10893647675392L, 81164);
      if ((paramString != null) && (paramString.equals(this.username))) {
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10892976586752L, 81159);
            BrandServiceSortView.b.this.aiz();
            GMTrace.o(10892976586752L, 81159);
          }
        });
      }
      GMTrace.o(10893647675392L, 81164);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\base\BrandServiceSortView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
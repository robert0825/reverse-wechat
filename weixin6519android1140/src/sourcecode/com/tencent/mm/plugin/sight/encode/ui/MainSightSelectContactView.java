package com.tencent.mm.plugin.sight.encode.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightSelectContactView
  extends FrameLayout
  implements AbsListView.OnScrollListener, d.a, l
{
  public ListView Ev;
  public int oVN;
  public d oVO;
  Animation oVP;
  public c oVQ;
  public View oVR;
  public a oVS;
  public LinearLayout oVT;
  private View oVU;
  private int oVV;
  private int oVW;
  public HashSet<String> oVX;
  public HashSet<String> oVY;
  boolean oVj;
  public MMFragmentActivity oVo;
  
  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9343835570176L, 69617);
    this.oVV = -1;
    this.oVW = -1;
    this.oVj = false;
    GMTrace.o(9343835570176L, 69617);
  }
  
  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9343969787904L, 69618);
    this.oVV = -1;
    this.oVW = -1;
    this.oVj = false;
    GMTrace.o(9343969787904L, 69618);
  }
  
  private void b(List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(9344909312000L, 69625);
    if (this.oVj)
    {
      GMTrace.o(9344909312000L, 69625);
      return;
    }
    if (paramList == null)
    {
      GMTrace.o(9344909312000L, 69625);
      return;
    }
    if (paramBoolean1)
    {
      this.oVY.clear();
      this.oVX.clear();
      c.oVy = true;
      c.oVz = false;
    }
    if (this.oVQ != null)
    {
      c localc = this.oVQ;
      localc.clearCache();
      localc.oVw = paramList;
      localc.notifyDataSetChanged();
    }
    if (paramBoolean2)
    {
      bhn();
      GMTrace.o(9344909312000L, 69625);
      return;
    }
    if (this.oVU != null) {
      this.Ev.removeFooterView(this.oVU);
    }
    GMTrace.o(9344909312000L, 69625);
  }
  
  public static boolean ub(int paramInt)
  {
    GMTrace.i(9346788360192L, 69639);
    if (paramInt == -1)
    {
      GMTrace.o(9346788360192L, 69639);
      return true;
    }
    GMTrace.o(9346788360192L, 69639);
    return false;
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(9345580400640L, 69630);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.oVY.contains(parama.iBi.field_username);
      GMTrace.o(9345580400640L, 69630);
      return bool;
    }
    GMTrace.o(9345580400640L, 69630);
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(9345446182912L, 69629);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.oVX.contains(parama.iBi.field_username);
      GMTrace.o(9345446182912L, 69629);
      return bool;
    }
    GMTrace.o(9345446182912L, 69629);
    return false;
  }
  
  public final void bhl()
  {
    GMTrace.i(9344506658816L, 69622);
    if (this.oVT == null)
    {
      GMTrace.o(9344506658816L, 69622);
      return;
    }
    this.oVT.getChildAt(0).setVisibility(8);
    this.oVR.setVisibility(0);
    List localList = this.oVQ.oVw;
    localList.remove("@search.tencent");
    localList.remove("@sns.tencent");
    localList.remove("@draft.tencent");
    b(localList, false, true);
    this.oVS.bhd();
    if (!this.oVS.vc()) {
      this.oVS.bhe();
    }
    this.oVS.bhf();
    GMTrace.o(9344506658816L, 69622);
  }
  
  public final void bhm()
  {
    GMTrace.i(9344372441088L, 69621);
    if (this.oVT == null)
    {
      GMTrace.o(9344372441088L, 69621);
      return;
    }
    this.oVT.getChildAt(0).setVisibility(0);
    this.oVR.setVisibility(8);
    t(true, false);
    this.oVS.bhc();
    GMTrace.o(9344372441088L, 69621);
  }
  
  public final void bhn()
  {
    GMTrace.i(9344640876544L, 69623);
    this.Ev.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9335111417856L, 69552);
        if ((MainSightSelectContactView.a(MainSightSelectContactView.this) == MainSightSelectContactView.b(MainSightSelectContactView.this).getCount()) && (MainSightSelectContactView.c(MainSightSelectContactView.this).bhb() >= MainSightSelectContactView.d(MainSightSelectContactView.this)))
        {
          GMTrace.o(9335111417856L, 69552);
          return;
        }
        if (MainSightSelectContactView.e(MainSightSelectContactView.this) != null) {
          MainSightSelectContactView.f(MainSightSelectContactView.this).removeFooterView(MainSightSelectContactView.e(MainSightSelectContactView.this));
        }
        int i = MainSightSelectContactView.d(MainSightSelectContactView.this);
        if ((MainSightSelectContactView.d(MainSightSelectContactView.this) < 0) || (MainSightSelectContactView.d(MainSightSelectContactView.this) > MainSightSelectContactView.c(MainSightSelectContactView.this).bhb())) {
          i = MainSightSelectContactView.c(MainSightSelectContactView.this).bhb();
        }
        MainSightSelectContactView.a(MainSightSelectContactView.this, MainSightSelectContactView.b(MainSightSelectContactView.this).getCount());
        MainSightSelectContactView.b(MainSightSelectContactView.this, i);
        int j = 0;
        int k = 0;
        Object localObject;
        while (j < MainSightSelectContactView.b(MainSightSelectContactView.this).getCount())
        {
          localObject = MainSightSelectContactView.b(MainSightSelectContactView.this).getView(j, null, MainSightSelectContactView.f(MainSightSelectContactView.this));
          ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
          k += ((View)localObject).getMeasuredHeight();
          if (k >= i)
          {
            GMTrace.o(9335111417856L, 69552);
            return;
          }
          j += 1;
        }
        i -= k;
        if (i > 0)
        {
          MainSightSelectContactView.a(MainSightSelectContactView.this, new View(MainSightSelectContactView.this.getContext()));
          localObject = new AbsListView.LayoutParams(-1, i);
          MainSightSelectContactView.e(MainSightSelectContactView.this).setLayoutParams((ViewGroup.LayoutParams)localObject);
          MainSightSelectContactView.e(MainSightSelectContactView.this).setBackgroundResource(R.e.black);
          MainSightSelectContactView.f(MainSightSelectContactView.this).addFooterView(MainSightSelectContactView.e(MainSightSelectContactView.this));
        }
        GMTrace.o(9335111417856L, 69552);
      }
    });
    GMTrace.o(9344640876544L, 69623);
  }
  
  public final ListView bho()
  {
    GMTrace.i(9345714618368L, 69631);
    ListView localListView = this.Ev;
    GMTrace.o(9345714618368L, 69631);
    return localListView;
  }
  
  public final LinkedList<String> bhp()
  {
    GMTrace.i(9345983053824L, 69633);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.oVY);
    GMTrace.o(9345983053824L, 69633);
    return localLinkedList;
  }
  
  public final boolean bhq()
  {
    GMTrace.i(9346117271552L, 69634);
    if (this.oVY == null)
    {
      GMTrace.o(9346117271552L, 69634);
      return true;
    }
    boolean bool = this.oVY.isEmpty();
    GMTrace.o(9346117271552L, 69634);
    return bool;
  }
  
  public final void br(List<String> paramList)
  {
    GMTrace.i(9346922577920L, 69640);
    b(paramList, false, false);
    GMTrace.o(9346922577920L, 69640);
  }
  
  final String gc(int paramInt)
  {
    GMTrace.i(9346385707008L, 69636);
    Object localObject = this.oVQ.DC(paramInt);
    if (localObject == null)
    {
      GMTrace.o(9346385707008L, 69636);
      return null;
    }
    localObject = ((com.tencent.mm.ui.contact.a.a)localObject).iBi;
    if (localObject == null)
    {
      GMTrace.o(9346385707008L, 69636);
      return null;
    }
    localObject = ((af)localObject).field_username;
    GMTrace.o(9346385707008L, 69636);
    return (String)localObject;
  }
  
  public final Activity getActivity()
  {
    GMTrace.i(9345311965184L, 69628);
    MMFragmentActivity localMMFragmentActivity = this.oVo;
    GMTrace.o(9345311965184L, 69628);
    return localMMFragmentActivity;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(9347325231104L, 69643);
    if ((this.oVT == null) || (paramAbsListView == null) || (this.oVT.getHeight() <= 0) || (this.oVo == null))
    {
      GMTrace.o(9347325231104L, 69643);
      return;
    }
    paramInt1 = this.oVT.getHeight() - this.oVo.cN().cO().getHeight();
    paramInt2 = -this.oVT.getTop();
    if (paramInt2 < 0)
    {
      GMTrace.o(9347325231104L, 69643);
      return;
    }
    float f = paramInt2 / paramInt1;
    this.oVS.am(f);
    if ((this.oVT.getTop() < 0) && (this.oVT.getTop() <= -paramInt1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.oVS.hy(bool);
      GMTrace.o(9347325231104L, 69643);
      return;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(9347191013376L, 69642);
    if (paramInt == 1) {
      bg.da(paramAbsListView);
    }
    GMTrace.o(9347191013376L, 69642);
  }
  
  public final void t(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(9345043529728L, 69626);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("@search.tencent");
    localArrayList.add("@sns.tencent");
    Object localObject1 = new ArrayList();
    at.AR();
    Object localObject2 = com.tencent.mm.y.c.yP().bTc();
    ((List)localObject2).remove(q.zE());
    ((List)localObject1).addAll((Collection)localObject2);
    if (paramBoolean1)
    {
      localArrayList.addAll(this.oVY);
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!localArrayList.contains(localObject2)) {
          localArrayList.add(localObject2);
        }
      }
    }
    localArrayList.addAll((Collection)localObject1);
    b(localArrayList, paramBoolean2, true);
    GMTrace.o(9345043529728L, 69626);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\MainSightSelectContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
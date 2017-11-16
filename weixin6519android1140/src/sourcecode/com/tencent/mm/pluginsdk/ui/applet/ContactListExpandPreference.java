package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.List;

public class ContactListExpandPreference
  extends Preference
{
  private int txJ;
  public g txK;
  public i txL;
  
  public ContactListExpandPreference(Context paramContext, int paramInt)
  {
    super(paramContext);
    GMTrace.i(949993078784L, 7078);
    this.txJ = -1;
    if (paramInt == 0) {
      bLJ();
    }
    for (;;)
    {
      setLayoutResource(a.f.kby);
      GMTrace.o(949993078784L, 7078);
      return;
      if (paramInt == 1)
      {
        this.txJ = 1;
        this.txL = new i();
      }
    }
  }
  
  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(950127296512L, 7079);
    this.txJ = -1;
    bLJ();
    setLayoutResource(a.f.kby);
    GMTrace.o(950127296512L, 7079);
  }
  
  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(950261514240L, 7080);
    this.txJ = -1;
    bLJ();
    setLayoutResource(a.f.kby);
    GMTrace.o(950261514240L, 7080);
  }
  
  private void bLJ()
  {
    GMTrace.i(950395731968L, 7081);
    this.txJ = 0;
    this.txK = new g(this.mContext);
    GMTrace.o(950395731968L, 7081);
  }
  
  public final void Pm(String paramString)
  {
    GMTrace.i(951603691520L, 7090);
    if (this.txK != null) {
      this.txK.twX.txy = paramString;
    }
    GMTrace.o(951603691520L, 7090);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(953348521984L, 7103);
    if (this.txK != null) {
      this.txK.qqX = parama;
    }
    GMTrace.o(953348521984L, 7103);
  }
  
  public final void a(i.b paramb)
  {
    GMTrace.i(953214304256L, 7102);
    if (this.txK != null) {
      this.txK.twY = paramb;
    }
    GMTrace.o(953214304256L, 7102);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(950798385152L, 7084);
    if (this.txK != null) {
      this.txK.twX.txr = paramd;
    }
    GMTrace.o(950798385152L, 7084);
  }
  
  public final void a(f paramf, String paramString)
  {
    GMTrace.i(950664167424L, 7083);
    if (this.txK != null)
    {
      g localg = this.txK;
      if ((paramf == null) || (paramString == null))
      {
        GMTrace.o(950664167424L, 7083);
        return;
      }
      localg.htU = paramf;
      localg.twT = paramString;
      paramf.bc(paramString, true);
    }
    GMTrace.o(950664167424L, 7083);
  }
  
  public final void aQ(List<String> paramList)
  {
    GMTrace.i(953080086528L, 7101);
    if (this.txK != null)
    {
      h localh = this.txK.twX;
      localh.bA(paramList);
      localh.notifyChanged();
    }
    GMTrace.o(953080086528L, 7101);
  }
  
  public final void ad(ArrayList<x> paramArrayList)
  {
    GMTrace.i(951201038336L, 7087);
    if (this.txK != null)
    {
      g localg = this.txK;
      localg.twX.ac(paramArrayList);
      localg.Bw(null);
    }
    GMTrace.o(951201038336L, 7087);
  }
  
  public final void bLK()
  {
    GMTrace.i(951335256064L, 7088);
    if (this.txK != null) {
      this.txK.twX.txD = false;
    }
    GMTrace.o(951335256064L, 7088);
  }
  
  public final void bLL()
  {
    GMTrace.i(952408997888L, 7096);
    if (this.txK != null)
    {
      h localh = this.txK.twX;
      localh.jPB = false;
      localh.notifyChanged();
    }
    GMTrace.o(952408997888L, 7096);
  }
  
  public final ContactListExpandPreference bLM()
  {
    GMTrace.i(952811651072L, 7099);
    if (this.txK != null) {
      this.txK.twX.txu = false;
    }
    GMTrace.o(952811651072L, 7099);
    return this;
  }
  
  public final void bLN()
  {
    boolean bool = false;
    GMTrace.i(952945868800L, 7100);
    if (this.txK != null)
    {
      g localg = this.txK;
      localg.twV = false;
      if (localg.twV) {
        bool = true;
      }
      localg.twW = bool;
    }
    GMTrace.o(952945868800L, 7100);
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(18726996934656L, 139527);
    if ((this.txK != null) && (this.txK.twX.zj(paramInt)))
    {
      Object localObject = this.txK.twX.getItem(paramInt);
      GMTrace.o(18726996934656L, 139527);
      return localObject;
    }
    GMTrace.o(18726996934656L, 139527);
    return null;
  }
  
  public final ContactListExpandPreference kf(boolean paramBoolean)
  {
    GMTrace.i(952543215616L, 7097);
    if (this.txK != null) {
      this.txK.twX.txt = paramBoolean;
    }
    GMTrace.o(952543215616L, 7097);
    return this;
  }
  
  public final ContactListExpandPreference kg(boolean paramBoolean)
  {
    GMTrace.i(952677433344L, 7098);
    if (this.txK != null) {
      this.txK.twX.txs = paramBoolean;
    }
    GMTrace.o(952677433344L, 7098);
    return this;
  }
  
  public final void m(String paramString, List<String> paramList)
  {
    GMTrace.i(951066820608L, 7086);
    if (this.txK != null)
    {
      g localg = this.txK;
      localg.username = paramString;
      Object localObject = paramList;
      if (paramList == null) {
        localObject = new ArrayList(0);
      }
      localg.twX.bA((List)localObject);
      localg.Bw(paramString);
    }
    GMTrace.o(951066820608L, 7086);
  }
  
  public final void notifyChanged()
  {
    GMTrace.i(950932602880L, 7085);
    if (this.txK != null) {
      this.txK.aZP();
    }
    GMTrace.o(950932602880L, 7085);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(950529949696L, 7082);
    ViewGroup localViewGroup;
    if (this.txJ == 1)
    {
      i locali = this.txL;
      if (paramView.getId() == a.e.kbp)
      {
        localViewGroup = (ViewGroup)paramView;
        if (locali.row != 0) {
          break label244;
        }
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(a.c.aQt), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.aQw));
        label84:
        if (((locali.twX.txq % h.txh != h.txh - 1) && (locali.twX.txq % h.txh != 0)) || (!locali.jNC) || (locali.row != locali.twX.getCount() / h.txh - 1)) {
          break label340;
        }
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), 0);
      }
      for (;;)
      {
        label170:
        if (locali.twX != null)
        {
          localViewGroup.setOnClickListener(locali.oiK);
          int j;
          if (localViewGroup.getChildCount() > h.txh)
          {
            j = localViewGroup.getChildCount();
            i = 0;
            for (;;)
            {
              if (i < j - h.txh)
              {
                localViewGroup.removeViewAt(i);
                i += 1;
                continue;
                localViewGroup = (ViewGroup)paramView.findViewById(a.e.kbp);
                break;
                label244:
                if (locali.row == locali.twX.getCount() / h.txh - 1)
                {
                  localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.aQt));
                  break label84;
                }
                localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(a.c.aQw), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.aQw));
                break label84;
                label340:
                if ((locali.jNC) || (locali.twX.txq % h.txh != 0) || (locali.row != locali.twX.getCount() / h.txh - 1)) {
                  break label170;
                }
                localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), (int)localViewGroup.getContext().getResources().getDimension(a.c.aQN));
                break label170;
              }
            }
            localViewGroup.requestLayout();
          }
          int i = 0;
          if (i < locali.txM)
          {
            View localView;
            label469:
            LinearLayout.LayoutParams localLayoutParams;
            if (localViewGroup.getChildAt(i) == null)
            {
              localView = View.inflate(localViewGroup.getContext(), a.f.cET, null);
              localViewGroup.addView(localView);
              localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
              if (h.txh != 4) {
                break label657;
              }
              j = localViewGroup.getResources().getDimensionPixelSize(a.c.aQE);
              localLayoutParams.setMargins(j, 0, j, 0);
            }
            for (;;)
            {
              if ((!locali.twX.bLH()) && (locali.twX.txq == 1))
              {
                j = localViewGroup.getResources().getDimensionPixelSize(a.c.aPC);
                localLayoutParams.setMargins(j, 0, j, 0);
              }
              localView.setLayoutParams(localLayoutParams);
              j = locali.row * locali.txM + i;
              locali.twX.getView(j, localView, localViewGroup);
              if (locali.txd != null) {
                localView.setOnClickListener(new i.3(locali, localViewGroup, j));
              }
              if (locali.txN != null) {
                localView.setOnLongClickListener(new i.4(locali, localViewGroup, j));
              }
              i += 1;
              break;
              localView = localViewGroup.getChildAt(i);
              break label469;
              label657:
              j = localViewGroup.getResources().getDimensionPixelSize(a.c.aQw);
              localLayoutParams.setMargins(j, 0, j, 0);
            }
          }
          if ((!locali.twX.bLH()) && (locali.twX.txq <= 1)) {
            break label729;
          }
          ((LinearLayout)localViewGroup).setGravity(17);
        }
      }
    }
    for (;;)
    {
      super.onBindView(paramView);
      GMTrace.o(950529949696L, 7082);
      return;
      label729:
      ((LinearLayout)localViewGroup).setGravity(19);
    }
  }
  
  public final void refresh()
  {
    GMTrace.i(16673197260800L, 124225);
    if (this.txK != null) {
      this.txK.twX.notifyChanged();
    }
    GMTrace.o(16673197260800L, 124225);
  }
  
  public final boolean zj(int paramInt)
  {
    GMTrace.i(951737909248L, 7091);
    if (this.txK != null)
    {
      boolean bool = this.txK.twX.zj(paramInt);
      GMTrace.o(951737909248L, 7091);
      return bool;
    }
    GMTrace.o(951737909248L, 7091);
    return false;
  }
  
  public final String zk(int paramInt)
  {
    GMTrace.i(952006344704L, 7093);
    if ((this.txK != null) && (this.txK.twX.zj(paramInt)))
    {
      String str = ((x)this.txK.twX.getItem(paramInt)).field_username;
      GMTrace.o(952006344704L, 7093);
      return str;
    }
    GMTrace.o(952006344704L, 7093);
    return "";
  }
  
  public final String zl(int paramInt)
  {
    GMTrace.i(952140562432L, 7094);
    if ((this.txK != null) && (this.txK.twX.zj(paramInt)))
    {
      String str = ((x)this.txK.twX.getItem(paramInt)).field_nickname;
      GMTrace.o(952140562432L, 7094);
      return str;
    }
    GMTrace.o(952140562432L, 7094);
    return "";
  }
  
  public final String zm(int paramInt)
  {
    GMTrace.i(952274780160L, 7095);
    if ((this.txK != null) && (this.txK.twX.zj(paramInt)))
    {
      String str = ((x)this.txK.twX.getItem(paramInt)).field_conRemark;
      GMTrace.o(952274780160L, 7095);
      return str;
    }
    GMTrace.o(952274780160L, 7095);
    return "";
  }
  
  public static abstract interface a
  {
    public abstract void anE();
    
    public abstract void ma(int paramInt);
    
    public abstract void mb(int paramInt);
    
    public abstract void mc(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\ContactListExpandPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
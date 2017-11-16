package com.tencent.mm.plugin.pwdgroup.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.pwdgroup.b.a;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.LinkedList;

public final class a
  extends BaseAdapter
{
  private LinkedList<te> kte;
  private Context mContext;
  private Animation mqx;
  private Animation nQp;
  private Animation nQq;
  private HashMap<String, Boolean> nQr;
  
  public a(Context paramContext)
  {
    GMTrace.i(10704266461184L, 79753);
    this.kte = new LinkedList();
    this.nQr = new HashMap();
    this.mContext = paramContext;
    this.mqx = AnimationUtils.loadAnimation(this.mContext, R.a.aLh);
    this.nQq = AnimationUtils.loadAnimation(this.mContext, R.a.aLh);
    this.nQp = AnimationUtils.loadAnimation(this.mContext, R.a.aLi);
    this.mqx.setInterpolator(new AccelerateDecelerateInterpolator());
    this.nQq.setInterpolator(new AccelerateInterpolator());
    this.nQp.setInterpolator(new AccelerateDecelerateInterpolator());
    this.mqx.setDuration(300L);
    this.nQq.setDuration(1000L);
    this.nQp.setDuration(1000L);
    GMTrace.o(10704266461184L, 79753);
  }
  
  private static String a(te paramte)
  {
    GMTrace.i(10705071767552L, 79759);
    if (paramte == null)
    {
      GMTrace.o(10705071767552L, 79759);
      return "";
    }
    if (bg.nm(paramte.jhi))
    {
      paramte = paramte.ujf;
      GMTrace.o(10705071767552L, 79759);
      return paramte;
    }
    paramte = paramte.jhi;
    GMTrace.o(10705071767552L, 79759);
    return paramte;
  }
  
  public final void I(LinkedList<te> paramLinkedList)
  {
    GMTrace.i(10704400678912L, 79754);
    this.kte = paramLinkedList;
    if ((this.kte != null) && (this.kte.size() > 0))
    {
      int j = this.kte.size();
      int i = 0;
      while (i < j)
      {
        paramLinkedList = a((te)this.kte.get(i));
        if (!this.nQr.containsKey(paramLinkedList)) {
          this.nQr.put(paramLinkedList, Boolean.valueOf(false));
        }
        i += 1;
      }
    }
    notifyDataSetChanged();
    GMTrace.o(10704400678912L, 79754);
  }
  
  public final int getCount()
  {
    GMTrace.i(10704534896640L, 79755);
    if (this.kte == null)
    {
      GMTrace.o(10704534896640L, 79755);
      return 1;
    }
    int i = this.kte.size();
    GMTrace.o(10704534896640L, 79755);
    return i + 1;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(10704669114368L, 79756);
    if (this.kte == null)
    {
      GMTrace.o(10704669114368L, 79756);
      return null;
    }
    if (paramInt >= this.kte.size())
    {
      GMTrace.o(10704669114368L, 79756);
      return null;
    }
    Object localObject = this.kte.get(paramInt);
    GMTrace.o(10704669114368L, 79756);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(10704803332096L, 79757);
    long l = paramInt;
    GMTrace.o(10704803332096L, 79757);
    return l;
  }
  
  public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(10704937549824L, 79758);
    Object localObject;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cwn, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      localObject = (te)getItem(paramInt);
      if (localObject != null)
      {
        if (!bg.nm(((te)localObject).jio)) {
          break label267;
        }
        paramViewGroup.ikm.setText(((te)localObject).jhi);
        label87:
        if (bg.nm(((te)localObject).jhi)) {
          break label282;
        }
        b.a.a(paramViewGroup.iCr, ((te)localObject).jhi);
      }
    }
    for (;;)
    {
      localObject = a((te)localObject);
      paramView.clearAnimation();
      if ((this.nQr.containsKey(localObject)) && (!((Boolean)this.nQr.get(localObject)).booleanValue()))
      {
        paramView.startAnimation(this.mqx);
        this.nQr.put(localObject, Boolean.valueOf(true));
      }
      if (paramInt + 1 == getCount())
      {
        paramViewGroup.ikm.setText("");
        paramViewGroup.iCr.setImageResource(R.g.aTn);
        if (paramView != null)
        {
          this.nQq.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10710037823488L, 79796);
              paramView.startAnimation(a.a(a.this));
              GMTrace.o(10710037823488L, 79796);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10709903605760L, 79795);
              GMTrace.o(10709903605760L, 79795);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10709769388032L, 79794);
              GMTrace.o(10709769388032L, 79794);
            }
          });
          this.nQp.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10710574694400L, 79800);
              paramView.startAnimation(a.b(a.this));
              GMTrace.o(10710574694400L, 79800);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10710440476672L, 79799);
              GMTrace.o(10710440476672L, 79799);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10710306258944L, 79798);
              GMTrace.o(10710306258944L, 79798);
            }
          });
          paramView.startAnimation(this.nQq);
        }
      }
      GMTrace.o(10704937549824L, 79758);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label267:
      paramViewGroup.ikm.setText(((te)localObject).jio);
      break label87;
      label282:
      b.a.a(paramViewGroup.iCr, ((te)localObject).ujf);
    }
  }
  
  final class a
  {
    ImageView iCr;
    TextView ikm;
    
    public a(View paramView)
    {
      GMTrace.i(10707085033472L, 79774);
      this.iCr = ((ImageView)paramView.findViewById(R.h.byn));
      this.ikm = ((TextView)paramView.findViewById(R.h.byw));
      GMTrace.o(10707085033472L, 79774);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
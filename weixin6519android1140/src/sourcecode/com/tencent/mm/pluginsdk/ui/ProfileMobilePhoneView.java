package com.tencent.mm.pluginsdk.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bj.d;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.m;
import java.util.List;
import junit.framework.Assert;

public class ProfileMobilePhoneView
  extends ProfileItemView
{
  public TextView izE;
  private Context mContext;
  public String tuh;
  public String tui;
  public String[] tuj;
  public LinearLayout tuq;
  public boolean tur;
  
  public ProfileMobilePhoneView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1158970081280L, 8635);
    GMTrace.o(1158970081280L, 8635);
  }
  
  public ProfileMobilePhoneView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1159104299008L, 8636);
    this.tur = false;
    this.mContext = paramContext;
    GMTrace.o(1159104299008L, 8636);
  }
  
  @Deprecated
  public final boolean L(x paramx)
  {
    GMTrace.i(1159506952192L, 8639);
    GMTrace.o(1159506952192L, 8639);
    return false;
  }
  
  public final int aXW()
  {
    GMTrace.i(1159238516736L, 8637);
    int i = R.i.cDM;
    GMTrace.o(1159238516736L, 8637);
    return i;
  }
  
  public final boolean aXX()
  {
    GMTrace.i(1159641169920L, 8640);
    Object localObject;
    if (this.izE != null)
    {
      localObject = this.izE.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = a.V(getContext(), R.f.aQg);
      this.izE.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (this.tuq == null)
    {
      GMTrace.o(1159641169920L, 8640);
      return false;
    }
    int k;
    if ((!bg.nm(this.tuh)) && (bg.SH(this.tuh).booleanValue()))
    {
      localObject = this.tuq.getChildAt(0);
      if (localObject != null)
      {
        ((View)localObject).setVisibility(0);
        ((TextView)localObject).setText(this.tuh);
      }
      k = 1;
    }
    int j;
    for (int i = 1;; i = 0)
    {
      if (bg.nm(this.tui)) {
        break label314;
      }
      this.tuj = this.tui.split(",");
      setVisibility(0);
      for (;;)
      {
        j = i;
        if (i >= this.tuj.length + k) {
          break;
        }
        localObject = this.tuq.getChildAt(i);
        if (localObject != null)
        {
          ((View)localObject).setVisibility(0);
          ((TextView)localObject).setText(this.tuj[(i - k)]);
        }
        i += 1;
      }
      if ((this.tuh != null) && (!bg.SH(this.tuh).booleanValue())) {
        w.e("MicroMsg.ProfileMobilePhoneView", "mobile format is error----%s", new Object[] { this.tuh });
      }
      k = 0;
    }
    for (;;)
    {
      if (j < 5)
      {
        this.tuq.getChildAt(j).setVisibility(8);
        j += 1;
      }
      else
      {
        if ((k != 1) && (bg.nm(this.tui))) {
          setVisibility(8);
        }
        GMTrace.o(1159641169920L, 8640);
        return false;
        label314:
        j = i;
      }
    }
  }
  
  public final void init()
  {
    GMTrace.i(1159372734464L, 8638);
    this.izE = ((TextView)findViewById(R.h.bTb));
    this.tuq = ((LinearLayout)findViewById(R.h.bTa));
    int i = 0;
    while (i < 5)
    {
      this.tuq.getChildAt(i).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(923686404096L, 6882);
          ProfileMobilePhoneView.a(ProfileMobilePhoneView.this, ((TextView)paramAnonymousView).getText().toString());
          GMTrace.o(923686404096L, 6882);
        }
      });
      i += 1;
    }
    GMTrace.o(1159372734464L, 8638);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private List<String> lWy;
    private Context mContext;
    
    public a(Context paramContext, List<String> paramList)
    {
      GMTrace.i(929457766400L, 6925);
      this.lWy = null;
      this.mContext = null;
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.mContext = paramContext;
        this.lWy = paramList;
        GMTrace.o(929457766400L, 6925);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(929591984128L, 6926);
      if (this.lWy == null)
      {
        GMTrace.o(929591984128L, 6926);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(929591984128L, 6926);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(929726201856L, 6927);
      Object localObject = this.lWy.get(paramInt);
      GMTrace.o(929726201856L, 6927);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(929860419584L, 6928);
      long l = paramInt;
      GMTrace.o(929860419584L, 6928);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(930128855040L, 6930);
      String str = (String)getItem(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(R.i.csH, paramViewGroup, false);
        paramView = new a();
        ((a)paramView).ikm = ((TextView)localView.findViewById(R.h.title));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        ((a)paramViewGroup).ikm.setText(str);
        GMTrace.o(930128855040L, 6930);
        return localView;
        paramViewGroup = paramView.getTag();
        localView = paramView;
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(929994637312L, 6929);
      GMTrace.o(929994637312L, 6929);
      return 2;
    }
    
    private final class a
    {
      TextView ikm;
      
      public a()
      {
        GMTrace.i(1037368819712L, 7729);
        GMTrace.o(1037368819712L, 7729);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ProfileMobilePhoneView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
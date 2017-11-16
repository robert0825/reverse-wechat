package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.exdevice.f.a.e;
import com.tencent.mm.plugin.exdevice.model.f;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.iv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.List;

final class a
  extends BaseAdapter
{
  String iAx;
  c kHR;
  private boolean kHS;
  boolean kHT;
  int kHU;
  int kHV;
  ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> kHW;
  List<iv> kHX;
  private String mAppName;
  private Context mContext;
  
  public a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(11095913791488L, 82671);
    this.mContext = paramContext;
    this.iAx = paramString2;
    this.kHS = paramBoolean;
    this.mAppName = paramString1;
    GMTrace.o(11095913791488L, 82671);
  }
  
  public final int getCount()
  {
    GMTrace.i(11096048009216L, 82672);
    if (this.kHS)
    {
      int i = this.kHU;
      int j = this.kHV;
      GMTrace.o(11096048009216L, 82672);
      return i + 5 + j;
    }
    GMTrace.o(11096048009216L, 82672);
    return 2;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(11096316444672L, 82674);
    GMTrace.o(11096316444672L, 82674);
    return Integer.valueOf(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11096450662400L, 82675);
    long l = paramInt;
    GMTrace.o(11096450662400L, 82675);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(11096584880128L, 82676);
    if (!this.kHS)
    {
      if (paramInt == 0)
      {
        GMTrace.o(11096584880128L, 82676);
        return 0;
      }
      GMTrace.o(11096584880128L, 82676);
      return 4;
    }
    if (paramInt == 0)
    {
      GMTrace.o(11096584880128L, 82676);
      return 0;
    }
    if (paramInt == 1)
    {
      GMTrace.o(11096584880128L, 82676);
      return 6;
    }
    if ((paramInt > 1) && (paramInt <= this.kHU + 1))
    {
      GMTrace.o(11096584880128L, 82676);
      return 1;
    }
    if (paramInt == this.kHU + 2)
    {
      GMTrace.o(11096584880128L, 82676);
      return 2;
    }
    if (paramInt == this.kHU + 3)
    {
      GMTrace.o(11096584880128L, 82676);
      return 5;
    }
    if ((paramInt > this.kHU + 3) && (paramInt <= this.kHU + 3 + this.kHV))
    {
      GMTrace.o(11096584880128L, 82676);
      return 3;
    }
    if (paramInt == this.kHU + this.kHV + 4)
    {
      GMTrace.o(11096584880128L, 82676);
      return 7;
    }
    GMTrace.o(11096584880128L, 82676);
    return 5;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11096719097856L, 82677);
    int i = getItemViewType(paramInt);
    final Object localObject1;
    c localc;
    final Object localObject2;
    d locald;
    e locale;
    f localf;
    if (paramView == null) {
      switch (i)
      {
      default: 
        paramViewGroup = null;
        localObject1 = null;
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        switch (i)
        {
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(11096719097856L, 82677);
      return paramView;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvS, paramViewGroup, false);
      localf = new f();
      localf.jXQ = ((ImageView)paramView.findViewById(R.h.bxw));
      paramView.setTag(localf);
      paramViewGroup = null;
      localObject1 = null;
      localc = null;
      localObject2 = null;
      locald = null;
      locale = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvR, paramViewGroup, false);
      locale = new e();
      locale.kIe = ((NoMeasuredTextView)paramView.findViewById(R.h.bxG));
      locale.kIf = ((TextView)paramView.findViewById(R.h.bxH));
      locale.jXQ = ((ImageView)paramView.findViewById(R.h.bxE));
      locale.kIa = paramView.findViewById(R.h.bxF);
      locale.kIe.J(this.mContext.getResources().getDimension(R.f.aPY));
      locale.kIe.setTextColor(this.mContext.getResources().getColor(R.e.aNE));
      locale.kIe.cag();
      locale.kIe.whw = true;
      paramView.setTag(locale);
      paramViewGroup = null;
      localObject1 = null;
      localc = null;
      localObject2 = null;
      locald = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvO, paramViewGroup, false);
      localObject2 = new a();
      ((a)localObject2).kHZ = ((TextView)paramView.findViewById(R.h.bxA));
      ((a)localObject2).kIa = paramView.findViewById(R.h.bxy);
      ((a)localObject2).kEV = ((ImageView)paramView.findViewById(R.h.bxz));
      paramView.setTag(localObject2);
      paramViewGroup = null;
      localObject1 = null;
      localc = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvO, paramViewGroup, false);
      localc = new c();
      localc.kHZ = ((TextView)paramView.findViewById(R.h.bxA));
      localc.kIa = paramView.findViewById(R.h.bxy);
      localc.kEV = ((ImageView)paramView.findViewById(R.h.bxz));
      localc.kIc = paramView.findViewById(R.h.bxx);
      paramView.setTag(localc);
      paramViewGroup = null;
      localObject1 = null;
      localObject2 = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.bxD, paramViewGroup, false);
      locald = new d();
      locald.kId = ((Button)paramView.findViewById(R.h.bxD));
      paramView.setTag(locald);
      paramViewGroup = null;
      localObject1 = null;
      localc = null;
      localObject2 = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvQ, paramViewGroup, false);
      paramView.setTag(new b());
      paramViewGroup = null;
      localObject1 = null;
      localc = null;
      localObject2 = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvQ, paramViewGroup, false);
      localObject1 = new b();
      ((b)localObject1).kHZ = ((TextView)paramView.findViewById(R.h.bxC));
      paramView.setTag(localObject1);
      paramViewGroup = null;
      localc = null;
      localObject2 = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.cvQ, paramViewGroup, false);
      paramViewGroup = new b();
      paramViewGroup.kIb = paramView.findViewById(R.h.bxB);
      paramView.setTag(paramViewGroup);
      localObject1 = null;
      localc = null;
      localObject2 = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      switch (i)
      {
      default: 
        paramViewGroup = null;
        localObject1 = null;
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 0: 
        localf = (f)paramView.getTag();
        localObject1 = null;
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        paramViewGroup = null;
        break;
      case 1: 
        locale = (e)paramView.getTag();
        localf = null;
        localc = null;
        localObject2 = null;
        locald = null;
        paramViewGroup = null;
        localObject1 = null;
        break;
      case 2: 
        localObject2 = (a)paramView.getTag();
        locald = null;
        locale = null;
        localf = null;
        paramViewGroup = null;
        localObject1 = null;
        localc = null;
        break;
      case 3: 
        localc = (c)paramView.getTag();
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        paramViewGroup = null;
        localObject1 = null;
        break;
      case 4: 
        locald = (d)paramView.getTag();
        locale = null;
        localf = null;
        localObject2 = null;
        paramViewGroup = null;
        localObject1 = null;
        localc = null;
        break;
      case 5: 
        paramView.getTag();
        paramViewGroup = null;
        localObject1 = null;
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 6: 
        localObject1 = (b)paramView.getTag();
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        paramViewGroup = null;
        break;
      case 7: 
        paramViewGroup = (b)paramView.getTag();
        localObject1 = null;
        localc = null;
        localObject2 = null;
        locald = null;
        locale = null;
        localf = null;
        break;
        com.tencent.mm.pluginsdk.ui.a.b.o(localf.jXQ, this.iAx);
        localf.jXQ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11055111602176L, 82367);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", a.a(a.this));
            com.tencent.mm.bj.d.b(a.b(a.this), "profile", ".ui.ContactInfoUI", paramAnonymousView);
            GMTrace.o(11055111602176L, 82367);
          }
        });
        continue;
        if ((paramInt - 2 >= 0) && (!bg.cc(this.kHW)))
        {
          paramViewGroup = (com.tencent.mm.plugin.exdevice.f.b.a.c)this.kHW.get(paramInt - 2);
          if (paramViewGroup != null)
          {
            paramInt = paramViewGroup.field_step;
            localObject1 = paramViewGroup.field_username;
            if (paramViewGroup.field_step >= 10000) {
              locale.kIf.setTextColor(this.mContext.getResources().getColor(R.e.aND));
            }
            for (;;)
            {
              locale.kIe.setText(h.b(this.mContext, r.fs((String)localObject1), locale.kIe.fB.getTextSize()));
              locale.kIf.setText(String.valueOf(paramInt));
              com.tencent.mm.pluginsdk.ui.a.b.n(locale.jXQ, (String)localObject1);
              locale.kIa.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(11081418276864L, 82563);
                  paramAnonymousView = a.b(a.this);
                  Intent localIntent = new Intent(paramAnonymousView, ExdeviceProfileUI.class);
                  localIntent.putExtra("username", localObject1);
                  paramAnonymousView.startActivity(localIntent);
                  GMTrace.o(11081418276864L, 82563);
                }
              });
              break;
              locale.kIf.setTextColor(this.mContext.getResources().getColor(R.e.aNC));
            }
            ((a)localObject2).kHZ.setText(this.mContext.getResources().getText(R.l.drE));
            ((a)localObject2).kEV.setImageResource(R.k.cLU);
            ((a)localObject2).kIa.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(11052561465344L, 82348);
                if (a.c(a.this) != null) {
                  a.c(a.this).auN();
                }
                GMTrace.o(11052561465344L, 82348);
              }
            });
            continue;
            if ((paramInt - this.kHU - 4 >= 0) && (!bg.cc(this.kHX)))
            {
              localObject2 = (iv)this.kHX.get(paramInt - this.kHU - 4);
              if (localObject2 != null)
              {
                paramViewGroup = ((iv)localObject2).title;
                localObject1 = ((iv)localObject2).eQA;
                localObject2 = ((iv)localObject2).url;
                localc.kHZ.setText(paramViewGroup);
                if (paramInt - this.kHU - 4 != this.kHV - 1) {
                  localc.kIc.setVisibility(0);
                }
                e.a(this.mContext, localc.kEV, (String)localObject1, R.e.aNq);
                localc.kIa.setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(11104772161536L, 82737);
                    com.tencent.mm.plugin.sport.b.d.nU(8);
                    f.S(a.b(a.this), localObject2);
                    GMTrace.o(11104772161536L, 82737);
                  }
                });
                continue;
                if (!this.kHT)
                {
                  at.AR();
                  if (com.tencent.mm.y.c.yK().TA(this.iAx))
                  {
                    locald.kId.setVisibility(0);
                    locald.kId.setOnClickListener(new View.OnClickListener()
                    {
                      public final void onClick(View paramAnonymousView)
                      {
                        GMTrace.i(16663533584384L, 124153);
                        if (a.c(a.this) != null) {
                          a.c(a.this).auO();
                        }
                        GMTrace.o(16663533584384L, 124153);
                      }
                    });
                    continue;
                  }
                }
                locald.kId.setVisibility(4);
                continue;
                ((b)localObject1).kHZ.setText(this.mContext.getString(R.l.drK));
                continue;
                paramViewGroup.kIb.setVisibility(0);
              }
            }
          }
        }
        break;
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(11096182226944L, 82673);
    GMTrace.o(11096182226944L, 82673);
    return 8;
  }
  
  final class a
  {
    public ImageView kEV;
    public TextView kHZ;
    public View kIa;
    
    a()
    {
      GMTrace.i(11060748746752L, 82409);
      GMTrace.o(11060748746752L, 82409);
    }
  }
  
  final class b
  {
    public TextView kHZ;
    public View kIb;
    
    b()
    {
      GMTrace.i(11083297325056L, 82577);
      GMTrace.o(11083297325056L, 82577);
    }
  }
  
  final class c
  {
    public ImageView kEV;
    public TextView kHZ;
    public View kIa;
    public View kIc;
    
    c()
    {
      GMTrace.i(11071083511808L, 82486);
      GMTrace.o(11071083511808L, 82486);
    }
  }
  
  final class d
  {
    public Button kId;
    
    d()
    {
      GMTrace.i(11066520109056L, 82452);
      GMTrace.o(11066520109056L, 82452);
    }
  }
  
  final class e
  {
    public ImageView jXQ;
    public View kIa;
    public NoMeasuredTextView kIe;
    public TextView kIf;
    
    e()
    {
      GMTrace.i(11055245819904L, 82368);
      GMTrace.o(11055245819904L, 82368);
    }
  }
  
  final class f
  {
    public ImageView jXQ;
    
    f()
    {
      GMTrace.i(11081552494592L, 82564);
      GMTrace.o(11081552494592L, 82564);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
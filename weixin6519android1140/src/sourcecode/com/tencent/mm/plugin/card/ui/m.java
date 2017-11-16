package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

public final class m
  extends BaseAdapter
{
  View.OnClickListener jJy;
  boolean jJz;
  List<b> jxd;
  private Context mContext;
  
  public m(Context paramContext)
  {
    GMTrace.i(4972632604672L, 37049);
    this.jxd = new ArrayList();
    this.jJz = false;
    this.mContext = paramContext;
    GMTrace.o(4972632604672L, 37049);
  }
  
  private static void a(View paramView, b paramb)
  {
    GMTrace.i(4973303693312L, 37054);
    if (paramb == null)
    {
      GMTrace.o(4973303693312L, 37054);
      return;
    }
    h(paramView, paramb.jxU);
    GMTrace.o(4973303693312L, 37054);
  }
  
  private static void h(View paramView, boolean paramBoolean)
  {
    GMTrace.i(4973437911040L, 37055);
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean) {
      paramView.setBackgroundResource(R.g.aXW);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      paramView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      GMTrace.o(4973437911040L, 37055);
      return;
      paramView.setBackgroundResource(R.g.aXC);
    }
  }
  
  private b lU(int paramInt)
  {
    GMTrace.i(4972901040128L, 37051);
    b localb = (b)this.jxd.get(paramInt);
    GMTrace.o(4972901040128L, 37051);
    return localb;
  }
  
  public final int getCount()
  {
    GMTrace.i(4972766822400L, 37050);
    int i = this.jxd.size();
    GMTrace.o(4972766822400L, 37050);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4973035257856L, 37052);
    long l = paramInt;
    GMTrace.o(4973035257856L, 37052);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4973169475584L, 37053);
    final b localb = lU(paramInt);
    switch (localb.jxT)
    {
    default: 
      if (paramView == null) {
        break;
      }
    }
    for (paramViewGroup = (a)paramView.getTag();; paramViewGroup = null)
    {
      Object localObject;
      if (paramView != null)
      {
        localObject = paramViewGroup;
        if (paramViewGroup != null) {}
      }
      else
      {
        paramView = View.inflate(this.mContext, R.i.cqG, null);
        localObject = new a();
        ((a)localObject).jIB = ((TextView)paramView.findViewById(R.h.bju));
        ((a)localObject).jJE = ((TextView)paramView.findViewById(R.h.bjt));
        ((a)localObject).jJF = ((TextView)paramView.findViewById(R.h.bjq));
        ((a)localObject).jJG = ((ImageView)paramView.findViewById(R.h.bjs));
        ((a)localObject).jcL = paramView.findViewById(R.h.bjp);
        ((a)localObject).jJH = ((CheckBox)paramView.findViewById(R.h.bjr));
        paramView.setTag(localObject);
      }
      ((a)localObject).jIB.setText(localb.title);
      label259:
      int i;
      if (localb.jxV)
      {
        ((a)localObject).jJH.setVisibility(0);
        ((a)localObject).jJH.setChecked(localb.jxW);
        ((a)localObject).jJH.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(4960418791424L, 36958);
            if (((CheckBox)paramAnonymousView).isChecked())
            {
              localb.jxW = true;
              GMTrace.o(4960418791424L, 36958);
              return;
            }
            localb.jxW = false;
            GMTrace.o(4960418791424L, 36958);
          }
        });
        if (!TextUtils.isEmpty(localb.jxI)) {
          break label624;
        }
        ((a)localObject).jJE.setVisibility(4);
        if ((localb.uaJ & 1L) <= 0L) {
          break label649;
        }
        i = 1;
        label274:
        if (i == 0) {
          break label655;
        }
        ((a)localObject).jIB.setGravity(17);
        ((a)localObject).jIB.setTextColor(this.mContext.getResources().getColor(R.e.aOm));
        ((a)localObject).jJE.setVisibility(8);
        label320:
        if (!localb.jxU) {
          break label688;
        }
        ((a)localObject).jJF.setVisibility(0);
        label337:
        ((a)localObject).jJE.setTextColor(this.mContext.getResources().getColor(R.e.aOe));
        if (bg.nm(localb.nDw)) {
          break label701;
        }
        i = 1;
        label372:
        if (i == 0) {
          break label707;
        }
        ((a)localObject).jJG.setVisibility(0);
        com.tencent.mm.plugin.card.b.m.a(((a)localObject).jJG, localb.nDw, a.fromDPToPix(this.mContext, 20), R.g.aYg, false);
        label412:
        if (paramInt + 1 >= getCount()) {
          break label720;
        }
        paramViewGroup = lU(paramInt);
        a(((a)localObject).jcL, paramViewGroup);
        paramViewGroup = lU(paramInt + 1);
        a(((a)localObject).jcL, paramViewGroup);
      }
      for (;;)
      {
        GMTrace.o(4973169475584L, 37053);
        return paramView;
        paramView = View.inflate(this.mContext, R.i.cqF, null);
        paramViewGroup = (TextView)paramView.findViewById(R.h.bjx);
        localObject = (TextView)paramView.findViewById(R.h.bjw);
        LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(R.h.ceF);
        if (!TextUtils.isEmpty(localb.jxX))
        {
          localLinearLayout.setTag(localb.jxX);
          localLinearLayout.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(5027930308608L, 37461);
              paramAnonymousView = (String)paramAnonymousView.getTag();
              if (!TextUtils.isEmpty(paramAnonymousView))
              {
                if (!paramAnonymousView.contains(";")) {
                  break label104;
                }
                paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.indexOf(";"));
              }
              label104:
              for (;;)
              {
                h.a(m.a(m.this), true, paramAnonymousView, "", m.a(m.this).getString(R.l.djg), m.a(m.this).getString(R.l.cSk), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(4975316959232L, 37069);
                    paramAnonymous2DialogInterface = new Intent("android.intent.action.DIAL");
                    paramAnonymous2DialogInterface.setFlags(268435456);
                    paramAnonymous2DialogInterface.setData(Uri.parse("tel:" + paramAnonymousView));
                    m.a(m.this).startActivity(paramAnonymous2DialogInterface);
                    GMTrace.o(4975316959232L, 37069);
                  }
                }, null);
                GMTrace.o(5027930308608L, 37461);
                return;
              }
            }
          });
          ((ImageView)paramView.findViewById(R.h.bjv)).setBackgroundColor(l.uD(localb.gjg));
          localLinearLayout.setVisibility(0);
        }
        for (;;)
        {
          paramViewGroup.setText(localb.title);
          ((TextView)localObject).setText(localb.jxI);
          GMTrace.o(4973169475584L, 37053);
          return paramView;
          localLinearLayout.setVisibility(8);
        }
        ((a)localObject).jJH.setVisibility(8);
        break;
        label624:
        ((a)localObject).jJE.setVisibility(0);
        ((a)localObject).jJE.setText(localb.jxI);
        break label259;
        label649:
        i = 0;
        break label274;
        label655:
        ((a)localObject).jIB.setGravity(3);
        ((a)localObject).jIB.setTextColor(this.mContext.getResources().getColor(R.e.aOf));
        break label320;
        label688:
        ((a)localObject).jJF.setVisibility(8);
        break label337;
        label701:
        i = 0;
        break label372;
        label707:
        ((a)localObject).jJG.setVisibility(8);
        break label412;
        label720:
        if (paramInt + 1 == getCount()) {
          if (this.jJz) {
            h(((a)localObject).jcL, true);
          } else {
            h(((a)localObject).jcL, false);
          }
        }
      }
    }
  }
  
  private final class a
  {
    TextView jIB;
    TextView jJE;
    TextView jJF;
    ImageView jJG;
    CheckBox jJH;
    View jcL;
    
    public a()
    {
      GMTrace.i(4926998577152L, 36709);
      GMTrace.o(4926998577152L, 36709);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
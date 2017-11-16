package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.bc.g;
import com.tencent.mm.bc.k;
import com.tencent.mm.g.a.il;
import com.tencent.mm.g.a.il.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class FMessageListView
  extends LinearLayout
{
  private Context context;
  private final LinearLayout.LayoutParams lYZ;
  private com.tencent.mm.pluginsdk.e.a tCA;
  private j.a tCB;
  private j.a tCC;
  a tCD;
  a tCE;
  private TextView tCF;
  a.a tCu;
  
  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1043408617472L, 7774);
    GMTrace.o(1043408617472L, 7774);
  }
  
  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1043542835200L, 7775);
    this.tCA = new com.tencent.mm.pluginsdk.e.a()
    {
      public final void j(com.tencent.mm.sdk.b.b paramAnonymousb)
      {
        GMTrace.i(1046092972032L, 7794);
        if ((paramAnonymousb instanceof il)) {
          FMessageListView.a(FMessageListView.this, ((il)paramAnonymousb).eLR.eBq);
        }
        GMTrace.o(1046092972032L, 7794);
      }
    };
    this.tCB = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(1054548688896L, 7857);
        FMessageListView.b(FMessageListView.this, paramAnonymousString);
        GMTrace.o(1054548688896L, 7857);
      }
    };
    this.tCC = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(1056427737088L, 7871);
        FMessageListView.c(FMessageListView.this, paramAnonymousString);
        GMTrace.o(1056427737088L, 7871);
      }
    };
    this.lYZ = new LinearLayout.LayoutParams(-1, -2);
    this.context = paramContext;
    com.tencent.mm.bc.l.MK().c(this.tCB);
    com.tencent.mm.pluginsdk.e.a.a(il.class.getName(), this.tCA);
    com.tencent.mm.bc.l.MN().c(this.tCC);
    GMTrace.o(1043542835200L, 7775);
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(1043811270656L, 7777);
    if (paramb == null)
    {
      w.e("MicroMsg.FMessageListView", "addItem fail, provider is null");
      GMTrace.o(1043811270656L, 7777);
      return;
    }
    if (paramb.id <= 0L)
    {
      w.e("MicroMsg.FMessageListView", "addItem fail, systemRowId invalid = " + paramb.id);
      GMTrace.o(1043811270656L, 7777);
      return;
    }
    int j = getChildCount();
    int i = 1;
    Object localObject1;
    while (i < j)
    {
      localObject1 = getChildAt(i);
      if (((localObject1 instanceof a)) && (((View)localObject1).getTag() != null) && (((View)localObject1).getTag().equals(Long.valueOf(paramb.id))))
      {
        w.w("MicroMsg.FMessageListView", "addItem, item repeated, sysRowId = " + paramb.id);
        GMTrace.o(1043811270656L, 7777);
        return;
      }
      i += 1;
    }
    if (paramb.tCJ != null)
    {
      if (this.tCF == null) {
        this.tCF = ((TextView)findViewById(R.h.bqC));
      }
      this.tCF.setText(paramb.tCJ);
      this.tCF.setVisibility(0);
    }
    w.d("MicroMsg.FMessageListView", "addItem, current child count = " + j);
    if (j == 6)
    {
      w.i("MicroMsg.FMessageListView", "addItem, most 3 FMessageItemView, remove earliest");
      removeViewAt(1);
    }
    if (j == 1)
    {
      w.d("MicroMsg.FMessageListView", "addItem, current child count is 0, add two child view");
      this.tCD = new a(this.context);
      addView(this.tCD);
      this.tCE = new a(this.context);
      this.tCE.Px("");
      this.tCE.zE(0);
      addView(this.tCE, this.lYZ);
      at.AR();
      localObject1 = c.yK().TE(paramb.username);
      if ((localObject1 != null) && (com.tencent.mm.l.a.eE(((af)localObject1).field_type))) {
        break label529;
      }
      w.d("MicroMsg.FMessageListView", "addItem, reply btn visible, talker = " + paramb.username);
      this.tCD.setVisibility(0);
      this.tCE.setVisibility(0);
    }
    Object localObject2;
    while (paramb.eYr)
    {
      localObject1 = this.context.getString(R.l.dwn, new Object[] { paramb.glz });
      i = 0;
      localObject2 = new a(this.context);
      ((a)localObject2).setTag(Long.valueOf(paramb.id));
      ((a)localObject2).Px((String)localObject1);
      ((a)localObject2).zE(8);
      if (i != 0) {
        ((a)localObject2).setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(1043274399744L, 7773);
            w.d("MicroMsg.FMessageListView", "jacks long click digest");
            paramAnonymousView = FMessageListView.this.getContext();
            String str = FMessageListView.this.getContext().getString(R.l.dfg);
            h.c local1 = new h.c()
            {
              public final void hQ(int paramAnonymous2Int)
              {
                GMTrace.i(1048643108864L, 7813);
                switch (paramAnonymous2Int)
                {
                }
                for (;;)
                {
                  GMTrace.o(1048643108864L, 7813);
                  return;
                  ((ClipboardManager)FMessageListView.this.getContext().getSystemService("clipboard")).setText(FMessageListView.4.this.tCH.glz);
                }
              }
            };
            h.a(paramAnonymousView, null, new String[] { str }, local1);
            GMTrace.o(1043274399744L, 7773);
            return true;
          }
        });
      }
      addView((View)localObject2, getChildCount() - 2, this.lYZ);
      GMTrace.o(1043811270656L, 7777);
      return;
      label529:
      w.d("MicroMsg.FMessageListView", "addItem, reply btn gone, talker = " + paramb.username);
      this.tCD.setVisibility(8);
      this.tCE.setVisibility(8);
    }
    if ((paramb.eCQ != null) && (paramb.eCQ.length() > 0)) {
      localObject1 = paramb.eCQ;
    }
    for (;;)
    {
      localObject1 = (String)localObject1 + ": " + paramb.glz;
      i = 1;
      break;
      localObject2 = paramb.username;
      at.AR();
      x localx = c.yK().TE(paramb.username);
      localObject1 = localObject2;
      if (localx != null)
      {
        localObject1 = localObject2;
        if ((int)localx.fTq > 0) {
          localObject1 = localx.vk();
        }
      }
    }
  }
  
  public final void detach()
  {
    GMTrace.i(1043677052928L, 7776);
    com.tencent.mm.bc.l.MK().j(this.tCB);
    com.tencent.mm.pluginsdk.e.a.b(il.class.getName(), this.tCA);
    com.tencent.mm.bc.l.MN().j(this.tCC);
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      Object localObject = getChildAt(i);
      if ((localObject instanceof a))
      {
        localObject = (a)localObject;
        at.wS().b(30, (e)localObject);
        if ((((a)localObject).hsU != null) && (((a)localObject).hsU.isShowing())) {
          ((a)localObject).hsU.dismiss();
        }
      }
      i += 1;
    }
    this.tCD = null;
    this.tCE = null;
    GMTrace.o(1043677052928L, 7776);
  }
  
  static final class a
    extends View
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(1039247867904L, 7743);
      setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
      GMTrace.o(1039247867904L, 7743);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\FMessageListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */